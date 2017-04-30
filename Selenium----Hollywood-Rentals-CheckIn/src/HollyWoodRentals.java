import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Object Repository for Hollywood Rentals Login Form
public class HollyWoodRentals {
		static WebDriver driver;
		public HollyWoodRentals(WebDriver driver){
			HollyWoodRentals.driver = driver;
		}
		public static WebElement enterTodayDate(){
			return driver.findElement(By.id("todayDate"));
		}
		public static WebElement clickShift(){
			return driver.findElement(By.id("selectShift"));
		}
		public static WebElement selectGraveYardShift(){
			return driver.findElement(By.id("graveYardShift"));
		}
		public static WebElement enterOfficerName(){
			return driver.findElement(By.id("officerName"));
		}
		public static WebElement enterFirstDriverName(){
			return driver.findElement(By.id("firstDriverName"));
		}
		public static WebElement enterFirstDriverLic(){
			return driver.findElement(By.id("firstDriverLic"));
		}
		public static WebElement enterFirstProductionName(){
			return driver.findElement(By.id("firstProductionName"));
		}
		public static WebElement enterFirstVehiclePlate(){
			return driver.findElement(By.id("firstVehiclePlate"));
		}
		public static WebElement enterFirstVehicleId(){
			return driver.findElement(By.id("firstVehicleId"));
		}
		public static WebElement enterFirstTimeIn(){
			return driver.findElement(By.id("firstTimeIn"));
		}
		public static WebElement enterFirstTimeOut(){
			return driver.findElement(By.id("firstTimeOut"));
		}
		public static WebElement enterSecondDriverName(){
			return driver.findElement(By.id("secondDriverName"));
		}
		public static WebElement enterSecondDriverLic(){
			return driver.findElement(By.id("secondDriverLic"));
		}
		public static WebElement enterSecondProductionName(){
			return driver.findElement(By.id("secondProductionName"));
		}
		public static WebElement enterSecondVehiclePlate(){
			return driver.findElement(By.id("secondVehiclePlate"));
		}
		public static WebElement enterSecondVehicleId(){
			return driver.findElement(By.id("secondVehicleId"));
		}
		public static WebElement enterSecondTimeIn(){
			return driver.findElement(By.id("secondTimeIn"));
		}
		public static WebElement enterSecondTimeOut(){
			return driver.findElement(By.id("secondTimeOut"));
		}
		public static WebElement enterThirdDriverName(){
			return driver.findElement(By.id("thirdDriverName"));
		}
		public static WebElement enterThirdDriverLic(){
			return driver.findElement(By.id("thirdDriverLic"));
		}
		public static WebElement enterThirdProductionName(){
			return driver.findElement(By.id("thirdProductionName"));
		}
		public static WebElement enterThirdVehiclePlate(){
			return driver.findElement(By.id("thirdVehiclePlate"));
		}
		public static WebElement enterThirdVehicleId(){
			return driver.findElement(By.id("thirdVehicleId"));
		}
		public static WebElement enterThirdTimeIn(){
			return driver.findElement(By.id("thirdTimeIn"));
		}
		public static WebElement enterThirdTimeOut(){
			return driver.findElement(By.id("thirdTimeOut"));
		}
		public static WebElement enterFourthDriverName(){
			return driver.findElement(By.id("fourthDriverName"));
		}
		public static WebElement enterFourthDriverLic(){
			return driver.findElement(By.id("fourthDriverLic"));
		}
		public static WebElement enterFourthProductionName(){
			return driver.findElement(By.id("fourthProductionName"));
		}
		public static WebElement enterFourthVehiclePlate(){
			return driver.findElement(By.id("fourthVehiclePlate"));
		}
		public static WebElement enterFourthVehicleId(){
			return driver.findElement(By.id("fourthVehicleId"));
		}
		public static WebElement enterFourthTimeIn(){
			return driver.findElement(By.id("fourthTimeIn"));
		}
		public static WebElement enterFourthTimeOut(){
			return driver.findElement(By.id("fourthTimeOut"));
		}
}
