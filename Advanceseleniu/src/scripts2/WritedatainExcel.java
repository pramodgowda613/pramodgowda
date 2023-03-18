package scripts2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritedatainExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fio=new FileInputStream("./Excel/pramod.xlsx");
		Workbook book=WorkbookFactory.create(fio);
	Sheet n = book.getSheet("Sheet1");
	Row k = n.createRow(0);
	Cell j = k.createCell(3);
	 j.setCellValue("bang");
	FileOutputStream fo=new FileOutputStream("./Excel/pramod.xlsx");
	book.write(fo);
	
	
	
		
		
	}

}
