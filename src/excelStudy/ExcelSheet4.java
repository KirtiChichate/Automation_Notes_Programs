
package excelSheetStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream MyFile= new FileInputStream("D:\\Velocity\\Java Class\\Dec-2021 Class\\4thDecEvening\\exceltest.xlsx");
		
		Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet2");
		
		int totalRows = MySheet.getLastRowNum();
		
		int totalCell = MySheet.getRow(0).getLastCellNum()-1;
		
		for(int i=0;i<=totalRows;i++)
		{
			for(int j=0;j<=totalCell;j++)
			{
				String value = MySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value +" ");
			}
			System.out.println();
		}
		
	}

}