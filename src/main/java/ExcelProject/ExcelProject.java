package ExcelProject;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class SearchInExcelFiles {
    public static void main(String[] args) {
        String searchWord = "next";
        String folderPath = "C:\\Users\\eduar\\Downloads\\test.xlsx";

        File folder = new File(folderPath);
        File[] files = folder.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile() && (file.getName().endsWith(".xlsx") || file.getName().endsWith(".xlsm"))) {
                    searchInExcelFile(file, searchWord);
                }
            }
        } else {
            System.out.println("Folderul nu există sau nu conține fișiere.");
        }
    }

    private static void searchInExcelFile(File file, String searchWord) {
        try (FileInputStream fis = new FileInputStream(file);
            Workbook workbook = WorkbookFactory.create(fis)) {

            for (Sheet sheet : workbook) {
                for (Row row : sheet) {
                    for (Cell cell : row) {
                        if (cell.getCellType() == CellType.STRING) {
                            String cellValue = cell.getStringCellValue();
                            if (cellValue.contains(searchWord)) {
                                printSearchResult(file.getName(), sheet.getSheetName(), row.getRowNum() + 1);
                            }
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printSearchResult(String fileName, String sheetName, int rowNum) {
        System.out.println("Găsit în fișier: " + fileName);
        System.out.println("Foaie: " + sheetName);
        System.out.println("Rând: " + rowNum);
        System.out.println();
    }
}

