package scripts2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readfromexcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./Excel/pramod.xlsx");
	Workbook book=WorkbookFactory.create(fis);
	Sheet h = book.getSheet("Sheet1");
	Row n = h.getRow(0);
	Cell r = n.getCell(0);
	String j = r.toString();
	System.out.println(j);
	
	
}
	
}
