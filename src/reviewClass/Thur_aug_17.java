package reviewClass;
import java.time.Duration;
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
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Thur_aug_17 {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
        driver.get("http://demo.guru99.com/popup.php");
        String mainWindow = driver.getWindowHandle();
        String title = driver.getTitle();
        System.out.println("Main window title is: " + title);
        driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
        Set<String> set = driver.getWindowHandles();
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            String childWindow = itr.next();
            if (!mainWindow.equals(childWindow)) {
                driver.switchTo().window(childWindow);
                driver.findElement(By.name("emailid")).sendKeys("sra@gmail.com");
                driver.findElement(By.name("btnLogin")).click();
                String userID = driver.findElement(By.xpath("//td[contains(text(),'User ID :')]//following-sibling::td")).getText();
                String password = driver.findElement(By.xpath("//td[contains(text(),'Password :')]//following-sibling::td")).getText();
                System.out.println("User ID is: " + userID);
                System.out.println("Password is: " + password);
                driver.close();
            }
        }
        driver.switchTo().window(mainWindow);
        if (driver.getTitle().equals(title)) {
            System.out.println("Title matches");
        } else {
            System.out.println("Title does not match");
        }
        driver.quit();
    }
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	driver.get("https://testautomationpractice.blogspot.com/");
        driver.switchTo().frame("frame-one1434677811");
        WebElement name = driver.findElement(By.id("RESULT_TextField-1"));
        name.sendKeys("saraa");
        WebElement gender = driver.findElement(By.id("RESULT_RadioButton-7"));
        gender.click();
        WebElement dob = driver.findElement(By.id("RESULT_TextField-2"));
        dob.sendKeys("01/01/1990");
        WebElement job = driver.findElement(By.id("RESULT_RadioButton-8"));
        job.click();
        WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
        submit.click();
        driver.switchTo().defaultContent();
        String title = driver.getTitle();
        if (title.equals("Automation Testing Practice")) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
		
    }
	}*/
	

