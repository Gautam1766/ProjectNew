package UtilitiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	Properties pr;
	String path="C:\\Eclipse\\Samsung\\Configuration\\Confi.properties";
	FileInputStream f1;
	public ReadConfig() 
	{
		pr=new Properties();
		
		try {
			f1 = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pr.load(f1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String getBro() 
	{
		String s1=pr.getProperty("browser");
		if(s1!=null) 
		{
			return s1;
		}
		else 
		{
			throw new RuntimeException("Browser not found");
		}
	}
	public String getUrl() 
	{
		String s1=pr.getProperty("url");
		if(s1!=null) 
		{
			return s1;
		}
		else 
		{
			throw new RuntimeException("Url not found");
		}
	}

}
