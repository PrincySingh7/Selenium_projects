package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Finders {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Yamini%20Devi/Desktop/Findersusecase.html");
		WebElement ele = driver.findElement(By.className("search-bar"));
		ele.sendKeys("Laptop ABC");
		String text1 = "Laptop ABC";
		if (ele.equals(text1)) {
			System.out.println("search is working fine");
		}
		else {
			System.out.println("False");
		}
		
	//Finding all the products on the page.
		List <WebElement> elements = driver.findElements(By.className("product-item"));
		for(WebElement element: elements) {
			System.out.println("Total number of elements with classname product-item are:" +element.getText());
		}
		List <WebElement> title = driver.findElements(By.className("product-item"));
		for(WebElement element: title) {
			System.out.println("Title of the elements are:" +element.getText());
		}
		
//		driver.get("https://www.selenium.dev/selenium/web/inputs.html");
//
//	    // Click on the element 
//        WebElement checkInput=driver.findElement(By.name("checkbox_input"));
//        checkInput.click();
//        Boolean isChecked=checkInput.isSelected();
        //assertEquals(isChecked,false);
		
	}
}