package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javafx.scene.control.Alert;

public class TestAlerts {

	public static void main(String[] args) throws InterruptedException {


		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[1]/input")).click();
		
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(3000);
		
		System.out.println(alert.getText());
		
		
		alert.accept();
		

	}

}
