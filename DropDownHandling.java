package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		Thread.sleep(2000);
		WebElement drop =driver.findElement(By.xpath("//select[@class='form-control']"));
		
		Select dropdown = new Select(drop);
		//dropdown.selectByIndex(2);
		//dropdown.selectByVisibleText("Teacher");
		dropdown.selectByValue("teach");
		Thread.sleep(1000);
		
		
	}

}
