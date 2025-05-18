package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Example1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://community.cloud.automationanywhere.digital/#/login?next=/index");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[3]/div/div[2]/div/div/div[1]/form/div/div/div/div/div/div/div[1]/div[1]/div/div/span/div/div/input")).sendKeys("yaminisingh271@gmail.com");
		driver.findElement(By.xpath("//Input[@name='password']")).sendKeys("Princy#77");
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@name='btnI'][@class='RNmpXc']")).click();

	}

}
