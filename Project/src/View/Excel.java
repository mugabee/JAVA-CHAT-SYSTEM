/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;



import java.io.FileOutputStream;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel {  
   public void exportToExcel(JTable table, String filePath) throws Exception {
  TableModel model = table.getModel();
  Workbook workbook = new XSSFWorkbook();
  Sheet sheet = workbook.createSheet();
  Row row;
  Cell cell;

  // write the column headers
  row = sheet.createRow(0);
  for (int c = 0; c < model.getColumnCount(); c++) {
   cell = row.createCell(c);
   cell.setCellValue(model.getColumnName(c));
  }

  // write the data rows
  for (int r = 0; r < model.getRowCount(); r++) {
   row = sheet.createRow(r+1);
   for (int c = 0; c < model.getColumnCount(); c++) {
    cell = row.createCell(c);
    Object value = model.getValueAt(r, c);
    if (value instanceof String) {
     cell.setCellValue((String)value);
    } else if (value instanceof Double) {
     cell.setCellValue((Double)value);
    }
   }
  }

  FileOutputStream out = new FileOutputStream(filePath);
  workbook.write(out);
  out.close();
  workbook.close();

 }
} 

