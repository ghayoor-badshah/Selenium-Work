package wrap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WrapObject {
	WebDriver driver;
	public WrapObject(WebDriver driver){
		this.driver = driver;
	}
	public WebElement login(){
		return driver.findElement(By.xpath("//*[@id='wrap-theme']/wm-global-nav/header/div/div[3]/div/div/nav/a[1]/span"));
	}
	public WebElement emailOrUserName(){
		return driver.findElement(By.xpath("//*[@id='wrap-theme']/wm-global-nav/header/div/div[3]/div/div/div/wm-auth-popup/div/wm-auth/div/div[3]/wm-login/div/form/input[3]"));
	}
	public WebElement password(){
		return driver.findElement(By.xpath("//*[@id='wrap-theme']/wm-global-nav/header/div/div[3]/div/div/div/wm-auth-popup/div/wm-auth/div/div[3]/wm-login/div/form/input[4]"));
	}
	public WebElement signIn(){
		return driver.findElement(By.xpath("//*[@id='wrap-theme']/wm-global-nav/header/div/div[3]/div/div/div/wm-auth-popup/div/wm-auth/div/div[3]/wm-login/div/form/button"));
	}
	public WebElement newWrap(){
		return driver.findElement(By.xpath("//*[@id='wrap-theme']/div[2]/div[1]/div/div/div[2]/div[2]/button/i"));
	}
	public WebElement wrapFromScratch(){
		return driver.findElement(By.xpath("//*[@id='wrap-theme']/div[5]/div/div/wm-wrap-settings/div/div/div[1]/button[2]"));
	}
	public WebElement publishWrap(){
		return driver.findElement(By.xpath("//*[@id='wrap-theme']/div[2]/div[1]/div/wm-wrap-editor/div/wm-action-bar/div/div[2]/div[9]/button"));
	}

}
