package Streams;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class DeleteFilesGUI extends JFrame implements ActionListener {
    private JButton destinationButton;
    private JButton executeButton;
    private File selectedDestination;
    private JLabel statusLabel;
    public DeleteFilesGUI() {
        setTitle("Delete Files");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        destinationButton = new JButton("Select Destination");
        executeButton = new JButton("Execute");
        statusLabel = new JLabel("");

        destinationButton.addActionListener(this);
        executeButton.addActionListener(this);

        add(destinationButton);
        add(executeButton);
        add(statusLabel);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                DeleteFilesGUI fileDeleteGUI = new DeleteFilesGUI();
                fileDeleteGUI.setVisible(true);
            }
        });
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == destinationButton) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int returnValue = fileChooser.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                selectedDestination = fileChooser.getSelectedFile();
                System.out.println("Selected destination: " + selectedDestination.getAbsolutePath());
            }
        } else if (e.getSource() == executeButton) {
            if (selectedDestination != null) {

                String localFolder = selectedDestination.getAbsolutePath();
                DeleteFilesFromGUI filesDelete = new DeleteFilesFromGUI();
                filesDelete.deleteF(localFolder);
                statusLabel.setText("Existing files were removed");


            } else {
                JOptionPane.showMessageDialog(null, "Please select destination first.");

            }
        }
    }
}
