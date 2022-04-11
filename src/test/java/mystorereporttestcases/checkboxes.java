package mystorereporttestcases;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class checkboxes {
  @Test
  public void f() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	 
	 
	  driver.get("http://www.dummypoint.com/seleniumtemplate.html");
	 
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	 
	  List<WebElement> chbox=driver.findElements(By.xpath("//input[@name='checkbox']"));
	  Thread.sleep(2000);
	  System.out.println("size of check boxes :"+chbox.size());
	  for(int i=0;i<chbox.size();i++) {
		Thread.sleep(2000);
		  chbox.get(i).click();
		  Thread.sleep(2000);
		 
	  }
	  driver.close();
  }
}
