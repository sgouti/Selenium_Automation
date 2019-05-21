package CoreoHome;

public class MainPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exceldata fetchdaat=new Exceldata();
		fetchdaat.Exceldata1("sid.xls");
		//System.out.println("checking data once again" + test);
Driver drv=new Driver();
drv.excel();

	}

}
