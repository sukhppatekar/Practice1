package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
  public static void main(String[] args) throws InterruptedException {
	
	  System.out.println("Locators program : xpath");
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\Tb_16\\107\\chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	//  driver.manage().window().maximize();
	  
	//  driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_electronics']")).click();
	 // driver.navigate().back();
	  
	
	  // driver.findElement(By.xpath("//li/child::a[@href='https://www.amazon.in/gp/redirect.html/ref=footer_fb?location=http://www.facebook.com/AmazonIN&token=2075D5EAC7BB214089728E2183FD391706D41E94&6']")).click();
 // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  Thread.sleep(2000);
  driver.findElement(By.xpath("//li/child::a[@href='https://amazon.jobs']")).click();
  
  
  }
}
