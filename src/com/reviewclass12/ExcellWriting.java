package com.reviewclass12;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcellWriting {
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir") + "/src/ExcellData/Amazon_test.xlsx";

        System.out.println(path);

        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook excel = new XSSFWorkbook(fileInputStream);
        Sheet sheet = excel.getSheet("sheet1");
        Row row = sheet.getRow(2);
         row.getCell(1).setCellValue("http://facebook.com");

        FileOutputStream fileOutputStream = new FileOutputStream(path);

        excel.write(fileOutputStream);
      //  System.out.println(cell);



    }
}
