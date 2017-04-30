import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Object Repository for Command Guard Services Timesheet
public class TimeSheet {
		static WebDriver driver;
		public TimeSheet(WebDriver driver){
			TimeSheet.driver = driver;
		}
		public static WebElement enterWorkSite(){
			return driver.findElement(By.id("nameAndAddress"));
		}
		public static WebElement enterFirstSatDate(){
			return driver.findElement(By.id("firstSatDate"));
		}
		public static WebElement enterFirstSatTimeOnDuty(){
			return driver.findElement(By.id("firstSatTimeOnDuty"));
		}
		public static WebElement enterFirstSatEmployeeName(){
			return driver.findElement(By.id("firstSatEmployeeName"));
		}
		public static WebElement enterFirstSatBreakStart(){
			return driver.findElement(By.id("firstSatBreakStart"));
		}
		public static WebElement enterFirstSatBreakEnd(){
			return driver.findElement(By.id("firstSatBreakEnd"));
		}
		public static WebElement enterFirstSatTimeOff(){
			return driver.findElement(By.id("firstSatTimeOff"));
		}
		public static WebElement enterFirstSatTotalHour(){
			return driver.findElement(By.id("firstSatTotalHour"));
		}
		public static WebElement enterFirstSatEmployeeSignature(){
			return driver.findElement(By.id("firstSatEmployeeSignature"));
		}
		public static WebElement enterFirstSatClientSignature(){
			return driver.findElement(By.id("firstSatClientSignature"));
		}
		public static WebElement enterSecondSatDate(){
			return driver.findElement(By.id("secondSatDate"));
		}
		public static WebElement enterSecondSatTimeOnDuty(){
			return driver.findElement(By.id("secondSatTimeOnDuty"));
		}
		public static WebElement enterSecondSatEmployeeName(){
			return driver.findElement(By.id("secondSatEmployeeName"));
		}
		public static WebElement enterSecondSatBreakStart(){
			return driver.findElement(By.id("secondSatBreakStart"));
		}
		public static WebElement enterSecondSatBreakEnd(){
			return driver.findElement(By.id("secondSatBreakEnd"));
		}
		public static WebElement enterSecondSatTimeOff(){
			return driver.findElement(By.id("secondSatTimeOff"));
		}
		public static WebElement enterSecondSatTotalHour(){
			return driver.findElement(By.id("secondSatTotalHour"));
		}
		public static WebElement enterSecondSatEmployeeSignature(){
			return driver.findElement(By.id("secondSatEmployeeSignature"));
		}
		public static WebElement enterSecondSatClientSignature(){
			return driver.findElement(By.id("secondSatClientSignature"));
		}
		public static WebElement enterFirstSunDate(){
			return driver.findElement(By.id("firstSunDate"));
		}
		public static WebElement enterFirstSunTimeOnDuty(){
			return driver.findElement(By.id("firstSunTimeOnDuty"));
		}
		public static WebElement enterFirstSunEmployeeName(){
			return driver.findElement(By.id("firstSunEmployeeName"));
		}
		public static WebElement enterFirstSunBreakStart(){
			return driver.findElement(By.id("firstSunBreakStart"));
		}
		public static WebElement enterFirstSunBreakEnd(){
			return driver.findElement(By.id("firstSunBreakEnd"));
		}
		public static WebElement enterFirstSunTimeOff(){
			return driver.findElement(By.id("firstSunTimeOff"));
		}
		public static WebElement enterFirstSunTotalHour(){
			return driver.findElement(By.id("firstSunTotalHour"));
		}
		public static WebElement enterFirstSunEmployeeSignature(){
			return driver.findElement(By.id("firstSunEmployeeSignature"));
		}
		public static WebElement enterFirstSunClientSignature(){
			return driver.findElement(By.id("firstSunClientSignature"));
		}
		public static WebElement enterSecondSunDate(){
			return driver.findElement(By.id("secondSunDate"));
		}
		public static WebElement enterSecondSunTimeOnDuty(){
			return driver.findElement(By.id("secondSunTimeOnDuty"));
		}
		public static WebElement enterSecondSunEmployeeName(){
			return driver.findElement(By.id("secondSunEmployeeName"));
		}
		public static WebElement enterSecondSunBreakStart(){
			return driver.findElement(By.id("secondSunBreakStart"));
		}
		public static WebElement enterSecondSunBreakEnd(){
			return driver.findElement(By.id("secondSunBreakEnd"));
		}
		public static WebElement enterSecondSunTimeOff(){
			return driver.findElement(By.id("secondSunTimeOff"));
		}
		public static WebElement enterSecondSunTotalHour(){
			return driver.findElement(By.id("secondSunTotalHour"));
		}
		public static WebElement enterSecondSunEmployeeSignature(){
			return driver.findElement(By.id("secondSunEmployeeSignature"));
		}
		public static WebElement enterSecondSunClientSignature(){
			return driver.findElement(By.id("secondSunClientSignature"));
		}
		public static WebElement enterFirstMonDate(){
			return driver.findElement(By.id("firstMonDate"));
		}
		public static WebElement enterFirstMonTimeOnDuty(){
			return driver.findElement(By.id("firstMonTimeOnDuty"));
		}
		public static WebElement enterFirstMonEmployeeName(){
			return driver.findElement(By.id("firstMonEmployeeName"));
		}
		public static WebElement enterFirstMonBreakStart(){
			return driver.findElement(By.id("firstMonBreakStart"));
		}
		public static WebElement enterFirstMonBreakEnd(){
			return driver.findElement(By.id("firstMonBreakEnd"));
		}
		public static WebElement enterFirstMonTimeOff(){
			return driver.findElement(By.id("firstMonTimeOff"));
		}
		public static WebElement enterFirstMonTotalHour(){
			return driver.findElement(By.id("firstMonTotalHour"));
		}
		public static WebElement enterFirstMonEmployeeSignature(){
			return driver.findElement(By.id("firstMonEmployeeSignature"));
		}
		public static WebElement enterFirstMonClientSignature(){
			return driver.findElement(By.id("firstMonClientSignature"));
		}
		public static WebElement enterSecondMonDate(){
			return driver.findElement(By.id("secondMonDate"));
		}
		public static WebElement enterSecondMonTimeOnDuty(){
			return driver.findElement(By.id("secondMonTimeOnDuty"));
		}
		public static WebElement enterSecondMonEmployeeName(){
			return driver.findElement(By.id("secondMonEmployeeName"));
		}
		public static WebElement enterSecondMonBreakStart(){
			return driver.findElement(By.id("secondMonBreakStart"));
		}
		public static WebElement enterSecondMonBreakEnd(){
			return driver.findElement(By.id("secondMonBreakEnd"));
		}
		public static WebElement enterSecondMonTimeOff(){
			return driver.findElement(By.id("secondMonTimeOff"));
		}
		public static WebElement enterSecondMonTotalHour(){
			return driver.findElement(By.id("secondMonTotalHour"));
		}
		public static WebElement enterSecondMonEmployeeSignature(){
			return driver.findElement(By.id("secondMonEmployeeSignature"));
		}
		public static WebElement enterSecondMonClientSignature(){
			return driver.findElement(By.id("secondMonClientSignature"));
		}
		public static WebElement enterFirstTueDate(){
			return driver.findElement(By.id("firstTueDate"));
		}
		public static WebElement enterFirstTueTimeOnDuty(){
			return driver.findElement(By.id("firstTueTimeOnDuty"));
		}
		public static WebElement enterFirstTueEmployeeName(){
			return driver.findElement(By.id("firstTueEmployeeName"));
		}
		public static WebElement enterFirstTueBreakStart(){
			return driver.findElement(By.id("firstTueBreakStart"));
		}
		public static WebElement enterFirstTueBreakEnd(){
			return driver.findElement(By.id("firstTueBreakEnd"));
		}
		public static WebElement enterFirstTueTimeOff(){
			return driver.findElement(By.id("firstTueTimeOff"));
		}
		public static WebElement enterFirstTueTotalHour(){
			return driver.findElement(By.id("firstTueTotalHour"));
		}
		public static WebElement enterFirstTueEmployeeSignature(){
			return driver.findElement(By.id("firstTueEmployeeSignature"));
		}
		public static WebElement enterFirstTueClientSignature(){
			return driver.findElement(By.id("firstTueClientSignature"));
		}
		public static WebElement enterSecondTueDate(){
			return driver.findElement(By.id("secondTueDate"));
		}
		public static WebElement enterSecondTueTimeOnDuty(){
			return driver.findElement(By.id("secondTueTimeOnDuty"));
		}
		public static WebElement enterSecondTueEmployeeName(){
			return driver.findElement(By.id("secondTueEmployeeName"));
		}
		public static WebElement enterSecondTueBreakStart(){
			return driver.findElement(By.id("secondTueBreakStart"));
		}
		public static WebElement enterSecondTueBreakEnd(){
			return driver.findElement(By.id("secondTueBreakEnd"));
		}
		public static WebElement enterSecondTueTimeOff(){
			return driver.findElement(By.id("secondTueTimeOff"));
		}
		public static WebElement enterSecondTueTotalHour(){
			return driver.findElement(By.id("secondTueTotalHour"));
		}
		public static WebElement enterSecondTueEmployeeSignature(){
			return driver.findElement(By.id("secondTueEmployeeSignature"));
		}
		public static WebElement enterSecondTueClientSignature(){
			return driver.findElement(By.id("secondTueClientSignature"));
		}
		public static WebElement enterFirstWedDate(){
			return driver.findElement(By.id("firstWedDate"));
		}
		public static WebElement enterFirstWedTimeOnDuty(){
			return driver.findElement(By.id("firstWedTimeOnDuty"));
		}
		public static WebElement enterFirstWedEmployeeName(){
			return driver.findElement(By.id("firstWedEmployeeName"));
		}
		public static WebElement enterFirstWedBreakStart(){
			return driver.findElement(By.id("firstWedBreakStart"));
		}
		public static WebElement enterFirstWedBreakEnd(){
			return driver.findElement(By.id("firstWedBreakEnd"));
		}
		public static WebElement enterFirstWedTimeOff(){
			return driver.findElement(By.id("firstWedTimeOff"));
		}
		public static WebElement enterFirstWedTotalHour(){
			return driver.findElement(By.id("firstWedTotalHour"));
		}
		public static WebElement enterFirstWedEmployeeSignature(){
			return driver.findElement(By.id("firstWedEmployeeSignature"));
		}
		public static WebElement enterFirstWedClientSignature(){
			return driver.findElement(By.id("firstWedClientSignature"));
		}
		public static WebElement enterSecondWedDate(){
			return driver.findElement(By.id("secondWedDate"));
		}
		public static WebElement enterSecondWedTimeOnDuty(){
			return driver.findElement(By.id("secondWedTimeOnDuty"));
		}
		public static WebElement enterSecondWedEmployeeName(){
			return driver.findElement(By.id("secondWedEmployeeName"));
		}
		public static WebElement enterSecondWedBreakStart(){
			return driver.findElement(By.id("secondWedBreakStart"));
		}
		public static WebElement enterSecondWedBreakEnd(){
			return driver.findElement(By.id("secondWedBreakEnd"));
		}
		public static WebElement enterSecondWedTimeOff(){
			return driver.findElement(By.id("secondWedTimeOff"));
		}
		public static WebElement enterSecondWedTotalHour(){
			return driver.findElement(By.id("secondWedTotalHour"));
		}
		public static WebElement enterSecondWedEmployeeSignature(){
			return driver.findElement(By.id("secondWedEmployeeSignature"));
		}
		public static WebElement enterSecondWedClientSignature(){
			return driver.findElement(By.id("secondWedClientSignature"));
		}
		public static WebElement enterFirstThurDate(){
			return driver.findElement(By.id("firstThurDate"));
		}
		public static WebElement enterFirstThurTimeOnDuty(){
			return driver.findElement(By.id("firstThurTimeOnDuty"));
		}
		public static WebElement enterFirstThurEmployeeName(){
			return driver.findElement(By.id("firstThurEmployeeName"));
		}
		public static WebElement enterFirstThurBreakStart(){
			return driver.findElement(By.id("firstThurBreakStart"));
		}
		public static WebElement enterFirstThurBreakEnd(){
			return driver.findElement(By.id("firstThurBreakEnd"));
		}
		public static WebElement enterFirstThurTimeOff(){
			return driver.findElement(By.id("firstThurTimeOff"));
		}
		public static WebElement enterFirstThurTotalHour(){
			return driver.findElement(By.id("firstThurTotalHour"));
		}
		public static WebElement enterFirstThurEmployeeSignature(){
			return driver.findElement(By.id("firstThurEmployeeSignature"));
		}
		public static WebElement enterFirstThurClientSignature(){
			return driver.findElement(By.id("firstThurClientSignature"));
		}
		public static WebElement enterSecondThurDate(){
			return driver.findElement(By.id("secondThurDate"));
		}
		public static WebElement enterSecondThurTimeOnDuty(){
			return driver.findElement(By.id("secondThurTimeOnDuty"));
		}
		public static WebElement enterSecondThurEmployeeName(){
			return driver.findElement(By.id("secondThurEmployeeName"));
		}
		public static WebElement enterSecondThurBreakStart(){
			return driver.findElement(By.id("secondThurBreakStart"));
		}
		public static WebElement enterSecondThurBreakEnd(){
			return driver.findElement(By.id("secondThurBreakEnd"));
		}
		public static WebElement enterSecondThurTimeOff(){
			return driver.findElement(By.id("secondThurTimeOff"));
		}
		public static WebElement enterSecondThurTotalHour(){
			return driver.findElement(By.id("secondThurTotalHour"));
		}
		public static WebElement enterSecondThurEmployeeSignature(){
			return driver.findElement(By.id("secondThurEmployeeSignature"));
		}
		public static WebElement enterSecondThurClientSignature(){
			return driver.findElement(By.id("secondThurClientSignature"));
		}
		public static WebElement enterFirstFriDate(){
			return driver.findElement(By.id("firstFriDate"));
		}
		public static WebElement enterFirstFriTimeOnDuty(){
			return driver.findElement(By.id("firstFriTimeOnDuty"));
		}
		public static WebElement enterFirstFriEmployeeName(){
			return driver.findElement(By.id("firstFriEmployeeName"));
		}
		public static WebElement enterFirstFriBreakStart(){
			return driver.findElement(By.id("firstFriBreakStart"));
		}
		public static WebElement enterFirstFriBreakEnd(){
			return driver.findElement(By.id("firstFriBreakEnd"));
		}
		public static WebElement enterFirstFriTimeOff(){
			return driver.findElement(By.id("firstFriTimeOff"));
		}
		public static WebElement enterFirstFriTotalHour(){
			return driver.findElement(By.id("firstFriTotalHour"));
		}
		public static WebElement enterFirstFriEmployeeSignature(){
			return driver.findElement(By.id("firstFriEmployeeSignature"));
		}
		public static WebElement enterFirstFriClientSignature(){
			return driver.findElement(By.id("firstFriClientSignature"));
		}
		public static WebElement enterSecondFriDate(){
			return driver.findElement(By.id("secondFriDate"));
		}
		public static WebElement enterSecondFriTimeOnDuty(){
			return driver.findElement(By.id("secondFriTimeOnDuty"));
		}
		public static WebElement enterSecondFriEmployeeName(){
			return driver.findElement(By.id("secondFriEmployeeName"));
		}
		public static WebElement enterSecondFriBreakStart(){
			return driver.findElement(By.id("secondFriBreakStart"));
		}
		public static WebElement enterSecondFriBreakEnd(){
			return driver.findElement(By.id("secondFriBreakEnd"));
		}
		public static WebElement enterSecondFriTimeOff(){
			return driver.findElement(By.id("secondFriTimeOff"));
		}
		public static WebElement enterSecondFriTotalHour(){
			return driver.findElement(By.id("secondFriTotalHour"));
		}
		public static WebElement enterSecondFriEmployeeSignature(){
			return driver.findElement(By.id("secondFriEmployeeSignature"));
		}
		public static WebElement enterSecondFriClientSignature(){
			return driver.findElement(By.id("secondFriClientSignature"));
		}
		public static WebElement enterFirstEmployeeInitial(){
			return driver.findElement(By.id("firstEmployeeInitial"));
		}
		public static WebElement enterSecondEmployeeInitial(){
			return driver.findElement(By.id("secondEmployeeInitial"));
		}
		public static WebElement enterEmployeeSig(){
			return driver.findElement(By.id("employeeSig"));
		}
		public static WebElement verifyTotalHours(){
			return driver.findElement(By.id("totalHours"));
		}
}
