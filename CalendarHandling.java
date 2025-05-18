package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandling {
	
	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String Year = "2025";
		String Month="7";
		String Date = "7";
		
		driver.findElement(By.xpath("//div[@class=\'react-date-picker__inputGroup\']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
		
		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
		
		driver.findElement(By.xpath("//button[text()='"+Year+"']")).click();
		
		driver.findElements(By.xpath("//button[@class='react-calendar__tile react-calendar__year-view__months__month']")).get(Integer.parseInt(Month)-2).click();
		
		driver.findElement(By.xpath("//abbr[text()='"+Date+"']")).click();
		
	}
}
