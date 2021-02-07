package stranice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Register {

	public static final String URL="http://demo.guru99.com/test/newtours/register.php";
	public static final String NAME="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input";
	public static final String LASTNAME="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input";
	public static final String PHONE="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input";
	public static final String EMAIL="//*[@id=\"userName\"]";
	public static final String ADRESS="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input";
	public static final String CITY="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[8]/td[2]/input";
	public static final String STATE="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input";
	public static final String POSTALCODE="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/input";
	public static final String USERNAME="//*[@id=\"email\"]";
	public static final String PASSWORD="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input";
	public static final String CONFIRMPASSWORD="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input";
	
	
	
	public static void firstName(WebDriver driver,String FirstName) {
		driver.findElement(By.xpath(NAME)).click();
		driver.findElement(By.xpath(NAME)).sendKeys(FirstName);
	}
		
		
	
	
	public static void lastName(WebDriver driver,String LasttName) {
		driver.findElement(By.xpath(LASTNAME)).click();
		driver.findElement(By.xpath(LASTNAME)).sendKeys(LasttName);
	}
	
	public static void phone(WebDriver driver,String Phone) {
		driver.findElement(By.xpath(PHONE)).click();
		driver.findElement(By.xpath(PHONE)).sendKeys(Phone);
	}
	
	public static void email(WebDriver driver,String Email) {
		driver.findElement(By.xpath(EMAIL)).click();
		driver.findElement(By.xpath(EMAIL)).sendKeys(Email);
	}
	
	public static void adress(WebDriver driver,String Adress) {
		driver.findElement(By.xpath(ADRESS)).click();
		driver.findElement(By.xpath(ADRESS)).sendKeys(Adress);
	}
	
	public static void city(WebDriver driver,String City) {
		driver.findElement(By.xpath(CITY)).click();
		driver.findElement(By.xpath(CITY)).sendKeys(City);
	}
	
	public static void state(WebDriver driver,String State) {
		driver.findElement(By.xpath(STATE)).click();
		driver.findElement(By.xpath(STATE)).sendKeys(State);
	}
	
	public static void postalCode(WebDriver driver,String PostalCode) {
		driver.findElement(By.xpath(POSTALCODE)).click();
		driver.findElement(By.xpath(POSTALCODE)).sendKeys(PostalCode);
	}
	
	public static void username(WebDriver driver,String Username) {
		driver.findElement(By.xpath(USERNAME)).click();
		driver.findElement(By.xpath(USERNAME)).sendKeys(Username);
	}
	
	public static void password(WebDriver driver,String Password) {
		driver.findElement(By.xpath(PASSWORD)).click();
		driver.findElement(By.xpath(PASSWORD)).sendKeys(Password);
	}
	public static void confirmPassword(WebDriver driver,String ConfirmPassword) {
		driver.findElement(By.xpath(CONFIRMPASSWORD)).click();
		driver.findElement(By.xpath(CONFIRMPASSWORD)).sendKeys(ConfirmPassword);
	}
	
}
