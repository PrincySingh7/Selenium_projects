package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigations {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//Navigate TO
		driver.navigate().to("https://www.selenium.dev/documentation/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
