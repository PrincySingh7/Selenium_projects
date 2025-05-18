package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandling_2 {

	public static void main(String[] args) {
		
		String Year = "2029";
		String Month ="March";
		String Date = "7";
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.findElement(By.id("datepicker")).click();
		
		String month_year = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		System.out.println(month_year);
		
		String Mon =month_year.split(" ")[0];
		String Yea  =month_year.split(" ")[1];
		
		while(!(Mon.equals(Month) && Yea.equals(Year))){
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			month_year = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			System.out.println(month_year);
			
			Mon =month_year.split(" ")[0];
			Yea  =month_year.split(" ")[1];
			
		}
		
		driver.findElement(By.xpath("//a[text()='"+Date+"']")).click();
		

	}

}
