package selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsEx1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//for alerts
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		Wait<WebDriver> alertBtn  = new WebDriverWait(driver, Duration.ofSeconds(5));
		alertBtn.until(ExpectedConditions.alertIsPresent());
		Alert sample = driver.switchTo().alert();
		String txt = sample.getText();
		sample.accept();
		System.out.println("You have clicked on: " +txt);
		
		//for Confirm
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		Wait<WebDriver> confirmBtn = new WebDriverWait(driver, Duration.ofSeconds(5));
		confirmBtn.until(ExpectedConditions.alertIsPresent());
		Alert sample1 = driver.switchTo().alert();
		String txt1 = sample1.getText();
		sample1.dismiss();
		System.out.println("You have clicke on: " +txt1);
		
		//For prompts
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		Wait<WebDriver> promptBtn = new WebDriverWait(driver, Duration.ofSeconds(5));
		promptBtn.until(ExpectedConditions.alertIsPresent());
		Alert sample2 = driver.switchTo().alert();
		String txt2 = sample2.getText();
		System.out.println("You have entered:" +txt2);
		sample2.sendKeys("Princy Singh");
		sample2.accept();
	}

}
