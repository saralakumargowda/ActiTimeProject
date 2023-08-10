package sampleprograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//To get the file path
		//FileInputStream fis=new FileInputStream("./src/test/resources/TestData.xlsx");
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData.xlsx");
		//open workbook in read mode
		Workbook book=WorkbookFactory.create(fis);
		
		// to get perticular sheet
		Sheet sh=book.getSheet("contacts");
		//Data formatter will convert as per your required type data
		DataFormatter format=new DataFormatter();
		String text = format.formatCellValue(sh.getRow(0).getCell(0));
		System.out.println(text);
		}
}
