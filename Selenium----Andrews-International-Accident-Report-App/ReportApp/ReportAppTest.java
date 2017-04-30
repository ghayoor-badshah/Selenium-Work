import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//Test and verifying data for Andrews International Incident Report
public class ReportAppTest {
	static WebDriver driver;
	@BeforeTest
	public static void configureDriver() throws FileNotFoundException, IOException, InterruptedException {
		System.setProperty("webdriver.edge.driver", "ReportApp/MicrosoftWebDriver.exe");
		driver = new EdgeDriver();
		driver.get("localhost/andrews-international-incident-report.html");
	}
	@Test
	public void test() {
		new ReportApp(driver);
		ReportApp.enterDrNo().sendKeys(Data.myList[0]);
		ReportApp.enterInvestigationTopic().sendKeys(Data.myList[1]);
		ReportApp.enterExtra().sendKeys(Data.myList[2]);
		ReportApp.enterAddressOfOccurrence().sendKeys(Data.myList[3]);
		ReportApp.enterDateAndTimeOccurrence().sendKeys(Data.myList[4]);
		ReportApp.enterDateAndTimeReported().sendKeys(Data.myList[5]);
		ReportApp.enterExactLocationOnPremisses().sendKeys(Data.myList[6]);
		ReportApp.enterNotificationPerson().sendKeys(Data.myList[7]);
		ReportApp.enterConnectedRepots().sendKeys(Data.myList[8]);
		ReportApp.enterTypeOfPropertyTakenLost().sendKeys(Data.myList[9]);
		ReportApp.enterStolenLost().sendKeys(Data.myList[10]);
		ReportApp.enterRecoverd().sendKeys(Data.myList[11]);
		ReportApp.enterEstimatedDamage().sendKeys(Data.myList[12]);
		ReportApp.enterVehicleInvolved().sendKeys(Data.myList[13]);
		ReportApp.enterYear().sendKeys(Data.myList[14]);
		ReportApp.enterMake().sendKeys(Data.myList[15]);
		ReportApp.enterModel().sendKeys(Data.myList[16]);
		ReportApp.enterType().sendKeys(Data.myList[17]);
		ReportApp.enterColor().sendKeys(Data.myList[18]);
		ReportApp.enterLicensePlate().sendKeys(Data.myList[19]);
		ReportApp.enterState().sendKeys(Data.myList[20]);
		ReportApp.enterBodyDamage().sendKeys(Data.myList[21]);
		ReportApp.enterWindowsDamage().sendKeys(Data.myList[22]);
		ReportApp.enterPointOfEntry().sendKeys(Data.myList[23]);
		ReportApp.enterMethodOfEntry().sendKeys(Data.myList[24]);
		ReportApp.enterInstrumentToolsUsed().sendKeys(Data.myList[25]);
		ReportApp.enterTypeOfWindowOrDoor().sendKeys(Data.myList[26]);
		ReportApp.enterFirstSex().sendKeys(Data.myList[27]);
		ReportApp.enterFirstDesc().sendKeys(Data.myList[28]);
		ReportApp.enterFirstHair().sendKeys(Data.myList[29]);
		ReportApp.enterFirstEyes().sendKeys(Data.myList[30]);
		ReportApp.enterFirstHeight().sendKeys(Data.myList[31]);
		ReportApp.enterFirstWeight().sendKeys(Data.myList[32]);
		ReportApp.enterFirstAge().sendKeys(Data.myList[33]);
		ReportApp.enterFirstClothingNameDob().sendKeys(Data.myList[34]);
		ReportApp.enterSecondSex().sendKeys(Data.myList[35]);
		ReportApp.enterSecondDesc().sendKeys(Data.myList[36]);
		ReportApp.enterSecondHair().sendKeys(Data.myList[37]);
		ReportApp.enterSecondEyes().sendKeys(Data.myList[38]);
		ReportApp.enterSecondHeight().sendKeys(Data.myList[39]);
		ReportApp.enterSecondWeight().sendKeys(Data.myList[40]);
		ReportApp.enterSecondAge().sendKeys(Data.myList[41]);
		ReportApp.enterSecondClothingNameDob().sendKeys(Data.myList[42]);
		ReportApp.enterFirstCode().sendKeys(Data.myList[43]);
		ReportApp.enterFirstNameAndDob().sendKeys(Data.myList[44]);
		ReportApp.enterFirstResidence().sendKeys(Data.myList[45]);
		ReportApp.enterFirstTelephone().sendKeys(Data.myList[46]);
		ReportApp.enterSecondCode().sendKeys(Data.myList[47]);
		ReportApp.enterFirstOccupationAndDriverLic().sendKeys(Data.myList[48]);
		ReportApp.enterFirstBusinessResidence().sendKeys(Data.myList[49]);
		ReportApp.enterSecondTelephone().sendKeys(Data.myList[50]);
		ReportApp.enterThirdCode().sendKeys(Data.myList[51]);
		ReportApp.enterSecondNameAndDob().sendKeys(Data.myList[52]);
		ReportApp.enterSecondResidence().sendKeys(Data.myList[53]);
		ReportApp.enterThirdTelephone().sendKeys(Data.myList[54]);
		ReportApp.enterFourthCode().sendKeys(Data.myList[55]);
		ReportApp.enterSecondOccupationAndDriverLic().sendKeys(Data.myList[56]);
		ReportApp.enterSecondBusinessResidence().sendKeys(Data.myList[57]);
		ReportApp.enterFourthTelephone().sendKeys(Data.myList[58]);
		ReportApp.enterFifthCode().sendKeys(Data.myList[59]);
		ReportApp.enterThirdNameAndDob().sendKeys(Data.myList[60]);
		ReportApp.enterThirdResidence().sendKeys(Data.myList[61]);
		ReportApp.enterFifthTelephone().sendKeys(Data.myList[62]);
		ReportApp.enterSixthCode().sendKeys(Data.myList[63]);
		ReportApp.enterThirdOccupationAndDriverLic().sendKeys(Data.myList[64]);
		ReportApp.enterThirdBusinessResidence().sendKeys(Data.myList[65]);
		ReportApp.enterSixthTelephone().sendKeys(Data.myList[66]);
		ReportApp.enterSeventhCode().sendKeys(Data.myList[67]);
		ReportApp.enterFourthNameAndDob().sendKeys(Data.myList[68]);
		ReportApp.enterFourthResidence().sendKeys(Data.myList[69]);
		ReportApp.enterSeventhTelephone().sendKeys(Data.myList[70]);
		ReportApp.enterEighthCode().sendKeys(Data.myList[71]);
		ReportApp.enterFourthOccupationDriverLic().sendKeys(Data.myList[72]);
		ReportApp.enterFourthBusinessResidence().sendKeys(Data.myList[73]);
		ReportApp.enterEighthTelephone().sendKeys(Data.myList[74]);
		ReportApp.enterSupervisorApproving().sendKeys(Data.myList[75]);
		ReportApp.enterInvestigatingOfficer().sendKeys(Data.myList[76]);
		ReportApp.enterPersonReporting().sendKeys(Data.myList[77]);
		
		//Assert.assertEquals(Data.myList[0], ReportApp.enterDrNo().getAttribute("value"));
	}
	@AfterTest
	public void endTest() throws FileNotFoundException, IOException {
		OpenReport.openExcel();
		driver.quit();
	}

}
