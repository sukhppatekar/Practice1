package DynamicWebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 
{
    public static void main  (String args [])  
    {
    	System.out.println("This webdynamic table program");
    	System.setProperty("webdriver.chrome.driver", "E:\\Tb_16\\104\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	
    	driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
    	
    	WebElement table=driver.findElement(By.xpath("//div[@id='innings_1']/child::div[1]"));
    	
    	List<WebElement>rows=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']"));
    	int crows=rows.size();
    	System.out.println("Total rows count:" + crows);
    	
    	//to run rows count
    	
    	List<WebElement>runrows=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(3)"));
    	int runrowscount=runrows.size();
    	System.out.println("Total run rows :" + runrowscount);
    	
    	int sum=0;
    	for(int i=0; i<runrowscount-2;i++)
    	{
    		String run=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(3)")).get(i).getText();
    		//con string to int
    		
    		int runvalue=Integer.parseInt(run);
    		sum=sum+runvalue;
    	
    	}
    	System.out.println(" Run sum :" + sum);
    	
    	String extrarun=table.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[14]/div[2]")).getText();
    	int erunvalue=Integer.parseInt(extrarun);
    	System.out.println("Extra run :" + erunvalue);
    	
    	int totalrun= sum+erunvalue;
    	System.out.println("Total run sum:" + totalrun);
    	
    	
    }
	
}
