
package excelSheetStudy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream MyFile= new FileInputStream("D:\\Velocity\\Java Class\\Dec-2021 Class\\4thDecEvening\\exceltest.xlsx");
		
		Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet3");
		
		for(int i=0;i<=3;i++)
		{
		String value = MySheet.getRow(i).getCell(0).getStringCellValue();
		System.out.println(value);
		}
		
		for(int i=0;i<=4;i++) {
		String value = MySheet.getRow(0).getCell(i).getStringCellValue();
		System.out.println(value);
		}
		//to get last row number
		int lastrowNum = MySheet.getLastRowNum();
		System.out.println(lastrowNum);
		for(int i=0;i<=lastrowNum;i++)
		{
		String value = MySheet.getRow(i).getCell(0).getStringCellValue();
		System.out.println(value);
		}
		
		short lastColumnNumber = MySheet.getRow(0).getLastCellNum();
		System.out.println(lastColumnNumber);
		int totalCell = lastColumnNumber-1;
		
		for(int i=0;i<=totalCell;i++) {
			String value = MySheet.getRow(0).getCell(i).getStringCellValue();
			System.out.println(value);
			}
		
	}

}