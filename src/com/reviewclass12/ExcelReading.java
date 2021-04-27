package com.reviewclass12;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReading {
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir") + "/src/ExcelData/Amazon_test.xlsx";

        System.out.println(path);

        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook excel = new XSSFWorkbook(fileInputStream);
        Sheet sheet = excel.getSheet("sheet1");
        Row row = sheet.getRow(2);
        Cell cell = row.getCell(1);
      //  System.out.println(row);
        System.out.println(cell);


    }
}
