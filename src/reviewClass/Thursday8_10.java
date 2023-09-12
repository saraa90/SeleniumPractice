package reviewClass;

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
import org.openqa.selenium.interactions.Actions;


public class Thursday8_10 {

	public static void main(String[] args) throws InterruptedException {

		  System.setProperty("webdriver.chrome.driver","/C://Users//saraa//OneDrive//Desktop//Web tools//chromedriver//chromedriver_win32//chromedriver.exe/");

		  	testCase1();
}

public static void testCase1() throws InterruptedException {
	
	/*

//	Navigate to (https://www.thetestingworld.com/testings).
	String url = "https://www.thetestingworld.com/testings";
	driver.get(url);
//	Maximize the browser & declare implicitly wait for 5 second.
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//Implicit Wait:
//  1- Set globally
//	2- Applies to all elements
//	3- Does not require a setting of a condition
//	4- Best used when all elements are loaded before the duration time set

//	Locate  "Register" webelement & varifly the element isDisplayed().
	WebElement registerBtn = driver.findElement(By.id("tab1"));
	System.out.println("The Register Button is Displayed " + registerBtn.isDisplayed());
//	Locate the textBox's for:  userName, email, passWord & sendKeys the values for each box.
	WebElement userName = driver.findElement(By.xpath("//input[@name='fld_username']"));
	String userN = "KM";
	WebElement email = driver.findElement(By.xpath("//input[@name='fld_email']"));
	String userEmail = "km@gmail.com";
	WebElement passWord = driver.findElement(By.xpath("//input[@name='fld_password']"));
	WebElement confirmPassW = driver.findElement(By.xpath("//input[@name='fld_cpassword']"));
	String userPassw = "12345";
	
	userName.sendKeys(userN);
	email.sendKeys(userEmail);
	
	passWord.sendKeys(userPassw);
	confirmPassW.sendKeys(userPassw);
	
	
//	Locate the "Date of birth", send the date in the correct format then click "Enter" using (Keys.ENTER).
	WebElement dob = driver.findElement(By.xpath("//input[@name='dob']"));
	String userDOB = "12/12/2000";
	
	//dob.sendKeys(userDOB);
	//dob.sendKeys(Keys.ENTER);
	dob.sendKeys(Keys.chord(userDOB, Keys.ENTER));
	//dob.sendKeys("06/13/1997", Keys.ENTER);
	
//	Locate "Select Country" dropdown & use select one for each: by value/visible text/index .
	WebElement countryDD = driver.findElement(By.id("countryId"));
	Select sel = new Select(countryDD);
	sel.selectByIndex(2);
	Thread.sleep(2000);
	sel.selectByValue("4");
	Thread.sleep(2000);
	sel.selectByVisibleText("United States");
//	Locate the "State" dropdown, use explicit wait for 3 seconds the select state by value 
	WebElement stateDD = driver.findElement(By.id("stateId"));
	
	WebDriverWait wait = new WebDriverWait(driver,3);
	wait.until(ExpectedConditions.elementToBeClickable(stateDD));
	
	
	Select sle1 = new Select(stateDD);
	sle1.selectByValue("3974");

	
	
//	Locate the "City" dropdown, use explicit wait for 3 seconds the select state by value 
	WebElement cityDD = driver.findElement(By.id("cityId"));
	
	WebDriverWait wt = new WebDriverWait(driver, 3);
	wt.until(ExpectedConditions.elementToBeClickable(cityDD));
	
	Select sle2 = new Select(cityDD);
	sle2.selectByVisibleText("Reston");
	
	
//	Locate checkbox for "terms & conditions" & "Sign up" then click on both.  
	
	
	
	//Navigate to (https://www.thetestingworld.com/testings).
	WebDriver driver = new ChromeDriver();

		String url = "https://www.thetestingworld.com/testings";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			        WebElement register = driver.findElement(By.xpath("//a[@class='btn btn-primary btn-block']"));
			        if (register.isDisplayed()) {
			            register.click();
			        }
			        WebElement username = driver.findElement(By.xpath("//input[@name='fld_username']"));
			        username.sendKeys("Saraa");
			    	Thread.sleep(2000);

			        WebElement email = driver.findElement(By.xpath("//input[@name='fld_email']"));
			        email.sendKeys("s.s.s@gmail.com");
			    	Thread.sleep(2000);

			        WebElement password = driver.findElement(By.xpath("//input[@name='fld_password']"));
			        password.sendKeys("password125");
			    	Thread.sleep(2000);

			        WebElement dob = driver.findElement(By.xpath("//input[@name='dob']"));
			        dob.sendKeys("07/09/2022" + Keys.ENTER);
			    	Thread.sleep(2000);

			        Select country = new Select(driver.findElement(By.xpath("//select[@name='sex']")));
			        country.selectByValue("2");
			    	Thread.sleep(2000);

			        Select state = new Select(driver.findElement(By.xpath("//select[@name='state']")));
			        WebDriverWait wait = new WebDriverWait(driver, 3);
			        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='state']")));
			        state.selectByValue("VA");
			    	Thread.sleep(2000);

			        Select city = new Select(driver.findElement(By.xpath("//select[@name='city']")));
			        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='city']")));
			        city.selectByValue("Alexandria");
			    	Thread.sleep(2000);

			        WebElement terms = driver.findElement(By.xpath("//input[@name='terms']"));
			        terms.click();
			    	Thread.sleep(2000);

			        WebElement signup = driver.findElement(By.xpath("//button[@type='submit']"));
			        signup.click();
*/
	/*
	
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.thetestingworld.com/testings");
    //driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    WebElement loginButton = driver.findElement(By.xpath("//label[contains(text(),'Login']"));
    loginButton.click();
    WebElement userName = driver.findElement(By.xpath("//input[@name='_txtUserName']"));
    WebElement passWord = driver.findElement(By.xpath("//input[@name='_txtPassword']"));
    userName.sendKeys("saraa");
    passWord.sendKeys("pass12345");
    loginButton.click();
    WebElement homeButton = driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
    homeButton.click();
    WebElement userList = driver.findElement(By.xpath("//a[text()='User List']"));
    userList.click();
    List<WebElement> users = driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));
    for (int i = 0; i < users.size(); i++) {
        List<WebElement> columns = users.get(i).findElements(By.tagName("td"));
        System.out.println("User " + (i + 1) + ": ");
        System.out.println("Name: " + columns.get(0).getText());
        System.out.println("Email: " + columns.get(1).getText());
        System.out.println("Phone: " + columns.get(2).getText());
        if (i == 1) {
            System.out.println("Email: " + columns.get(1).getText());
            System.out.println("Phone: " + columns.get(2).getText());
        }
 	 }
	*/
	
	
			   
			    /*
	
//	Test case: registerUser 
//	   
//	Step 1: Go to URL "https://www.thetestingworld.com/testings".
	WebDriver driver = new ChromeDriver();
	String url = "https://www.thetestingworld.com/testings";
	driver.get(url);
//	Step 2: Maximize the browser & declare implicitly wait for 5 second.
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	Step 3:  Verify the browser landed on the "Register" page. 
	
	WebElement registerBtn = driver.findElement(By.xpath("//*[@for='tab1']"));
	System.out.println("The Register Button is Displayed " + registerBtn.isDisplayed());

//	Step 4: Locate all the required Text Boxes, Dropdowns, Radio Buttons.

	WebElement userName = driver.findElement(By.xpath("//input[@name='fld_username']"));
	String userN = "KM";
	WebElement email = driver.findElement(By.xpath("//input[@name='fld_email']"));
	String userEmail = "km@gmail.com";
	WebElement passWord = driver.findElement(By.xpath("//input[@name='fld_password']"));
	WebElement confirmPassW = driver.findElement(By.xpath("//input[@name='fld_cpassword']"));
	String userPassw = "12345";
	
	userName.sendKeys(userN);
	email.sendKeys(userEmail);
	
	passWord.sendKeys(userPassw);
	confirmPassW.sendKeys(userPassw);
	
	WebElement dob = driver.findElement(By.xpath("//input[@name='dob']"));
	String userDOB = "12/12/2000";
	
	//dob.sendKeys(userDOB);
	//dob.sendKeys(Keys.ENTER);
	dob.sendKeys(Keys.chord(userDOB, Keys.ENTER));
	
	WebElement phoneNumber = driver.findElement(By.cssSelector("input[name='phone']"));
	String userPHnumber = "1012023090";
	phoneNumber.sendKeys(userPHnumber);
	
	WebElement address = driver.findElement(By.cssSelector("input[name='address']"));
	String userAddress = "1234 fairfax blvd";
	address.sendKeys(userAddress);
	
	WebElement radioAddresstype = driver.findElement(By.cssSelector("input[value='office']"));
	radioAddresstype.click();
	
	WebElement genderDD = driver.findElement(By.cssSelector("select[name='sex']"));
	Select sl3 = new Select(genderDD);
	sl3.selectByVisibleText("Male");
	
	WebElement countryDD = driver.findElement(By.id("countryId"));
	Select sel = new Select(countryDD);
	sel.selectByValue("231");
	
	WebElement stateDD = driver.findElement(By.id("stateId"));
	WebDriverWait wait = new WebDriverWait(driver,3);
	wait.until(ExpectedConditions.elementToBeClickable(stateDD));
	Select sle1 = new Select(stateDD);
	sle1.selectByValue("3974");
	
	WebElement cityDD = driver.findElement(By.id("cityId"));
	WebDriverWait wt = new WebDriverWait(driver, 3);
	wt.until(ExpectedConditions.elementToBeClickable(cityDD));
	Select sle2 = new Select(cityDD);
	sle2.selectByVisibleText("Fairfax");
	
	WebElement zipCode = driver.findElement(By.cssSelector("input[name='zip']"));
	String userZipCode = "11001";
	zipCode.sendKeys(userZipCode);
	
	

//	Step 5: Locate the checkbox for Terms and Conditions and Sign Up button and click.  
	
	WebElement termsAndCond = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
	termsAndCond.click();
	WebElement logInBtn = driver.findElement(By.xpath("//*[@value='Sign up']"));
	logInBtn.click();
	
//	Step 6: Locate "User is successfully Register. Now You can Login" webelement and verify its displayed on the page. 
	
	String actualMsg = "User is successfully Register. Now You can Login";
	String expectedMsg = driver.findElement(By.className("vd_green")).getText();
	String expectedMsg = driver.
			
	System.out.println(actualMsg + "VS" +expectedMsg);
//	Step 7: Locate the Login button and click on it. 
*/	
/*
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Go to URL "https://www.thetestingworld.com/testings".
		driver.get("https://www.thetestingworld.com/testings");
		
		//Locate the Login button and click on it.
		WebElement LoginBtn = driver.findElement(By.xpath("(//*[contains(text(), 'Login')])[3]"));
		LoginBtn.click();
		
		//Locate the userName and passWord text box and put your info. 
		WebElement userNameBox = driver.findElement(By.cssSelector("input[name='_txtUserName']"));
		userNameBox.sendKeys("Jawaher");
		
		WebElement passwordBox = driver.findElement(By.cssSelector("input[name='_txtPassword']"));
		passwordBox.sendKeys("123456");
		
		//Locate the Keep me logged in checkbox and click on it.
		WebElement checkBox = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		checkBox.click();
		
		//Locate the Login button and click on it.
		WebElement loginBtn = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
		loginBtn.click();
		
		//Locate the Home button then select "user list" from the drop down menu
		WebElement homeBtnDD = driver.findElement(By.xpath("//*[contains(text(),'Home')]"));
		//homeBtnDD.click();
		Thread.sleep(1000);
		
		Actions letdoaction = new Actions(driver);
		letdoaction.moveToElement(homeBtnDD).perform();
		
		Thread.sleep(1000);
		
		WebElement userlistBtn = driver.findElement(By.xpath("//*[contains(text(),'User List')]"));
		userlistBtn.click();
		
		
		//Save all users in a List of WebElements, then print the user information 
		List <WebElement> usersList = driver.findElements(By.className("items"));
		for (int i = 0; i < usersList.size(); i++) {
			System.out.println(usersList.get(i));
		}
		
	}


	WebDriver driver = new ChromeDriver();
	String url = "https://www.thetestingworld.com/testings";
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	driver.findElement(By.xpath("//label[contains(text(),'Login')]")).click();

	WebElement userNameBox = driver.findElement(By.xpath("//input[@name='_txtUserName']"));
	userNameBox.sendKeys("PrimeT");
	WebElement passWordBox = driver.findElement(By.xpath("//input[@name='_txtPassword']"));
	passWordBox.sendKeys("12345");
	WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Login']"));
	loginBtn.click();
	WebElement homeBtn = driver.findElement(By.xpath("//*[contains(text(),'Home')]"));
	Thread.sleep(1000);

	Actions letdoaction = new Actions(driver);
	letdoaction.moveToElement(homeBtn).perform();

	Thread.sleep(1000);

	WebElement userListbtn = driver.findElement(By.xpath("//*[contains(text(),'User List')]"));
	userListbtn.click();

	List <WebElement> usersLst = driver.findElements(By.className("items"));
		System.out.println(usersLst.size());
	for (int i = 0; i < usersLst.size(); i++) {
			System.out.println(usersLst.get(i).getText());
}
*/

//	Login to your account 
driver.findElement(By.xpath("//label[contains(text(),'Login')]")).click();

WebElement userNameBox = driver.findElement(By.xpath("//input[@name='_txtUserName']"));
userNameBox.sendKeys("PrimeT");
WebElement passWordBox = driver.findElement(By.xpath("//input[@name='_txtPassword']"));
passWordBox.sendKeys("12345");
WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Login']"));
loginBtn.click();
//	Locate the "Dual List Box Demo"  and save it in a List of WebElements.
WebElement listBox = driver.findElement(By.className("pickData"));
//Use Select Class to select the first 5 names on the list 'by index' or 'visible text'.	
Select slt1 = new Select(listBox);
slt1.selectByIndex(0);
slt1.selectByIndex(1);
slt1.selectByVisibleText("Alice");
slt1.selectByVisibleText("Isabella");
slt1.selectByVisibleText("Manuela");
//	Get all the selected options using getAllSelectedOptions

List <WebElement> selectedoption = slt1.getAllSelectedOptions();
System.out.println(selectedoption.get(0).getText());
//	Add the selected names to the second list. 
driver.findElement(By.className("pAdd")).click();
//	Select all the names from the second list and deselect the last two names. 
//	Use wait for 3 seconds then Locate Remove All button and click on it.
Thread.sleep(1000);
WebElement listofselecteduser = driver.findElement(By.className("pickListResult"));
Select slt2 = new Select(listofselecteduser);
slt2.selectByIndex(0);
slt2.selectByIndex(1);
slt2.selectByIndex(2);
slt2.selectByIndex(3);
slt2.selectByIndex(4);

Thread.sleep(2000);
slt2.deselectByIndex(4);
slt2.deselectByIndex(3);

}

public static void alerthandle() throws InterruptedException {
WebDriver driver = new ChromeDriver();
String url = "https://demoqa.com/alerts";
driver.get(url);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
Thread.sleep(1000);
driver.findElement(By.id("promtButton")).click();

Alert alert = driver.switchTo().alert();

alert.sendKeys("Kewan");
alert.accept();

}









	
}



			

	





