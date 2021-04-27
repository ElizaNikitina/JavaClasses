package com.class32ExcelReading;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelFileReading {
    public static void main(String[] args) throws IOException {

        String path = System.getProperty("user.dir") + "/src/ExcelData/Test01.xlsx";
        FileInputStream fis = new FileInputStream(path);

        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet("Sheet1");

        Row row = sheet.getRow(0);
        Cell cell = row.getCell(1);

        //h=get value from cell
        String row1cell2 = cell.toString();
        System.out.println(row1cell2);

       Row row3 = sheet.getRow(2);
        Cell r3cell3 = row3.getCell(2);
        System.out.println(r3cell3.toString());

        String cellValue = sheet.getRow(1).getCell(2).toString();
        System.out.println(cellValue);

       double cellV =  sheet.getRow(1).getCell(4).getNumericCellValue();
        System.out.println((int)cellV);

       String zip =  sheet.getRow(1).getCell(4).toString();
       String[] arr = zip.split("\\.");
        System.out.println(arr[0]);
        System.out.println(zip);

    }

}
