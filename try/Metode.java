package metode;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import stranice.PrvaStranica;
import stranice.Register;



public class Metode {

	WebDriver driver;
	
	@BeforeClass
	public void napraviDrajvere() {
		System.setProperty("webdriver.chrome.driver", "C:\\NewChromedriver\\chromedriver.exe");
		driver = new ChromeDriver();	
	}
	
	@Test(priority=1)
	public void prviTest() {
		driver.navigate().to(PrvaStranica.URL);
		PrvaStranica.Register(driver);
		String actual = driver.getCurrentUrl();
		String expected= Register.URL;
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority=2)
	public  void drugiTest() {
	
		
		File f=new File ("Tabela.xlsx");
		try {
		InputStream inp = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(inp); // Pretvaranje fajla u odgovarajuci format
		Sheet sheet = wb.getSheetAt(0); // Dohvata sheet
		//Row row=sheet.getRow(0);
		
		
		
		
		
		
		driver.navigate().to(Register.URL);
	
		
		SoftAssert sa=new SoftAssert();			// softassert se pravi van for petlje

		for(int i=0;i<2;i++) {
			
			Row row=sheet.getRow(i);
			
			
			Cell c1=row.getCell(0);
			//System.out.println("TEST");
			Cell c2=row.getCell(1);
			Cell c3=row.getCell(2);
			Cell c4=row.getCell(3);
			Cell c5=row.getCell(4);
			Cell c6=row.getCell(5);
			Cell c7=row.getCell(6);
			Cell c8=row.getCell(7);
			Cell c9=row.getCell(8);
			Cell c10=row.getCell(9);
			Cell c11=row.getCell(10);
			
			
			
			String FirstName =c1.toString();
			String LasttName =c2.toString();
			String Phone =c3.toString();
			String Email =c4.toString();
			String Adress =c5.toString();
			String City =c6.toString();
			String State =c7.toString();
			String PostalCode =c8.toString();
			String Username =c9.toString();
			String Password =c10.toString();
			String ConfirmPassword =c11.toString();
			
					
			driver.navigate().to(Register.URL);		//svaki put se vratimo na registracionu formu
			Register.firstName(driver,FirstName);
			Register.lastName(driver,LasttName);
			Register.phone(driver,Phone);
			Register.email(driver,Email);
			Register.adress(driver,Adress);
			Register.city(driver,City);
			Register.state(driver,State);
			Register.postalCode(driver,PostalCode);
			Register.username(driver,Username);
			Register.password(driver,Password);
			Register.confirmPassword(driver,ConfirmPassword);
			
			
			
			
			
			
			String actual = driver.getCurrentUrl();
			String expected= Register.URL;
			//Assert.assertEquals(actual, expected);	//svaki put radimo hard assert
			sa.assertEquals(actual, expected);
		}
		sa.assertAll();
		
		
		
		
		//Thread.sleep(5000);
		//wb.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}

	private Row row(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	 
	 
	
	
}
