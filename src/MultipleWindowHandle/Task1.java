package MultipleWindowHandle;

import org.openqa.selenium.WebDriver;

public class Task1 
{
   WebDriver driver;
   public void openurl()
   {
	   System.out.println("open url");
	   System.getProperty("webdriver.chrome.driver", "E:\\\\Tb_16\\\\104\\\\chromedriver.exe");
	   driver.get("");
	   
   }
   
}
