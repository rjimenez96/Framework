package piit.AutomationTrainingProgram;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Browser {
	WebDriver driver;
  @Test
  public void f() {
	  WebElement id=driver.findElement(By.name("email"));
	  id.sendKeys("Silem@piit");
	  WebElement pssword=driver.findElement(By.name("pass"));
	  pssword.sendKeys("jhonsilver");
	  WebElement loginbutton=driver.findElement(By.name("login"));
	  loginbutton.click();
	  	
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\vitol\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	     driver.navigate().to("https://www.facebook.com");
	     driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
