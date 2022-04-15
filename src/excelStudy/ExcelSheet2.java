
package excelSheetStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream MyFile= new FileInputStream("D:\\Velocity\\Java Class\\Dec-2021 Class\\4thDecEvening\\exceltest.xlsx");
		
		Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet3");
		
		String value1 = MySheet.getRow(0).getCell(0).getStringCellValue();
		double value2 = MySheet.getRow(0).getCell(1).getNumericCellValue();
		String value3 = MySheet.getRow(1).getCell(6).getStringCellValue();
		//String value4 = MySheet.getRow(2).getCell(2).getStringCellValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		//System.out.println(value4);
		

	}

}
