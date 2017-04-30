import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//Test and verifying data for Andrew's Payroll System
public class AndrewPayRollSystemTest {
	static WebDriver driver;
	@BeforeTest
	public static void configureDriver() throws FileNotFoundException, IOException, InterruptedException {
		System.setProperty("webdriver.edge.driver", "src/MicrosoftWebDriver.exe");
		driver = new EdgeDriver();
		driver.get("localhost/andrew-payroll-submission.html");
	}
	@Test
	public void test() {
		new AndrewPayRoll(driver);	
		AndrewPayRoll.enterFromName().sendKeys(Data.myList[0]);
		AndrewPayRoll.enterTodayDate().sendKeys(Data.myList[1]);
		AndrewPayRoll.enterOfficerContactNo().sendKeys(Data.myList[2]);
		AndrewPayRoll.enterOfficerName().sendKeys(Data.myList[3]);
		AndrewPayRoll.enterOfficerSSN().sendKeys(Data.myList[4]);
		AndrewPayRoll.enterWeekDate().sendKeys(Data.myList[5]);
		AndrewPayRoll.enterFirstFridayDate().sendKeys(Data.myList[6]);
		AndrewPayRoll.enterFirstFridayLocation().sendKeys(Data.myList[7]);
		AndrewPayRoll.enterFirstFridayTimeIn().sendKeys(Data.myList[8]);
		AndrewPayRoll.enterFirstFridayMealStart().sendKeys(Data.myList[9]);
		AndrewPayRoll.enterFirstFridayMealEnd().sendKeys(Data.myList[10]);
		AndrewPayRoll.enterFirstFridayTimeOut().sendKeys(Data.myList[11]);
		AndrewPayRoll.verifyFirstFridayTotal().sendKeys(Keys.ENTER);
		AndrewPayRoll.enterSecondFridayLocation().sendKeys(Data.myList[13]);
		AndrewPayRoll.enterSecondFridayTimeIn().sendKeys(Data.myList[14]);
		AndrewPayRoll.enterSecondFridayMealStart().sendKeys(Data.myList[15]);
		AndrewPayRoll.enterSecondFridayMealEnd().sendKeys(Data.myList[16]);
		AndrewPayRoll.enterSecondFridayTimeOut().sendKeys(Data.myList[17]);
		AndrewPayRoll.verifySecondFridayTotal().sendKeys(Keys.ENTER);
		AndrewPayRoll.enterFirstSaturdayDate().sendKeys(Data.myList[19]);
		AndrewPayRoll.enterFirstSaturdayLocation().sendKeys(Data.myList[20]);
		AndrewPayRoll.enterFirstSaturdayTimeIn().sendKeys(Data.myList[21]);
		AndrewPayRoll.enterFirstSaturdayMealStart().sendKeys(Data.myList[22]);
		AndrewPayRoll.enterFirstSaturdayMealEnd().sendKeys(Data.myList[23]);
		AndrewPayRoll.enterFirstSaturdayTimeOut().sendKeys(Data.myList[24]);
		AndrewPayRoll.verifyFirstSaturdayTotal().sendKeys(Keys.ENTER);
		AndrewPayRoll.enterSecondSaturdayLocation().sendKeys(Data.myList[26]);
		AndrewPayRoll.enterSecondSaturdayTimeIn().sendKeys(Data.myList[27]);
		AndrewPayRoll.enterSecondSaturdayMealStart().sendKeys(Data.myList[28]);
		AndrewPayRoll.enterSecondSaturdayMealEnd().sendKeys(Data.myList[29]);
		AndrewPayRoll.enterSecondSaturdayTimeOut().sendKeys(Data.myList[30]);
		AndrewPayRoll.verifySecondSaturdayTotal().sendKeys(Keys.ENTER);
		AndrewPayRoll.enterFirstSundayDate().sendKeys(Data.myList[32]);
		AndrewPayRoll.enterFirstSundayLocation().sendKeys(Data.myList[33]);
		AndrewPayRoll.enterFirstSundayTimeIn().sendKeys(Data.myList[34]);
		AndrewPayRoll.enterFirstSundayMealStart().sendKeys(Data.myList[35]);
		AndrewPayRoll.enterFirstSundayMealEnd().sendKeys(Data.myList[36]);
		AndrewPayRoll.enterFirstSundayTimeOut().sendKeys(Data.myList[37]);
		AndrewPayRoll.verifyFirstSundayTotal().sendKeys(Keys.ENTER);
		AndrewPayRoll.enterSecondSundayLocation().sendKeys(Data.myList[39]);
		AndrewPayRoll.enterSecondSundayTimeIn().sendKeys(Data.myList[40]);
		AndrewPayRoll.enterSecondSundayMealStart().sendKeys(Data.myList[41]);
		AndrewPayRoll.enterSecondSundayMealEnd().sendKeys(Data.myList[42]);
		AndrewPayRoll.enterSecondSundayTimeOut().sendKeys(Data.myList[43]);
		AndrewPayRoll.verifySecondSundayTotal().sendKeys(Keys.ENTER);
		AndrewPayRoll.enterFirstMondayDate().sendKeys(Data.myList[45]);
		AndrewPayRoll.enterFirstMondayLocation().sendKeys(Data.myList[46]);
		AndrewPayRoll.enterFirstMondayTimeIn().sendKeys(Data.myList[47]);
		AndrewPayRoll.enterFirstMondayMealStart().sendKeys(Data.myList[48]);
		AndrewPayRoll.enterFirstMondayMealEnd().sendKeys(Data.myList[49]);
		AndrewPayRoll.enterFirstMondayTimeOut().sendKeys(Data.myList[50]);
		AndrewPayRoll.verifyFirstMondayTotal().sendKeys(Keys.ENTER);
		AndrewPayRoll.enterSecondMondayLocation().sendKeys(Data.myList[52]);
		AndrewPayRoll.enterSecondMondayTimeIn().sendKeys(Data.myList[53]);
		AndrewPayRoll.enterSecondMondayMealStart().sendKeys(Data.myList[54]);
		AndrewPayRoll.enterSecondMondayMealEnd().sendKeys(Data.myList[55]);
		AndrewPayRoll.enterSecondMondayTimeOut().sendKeys(Data.myList[56]);
		AndrewPayRoll.verifySecondMondayTotal().sendKeys(Keys.ENTER);
		AndrewPayRoll.enterFirstTuesdayDate().sendKeys(Data.myList[58]);
		AndrewPayRoll.enterFirstTuesdayLocation().sendKeys(Data.myList[59]);
		AndrewPayRoll.enterFirstTuesdayTimeIn().sendKeys(Data.myList[60]);
		AndrewPayRoll.enterFirstTuesdayMealStart().sendKeys(Data.myList[61]);
		AndrewPayRoll.enterFirstTuesdayMealEnd().sendKeys(Data.myList[62]);
		AndrewPayRoll.enterFirstTuesdayTimeOut().sendKeys(Data.myList[63]);
		AndrewPayRoll.verifyFirstTuesdayTotal().sendKeys(Keys.ENTER);
		AndrewPayRoll.enterSecondTuesdayLocation().sendKeys(Data.myList[65]);
		AndrewPayRoll.enterSecondTuesdayTimeIn().sendKeys(Data.myList[66]);
		AndrewPayRoll.enterSecondTuesdayMealStart().sendKeys(Data.myList[67]);
		AndrewPayRoll.enterSecondTuesdayMealEnd().sendKeys(Data.myList[68]);
		AndrewPayRoll.enterSecondTuesdayTimeOut().sendKeys(Data.myList[69]);
		AndrewPayRoll.verifySecondTuesdayTotal().sendKeys(Keys.ENTER);
		AndrewPayRoll.enterFirstWednesdayDate().sendKeys(Data.myList[71]);
		AndrewPayRoll.enterFirstWednesdayLocation().sendKeys(Data.myList[72]);
		AndrewPayRoll.enterFirstWednesdayTimeIn().sendKeys(Data.myList[73]);
		AndrewPayRoll.enterFirstWednesdayMealStart().sendKeys(Data.myList[74]);
		AndrewPayRoll.enterFirstWednesdayMealEnd().sendKeys(Data.myList[75]);
		AndrewPayRoll.enterFirstWednesdayTimeOut().sendKeys(Data.myList[76]);
		AndrewPayRoll.verifyFirstWednesdayTotal().sendKeys(Keys.ENTER);
		AndrewPayRoll.enterSecondWednesdayLocation().sendKeys(Data.myList[78]);
		AndrewPayRoll.enterSecondWednesdayTimeIn().sendKeys(Data.myList[79]);
		AndrewPayRoll.enterSecondWednesdayMealStart().sendKeys(Data.myList[80]);
		AndrewPayRoll.enterSecondWednesdayMealEnd().sendKeys(Data.myList[81]);
		AndrewPayRoll.enterSecondWednesdayTimeOut().sendKeys(Data.myList[82]);
		AndrewPayRoll.verifySecondWednesdayTotal().sendKeys(Keys.ENTER);
		AndrewPayRoll.enterFirstThursdayDate().sendKeys(Data.myList[84]);
		AndrewPayRoll.enterFirstThursdayLocation().sendKeys(Data.myList[85]);
		AndrewPayRoll.enterFirstThursdayTimeIn().sendKeys(Data.myList[86]);
		AndrewPayRoll.enterFirstThursdayMealStart().sendKeys(Data.myList[87]);
		AndrewPayRoll.enterFirstThursdayMealEnd().sendKeys(Data.myList[88]);
		AndrewPayRoll.enterFirstThursdayTimeOut().sendKeys(Data.myList[89]);
		AndrewPayRoll.verifyFirstThursdayTotal().sendKeys(Keys.ENTER);
		AndrewPayRoll.enterSecondThursdayLocation().sendKeys(Data.myList[91]);
		AndrewPayRoll.enterSecondThursdayTimeIn().sendKeys(Data.myList[92]);
		AndrewPayRoll.enterSecondThursdayMealStart().sendKeys(Data.myList[93]);
		AndrewPayRoll.enterSecondThursdayMealEnd().sendKeys(Data.myList[94]);
		AndrewPayRoll.enterSecondThursdayTimeOut().sendKeys(Data.myList[95]);
		AndrewPayRoll.verifySecondThursdayTotal().sendKeys(Keys.ENTER);
		AndrewPayRoll.enterEmployeeSignature().sendKeys(Data.myList[97]);
		AndrewPayRoll.verifyRegularHours().sendKeys(Keys.ENTER);
		AndrewPayRoll.enterOverTimeAuthorizedBy().sendKeys(Data.myList[99]);
		AndrewPayRoll.verifyOverTimeHours().sendKeys(Keys.ENTER);
		AndrewPayRoll.enterOverTimeReason().sendKeys(Data.myList[101]);
		AndrewPayRoll.verifyDoubleTime().sendKeys(Keys.ENTER);
		AndrewPayRoll.enterDoubleTimeAuthorizedBy().sendKeys(Data.myList[103]);
		AndrewPayRoll.verifyHolidayWork().sendKeys(Keys.ENTER);
		AndrewPayRoll.enterDoubleTimeReason().sendKeys(Data.myList[105]);
		AndrewPayRoll.verifyHolidayOff().sendKeys(Keys.ENTER);
	}
	@AfterTest
	public void endTest() throws FileNotFoundException, IOException, InterruptedException {
		OpenReport.openExcel();
		driver.quit();
	}

}
