import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Object Repository for Allied Time Attendence Instruction
public class TimeAttendenceSystem {
		static WebDriver driver;
		public TimeAttendenceSystem(WebDriver driver){
			TimeAttendenceSystem.driver = driver;
		}
		public static WebElement verifyAllied(){
			return driver.findElement(By.id("allied"));
		}
		public static WebElement verifyConsultingSecurity(){
			return driver.findElement(By.id("consultingSecurity"));
		}
		public static WebElement verifyTimeAndAttendenceSystem(){
			return driver.findElement(By.id("timeAndAttendenceSystem"));
		}
		public static WebElement verifyInstructionOne(){
			return driver.findElement(By.id("instructionOne"));
		}
		public static WebElement veriftyInstructionTwo(){
			return driver.findElement(By.id("instructionTwo"));
		}
		public static WebElement verifyPhoneNo(){
			return driver.findElement(By.id("phoneNo"));
		}
		public static WebElement verifyIdNoOne(){
			return driver.findElement(By.id("idNoOne"));
		}
		public static WebElement verifyPasswordOne(){
			return driver.findElement(By.id("passwordOne"));
		}
		public static WebElement verifyEmpIdOne(){
			return driver.findElement(By.id("empIdOne"));
		}
		public static WebElement verifyClockInOne(){
			return driver.findElement(By.id("clockInOne"));
		}
		public static WebElement verifyShiftDateOne(){
			return driver.findElement(By.id("shiftDateOne"));
		}
		public static WebElement verifyRecordClockInOne(){
			return driver.findElement(By.id("recordClockInOne"));
		}
		public static WebElement verifyIdNoTwo(){
			return driver.findElement(By.id("idNoTwo"));
		}
		public static WebElement verifyPasswordTwo(){
			return driver.findElement(By.id("passwordTwo"));
		}
		public static WebElement verifyEmpIdTwo(){
			return driver.findElement(By.id("empIdTwo"));
		}
		public static WebElement verifyClockInTwo(){
			return driver.findElement(By.id("clockInTwo"));
		}
		public static WebElement verifyShiftDateTwo(){
			return driver.findElement(By.id("shiftDateTwo"));
		}
		public static WebElement verifyRecordClockInTwo(){
			return driver.findElement(By.id("recordClockInTwo"));
		}
}
