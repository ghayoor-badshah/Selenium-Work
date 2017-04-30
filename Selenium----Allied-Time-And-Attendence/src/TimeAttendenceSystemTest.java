import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//Test and verifying data for Allied Time Attendence Instruction
public class TimeAttendenceSystemTest {
	static WebDriver driver;
	@BeforeTest
	public static void configureDriver() throws FileNotFoundException, IOException, InterruptedException {
		System.setProperty("webdriver.edge.driver", "src/MicrosoftWebDriver.exe");
		driver = new EdgeDriver();
		driver.get("localhost/time-attendence-system.html");
	}
	@Test
	public void test() {
		new TimeAttendenceSystem(driver);	
		TimeAttendenceSystem.verifyAllied();
		TimeAttendenceSystem.verifyConsultingSecurity();
		TimeAttendenceSystem.verifyTimeAndAttendenceSystem();
		TimeAttendenceSystem.verifyInstructionOne();
		TimeAttendenceSystem.veriftyInstructionTwo();
		TimeAttendenceSystem.verifyPhoneNo();
		TimeAttendenceSystem.verifyIdNoOne();
		TimeAttendenceSystem.verifyPasswordOne();
		TimeAttendenceSystem.verifyEmpIdOne();
		TimeAttendenceSystem.verifyClockInOne();
		TimeAttendenceSystem.verifyShiftDateOne();
		TimeAttendenceSystem.verifyRecordClockInOne();
		TimeAttendenceSystem.verifyIdNoTwo();
		TimeAttendenceSystem.verifyPasswordTwo();
		TimeAttendenceSystem.verifyEmpIdTwo();
		TimeAttendenceSystem.verifyClockInTwo();
		TimeAttendenceSystem.verifyShiftDateTwo();
		TimeAttendenceSystem.verifyRecordClockInTwo();
		}
	@AfterTest
	public void endTest() throws FileNotFoundException, IOException {
		OpenReport.openExcel();
		driver.quit();
	}

}
