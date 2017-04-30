import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Object Repository for Andrew's Payroll System
public class AndrewPayRoll {
		static WebDriver driver;
		public AndrewPayRoll(WebDriver driver){
			AndrewPayRoll.driver = driver;
		}
		public static WebElement enterFromName(){
			return driver.findElement(By.id("fromName"));
		}
		public static WebElement enterTodayDate(){
			return driver.findElement(By.id("toTodayDate"));
		}
		public static WebElement enterOfficerContactNo(){
			return driver.findElement(By.id("officerContactNo"));
		}
		public static WebElement enterOfficerName(){
			return driver.findElement(By.id("officerName"));
		}
		public static WebElement enterOfficerSSN(){
			return driver.findElement(By.id("officerSsn"));
		}
		public static WebElement enterWeekDate(){
			return driver.findElement(By.id("weekDate"));
		}
		public static WebElement enterFirstFridayDate(){
			return driver.findElement(By.id("firstFridayDate"));
		}
		public static WebElement enterFirstFridayLocation(){
			return driver.findElement(By.id("firstFridayLocation"));
		}
		public static WebElement enterFirstFridayTimeIn(){
			return driver.findElement(By.id("firstFridayTimeIn"));
		}
		public static WebElement enterFirstFridayMealStart(){
			return driver.findElement(By.id("firstFridayMealStart"));
		}
		public static WebElement enterFirstFridayMealEnd(){
			return driver.findElement(By.id("firstFridayMealEnd"));
		}
		public static WebElement enterFirstFridayTimeOut(){
			return driver.findElement(By.id("firstFridayTimeOut"));
		}
		public static WebElement verifyFirstFridayTotal(){
			return driver.findElement(By.id("firstFridayTotal"));
		}
		public static WebElement enterSecondFridayLocation(){
			return driver.findElement(By.id("secondFridayLocation"));
		}
		public static WebElement enterSecondFridayTimeIn(){
			return driver.findElement(By.id("secondFridayTimeIn"));
		}
		public static WebElement enterSecondFridayMealStart(){
			return driver.findElement(By.id("secondFridayMealStart"));
		}
		public static WebElement enterSecondFridayMealEnd(){
			return driver.findElement(By.id("secondFridayMealEnd"));
		}
		public static WebElement enterSecondFridayTimeOut(){
			return driver.findElement(By.id("secondFridayTimeOut"));
		}
		public static WebElement verifySecondFridayTotal(){
			return driver.findElement(By.id("secondFridayTotal"));
		}
		public static WebElement enterFirstSaturdayDate(){
			return driver.findElement(By.id("firstSaturdayDate"));
		}
		public static WebElement enterFirstSaturdayLocation(){
			return driver.findElement(By.id("firstSaturdayLocation"));
		}
		public static WebElement enterFirstSaturdayTimeIn(){
			return driver.findElement(By.id("firstSaturdayTimeIn"));
		}
		public static WebElement enterFirstSaturdayMealStart(){
			return driver.findElement(By.id("firstSaturdayMealStart"));
		}
		public static WebElement enterFirstSaturdayMealEnd(){
			return driver.findElement(By.id("firstSaturdayMealEnd"));
		}
		public static WebElement enterFirstSaturdayTimeOut(){
			return driver.findElement(By.id("firstSaturdayTimeOut"));
		}
		public static WebElement verifyFirstSaturdayTotal(){
			return driver.findElement(By.id("firstSaturdayTotal"));
		}
		public static WebElement enterSecondSaturdayLocation(){
			return driver.findElement(By.id("secondSaturdayLocation"));
		}
		public static WebElement enterSecondSaturdayTimeIn(){
			return driver.findElement(By.id("secondSaturdayTimeIn"));
		}
		public static WebElement enterSecondSaturdayMealStart(){
			return driver.findElement(By.id("secondSaturdayMealStart"));
		}
		public static WebElement enterSecondSaturdayMealEnd(){
			return driver.findElement(By.id("secondSaturdayMealEnd"));
		}
		public static WebElement enterSecondSaturdayTimeOut(){
			return driver.findElement(By.id("secondSaturdayTimeOut"));
		}
		public static WebElement verifySecondSaturdayTotal(){
			return driver.findElement(By.id("secondSaturdayTotal"));
		}
		public static WebElement enterFirstSundayDate(){
			return driver.findElement(By.id("firstSundayDate"));
		}
		public static WebElement enterFirstSundayLocation(){
			return driver.findElement(By.id("firstSundayLocation"));
		}
		public static WebElement enterFirstSundayTimeIn(){
			return driver.findElement(By.id("firstSundayTimeIn"));
		}
		public static WebElement enterFirstSundayMealStart(){
			return driver.findElement(By.id("firstSundayMealStart"));
		}
		public static WebElement enterFirstSundayMealEnd(){
			return driver.findElement(By.id("firstSundayMealEnd"));
		}
		public static WebElement enterFirstSundayTimeOut(){
			return driver.findElement(By.id("firstSundayTimeOut"));
		}
		public static WebElement verifyFirstSundayTotal(){
			return driver.findElement(By.id("firstSundayTotal"));
		}
		public static WebElement enterSecondSundayLocation(){
			return driver.findElement(By.id("secondSundayLocation"));
		}
		public static WebElement enterSecondSundayTimeIn(){
			return driver.findElement(By.id("secondSundayTimeIn"));
		}
		public static WebElement enterSecondSundayMealStart(){
			return driver.findElement(By.id("secondSundayMealStart"));
		}
		public static WebElement enterSecondSundayMealEnd(){
			return driver.findElement(By.id("secondSundayMealEnd"));
		}
		public static WebElement enterSecondSundayTimeOut(){
			return driver.findElement(By.id("secondSundayTimeOut"));
		}
		public static WebElement verifySecondSundayTotal(){
			return driver.findElement(By.id("secondSundayTotal"));
		}
		public static WebElement enterFirstMondayDate(){
			return driver.findElement(By.id("firstMondayDate"));
		}
		public static WebElement enterFirstMondayLocation(){
			return driver.findElement(By.id("firstMondayLocation"));
		}
		public static WebElement enterFirstMondayTimeIn(){
			return driver.findElement(By.id("firstMondayTimeIn"));
		}
		public static WebElement enterFirstMondayMealStart(){
			return driver.findElement(By.id("firstMondayMealStart"));
		}
		public static WebElement enterFirstMondayMealEnd(){
			return driver.findElement(By.id("firstMondayMealEnd"));
		}
		public static WebElement enterFirstMondayTimeOut(){
			return driver.findElement(By.id("firstMondayTimeOut"));
		}
		public static WebElement verifyFirstMondayTotal(){
			return driver.findElement(By.id("firstMondayTotal"));
		}
		public static WebElement enterSecondMondayLocation(){
			return driver.findElement(By.id("secondMondayLocation"));
		}
		public static WebElement enterSecondMondayTimeIn(){
			return driver.findElement(By.id("secondMondayTimeIn"));
		}
		public static WebElement enterSecondMondayMealStart(){
			return driver.findElement(By.id("secondMondayMealStart"));
		}
		public static WebElement enterSecondMondayMealEnd(){
			return driver.findElement(By.id("secondMondayMealEnd"));
		}
		public static WebElement enterSecondMondayTimeOut(){
			return driver.findElement(By.id("secondMondayTimeOut"));
		}
		public static WebElement verifySecondMondayTotal(){
			return driver.findElement(By.id("secondMondayTotal"));
		}
		public static WebElement enterFirstTuesdayDate(){
			return driver.findElement(By.id("firstTuesdayDate"));
		}
		public static WebElement enterFirstTuesdayLocation(){
			return driver.findElement(By.id("firstTuesdayLocation"));
		}
		public static WebElement enterFirstTuesdayTimeIn(){
			return driver.findElement(By.id("firstTuesdayTimeIn"));
		}
		public static WebElement enterFirstTuesdayMealStart(){
			return driver.findElement(By.id("firstTuesdayMealStart"));
		}
		public static WebElement enterFirstTuesdayMealEnd(){
			return driver.findElement(By.id("firstTuesdayMealEnd"));
		}
		public static WebElement enterFirstTuesdayTimeOut(){
			return driver.findElement(By.id("firstTuesdayTimeOut"));
		}
		public static WebElement verifyFirstTuesdayTotal(){
			return driver.findElement(By.id("firstTuesdayTotal"));
		}
		public static WebElement enterSecondTuesdayLocation(){
			return driver.findElement(By.id("secondTuesdayLocation"));
		}
		public static WebElement enterSecondTuesdayTimeIn(){
			return driver.findElement(By.id("secondTuesdayTimeIn"));
		}
		public static WebElement enterSecondTuesdayMealStart(){
			return driver.findElement(By.id("secondTuesdayMealStart"));
		}
		public static WebElement enterSecondTuesdayMealEnd(){
			return driver.findElement(By.id("secondTuesdayMealEnd"));
		}
		public static WebElement enterSecondTuesdayTimeOut(){
			return driver.findElement(By.id("secondTuesdayTimeOut"));
		}
		public static WebElement verifySecondTuesdayTotal(){
			return driver.findElement(By.id("secondTuesdayTotal"));
		}
		public static WebElement enterFirstWednesdayDate(){
			return driver.findElement(By.id("firstWednesdayDate"));
		}
		public static WebElement enterFirstWednesdayLocation(){
			return driver.findElement(By.id("firstWednesdayLocation"));
		}
		public static WebElement enterFirstWednesdayTimeIn(){
			return driver.findElement(By.id("firstWednesdayTimeIn"));
		}
		public static WebElement enterFirstWednesdayMealStart(){
			return driver.findElement(By.id("firstWednesdayMealStart"));
		}
		public static WebElement enterFirstWednesdayMealEnd(){
			return driver.findElement(By.id("firstWednesdayMealEnd"));
		}
		public static WebElement enterFirstWednesdayTimeOut(){
			return driver.findElement(By.id("firstWednesdayTimeOut"));
		}
		public static WebElement verifyFirstWednesdayTotal(){
			return driver.findElement(By.id("firstWednesdayTotal"));
		}
		public static WebElement enterSecondWednesdayLocation(){
			return driver.findElement(By.id("secondWednesdayLocation"));
		}
		public static WebElement enterSecondWednesdayTimeIn(){
			return driver.findElement(By.id("secondWednesdayTimeIn"));
		}
		public static WebElement enterSecondWednesdayMealStart(){
			return driver.findElement(By.id("secondWednesdayMealStart"));
		}
		public static WebElement enterSecondWednesdayMealEnd(){
			return driver.findElement(By.id("secondWednesdayMealEnd"));
		}
		public static WebElement enterSecondWednesdayTimeOut(){
			return driver.findElement(By.id("secondWednesdayTimeOut"));
		}
		public static WebElement verifySecondWednesdayTotal(){
			return driver.findElement(By.id("secondWednesdayTotal"));
		}
		public static WebElement enterFirstThursdayDate(){
			return driver.findElement(By.id("firstThursdayDate"));
		}
		public static WebElement enterFirstThursdayLocation(){
			return driver.findElement(By.id("firstThursdayLocation"));
		}
		public static WebElement enterFirstThursdayTimeIn(){
			return driver.findElement(By.id("firstThursdayTimeIn"));
		}
		public static WebElement enterFirstThursdayMealStart(){
			return driver.findElement(By.id("firstThursdayMealStart"));
		}
		public static WebElement enterFirstThursdayMealEnd(){
			return driver.findElement(By.id("firstThursdayMealEnd"));
		}
		public static WebElement enterFirstThursdayTimeOut(){
			return driver.findElement(By.id("firstThursdayTimeOut"));
		}
		public static WebElement verifyFirstThursdayTotal(){
			return driver.findElement(By.id("firstThursdayTotal"));
		}
		public static WebElement enterSecondThursdayLocation(){
			return driver.findElement(By.id("secondThursdayLocation"));
		}
		public static WebElement enterSecondThursdayTimeIn(){
			return driver.findElement(By.id("secondThursdayTimeIn"));
		}
		public static WebElement enterSecondThursdayMealStart(){
			return driver.findElement(By.id("secondThursdayMealStart"));
		}
		public static WebElement enterSecondThursdayMealEnd(){
			return driver.findElement(By.id("secondThursdayMealEnd"));
		}
		public static WebElement enterSecondThursdayTimeOut(){
			return driver.findElement(By.id("secondThursdayTimeOut"));
		}
		public static WebElement verifySecondThursdayTotal(){
			return driver.findElement(By.id("secondThursdayTotal"));
		}
		public static WebElement enterEmployeeSignature(){
			return driver.findElement(By.id("employeeSignature"));
		}
		public static WebElement verifyRegularHours(){
			return driver.findElement(By.id("regularHours"));
		}
		public static WebElement enterOverTimeAuthorizedBy(){
			return driver.findElement(By.id("overTimeAuthorizedBy"));
		}
		public static WebElement verifyOverTimeHours(){
			return driver.findElement(By.id("overTimeHours"));
		}
		public static WebElement enterOverTimeReason(){
			return driver.findElement(By.id("overTimeReason"));
		}
		public static WebElement verifyDoubleTime(){
			return driver.findElement(By.id("doubleTime"));
		}
		public static WebElement enterDoubleTimeAuthorizedBy(){
			return driver.findElement(By.id("doubleTimeAuthorizedBy"));
		}
		public static WebElement verifyHolidayWork(){
			return driver.findElement(By.id("holidayWork"));
		}
		public static WebElement enterDoubleTimeReason(){
			return driver.findElement(By.id("doubleTimeReason"));
		}
		public static WebElement verifyHolidayOff(){
			return driver.findElement(By.id("holidayOff"));
		}
}
