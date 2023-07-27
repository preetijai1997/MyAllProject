import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDrivenDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir");
		 ExcelDriven excel=new ExcelDriven(path+"//excel//data.xlsx","FirstSheet");
		 excel.getProperty();
		 excel.getCellDataString(0, 0);
		 excel.getCellDataNumber(1, 1);
	}

}
