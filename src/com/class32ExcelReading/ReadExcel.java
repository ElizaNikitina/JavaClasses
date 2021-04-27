package com.class32ExcelReading;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel {
    public static void main(String[] args) throws IOException {

        String path = System.getProperty("user.dir") + "/src/ExcelData/Test01.xlsx";
        FileInputStream fis = new FileInputStream(path);

        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet("Sheet1");
        //find number of rows
       int rows = sheet.getPhysicalNumberOfRows();

       //find number of columns
       int colls = sheet.getRow(0).getLastCellNum();

       //get data from all rows and all columns
       for(int r=0; r<rows; r++){ //iterate over rows
           for(int c=0; c<colls; c++){ //iterate over coll
            String cellValue = sheet.getRow(r).getCell(c).toString();
               System.out.print(cellValue + " ");
           }
           System.out.println();
       }

    }
}
