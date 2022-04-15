
package excelSheetStudy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream MyFile= new FileInputStream("D:\\Velocity\\Java Class\\Dec-2021 Class\\4thDecEvening\\exceltest.xlsx");
		
		Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet2");
		
		int totalRows = MySheet.getLastRowNum();
		
		int totalCell = MySheet.getRow(0).getLastCellNum()-1;
		
		for(int i=0;i<=totalRows;i++)
		{
			for(int j=0;j<=totalCell;j++)
			{
				Cell info = MySheet.getRow(i).getCell(j);
				CellType type = info.getCellType();//string, numeric,boolean
				
				
				if(type==CellType.STRING)
				{
					String value = info.getStringCellValue();
					System.out.print(value+" ");
				}
				
				else if (type==CellType.NUMERIC) 
				{
					double value = info.getNumericCellValue();
					System.out.print(value+" ");
				}
				else if (type==CellType.BOOLEAN)
				{
					boolean value = info.getBooleanCellValue();
					System.out.print(value+" ");
				}
				
		}
			System.out.println();
		}

	}

}