package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {

	
		private static final WebElement SearchButtonClick = null;
		WebDriver driver;
		@FindBy(xpath = "(//*[@name='email'])[2]") WebElement Id;
        @FindBy(name = "did_submit") WebElement SearchbuttonClicks;
        @FindBy(xpath = "//*[contains(text(),'please enter your email')]") WebElement Question;
        public ForgotPasswordPage(WebDriver driver) {
       	 this.driver=driver;
       	 PageFactory.initElements(driver, this);
        }
        public void IdsSendKeys() {
        	Id.sendKeys("Ali@gmail.com");
        }
        public void SearchButtonClick() {
        	SearchButtonClick.click();
        }
		public String QuestionOfText() {
			// TODO Auto-generated method stub
			return null;
		}
	
			
			
		}
	
		
			
		
        
	



