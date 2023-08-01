package ExcelProject;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ExcelProject{

    public static void main(String[] args) {
        String folderPath = "C:\\Users\\Cristi\\Documents\\Curs programare\\Excell Project";
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter the the word you are looking for: ");
        String searchText = scan1.nextLine();

        File folder = new File(folderPath);
        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile() && (file.getName().endsWith(".xlsx") || file.getName().endsWith(".xlsm"))) {
                    FileInExcel(file, String.valueOf(searchText));
                }
            }
        }
    }

    private static void FileInExcel(File file, String searchText) {
        try (FileInputStream fis = new FileInputStream(file);
             XSSFWorkbook workbook = new XSSFWorkbook(fis)) {

            DataFormatter dataFormatter = new DataFormatter();
            for (Sheet sheet : workbook) {
                for (Row row : sheet) {
                    for (Cell cell : row) {
                        String cellValue = dataFormatter.formatCellValue(cell);
                        if (cellValue.contains(searchText)) {
                            System.out.println("Found in file: " + file.getName());
                            System.out.println("Sheet: " + sheet.getSheetName());
                            System.out.println("Row: " + (row.getRowNum() + 1));
                            System.out.println("Cell: " + cell.getAddress());
                            System.out.println();
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}