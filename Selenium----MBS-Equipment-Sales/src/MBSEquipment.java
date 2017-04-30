import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Object Repository for MBS Equipment Sales
public class MBSEquipment {
		static WebDriver driver;
		public MBSEquipment(WebDriver driver){
			MBSEquipment.driver = driver;
		}
		public static WebElement verifyMbsEquipment(){
			return driver.findElement(By.id("mbsEquipment"));
		}
		public static WebElement enterTodayDate(){
			return driver.findElement(By.id("todayDate"));
		}
		public static WebElement enterCurrentTime(){
			return driver.findElement(By.id("currentTime"));
		}
		public static WebElement enterQuote(){
			return driver.findElement(By.id("quote"));
		}
		public static WebElement enterPageNo(){
			return driver.findElement(By.id("pageNo"));
		}
		public static WebElement enterQuoteNo(){
			return driver.findElement(By.id("quoteNo"));
		}
		public static WebElement enterOrderDescription(){
			return driver.findElement(By.id("orderDescription"));
		}
		public static WebElement enterCustomerName(){
			return driver.findElement(By.id("customerName"));
		}
		public static WebElement enterPackageType(){
			return driver.findElement(By.id("packageType"));
		}
		public static WebElement enterBillingAddress(){
			return driver.findElement(By.id("billingAddress"));
		}
		public static WebElement enterOthers(){
			return driver.findElement(By.id("others"));
		}
		public static WebElement enterPhoneNo(){
			return driver.findElement(By.id("phoneNo"));
		}
		public static WebElement enterShipDate(){
			return driver.findElement(By.id("shipDate"));
		}
		public static WebElement enterCustomerContact(){
			return driver.findElement(By.id("customerContact"));
		}
		public static WebElement enterTerms(){
			return driver.findElement(By.id("terms"));
		}
		public static WebElement enterBillType(){
			return driver.findElement(By.id("billType"));
		}
		public static WebElement enterSalesPerson(){
			return driver.findElement(By.id("salesPerson"));
		}
		public static WebElement enterShipMethod(){
			return driver.findElement(By.id("shipMethod"));
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
