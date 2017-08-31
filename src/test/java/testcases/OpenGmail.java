package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGmail {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");		
		System.out.println(driver.getTitle());	
		//Given the search bar code
		WebElement email = driver.findElement(By.xpath("//*[@id='lst-ib']"));
		//Enter Facebook at Search of Google
		email.sendKeys("facebook");
		//Location of Search button on Google
		WebElement Search = driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[3]/center/input[1]"));
		Search.click();
		//Find the facebook link and open it
		driver.findElement(By.linkText("Facebook - Log In or Sign Up")).click();
		System.out.println(driver.getTitle());
		
		
		driver.close();
		
		


	}

}