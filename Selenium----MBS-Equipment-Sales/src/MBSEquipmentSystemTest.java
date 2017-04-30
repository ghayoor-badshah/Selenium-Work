import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//Test and verifying data for MBS Equipment Sales
public class MBSEquipmentSystemTest {
	static WebDriver driver;
	@BeforeTest
	public static void configureDriver() throws FileNotFoundException, IOException, InterruptedException {
		System.setProperty("webdriver.edge.driver", "src/MicrosoftWebDriver.exe");
		driver = new EdgeDriver();
		driver.get("localhost/mbs-equipment-co.html");
	}
	@Test
	public void test() {
		new MBSEquipment(driver);	
		MBSEquipment.verifyMbsEquipment();
		MBSEquipment.enterTodayDate().sendKeys(Data.myList[1]);
		MBSEquipment.enterCurrentTime().sendKeys(Data.myList[2]);
		MBSEquipment.enterQuote().sendKeys(Data.myList[3]);
		MBSEquipment.enterPageNo().sendKeys(Data.myList[4]);
		MBSEquipment.enterQuoteNo().sendKeys(Data.myList[5]);
		MBSEquipment.enterOrderDescription().sendKeys(Data.myList[6]);
		MBSEquipment.enterCustomerName().sendKeys(Data.myList[7]);
		MBSEquipment.enterPackageType().sendKeys(Data.myList[8]);
		MBSEquipment.enterBillingAddress().sendKeys(Data.myList[9]);
		MBSEquipment.enterOthers().sendKeys(Data.myList[10]);
		MBSEquipment.enterPhoneNo().sendKeys(Data.myList[11]);
		MBSEquipment.enterShipDate().sendKeys(Data.myList[12]);
		MBSEquipment.enterCustomerContact().sendKeys(Data.myList[13]);
		MBSEquipment.enterTerms().sendKeys(Data.myList[14]);
		MBSEquipment.enterBillType().sendKeys(Data.myList[15]);
		MBSEquipment.enterSalesPerson().sendKeys(Data.myList[16]);
		MBSEquipment.enterShipMethod().sendKeys(Data.myList[17]);
		MBSEquipment.enterRentalAgent().sendKeys(Data.myList[18]);
		MBSEquipment.enterPayType().sendKeys(Data.myList[19]);
		MBSEquipment.enterPO().sendKeys(Data.myList[20]);
		MBSEquipment.enterFirstStockNo().sendKeys(Data.myList[21]);
		MBSEquipment.enterFirstDescription().sendKeys(Data.myList[22]);
		MBSEquipment.enterFirstQuantityOrder().sendKeys(Data.myList[23]);
		MBSEquipment.enterFirstQuantityShipped().sendKeys(Data.myList[24]);
		MBSEquipment.enterFirstToGoOut().sendKeys(Data.myList[25]);
		MBSEquipment.enterSecondStockNo().sendKeys(Data.myList[26]);
		MBSEquipment.enterSecondDescription().sendKeys(Data.myList[27]);
		MBSEquipment.enterSecondQuantityOrder().sendKeys(Data.myList[28]);
		MBSEquipment.enterSecondQuantityShipped().sendKeys(Data.myList[29]);
		MBSEquipment.enterSecondToGoOut().sendKeys(Data.myList[30]);
		MBSEquipment.enterThirdStockNo().sendKeys(Data.myList[31]);
		MBSEquipment.enterThirdDescription().sendKeys(Data.myList[32]);
		MBSEquipment.enterThirdQuantityOrder().sendKeys(Data.myList[33]);
		MBSEquipment.enterThirdQuantityShipped().sendKeys(Data.myList[34]);
		MBSEquipment.enterThirdToGoOut().sendKeys(Data.myList[35]);
		MBSEquipment.enterFourthStockNo().sendKeys(Data.myList[36]);
		MBSEquipment.enterFourthDescription().sendKeys(Data.myList[37]);
		MBSEquipment.enterFourthQuantityOrder().sendKeys(Data.myList[38]);
		MBSEquipment.enterFourthQuantityShipped().sendKeys(Data.myList[39]);
		MBSEquipment.enterFourthToGoOut().sendKeys(Data.myList[40]);
		MBSEquipment.enterFifthStockNo().sendKeys(Data.myList[41]);
		MBSEquipment.enterFifthDescription().sendKeys(Data.myList[42]);
		MBSEquipment.enterFifthQuantityOrder().sendKeys(Data.myList[43]);
		MBSEquipment.enterFifthQuantityShipped().sendKeys(Data.myList[44]);
		MBSEquipment.enterFifthToGoOut().sendKeys(Data.myList[45]);
	}
	@AfterTest
	public void endTest() throws FileNotFoundException, IOException, InterruptedException {
		OpenReport.openExcel();
		driver.quit();
	}
}
