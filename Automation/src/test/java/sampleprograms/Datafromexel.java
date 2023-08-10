package sampleprograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Datafromexel {

	public static void main(String[] args) throws IOException   {
		
		//FileInputStream fis = new FileInputStream("./src/test/resources/TestData_1.xlsx");
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData.xlsx");
		Workbook book1 = WorkbookFactory.create(fis);
		Sheet sh = book1.getSheet("Names");
		DataFormatter format1 = new DataFormatter();
		String txt2 = format1.formatCellValue(sh.getRow(0).getCell(0));
		System.out.println(txt2);
		
	}

}
