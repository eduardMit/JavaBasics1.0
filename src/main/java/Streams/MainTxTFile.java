package Streams;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainTxTFile {
    private static final Logger log = Logger.getLogger("MyLog");
    public static void main(String[] args) {

        // Create new .txt file
        try{
            Log newLog = new Log("C:\\Users\\emanu\\IdeaProjects\\JavaBasics-SD71\\src\\main\\java\\Streams\\LogFile.log");
            newLog.log.setLevel(Level.INFO);
            newLog.log.info("Create new file with 3 new lines");

            BufferedWriter buffWriter = new BufferedWriter(new FileWriter("C:\\Users\\emanu\\Downloads\\NewFile.txt"));
            buffWriter.write("Entry1\n");
            buffWriter.write("Entry2\n");
            buffWriter.write("Entry3");
            buffWriter.close();
        } catch (Exception e){
            System.out.println(e);
        }

        // Read from the previously created file
        try {
            BufferedReader buffRead = new BufferedReader(new FileReader("C:\\Users\\emanu\\Downloads\\NewFile.txt"));
            String entry;
            while ((entry = buffRead.readLine()) !=null){
                System.out.println(entry);
            }
            buffRead.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
