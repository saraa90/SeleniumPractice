package day6_workingWithWebElement2;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class RadioCheckBoxs {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/C://Users//saraa//OneDrive//Desktop//Web tools//chromedriver//chromedriver_win32//chromedriver.exe/");
		RadioCheckBoxs test = new RadioCheckBoxs();
		test.radioButtonDemo();
		
		
		}
	
	public void radioButtonDemo() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.get("https://www.facebook.com/");
		 driver.findElement(By.linkText("Create new account")).click();
		 Thread.sleep(1000);
		 WebElement maleRadio = driver.findElement(By.xpath("//label[text()='Male']"));
		 
		 if (maleRadio.isDisplayed()) {
				System.out.println("The male radio button is displayed!");
			}else {
				System.out.println("The male radio button is NOT displayed!");
			}
			
			if (maleRadio.isEnabled()) {
				System.out.println("The male radio button is enabled!");
			}else {
				System.out.println("The male radio button is NOT enabled!");
			}
			
			if(maleRadio.isSelected()) {
				System.out.println("Male radio button is already selected");
			}else {
				// if not, then select the Male radio button
				maleRadio.click();
			}
			
			
			//Test case 1.
            //go to https://indeed.com
			//check if the search fields are enabled and displayed
		/*	
				WebDriver driver1 = new ChromeDriver();
				driver1.manage().window().maximize();
				driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);			        
				driver1.get("https://www.indeed.com");
			        WebElement whatSearchField = driver1.findElement(By.id("text-input-what"));
			        if (whatSearchField.isDisplayed()) {
			            System.out.println("The 'What' search field is displayed.");
			            if (whatSearchField.isEnabled()) {
			                System.out.println("The 'What' search field is enabled.");
			            } else {
			                System.out.println("The 'What' search field is disabled.");
			            }
			        } else {
			            System.out.println("The 'What' search field is not displayed.");
			        }
			        WebElement whereSearchField = driver1.findElement(By.id("text-input-where"));
			        if (whereSearchField.isDisplayed()) {
			            System.out.println("The 'Where' search field is displayed.");
			            if (whereSearchField.isEnabled()) {
			                System.out.println("The 'Where' search field is enabled.");
			            } else {
			                System.out.println("The 'Where' search field is disabled.");
			            }
			        } else {
			            System.out.println("The 'Where' search field is not displayed.");
			       
			        
			       */ 
			        
		 // Test case 2.
		   //   go to http://practice.primetech-apps.com/practice/radio-button
			 //   Find those available radio buttons.
			//Check if it's displayed and enabled,  if true, check if it's selected, if false select the button and check if it's selected.     
			            WebDriver driver11 = new ChromeDriver();
						driver11.manage().window().maximize();
						driver11.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);   
						 driver.get ("http://practice.primetech-apps.com/practice/radio-button");
					        List<WebElement> radioButtons = driver.findElements(By.cssSelector("input[type='radio']"));
					        for (WebElement radioButton : radioButtons) {
					            if (radioButton.isDisplayed() && radioButton.isEnabled()) {
					                System.out.println("Radio button is displayed and enabled.");
					                if (radioButton.isSelected()) {
					                    System.out.println("Radio button is selected.");
					                } else {
					                    radioButton.click();
					                    System.out.println("Radio button is not selected. Clicked on it.");
					                }
					            } else {
					                System.out.println("Radio button is not displayed or enabled.");
					            }
					        }
			        
	// Test case 3.
	//	go to http://practice.primetech-apps.com/practice/check-box
	//find the checkboxes and verify if it's displayed, if true, then verify if it's enabled, if true,        
	// verify if it's selected, if false, then check the boxes. Then verify if it's checked.
					        
			 WebDriver driver111 = new ChromeDriver();
				driver111.manage().window().maximize();
			driver111.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);   
			 driver.get ("http://practice.primetech-apps.com/practice/check-box");	   
			 List<WebElement>checkBoxes = driver.findElements(By.className("form-check-input"));
			 for (WebElement checkBox : checkBoxes) {
				 if ( checkBox.isDisplayed());
				 	System.out.println("Check is displayed");
				 if( checkBox.isEnabled());
				 	System.out.println("Check is enabled.");
				 if ( checkBox .isSelected());
				 	System.out.println("Check is selected");
			 


				 
			 }
			 
			        
			        }
			     
			    }
			

	

