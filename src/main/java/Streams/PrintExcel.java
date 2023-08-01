package Streams;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import java.io.FileInputStream;

public class PrintExcel {

    public static void main(String[] args) {

     String filePath = "C:\\Users\\emanu\\Downloads\\Resources\\CGPT\\Java-Excel\\File1.xlsx";

     try{
         FileInputStream newFile = new FileInputStream(filePath);
         XSSFWorkbook workbook = new XSSFWorkbook(newFile);

         XSSFSheet sheet = workbook.getSheetAt(0);

             for (Row row : sheet) {
                 for (Cell cell : row) {
                     CellType cellType = cell.getCellType();

                     switch (cellType) {
                         case STRING:
                             System.out.println(cell.getStringCellValue());
                             break;
                         case NUMERIC:
                             System.out.println(cell.getNumericCellValue());
                             break;
                         case BOOLEAN:
                             System.out.println(cell.getBooleanCellValue());
                             break;
                         case FORMULA:
                             System.out.println(cell.getCellFormula());
                             break;
                         default:
                             System.out.println("\t");
                     }
                 }
             }
             workbook.close();
             newFile.close();
         } catch(Exception e) {
                e.printStackTrace();
         }

    }

}
