package com.reviewclass12;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadingAllTheDATA {
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir") + "/src/ExcellData/Amazon_test.xlsx";

        System.out.println(path);

        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook excel = new XSSFWorkbook(fileInputStream);
        Sheet sheet = excel.getSheet("sheet1");
        int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
        for (int i = 0; i < physicalNumberOfRows; i++) {
            Row row = sheet.getRow(i);
           int physicalNumberOfCells = row.getPhysicalNumberOfCells();
           for(int j=0; j<physicalNumberOfCells; j++){
               System.out.print(row.getCell(j) + " ");
           }
            System.out.println();

        }
    }
}
