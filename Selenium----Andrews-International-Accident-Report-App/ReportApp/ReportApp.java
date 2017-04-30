import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Object Repository for Andrews International Incident Report
public class ReportApp {
		static WebDriver driver;
		public ReportApp(WebDriver driver){
			ReportApp.driver = driver;
		}
		public static WebElement enterDrNo(){
			return driver.findElement(By.id("dr#"));
		}
		public static WebElement enterInvestigationTopic(){
			return driver.findElement(By.id("investigationTopic"));
		}
		public static WebElement enterExtra(){
			return driver.findElement(By.id("extra"));
		}
		public static WebElement enterAddressOfOccurrence(){
			return driver.findElement(By.id("addressOfOccurrence"));
		}
		public static WebElement enterDateAndTimeOccurrence(){
			return driver.findElement(By.id("dateAndTimeOccurrence"));
		}
		public static WebElement enterDateAndTimeReported(){
			return driver.findElement(By.id("dateAndTimeReported"));
		}
		public static WebElement enterExactLocationOnPremisses(){
			return driver.findElement(By.id("exactLocationOnPremisses"));
		}
		public static WebElement enterNotificationPerson(){
			return driver.findElement(By.id("notificationPerson"));
		}
		public static WebElement enterConnectedRepots(){
			return driver.findElement(By.id("connectedRepotere"));
		}
		public static WebElement enterTypeOfPropertyTakenLost(){
			return driver.findElement(By.id("typeOfPropertyTakenLost"));
		}
		public static WebElement enterStolenLost(){
			return driver.findElement(By.id("stolenLost"));
		}
		public static WebElement enterRecoverd(){
			return driver.findElement(By.id("recoverd"));
		}
		public static WebElement enterEstimatedDamage(){
			return driver.findElement(By.id("estimatedDamage"));
		}
		public static WebElement enterVehicleInvolved(){
			return driver.findElement(By.id("vehicleInvolved"));
		}
		public static WebElement enterYear(){
			return driver.findElement(By.id("year"));
		}
		public static WebElement enterMake(){
			return driver.findElement(By.id("make"));
		}
		public static WebElement enterModel(){
			return driver.findElement(By.id("model"));
		}
		public static WebElement enterType(){
			return driver.findElement(By.id("type"));
		}
		public static WebElement enterColor(){
			return driver.findElement(By.id("color"));
		}
		public static WebElement enterLicensePlate(){
			return driver.findElement(By.id("licensePlate"));
		}
		public static WebElement enterState(){
			return driver.findElement(By.id("state"));
		}
		public static WebElement enterBodyDamage(){
			return driver.findElement(By.id("bodyDamage"));
		}
		public static WebElement enterWindowsDamage(){
			return driver.findElement(By.id("windowsDamage"));
		}
		public static WebElement enterPointOfEntry(){
			return driver.findElement(By.id("pointOfEntry"));
		}
		public static WebElement enterMethodOfEntry(){
			return driver.findElement(By.id("methodOfEntry"));
		}
		public static WebElement enterInstrumentToolsUsed(){
			return driver.findElement(By.id("instrumentToolsUsed"));
		}
		public static WebElement enterTypeOfWindowOrDoor(){
			return driver.findElement(By.id("typeOfWindowOrDoor"));
		}
		public static WebElement enterFirstSex(){
			return driver.findElement(By.id("sex-one"));
		}
		public static WebElement enterFirstDesc(){
			return driver.findElement(By.id("desc-one"));
		}
		public static WebElement enterFirstHair(){
			return driver.findElement(By.id("hair-one"));
		}
		public static WebElement enterFirstEyes(){
			return driver.findElement(By.id("eyes-one"));
		}
		public static WebElement enterFirstHeight(){
			return driver.findElement(By.id("height-one"));
		}
		public static WebElement enterFirstWeight(){
			return driver.findElement(By.id("weight-one"));
		}
		public static WebElement enterFirstAge(){
			return driver.findElement(By.id("age-one"));
		}
		public static WebElement enterFirstClothingNameDob(){
			return driver.findElement(By.id("clothingNameDob-one"));
		}
		public static WebElement enterSecondSex(){
			return driver.findElement(By.id("sex-two"));
		}
		public static WebElement enterSecondDesc(){
			return driver.findElement(By.id("desc-two"));
		}
		public static WebElement enterSecondHair(){
			return driver.findElement(By.id("hair-two"));
		}
		public static WebElement enterSecondEyes(){
			return driver.findElement(By.id("eyes-two"));
		}
		public static WebElement enterSecondHeight(){
			return driver.findElement(By.id("height-two"));
		}
		public static WebElement enterSecondWeight(){
			return driver.findElement(By.id("weight-two"));
		}
		public static WebElement enterSecondAge(){
			return driver.findElement(By.id("age-two"));
		}
		public static WebElement enterSecondClothingNameDob(){
			return driver.findElement(By.id("clothingNameDob-two"));
		}
		public static WebElement enterFirstCode(){
			return driver.findElement(By.id("code-one"));
		}
		public static WebElement enterFirstNameAndDob(){
			return driver.findElement(By.id("nameAndDob-one"));
		}
		public static WebElement enterFirstResidence(){
			return driver.findElement(By.id("residence-one"));
		}
		public static WebElement enterFirstTelephone(){
			return driver.findElement(By.id("telephone-one"));
		}
		public static WebElement enterSecondCode(){
			return driver.findElement(By.id("code-two"));
		}
		public static WebElement enterFirstOccupationAndDriverLic(){
			return driver.findElement(By.id("occupationAndDriverLic-one"));
		}
		public static WebElement enterFirstBusinessResidence(){
			return driver.findElement(By.id("businessResidence-one"));
		}
		public static WebElement enterSecondTelephone(){
			return driver.findElement(By.id("telephone-two"));
		}
		public static WebElement enterThirdCode(){
			return driver.findElement(By.id("code-three"));
		}
		public static WebElement enterSecondNameAndDob(){
			return driver.findElement(By.id("nameAndDob-two"));
		}
		public static WebElement enterSecondResidence(){
			return driver.findElement(By.id("residence-two"));
		}
		public static WebElement enterThirdTelephone(){
			return driver.findElement(By.id("telephone-three"));
		}
		public static WebElement enterFourthCode(){
			return driver.findElement(By.id("code-four"));
		}
		public static WebElement enterSecondOccupationAndDriverLic(){
			return driver.findElement(By.id("occupationAndDriverLic-two"));
		}
		public static WebElement enterSecondBusinessResidence(){
			return driver.findElement(By.id("businessResidence-two"));
		}
		public static WebElement enterFourthTelephone(){
			return driver.findElement(By.id("telephone-four"));
		}
		public static WebElement enterFifthCode(){
			return driver.findElement(By.id("code-five"));
		}
		public static WebElement enterThirdNameAndDob(){
			return driver.findElement(By.id("nameAndDob-three"));
		}
		public static WebElement enterThirdResidence(){
			return driver.findElement(By.id("residence-three"));
		}
		public static WebElement enterFifthTelephone(){
			return driver.findElement(By.id("telephone-five"));
		}
		public static WebElement enterSixthCode(){
			return driver.findElement(By.id("code-six"));
		}
		public static WebElement enterThirdOccupationAndDriverLic(){
			return driver.findElement(By.id("occupationAndDriverLic-three"));
		}
		public static WebElement enterThirdBusinessResidence(){
			return driver.findElement(By.id("businessResidence-three"));
		}
		public static WebElement enterSixthTelephone(){
			return driver.findElement(By.id("telephone-six"));
		}
		public static WebElement enterSeventhCode(){
			return driver.findElement(By.id("code-seven"));
		}
		public static WebElement enterFourthNameAndDob(){
			return driver.findElement(By.id("nameAndDob-four"));
		}
		public static WebElement enterFourthResidence(){
			return driver.findElement(By.id("residence-four"));
		}
		public static WebElement enterSeventhTelephone(){
			return driver.findElement(By.id("telephone-seven"));
		}
		public static WebElement enterEighthCode(){
			return driver.findElement(By.id("code-eight"));
		}
		public static WebElement enterFourthOccupationDriverLic(){
			return driver.findElement(By.id("occupationDriverLic-four"));
		}
		public static WebElement enterFourthBusinessResidence(){
			return driver.findElement(By.id("businessResidence-four"));
		}
		public static WebElement enterEighthTelephone(){
			return driver.findElement(By.id("telephone-eight"));
		}
		public static WebElement enterSupervisorApproving(){
			return driver.findElement(By.id("supervisorApproving"));
		}
		public static WebElement enterInvestigatingOfficer(){
			return driver.findElement(By.id("investigatingOfficer"));
		}
		public static WebElement enterPersonReporting(){
			return driver.findElement(By.id("personReporting"));
		}
		
}
