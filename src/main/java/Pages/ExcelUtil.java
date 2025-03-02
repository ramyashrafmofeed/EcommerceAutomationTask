package Pages;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtil {
    public static String getCellData(String filePath, String sheetName, int row, int col) throws IOException {
        FileInputStream file = new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheet(sheetName);
        Row r = sheet.getRow(row);
        Cell cell = r.getCell(col);
        String data = cell.getStringCellValue();
        workbook.close();
        return data;
    }
}
