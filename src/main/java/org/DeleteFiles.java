package org.example;

import java.io.File;

public class DeleteFiles {

    private static String localFolder = "C:\\Users\\edumit\\Downloads\\Courses\\Software Developer";

    public static void main(String[] args) {

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
