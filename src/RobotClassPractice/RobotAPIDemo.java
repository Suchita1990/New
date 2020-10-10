package RobotClassPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotAPIDemo {
	@Test
	public void tc_01() throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://spreadsheetpage.com/index.php/site/file/yearly_calender_workbook");
		driver.findElement(By.xpath("/html/body/div/section/div/div[1]/ul/li[3]/a")).click();
		Robot robot=new Robot();
		Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_DOWN);//press down arrow in keyboard
		Thread.sleep(2000);
 		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
       

	}

}
