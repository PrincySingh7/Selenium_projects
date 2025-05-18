package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMLOGIN {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver .get("https://www.freecontactform.com/forms/contact-form-free");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement var = driver.findElement(By.xpath("/html/body/main/div/div[1]/iframe"));
		driver.switchTo().frame(var);
		
		driver.findElement(By.id("Name")).sendKeys("Princy");
		driver.findElement(By.id("Email")).sendKeys("yaminising78@gmail.com");
		driver.findElement(By.id("Phone")).sendKeys("7894561285");
		driver.findElement(By.id("Message")).sendKeys("Hello!!");
		driver.findElement(By.id("fcf-button")).click();
		
		//boolean isEmailVisible = driver.findElement(By.name("email_input")).isDisplayed();
		
		boolean button1 = driver.findElement(By.xpath("//*[@id=\"fcf-thank-you\"]/button")).isDisplayed();
		
		System.out.println(button1 +" testing");
		
		
		
		
		
	}
}