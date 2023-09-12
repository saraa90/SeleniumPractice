package day9_actionClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsClassDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/C://Users//saraa//OneDrive//Desktop//Web tools//chromedriver//chromedriver_win32//chromedriver.exe/");
		//actionClassDemo();
		testCase();
		
	}
	public static void testCase() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
		Actions act = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
			//go to Etsy.com
		driver.get("https://etsy.com");
			//Hover Over on Jewelry & Accessories
		WebElement JA = driver.findElement(By.xpath("//span[contains(text(), 'Jewelry & Accessories')]"));
		act.moveToElement(JA).build().perform();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(text(), 'Bags & Purses')])[1]")));
			//Mouseover on Bags & Purses
		WebElement BP = driver.findElement(By.xpath("(//span[contains(text(), 'Bags & Purses')])[1]"));
		System.out.println(BP.isDisplayed()); // isDisplayed method only cares about the element visibility on the UI.
		act.moveToElement(BP).build().perform();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Shoulder Bags")));
			//Mouseover to Shoulder Bags
		WebElement ShoulderBags = driver.findElement(By.linkText("Shoulder Bags"));
		act.moveToElement(ShoulderBags).build().perform();
		
			//Click on the shoulder bags
		ShoulderBags.click();
		
			//Verify you are on the Shoulder bags page
		if (driver.getTitle().contains("Shoulder Bags")) {
			System.out.println("We are on the shoulder bags page");
		}else {
			System.out.println("We are Not on the shoulder bags page");
		}
	}







	/*public static void actionClassDemo() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
		Actions action = new Actions(driver);
		driver.get("http://practice.primetech-apps.com/practice/drag-and-drop");
		WebElement sourceTextElement = driver.findElement(By.id("text"));
		WebElement sourceTextAreaElement = driver.findElement(By.id("textarea"));
		WebElement sourceNumberElement = driver.findElement(By.id("Number"));
		
		WebElement targetBoxElement = driver.findElement(By.id("dropzone"));
		
		action.dragAndDrop(sourceTextElement, targetBoxElement).build().perform();
		action.dragAndDrop(sourceTextAreaElement, targetBoxElement).build().perform();
		action.dragAndDrop(sourceNumberElement, targetBoxElement).build().perform();
		
		
		
*/


		
		
		
	}


