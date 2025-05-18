package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginOrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("orangehrm-login-button")).click();
		
		//Get the current URL
		String cur_URl = driver.getCurrentUrl();
		System.out.println("The current URL of the page is : " +cur_URl);
		
		//verifying with the desired url
		String des_URL = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		
		if (cur_URl.equals(des_URL)) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		//Get the Title of the page
		String Cur_Title = driver.getTitle();
		System.out.println("The title of the page is :" +Cur_Title);	
		
		//verifying the title of page
		String Des_Title="OrangeHRM";
		
		if(Cur_Title.equals(Des_Title)) {
			System.out.println("Title matched!!");
		}
		else {
			System.out.println("Title doesn't matched!!");
		}
		
		}

}
