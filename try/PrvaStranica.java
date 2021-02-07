package stranice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PrvaStranica {
	
	
	public static final String URL="http://demo.guru99.com/test/newtours/";

	
	public static void Register(WebDriver driver) {
		driver.findElement(By.linkText("REGISTER")).click();
		
	}

}

	