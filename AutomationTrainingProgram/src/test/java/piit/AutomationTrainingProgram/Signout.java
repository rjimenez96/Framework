package piit.AutomationTrainingProgram;



import java.io.File;
import java.util.Date;

import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.ForgotPasswordPage;
import PageObjectModel.Home;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Signout {

	WebDriver driver;
  @Test(priority = 1)
  public void f() throws InterruptedException {
	  Home ob=new Home(driver);
	  ob.Email();
	  Pictures();
	  ob.PsswordFieldsEnters();
	  Thread.sleep(6000);
	  ob.ForgotLinkClick();
	  ForgotPasswordPage id=new ForgotPasswordPage(driver);
	  id.IdsSendKeys();
	  id.SearchButtonClick();
	  Thread.sleep(6000);
	  
	  File screenshots= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(screenshots, new File("C:\\Users\\vitol\\eclipse-workspace\\AutomationTrainingProgram\\Pictures"));
  }
  
public void Pictures() {
	// TODO Auto-generated method stub
	
}

@Test(priority = 2,dependsOnMethods = "f")
  public void  TexrVerificationMethod() throws InterruptedException {
	 driver.navigate().back();
	 Thread.sleep(6000);
	 ForgotPasswordPage id=new ForgotPasswordPage(driver);
	String Questions=  id.QuestionOfText();
	SoftAssert softit=new SoftAssert();
	softit.assertEquals("Please enter your email or mobile number to search for your account.", Questions);
    System.out.println("This is after assertion");
    softit.assertAll();
  }
  
    @BeforeClass
  public void beforeClass() {
    	//System.setProperty("webdriver.chrome.driver","C:\\Users\\vitol\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
	 // System.setProperty("webdriver.edge.driver","C:\\Users\\vitol\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\msedgedriver.exe");
      // driver=new ChromeDriver();
	   // driver=new EdgeDriver();
    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\vitol\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\geckodriver.exe");
    	 driver=new FirefoxDriver();
	     driver.navigate().to("https://www.facebook.com");
	     driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
 }
 public void Browsers(String window) {
	 if(window.equalsIgnoreCase("Chrome")); {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\vitol\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");	 
		 driver=new ChromeDriver();
	     driver.navigate().to("https://www.facebook.com");
	     driver.manage().window().maximize();
	 }else if(window.equalsIgnoreCase("Edge")) {
		 System.setProperty("webdriver.edge.driver","C:\\Users\\vitol\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\msedgedriver.exe");	 
		 driver=new EdgeDriver();
	     driver.navigate().to("https://www.facebook.com");
	     driver.manage().window().maximize();
	     
	 }else if(window.equalsIgnoreCase("Firefox")) {
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\vitol\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\geckodriver.exe");
    	 driver=new FirefoxDriver();
	     driver.navigate().to("https://www.facebook.com");
	     driver.manage().window().maximize();	 
	 }
	 public void Pictures() throws IOException {
		 Date dt=new Date();
		String sk= dt.toString().replace("","_" ).replace(":","_");
		 System.out.println(sk);
		 System.out.println(dt);
		 File screenshots= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(screenshots, new File("C:\\Users\\vitol\\eclipse-workspace\\AutomationTrainingProgram\\Pictures"));
 }








	
}
}
