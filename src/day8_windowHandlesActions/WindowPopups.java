package day8_windowHandlesActions;

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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowPopups {

	public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver","/C://Users//saraa//OneDrive//Desktop//Web tools//chromedriver//chromedriver_win32//chromedriver.exe/");
		  //windowHandlesDemo();
		  windowHandlesDemoWithIterator();		  
	}

	public static void windowHandlesDemoWithIterator() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://practice.primetech-apps.com/practice/browser-windows");
		String mainWindowId = driver.getWindowHandle();
		driver.findElement(By.id("newTab")).click();
		Set<String> windowIds = driver.getWindowHandles();
		Iterator<String> iterate = windowIds.iterator();
		String firstWindowId = iterate.next();
			System.out.println("first window id: "+ firstWindowId);
		if (firstWindowId.equals(mainWindowId)) {
			System.out.println("first window id match to main window id ");

		}else {
			System.out.println("first window id NOT match to main window id ");

		}
		String secondWindowId = iterate.next();
		System.out.println("second window id: "+ secondWindowId);
		driver.switchTo().window(secondWindowId);
		WebElement newTabText = driver.findElement(By.xpath("//p[text()='This is a new tab']"));
		if (newTabText.isDisplayed()) {
			System.out.println("We are on the child window");
		}else {
			System.out.println("We are not on the child window yet");
		}
		
		//7. Close the window, 
		driver.close();
		// Switch back to the main window, 
		driver.switchTo().window(mainWindowId);
		
		//Verify you are on the main window. 
		if (driver.findElement(By.xpath("//h3[text()='Browser Windows']")).isDisplayed()) {
			System.out.println("we are back to main window");
		}else {
			System.out.println("I am lost between the windows");
		}
	}

		
		
	
	
	/*public static void windowHandlesDemo() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	// got to this website
	driver.get("http://practice.primetech-apps.com/practice/browser-windows");
	
	// get the window id and store it in a variable
	String mainWindowID = driver.getWindowHandle(); // gets the window id of the current window that the driver is on

	// print it out
	System.out.println(mainWindowID);
	
	// click on new tab button
	driver.findElement(By.id("newTab")).click();
	
	// get the all window ids and store them into a set of string
	Set<String> windowIds =  driver.getWindowHandles();
	
	// print them out
	// switch to the new window / child window
	for (String singleWindowId : windowIds) {
		// if the singleWindowId is not equal to main windowId, then switch
		if (!singleWindowId.equals(mainWindowID)) {
			driver.switchTo().window(singleWindowId);
		}
	}
	
	// verify that there is a text as 'This is a new tab'
	WebElement newTabText = driver.findElement(By.xpath("//p[text()='This is a new tab']"));
	if (newTabText.isDisplayed()) {
		System.out.println("We are on the child window");
	}else {
		System.out.println("We are not on the child window yet");
	}
	
	// close the new window
	driver.close();
	
	// driver will not automatically switch between the windows, we have to command it
	// switch back to main window
	
	driver.switchTo().window(mainWindowID);
	
	
	if (driver.findElement(By.xpath("//h3[text()='Browser Windows']")).isDisplayed()) {
		System.out.println("we are back to main window");
	}else {
		System.out.println("I am lost between the windows");
	}
	
}
		

		
	
	
	

		public static void java_variables_demo() {
			
		String[] names = {"Saraa","Selena"};
		for (int i = 0 ; i < names.length; i++) {
			if (!names[i].equals("Saraa")){
				System.out.println(names[i]);
				
				
			}
			
		}
		List<String> newNames = new ArrayList<>();
		newNames.add("Saja");
		newNames.add("Huda");
		for( int i=0; i < newNames.size();i++) {
			if (!newNames.get(i).equals("Saja"));
			String name = newNames.get(i);
			System.out.println(name);
		}
		
		*/
		
	}

	
