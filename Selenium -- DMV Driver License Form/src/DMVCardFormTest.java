import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//Test and verifying data for DMV Driver License/ID Form
public class DMVCardFormTest {
	static WebDriver driver;
	@BeforeTest
	public static void configureDriver() throws FileNotFoundException, IOException, InterruptedException {
		System.setProperty("webdriver.edge.driver", "src/MicrosoftWebDriver.exe");
		driver = new EdgeDriver();
		driver.get("localhost/dmv-Driver-License-Identification-Card.html");
	}
	@Test
	public void test() {
		new DMVCardForm(driver);
		DMVCardForm.verifyDmvHeading();
		DMVCardForm.clickOnDriverLicenseBox().click();
		DMVCardForm.verifyDriverLicenseText();
		DMVCardForm.clickGetIdCardFirstTimeBox().click();;
		DMVCardForm.verifyGetIdCardFirstTimeText();
		DMVCardForm.clickNoToPreviousHistoryBox().click();
		DMVCardForm.verifyNoToPreviusHistoryText();
		DMVCardForm.enterFirstName().sendKeys(Data.myList[4]);
		DMVCardForm.enterLastName().sendKeys(Data.myList[5]);
		DMVCardForm.enterMiddleName().sendKeys(Data.myList[6]);
		DMVCardForm.enterSuffix().sendKeys(Data.myList[7]);
		DMVCardForm.clickNoTodifferentName().click();
		DMVCardForm.verifyNoToDifferentNameText();
		DMVCardForm.enterDateOfBirth().sendKeys(Data.myList[9]);
		DMVCardForm.clickOnMaleBox().click();
		DMVCardForm.verifyMaleText();
		DMVCardForm.enterHairColor().sendKeys(Data.myList[11]);
		DMVCardForm.enterEyeColor().sendKeys(Data.myList[12]);
		DMVCardForm.enterHeight().sendKeys(Data.myList[13]);
		DMVCardForm.enterWeight().sendKeys(Data.myList[14]);
		DMVCardForm.enterMailingAddress().sendKeys(Data.myList[15]);
		DMVCardForm.clickYesToSocialSecurityBox().click();
		DMVCardForm.verifyYesToSocialSecurityText();
		DMVCardForm.enterFirstThreeDigitOfSocial().sendKeys(Data.myList[17]);
		DMVCardForm.enterMiddleTwoDigitOfSocial().sendKeys(Data.myList[18]);
		DMVCardForm.enterLastThreeDigitOfSocial().sendKeys(Data.myList[19]);
		DMVCardForm.enterApplicantSignature().sendKeys(Data.myList[20]);
		DMVCardForm.enterToDayDate().sendKeys(Data.myList[21]);
		DMVCardForm.clickNoForMedicalCondiationBox().click();
		DMVCardForm.verifyNoForMedicalConditionText();
		DMVCardForm.clickNoToVeteranBox().click();
		DMVCardForm.verifyNoToVeteranText();
		DMVCardForm.clickNoToOrganDonationBox().click();
		DMVCardForm.verifyNoToOrganDonationText();
		DMVCardForm.clickYesToUSCitizenBox().click();
		DMVCardForm.verifyYesToUSCitizenText();
		DMVCardForm.clickYesToEligibleToVoteBox().click();
		DMVCardForm.verifyYesToEligibleToVoteText();
		DMVCardForm.clickRegisterToVoteBox().click();
	}
	@AfterTest
	public void endTest() throws IOException {
		OpenReport.openExcel();
		driver.quit();
	}
}
