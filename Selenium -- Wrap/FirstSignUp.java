package wrap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstSignUp {
	WebDriver driver;
	public FirstSignUp(WebDriver driver){
		this.driver = driver;
	}
	public WebElement createWrap(){
		return driver.findElement(By.xpath("//*[@id='wrap-theme']/div[2]/div[1]/wm-landing/div/div[1]/a"));
	}
	public WebElement freeSignUp(){
		return driver.findElement(By.xpath("//*[@id='pricingModel']/div/div[1]/div[4]/div[1]/div[2]/div[3]/a"));
	}
	public WebElement emailAddress(){
		return driver.findElement(By.xpath("//*[@id='wrap-theme']/div[2]/div[1]/wm-plans-page/div/div/div/wm-plans-authorization/div/div/wm-auth-page/div/ng-transclude/wm-auth/div/div[3]/wm-signup/div/div/form/input"));
	}
	public WebElement signUpBtn(){
		return driver.findElement(By.xpath("//*[@id='wrap-theme']/div[2]/div[1]/wm-plans-page/div/div/div/wm-plans-authorization/div/div/wm-auth-page/div/ng-transclude/wm-auth/div/div[3]/wm-signup/div/div/form/button"));
	}
	public WebElement userName(){
		return driver.findElement(By.xpath("//*[@id='wrap-theme']/div[2]/div[1]/wm-plans-page/div/div/div/wm-plans-authorization/div/div/wm-auth-page/div/ng-transclude/wm-auth/div/div[3]/wm-signup/div/div/form/input[3]"));
	}
	public WebElement password(){
		return driver.findElement(By.xpath("//*[@id='wrap-theme']/div[2]/div[1]/wm-plans-page/div/div/div/wm-plans-authorization/div/div/wm-auth-page/div/ng-transclude/wm-auth/div/div[3]/wm-signup/div/div/form/input[4]"));
	}
	public WebElement createAccountBtn(){
		return driver.findElement(By.xpath("//*[@id='wrap-theme']/div[2]/div[1]/wm-plans-page/div/div/div/wm-plans-authorization/div/div/wm-auth-page/div/ng-transclude/wm-auth/div/div[3]/wm-signup/div/div/form/button"));
	}
	public WebElement firstName(){
		return driver.findElement(By.xpath("//*[@id='wrap-theme']/div[2]/div[1]/wm-plans-page/div/div/div/wm-plans-authorization/div/div/wm-auth-page/div/ng-transclude/wm-auth/div/div[3]/wm-signup/div/div/form/input[1]"));
	}
	public WebElement lastName(){
		return driver.findElement(By.xpath("//*[@id='wrap-theme']/div[2]/div[1]/wm-plans-page/div/div/div/wm-plans-authorization/div/div/wm-auth-page/div/ng-transclude/wm-auth/div/div[3]/wm-signup/div/div/form/input[2]"));
	}
	public WebElement company(){
		return driver.findElement(By.xpath("//*[@id='wrap-theme']/div[2]/div[1]/wm-plans-page/div/div/div/wm-plans-authorization/div/div/wm-auth-page/div/ng-transclude/wm-auth/div/div[3]/wm-signup/div/div/form/input[3]"));
	}
	public WebElement phoneNo(){
		return driver.findElement(By.xpath("//*[@id='wrap-theme']/div[2]/div[1]/wm-plans-page/div/div/div/wm-plans-authorization/div/div/wm-auth-page/div/ng-transclude/wm-auth/div/div[3]/wm-signup/div/div/form/input[4]"));
	}
	public WebElement createAccount(){
		return driver.findElement(By.xpath("//*[@id='wrap-theme']/div[2]/div[1]/wm-plans-page/div/div/div/wm-plans-authorization/div/div/wm-auth-page/div/ng-transclude/wm-auth/div/div[3]/wm-signup/div/div/form/button"));
	}
}
