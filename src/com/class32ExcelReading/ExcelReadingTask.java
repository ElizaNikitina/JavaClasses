package com.class32ExcelReading;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReadingTask {

    public static void main(String[] args) throws IOException {

        String path =  System.getProperty("user.dir") + "/src/ExcelData/Test01.xlsx";

        FileInputStream fis = new FileInputStream(path);

        Workbook book = new XSSFWorkbook(fis);

        Sheet sheet = book.getSheet("Sheet2");
       int rows = sheet.getPhysicalNumberOfRows();
       int cols = sheet.getRow(0).getLastCellNum();

       for(int r=0; r<rows; r++){
           for(int c=0; c<cols; c++){
             String value = sheet.getRow(r).getCell(c).toString();
               System.out.print(value + "    ");
           }
           System.out.println();
       }

    }
}
