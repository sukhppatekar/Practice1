package Calender;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 
{
  public static void main(String args[]) throws InterruptedException
  {
	  System.out.println("This is basic datepicker program");
	  System.setProperty("webdriver.chrome.driver", "E:\\Tb_16\\104\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  
	  driver.get("https://demo.automationtesting.in/Datepicker.html");
	  
	  driver.findElement(By.id("datepicker1")).click();
	  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	  while(!driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-datepicker-month']")).getText().contains("October"))
			
	  {
		  
		  
		  System.out.println("in while loop");
		  
		
		  driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-icon ui-icon-circle-triangle-e']")).click();
			
	  }
	  
	  List<WebElement>days=driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
	  int daycount=  days.size();
	  System.out.println("daycount :" + daycount);
	  
	  for(int i=1; i<daycount; i++)
	  {
		  System.out.println("in for loop");
		 String dayvalue= driver.findElements(By.xpath("//td[@data-handler='selectDay']")).get(i).getText();
		  
		  if(dayvalue.equalsIgnoreCase("25"))
		  {
			  driver.findElements(By.xpath("//td[@data-handler='selectDay']")).get(i).click();
		  }
	  }
	  
  }
}
