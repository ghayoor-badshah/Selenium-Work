import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//Test and verifying data for Hollywood Rentals Login Form
public class HollyWoodRentalsTest {
	static WebDriver driver;
	@BeforeTest
	public static void configureDriver() throws FileNotFoundException, IOException, InterruptedException {
		System.setProperty("webdriver.edge.driver", "src/MicrosoftWebDriver.exe");
		driver = new EdgeDriver();
		driver.get("localhost/hollywood-rentals.html");
	}
	@Test
	public void test() {
		new HollyWoodRentals(driver);	
		HollyWoodRentals.enterTodayDate().sendKeys(Data.myList[0]);
		HollyWoodRentals.clickShift().click();
		HollyWoodRentals.selectGraveYardShift().click();
		HollyWoodRentals.clickShift().sendKeys(Keys.ENTER);
		HollyWoodRentals.enterOfficerName().sendKeys(Data.myList[2]);
		HollyWoodRentals.enterFirstDriverName().sendKeys(Data.myList[3]);
		HollyWoodRentals.enterFirstDriverLic().sendKeys(Data.myList[4]);
		HollyWoodRentals.enterFirstProductionName().sendKeys(Data.myList[5]);
		HollyWoodRentals.enterFirstVehiclePlate().sendKeys(Data.myList[6]);
		HollyWoodRentals.enterFirstVehicleId().sendKeys(Data.myList[7]);
		HollyWoodRentals.enterFirstTimeIn().sendKeys(Data.myList[8]);
		HollyWoodRentals.enterFirstTimeOut().sendKeys(Data.myList[9]);
		HollyWoodRentals.enterSecondDriverName().sendKeys(Data.myList[10]);
		HollyWoodRentals.enterSecondDriverLic().sendKeys(Data.myList[11]);
		HollyWoodRentals.enterSecondProductionName().sendKeys(Data.myList[12]);
		HollyWoodRentals.enterSecondVehiclePlate().sendKeys(Data.myList[13]);
		HollyWoodRentals.enterSecondVehicleId().sendKeys(Data.myList[14]);
		HollyWoodRentals.enterSecondTimeIn().sendKeys(Data.myList[15]);
		HollyWoodRentals.enterSecondTimeOut().sendKeys(Data.myList[16]);
		HollyWoodRentals.enterThirdDriverName().sendKeys(Data.myList[17]);
		HollyWoodRentals.enterThirdDriverLic().sendKeys(Data.myList[18]);
		HollyWoodRentals.enterThirdProductionName().sendKeys(Data.myList[19]);
		HollyWoodRentals.enterThirdVehiclePlate().sendKeys(Data.myList[20]);
		HollyWoodRentals.enterThirdVehicleId().sendKeys(Data.myList[21]);
		HollyWoodRentals.enterThirdTimeIn().sendKeys(Data.myList[22]);
		HollyWoodRentals.enterThirdTimeOut().sendKeys(Data.myList[23]);
		HollyWoodRentals.enterFourthDriverName().sendKeys(Data.myList[24]);
		HollyWoodRentals.enterFourthDriverLic().sendKeys(Data.myList[25]);
		HollyWoodRentals.enterFourthProductionName().sendKeys(Data.myList[26]);
		HollyWoodRentals.enterFourthVehiclePlate().sendKeys(Data.myList[27]);
		HollyWoodRentals.enterFourthVehicleId().sendKeys(Data.myList[28]);
		HollyWoodRentals.enterFourthTimeIn().sendKeys(Data.myList[29]);
		HollyWoodRentals.enterFourthTimeOut().sendKeys(Data.myList[30]);
		}
	@AfterTest
	public void endTest() throws FileNotFoundException, IOException {
		OpenReport.openExcel();
		driver.quit();
	}

}
