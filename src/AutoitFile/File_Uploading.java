package AutoitFile;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class File_Uploading
{
  @Test
  public void tc_01() throws IOException, InterruptedException
  {
   System.setProperty("webdriver.chrome.driver", "E:\\Java program\\JARs\\chromedriver.exe");
   RemoteWebDriver driver=new ChromeDriver();
   driver.get("C:\\Users\\avinash\\Desktop\\FileUpload.html");
   
   Actions action=new Actions(driver);
   action.click(driver.findElement(By.xpath("//input[@type='file']"))).perform();
   Thread.sleep(5000);
   Runtime.getRuntime().exec("C:\\Users\\avinash\\Desktop\\AutoItScript1.exe");
   
   
}
}
