import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Object Repository for TriNETSOI
public class TriNetSOI {
		static WebDriver driver;
		public TriNetSOI(WebDriver driver){
			TriNetSOI.driver = driver;
		}
		public static WebElement verifyFirstParagraph(){
			return driver.findElement(By.id("paraOne"));
		}
		public static WebElement verifyAddressChanges(){
			return driver.findElement(By.id("addressChanges"));
		}
		public static WebElement verifyFormsAssistance(){
			return driver.findElement(By.id("formsAssistance"));
		}
		public static WebElement verifyPayRollAndYTDReports(){
			return driver.findElement(By.id("payRollAndYTD"));
		}
		public static WebElement verifyGovernmentEmplVerification(){
			return driver.findElement(By.id("govEmpVeri"));
		}
		public static WebElement verifyHealthPlanEligibilityQuestion(){
			return driver.findElement(By.id("healthPlanEligibilityQuestion"));
		}
		public static WebElement verifyCreditableCoverage(){
			return driver.findElement(By.id("creditableCoverage"));
		}
		public static WebElement verifyCheckHistoryReport(){
			return driver.findElement(By.id("checkHistoryReport"));
		}
		public static WebElement verifyWebsiteNavigation(){
			return driver.findElement(By.id("websiteNavigation"));
		}
		public static WebElement verifyPayrollTracking(){
			return driver.findElement(By.id("payrollTracking"));
		}
		public static WebElement verifyW2Reprint(){
			return driver.findElement(By.id("w2Reprint"));
		}
		public static WebElement verifyCall(){
			return driver.findElement(By.id("call"));
		}
		public static WebElement verifyPhoneNo(){
			return driver.findElement(By.id("phoneNo"));
		}
		public static WebElement verifySpanishSpeakingRepresentative(){
			return driver.findElement(By.id("spanishSpeakingRepresentative"));
		}
		public static WebElement verifyEmail(){
			return driver.findElement(By.id("email"));
		}
		public static WebElement verifyFirstEmail(){
			return driver.findElement(By.id("firstEmail"));
		}
		public static WebElement verifyHours(){
			return driver.findElement(By.id("hours"));
		}
		public static WebElement verifySevenToNine(){
			return driver.findElement(By.id("sevenToNine"));
		}
		public static WebElement verifySixToEight(){
			return driver.findElement(By.id("sixToEight"));
		}
		public static WebElement verifyFourToSix(){
			return driver.findElement(By.id("fourToSix"));
		}
		public static WebElement verifyFirstAddress(){
			return driver.findElement(By.id("firstAddress"));
		}
		public static WebElement verifyPoBox(){
			return driver.findElement(By.id("poBox"));
		}
		public static WebElement enterRentalAgent(){
			return driver.findElement(By.id("rentalAgent"));
		}
		public static WebElement enterPayType(){
			return driver.findElement(By.id("payType"));
		}
		public static WebElement enterPO(){
			return driver.findElement(By.id("pO"));
		}
		public static WebElement enterFirstStockNo(){
			return driver.findElement(By.id("firstStock#"));
		}
		public static WebElement enterFirstDescription(){
			return driver.findElement(By.id("firstDescription"));
		}
		public static WebElement enterFirstQuantityOrder(){
			return driver.findElement(By.id("firstQuantityOrder"));
		}
		public static WebElement enterFirstQuantityShipped(){
			return driver.findElement(By.id("firstQuantityShipped"));
		}
		public static WebElement enterFirstToGoOut(){
			return driver.findElement(By.id("firstToGoOut"));
		}
		public static WebElement enterSecondStockNo(){
			return driver.findElement(By.id("secondStock#"));
		}
		public static WebElement enterSecondDescription(){
			return driver.findElement(By.id("secondDescription"));
		}
		public static WebElement enterSecondQuantityOrder(){
			return driver.findElement(By.id("secondQuantityOrder"));
		}
		public static WebElement enterSecondQuantityShipped(){
			return driver.findElement(By.id("secondQuantityShipped"));
		}
		public static WebElement enterSecondToGoOut(){
			return driver.findElement(By.id("secondToGoOut"));
		}
		public static WebElement enterThirdStockNo(){
			return driver.findElement(By.id("thirdStock#"));
		}
		public static WebElement enterThirdDescription(){
			return driver.findElement(By.id("thirdDescription"));
		}
		public static WebElement enterThirdQuantityOrder(){
			return driver.findElement(By.id("thirdQuantityOrder"));
		}
		public static WebElement enterThirdQuantityShipped(){
			return driver.findElement(By.id("thirdQuantityShipped"));
		}
		public static WebElement enterThirdToGoOut(){
			return driver.findElement(By.id("thirdToGoOut"));
		}
		public static WebElement enterFourthStockNo(){
			return driver.findElement(By.id("fourthStock#"));
		}
		public static WebElement enterFourthDescription(){
			return driver.findElement(By.id("fourthDescription"));
		}
		public static WebElement enterFourthQuantityOrder(){
			return driver.findElement(By.id("fourthQuantityOrder"));
		}
		public static WebElement enterFourthQuantityShipped(){
			return driver.findElement(By.id("fourthQuantityShipped"));
		}
		public static WebElement enterFourthToGoOut(){
			return driver.findElement(By.id("fourthToGoOut"));
		}
		public static WebElement enterFifthStockNo(){
			return driver.findElement(By.id("fifthStock#"));
		}
		public static WebElement enterFifthDescription(){
			return driver.findElement(By.id("fifthDescription"));
		}
		public static WebElement enterFifthQuantityOrder(){
			return driver.findElement(By.id("fifthQuantityOrder"));
		}
		public static WebElement enterFifthQuantityShipped(){
			return driver.findElement(By.id("fifthQuantityShipped"));
		}
		public static WebElement enterFifthToGoOut(){
			return driver.findElement(By.id("fifthToGoOut"));
		}
}
