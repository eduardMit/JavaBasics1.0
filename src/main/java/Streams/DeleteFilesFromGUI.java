package Streams;

import java.io.File;

public class DeleteFilesFromGUI {

    public void deleteF (String localFolder) {

        File folder = new File(localFolder);

        for (File entry : folder.listFiles()) {
            if (entry.isDirectory() == false) {
                String fileName = entry.getName().toLowerCase();

                if (fileName.endsWith(".txt") || fileName.endsWith(".rar")) {
                    entry.delete();
                    System.out.println("Existing files were removed");
                }
            }
        }
    }
}
