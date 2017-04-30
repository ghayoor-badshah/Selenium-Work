import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Object Repository for DMV Driver License/ID Form
public class DMVCardForm {
		static WebDriver driver;
		public DMVCardForm(WebDriver driver){
			DMVCardForm.driver = driver;
		}
		public static WebElement verifyDmvHeading(){
			return driver.findElement(By.id("dmvHeading"));
		}
		public static WebElement clickOnDriverLicenseBox(){
			return driver.findElement(By.id("driverLicense"));
		}
		public static WebElement verifyDriverLicenseText(){
			return driver.findElement(By.id("dLText"));
		}
		public static WebElement clickGetIdCardFirstTimeBox(){
			return driver.findElement(By.id("getIdCard"));
		}
		public static WebElement verifyGetIdCardFirstTimeText(){
			return driver.findElement(By.id("idCardText"));
		}
		public static WebElement clickNoToPreviousHistoryBox(){
			return driver.findElement(By.id("noToPreviousHistory"));
		}
		public static WebElement verifyNoToPreviusHistoryText(){
			return driver.findElement(By.id("noToPreviousHistoryText"));
		}
		public static WebElement enterFirstName(){
			return driver.findElement(By.id("firstName"));
		}
		public static WebElement enterLastName(){
			return driver.findElement(By.id("lastName"));
		}
		public static WebElement enterMiddleName(){
			return driver.findElement(By.id("middleName"));
		}
		public static WebElement enterSuffix(){
			return driver.findElement(By.id("suffix"));
		}
		public static WebElement clickNoTodifferentName(){
			return driver.findElement(By.id("noTodifferentName"));
		}
		public static WebElement verifyNoToDifferentNameText(){
			return driver.findElement(By.id("noForDifferentNameText"));
		}
		public static WebElement enterDateOfBirth(){
			return driver.findElement(By.id("dateOfBirth"));
		}
		public static WebElement clickOnMaleBox(){
			return driver.findElement(By.id("male"));
		}
		public static WebElement verifyMaleText(){
			return driver.findElement(By.id("maleText"));
		}
		public static WebElement enterHairColor(){
			return driver.findElement(By.id("hairColor"));
		}
		public static WebElement enterEyeColor(){
			return driver.findElement(By.id("eyeColor"));
		}
		public static WebElement enterHeight(){
			return driver.findElement(By.id("height"));
		}
		public static WebElement enterWeight(){
			return driver.findElement(By.id("weight"));
		}
		public static WebElement enterMailingAddress(){
			return driver.findElement(By.id("mailingAddress"));
		}
		public static WebElement clickYesToSocialSecurityBox(){
			return driver.findElement(By.id("yesToSocialSecurity"));
		}
		public static WebElement verifyYesToSocialSecurityText(){
			return driver.findElement(By.id("yesToSocialSecurityText"));
		}
		public static WebElement enterFirstThreeDigitOfSocial(){
			return driver.findElement(By.id("firstThreeDigitOfSocial"));
		}
		public static WebElement enterMiddleTwoDigitOfSocial(){
			return driver.findElement(By.id("middleTwoDigitOfSocial"));
		}
		public static WebElement enterLastThreeDigitOfSocial(){
			return driver.findElement(By.id("lastThreeDigitOfSocial"));
		}
		public static WebElement enterApplicantSignature(){
			return driver.findElement(By.id("applicantSignature"));
		}
		public static WebElement enterToDayDate(){
			return driver.findElement(By.id("toDayDate"));
		}
		public static WebElement clickNoForMedicalCondiationBox(){
			return driver.findElement(By.id("noForMedicalCondiation"));
		}
		public static WebElement verifyNoForMedicalConditionText(){
			return driver.findElement(By.id("noForMedicalConditionText"));
		}
		public static WebElement clickNoToVeteranBox(){
			return driver.findElement(By.id("noToVeteran"));
		}
		public static WebElement verifyNoToVeteranText(){
			return driver.findElement(By.id("noToVeteranText"));
		}
		public static WebElement clickNoToOrganDonationBox(){
			return driver.findElement(By.id("noToOrganDonation"));
		}
		public static WebElement verifyNoToOrganDonationText(){
			return driver.findElement(By.id("noToOrganDonationText"));
		}
		public static WebElement clickYesToUSCitizenBox(){
			return driver.findElement(By.id("yesToUSCitizen"));
		}
		public static WebElement verifyYesToUSCitizenText(){
			return driver.findElement(By.id("yesToUSCitizenText"));
		}
		public static WebElement clickYesToEligibleToVoteBox(){
			return driver.findElement(By.id("yesToEligibleToVote"));
		}
		public static WebElement verifyYesToEligibleToVoteText(){
			return driver.findElement(By.id("yesToEligibleToVoteText"));
		}
		public static WebElement clickRegisterToVoteBox(){
			return driver.findElement(By.id("registerToVote"));
		}
		public static WebElement verifyRegisterToVoteText(){
			return driver.findElement(By.id("registerToVoteText"));
		}
}
