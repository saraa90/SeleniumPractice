package day8_windowHandlesActions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertDemoRecap {

	public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver","/C://Users//saraa//OneDrive//Desktop//Web tools//chromedriver//chromedriver_win32//chromedriver.exe/");
		  //alert_testcase3();
		  alert_testcase4();

		  
	}
	public static void alert_testcase4() {
		
		//Test case 4
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//go to http://practice.primetech-apps.com/practice/alerts 
		driver.get("http://practice.primetech-apps.com/practice/alerts");
		//	Click on the 'Prompt Alert' button and type PrimeTech. Then dismiss the Alert.
		String input ="PrimeTech";
		driver.findElement(By.id("prompt")).click();
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert handle = driver.switchTo().alert();
		handle.sendKeys(input);
		//The dismiss the alert 
		handle.dismiss();
		
		//	 Verify that "User cancelled the prompt." text displays.
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("demo")));
		String actualMessage = driver.findElement(By.id("demo")).getText();
		
		String expectedMessage = "User cancelled the propt";
		
		if (actualMessage.equals(expectedMessage)) {
			System.out.println("Cancelled Message match, Test pass");
			
		}else {
			System.out.println("Cancelled Message match ,Test fail");
			
			
	}

	/*	
	public static void alert_testcase3() {
		//Test case 3
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//go to http://practice.primetech-apps.com/practice/alerts 
		driver.get("http://practice.primetech-apps.com/practice/alerts");
		//	Click on the 'Prompt Alert' button and type PrimeTech
		String input ="PrimeTech";
		driver.findElement(By.id("prompt")).click();
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert handle = driver.switchTo().alert();
		handle.sendKeys(input);
		
		
		
		//	Then accept the Alert. Verify that a greeting message displays as
		//	"Hello <your input>! How are you today?".
		handle.accept();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("demo")));
		String actualMessage = driver.findElement(By.id("demo")).getText();
		
		String expectedMessage = "Hello "+ input + " ! How are you today?";
		
		if (actualMessage.equals(expectedMessage)) {
			System.out.println("Greeting match, Test Pass");
			
		}else {
			System.out.println("Greeting dose not match, Test Fail ");

		}*/
		
		
		
	}

}
