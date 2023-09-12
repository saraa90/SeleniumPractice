package reviewClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wed_aug_16 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/C://Users//saraa//OneDrive//Desktop//Web tools//chromedriver//chromedriver_win32//chromedriver.exe/");
		//alertHandle();
		testCase2();
		
		
	}
	/*
	public static void testCase1() throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://testautomationpractice.blogspot.com/");
	        WebElement alertButton = driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
	        WebElement confirmButton = driver.findElement(By.xpath("//button[@onclick='myFunctionConfirm()']"));
	        WebElement promptButton = driver.findElement(By.xpath("//button[@onclick='myFunctionPrompt()']"));

	        alertButton.click();
			Thread.sleep(2000);

	        Alert alert = driver.switchTo().alert();
	        String alertText = alert.getText();
	        System.out.println(alertText);
	        alert.accept();

	        confirmButton.click();
			Thread.sleep(2000);

	        Alert confirm = driver.switchTo().alert();
	        String confirmText = confirm.getText();
	        System.out.println(confirmText);
	        confirm.dismiss();

	        promptButton.click();
			Thread.sleep(2000);

	        Alert prompt = driver.switchTo().alert();
	        prompt.sendKeys("Saraa");
	        prompt.accept();
	        String promptText = driver.findElement(By.id("prompt_demo")).getText();
	        System.out.println(promptText);

	        driver.quit();
	    }*/
		
	public static void testCase2() {
		
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.get("https://testautomationpractice.blogspot.com/");
	        String mainWindowId = driver.getWindowHandle();
	        WebElement newWindowButton = driver.findElement(By.xpath("//button[@onclick='newBrwTab()']"));
	        newWindowButton.click();
	        Set<String> windowIds = driver.getWindowHandles();
	        for (String windowId : windowIds) {
	            if (!windowId.equals(mainWindowId)) {
	                driver.switchTo().window(windowId);
	                WebElement featuredProducts = driver.findElement(By.xpath("//h2[contains(text(),'Featured Products')]"));
	                if (featuredProducts.isDisplayed()) {
	                    System.out.println("Featured Products is Displayed.");
	                }
	                driver.close();
	            }
	        }
	        driver.switchTo().window(mainWindowId);
	        WebElement homePageText = driver.findElement(By.xpath("//h2[contains(text(),'Automation Testing Practice')]"));
	        if (homePageText.getText().equals("Automation Testing Practice")) {
	            System.out.println("You are on the main window.");
	        }
	        driver.quit();
	    }
	
	
	}
	
	/*public static void alertHandle() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Go to ‘https://demo.automationtesting.in/Alerts.html’
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.className("btn-danger")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		


*/




//			Click the button to display an alert box.
//			Cancel or dismiss the alert.
	
		
	


