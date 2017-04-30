package wrap;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Wrap {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://authoring.qa.wrapdev.net");
		driver.manage().window().fullscreen();
		WrapObject wrap = new WrapObject(driver);
		
		//The following code is for the creating and publishing the Wrap if you are already a member of the website
		wrap.login().click();
		wrap.emailOrUserName().sendKeys("dummy293.05754250247395@yahoo.com");
		wrap.password().sendKeys("abc1234");
		wrap.signIn().click();
		Thread.sleep(5000L);
		wrap.newWrap().click();
		Thread.sleep(2000L);
		wrap.wrapFromScratch().click();
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE);
		Thread.sleep(1000L);
		wrap.publishWrap().click();
		Thread.sleep(10000L);
		action.sendKeys(Keys.ESCAPE);
		/*
		//The following code is for the first time SignUp into the Wrap WebSite
		FirstSignUp SignUp = new FirstSignUp(driver);
		SignUp.createWrap().click();
		SignUp.freeSignUp().click();
		SignUp.emailAddress().sendKeys("dummy293.05754250247395@yahoo.com");
		SignUp.signUpBtn().click();
		SignUp.userName().sendKeys("dummy29305754250247399");
		SignUp.password().sendKeys("abc1234");
		Thread.sleep(5000L);
		SignUp.createAccountBtn().click();
		SignUp.firstName().sendKeys("dummy");
		SignUp.lastName().sendKeys("kalo");
		SignUp.company().sendKeys("ABC");
		SignUp.phoneNo().sendKeys("818-888-8888");
		Thread.sleep(5000L);
		SignUp.createAccount().click();*/
		driver.quit();
	}
}
