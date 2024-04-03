package TestCaseFile;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectM.Login2;
import PageObjectM.Logout;
import UtilitiesFile.DataDriven22;

public class TestCase  extends BaseClass12 {
    @Test	
	void TC1() 
	{
		driver.get(ulr1);
		
		
	}
    @Test
    void TC2() 
    {
    	Login2 lg=new Login2(driver);
    	lg.User_name("student");
    	lg.Pass_word("Password123");
    	lg.Submit();
    }
////    @Test
////    void TC3() 
////    {
////    	Logout g2=new Logout(driver);
////    	g2.Log();
////    }
//    @DataProvider(name="Datapro")
//    public String [][] getData() throws Exception
//    {
//    	String File_name="C:\\Users\\pc\\Desktop\\Login1.xlsx";
//    	int Rows=DataDriven22.getRowCount(File_name, "Sheet1");
//    	int clm=DataDriven22.getColCount(File_name, "Sheet1");
//    	String s1[][]=new String[Rows-1][clm]; 
//    	for(int i=1;i<Rows;i++) 
//    	{
//    		for(int j=0;j<clm;j++) 
//    		{
//    			s1[i-1][j]=DataDriven22.getCellvalue(File_name, "Sheet1", i, j);
//    		}
//    	}
//    	return s1;
//    }
	
	

}
