package com.class32ExcelReading;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDataToExcel {

    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir") + "/src/ExcelData/Test01.xlsx";

        FileInputStream fis = new FileInputStream(path);

        Workbook book = new XSSFWorkbook(fis);

        //writing into existing sheet
      Sheet sheet1 = book.getSheet("Sheet1");
      //1st row 6cell[5]
        sheet1.getRow(0).createCell(5).setCellValue("Country");
        sheet1.createRow(3).createCell(0).setCellValue("Oleg");

        //create sheet
      Sheet newSheet =  book.createSheet("NEW_Sheet");
      newSheet.createRow(0).createCell(0).setCellValue("new row");

        FileOutputStream fos = new FileOutputStream(path);
        book.write(fos);

    }
}
