package com.class32ExcelReading;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FromExcelToMap {

    public static void main(String[] args) throws IOException {

        String path = System.getProperty("user.dir") + "/src/ExcelData/Test01.xlsx";

        FileInputStream fis = new FileInputStream(path);

        Workbook book = new XSSFWorkbook(fis);
        Sheet sheet = book.getSheet("Sheet2");

        int rows=sheet.getPhysicalNumberOfRows();
        int cols =sheet.getRow(0).getLastCellNum();

        List<Map<String, String>> listMap=new ArrayList<>();

        for(int r=1; r<rows; r++) {

            Map<String, String> map=new LinkedHashMap<>();

            for(int c=0; c<cols; c++) {

                String key=sheet.getRow(0).getCell(c).toString();
                String value=sheet.getRow(r).getCell(c).toString();
                map.put(key, value);
            }

            listMap.add(map);
        }

        System.out.println(listMap);

        System.out.println("----accessing each map separately------");
        for( Map<String, String> l :listMap){
            System.out.println(l);
        }
    }
}
