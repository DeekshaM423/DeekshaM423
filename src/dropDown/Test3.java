package dropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		 WebElement dropDown = driver.findElement(By.id("gh-cat"));
		
		 Select s=new Select(dropDown);
		 s.selectByIndex(16);
		 s.selectByValue("2984");
		 s.selectByVisibleText("Crafts");
		 
		 System.out.println(s.isMultiple());
		 
		 List<WebElement> option = s.getOptions();
		 System.out.println(option.size());
		 
		 for(WebElement b:option) {
			 System.out.println(b.getText());
		 }
		 
		 driver.close();
		 
		 

	}

}
