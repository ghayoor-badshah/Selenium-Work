import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//Test and verifying data for TriNETSOI
public class TriNetSOITest {
	static WebDriver driver;
	@BeforeTest
	public static void configureDriver() throws FileNotFoundException, IOException, InterruptedException {
		System.setProperty("webdriver.edge.driver", "src/MicrosoftWebDriver.exe");
		driver = new EdgeDriver();
		driver.get("localhost/TriNetSOI.html");
	}
	@Test
	public void test() {
		new TriNetSOI(driver);	
		TriNetSOI.verifyFirstParagraph();
		TriNetSOI.verifyAddressChanges();
		TriNetSOI.verifyFormsAssistance();
		TriNetSOI.verifyPayRollAndYTDReports();
		TriNetSOI.verifyGovernmentEmplVerification();
		TriNetSOI.verifyHealthPlanEligibilityQuestion();
		TriNetSOI.verifyCreditableCoverage();
		TriNetSOI.verifyCheckHistoryReport();
		TriNetSOI.verifyWebsiteNavigation();
		TriNetSOI.verifyPayrollTracking();
		TriNetSOI.verifyW2Reprint();
		TriNetSOI.verifyCall();
		TriNetSOI.verifyPhoneNo();
		TriNetSOI.verifySpanishSpeakingRepresentative();
		TriNetSOI.verifyEmail();
		TriNetSOI.verifyFirstEmail();
		TriNetSOI.verifyHours();
		TriNetSOI.verifySevenToNine();
		TriNetSOI.verifySixToEight();
		TriNetSOI.verifyFourToSix();
		TriNetSOI.verifyFirstAddress();
		TriNetSOI.verifyPoBox();
	}
	@AfterTest
	public void endTest() throws FileNotFoundException, IOException, InterruptedException {
		OpenReport.openExcel();
		driver.quit();
	}
}
