package com.reviewclass12;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateNewFiles {
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir") + "/src/ExcellData/myFile.xlsx";

        System.out.println(path);

        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook excel = new XSSFWorkbook(fileInputStream);
       // Sheet sheet = excel.createSheet("sheet2");
        Sheet sheet2 = excel.createSheet("TEST_Sheet_creation");
        Row row = sheet2.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("New Information");


        FileOutputStream fileOutputStream = new FileOutputStream(path);

        excel.write(fileOutputStream);




    }
}
