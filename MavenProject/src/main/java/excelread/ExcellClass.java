package excelread;

import java.io.IOException;

public class ExcellClass {

	public static void main(String[] args) throws IOException {
		
		System.out.println(ExcelCode.readStringData(2,0));
		System.out.println(ExcelCode.readIntegerData(2, 1));
	}

}
