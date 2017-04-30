import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Object Repository for security-guard-application
public class GuardApp {
		static WebDriver driver;
		public GuardApp(WebDriver driver){
			GuardApp.driver = driver;
		}
		public static WebElement enterName() {
			return driver.findElement(By.id("name-one"));
		}
		public static WebElement enterDate() {
			return driver.findElement(By.id("date-one"));
		}
		public static WebElement enterAddress() {
			return driver.findElement(By.id("address-one"));
		}
		public static WebElement enterCity() {
			return driver.findElement(By.id("city-one"));
		}
		public static WebElement enterState() {
			return driver.findElement(By.id("state-one"));
		}
		public static WebElement enterZip() {
			return driver.findElement(By.id("zipCode-one"));
		}
		public static WebElement enterPhone() {
			return driver.findElement(By.id("phone-one"));
		}
		public static WebElement enterHomePhone() {
			return driver.findElement(By.id("homePhone-one"));
		}
		public static WebElement clickYes18Years() {
			return driver.findElement(By.id("18yearOld-one"));
		}
		public static WebElement enterDateOfBirth() {
			return driver.findElement(By.id("DOB-one"));
		}
		public static WebElement enterEmail() {
			return driver.findElement(By.id("email-one"));
		}
		public static WebElement enterReferedBy() {
			return driver.findElement(By.id("reference-one"));
		}
		public static WebElement enterReferedRelationship() {
			return driver.findElement(By.id("relationship-one"));
		}
		public static WebElement enterHair() {
			return driver.findElement(By.id("hair-one"));
		}
		public static WebElement enterEyes() {
			return driver.findElement(By.id("eyes-one"));
		}
		public static WebElement enterHeight() {
			return driver.findElement(By.id("height-one"));
		}
		public static WebElement enterShirtSize() {
			return driver.findElement(By.id("shirtSize-one"));
		}
		public static WebElement clickYesWorkRight() {
			return driver.findElement(By.id("YesworkRight-one"));
		}
		public static WebElement clickYesOwnVehicle() {
			return driver.findElement(By.id("vehicleYes-one"));
		}
		public static WebElement clickYesDriverLic() {
			return driver.findElement(By.id("driverLicYes"));
		}
		public static WebElement enterDriverLicNo() {
			return driver.findElement(By.id("descriptionForYes"));
		}
		public static WebElement enterNoOfMiles() {
			return driver.findElement(By.id("travelNoOfMiles"));
		}
		public static WebElement clickYesSubstanceTest() {
			return driver.findElement(By.id("YesSubtanceTest"));
		}
		public static WebElement clickNoToCrime() {
			return driver.findElement(By.id("NoCrime"));
		}
		public static WebElement clickSecurityGuard() {
			return driver.findElement(By.id("securityGuard"));
		}
		public static WebElement clickUnarmed() {
			return driver.findElement(By.id("unarmed"));
		}
		public static WebElement clickSunday() {
			return driver.findElement(By.id("sun"));
		}
		public static WebElement clickSaturday() {
			return driver.findElement(By.id("sat"));
		}
		public static WebElement clickAnyShift() {
			return driver.findElement(By.id("anyShift"));
		}
		public static WebElement clickCurrentlyEmployed() {
			return driver.findElement(By.id("yesCurrentlyEmployed"));
		}
		public static WebElement clickYesContact() {
			return driver.findElement(By.id("yesContact"));
		}
		public static WebElement enterEmployerNameAndAddress() {
			return driver.findElement(By.id("employeeContactDetail"));
		}
		public static WebElement clickNoWorkForMaximus() {
			return driver.findElement(By.id("noForMaximus"));
		}
		public static WebElement clickYesForAnotherCompany() {
			return driver.findElement(By.id("yesWorkAnother"));
		}
		public static WebElement enterWhenAndWhere() {
			return driver.findElement(By.id("yesDescriptionForAnother"));
		}
		public static WebElement enterStartingWorkDate() {
			return driver.findElement(By.id("startWork"));
		}
		public static WebElement enterLastPayRate() {
			return driver.findElement(By.id("lastPayRate"));
		}
		public static WebElement enterMinAcceptablePayRate() {
			return driver.findElement(By.id("minAcceptableRate"));
		}
		public static WebElement enterLanguageProfeciency() {
			return driver.findElement(By.id("languageProfeciency"));
		}
		public static WebElement enterEducation() {
			return driver.findElement(By.id("education"));
		}
		public static WebElement enterNameAndLocationOfSchool() {
			return driver.findElement(By.id("schoolLocation"));
		}
		public static WebElement enterNoOfYearsSchoolAttended() {
			return driver.findElement(By.id("educationDuration"));
		}
		public static WebElement clickYesGraduated() {
			return driver.findElement(By.id("yesGraduated"));
		}
		public static WebElement enterGraduationYear() {
			return driver.findElement(By.id("yearGraduated"));
		}
		public static WebElement clickGuardCardPermit() {
			return driver.findElement(By.id("cardCardPermit"));
		}
		public static WebElement enterGuardCardPermitNo() {
			return driver.findElement(By.id("cardCardPermit#"));
		}
		public static WebElement enterGuardCardExpiration() {
			return driver.findElement(By.id("cardCardPermitExp"));
		}
		public static WebElement clickFirstAidCard() {
			return driver.findElement(By.id("firstAidPermit"));
		}
		public static WebElement enterFirstAidCardNo() {
			return driver.findElement(By.id("firstAidPermit#"));
		}
		public static WebElement enterFirstAidCardExpiration() {
			return driver.findElement(By.id("firstAidPermitExp"));
		}
		public static WebElement clickCPRCard() {
			return driver.findElement(By.id("CPRPermit"));
		}
		public static WebElement enterCPRCardNo() {
			return driver.findElement(By.id("CPRPermit#"));
		}
		public static WebElement enterCPRCardExpiration() {
			return driver.findElement(By.id("CPRPermitExp"));
		}
		public static WebElement clickAEDPermit() {
			return driver.findElement(By.id("AEDPermit"));
		}
		public static WebElement enterAEDPermitNo() {
			return driver.findElement(By.id("AEDPermit#"));
		}
		public static WebElement enterAEDPermitExpiration() {
			return driver.findElement(By.id("AEDPermitExp"));
		}
		public static WebElement clickOtherPermit() {
			return driver.findElement(By.id("OtherPermit"));
		}
		public static WebElement enterOtherPermitNo() {
			return driver.findElement(By.id("OtherPermit#"));
		}
		public static WebElement enterOtherPermitExpiration() {
			return driver.findElement(By.id("OtherPermitExp"));
		}
		public static WebElement clickPepperSpary() {
			return driver.findElement(By.id("PepperSpary"));
		}
		public static WebElement enterPepperSparyNo() {
			return driver.findElement(By.id("PepperSpary#"));
		}
		public static WebElement clickBaton() {
			return driver.findElement(By.id("baton"));
		}
		public static WebElement enterBatonNo() {
			return driver.findElement(By.id("baton#"));
		}
		public static WebElement clickFirArm() {
			return driver.findElement(By.id("firArm"));
		}
		public static WebElement enterFirArmNo() {
			return driver.findElement(By.id("firArm#"));
		}
		public static WebElement enterFirArmCaliber() {
			return driver.findElement(By.id("firArmCaliber"));
		}
		public static WebElement enterFirArmExpiration() {
			return driver.findElement(By.id("firArmExp"));
		}
		public static WebElement clickYesOwnFireArm() {
			return driver.findElement(By.id("yesToFireArm"));
		}
		public static WebElement clickYesFireArmAvailable() {
			return driver.findElement(By.id("yesFireArmAvailable"));
		}
		public static WebElement enterFireArmMake() {
			return driver.findElement(By.id("fireArmMake"));
		}
		public static WebElement enterFireArmModel() {
			return driver.findElement(By.id("fireArmModel"));
		}
		public static WebElement enterFireArmSerialNo() {
			return driver.findElement(By.id("firArmSerial#"));
		}
		public static WebElement enterFireArmFacilityName() {
			return driver.findElement(By.id("firArmTrainingFacility"));
		}
		public static WebElement enterFireArmFacilityAddress() {
			return driver.findElement(By.id("firArmFacilityAddress"));
		}
		public static WebElement enterFireArmFacilityPhoneNo() {
			return driver.findElement(By.id("firArmFacilityPhone#"));
		}
		public static WebElement enterMilitaryBranch() {
			return driver.findElement(By.id("militaryBranch"));
		}
		public static WebElement enterMilitaryRank() {
			return driver.findElement(By.id("militaryRank"));
		}
		public static WebElement enterMilitaryService() {
			return driver.findElement(By.id("militaryServiceDuration"));
		}
		public static WebElement clickYesHonorableDischarge() {
			return driver.findElement(By.id("militaryHonDischarge"));
		}
		public static WebElement enterSeparatinDate() {
			return driver.findElement(By.id("militarySeparationDate"));
		}
		public static WebElement enterMilatarySkill() {
			return driver.findElement(By.id("militarySkills"));
		}
		public static WebElement enterFirstEmployerWorkStart() {
			return driver.findElement(By.id("dateStart-one"));
		}
		public static WebElement enterFirstEmployerWorkTo() {
			return driver.findElement(By.id("dateTo-one"));
		}
		public static WebElement enterFirstEmployerName() {
			return driver.findElement(By.id("employeeName-one"));
		}
		public static WebElement enterFirstEmployerAddress() {
			return driver.findElement(By.id("employeeAddress-one"));
		}
		public static WebElement enterFirstEmployerSalary() {
			return driver.findElement(By.id("salary-one"));
		}
		public static WebElement enterFirstEmployerPosition() {
			return driver.findElement(By.id("position-one"));
		}
		public static WebElement enterFirstEmployerLeavingReason() {
			return driver.findElement(By.id("reasonForLeaving-one"));
		}
		public static WebElement enterSecondEmployerWorkStart() {
			return driver.findElement(By.id("dateStart-two"));
		}
		public static WebElement enterSecondEmployerWorkTo() {
			return driver.findElement(By.id("dateTo-two"));
		}
		public static WebElement enterSecondEmployerName() {
			return driver.findElement(By.id("employeeName-two"));
		}
		public static WebElement enterSecondEmployerAddress() {
			return driver.findElement(By.id("employeeAddress-two"));
		}
		public static WebElement enterSecondEmployerSalary() {
			return driver.findElement(By.id("salary-two"));
		}
		public static WebElement enterSecondEmployerPosition() {
			return driver.findElement(By.id("position-two"));
		}
		public static WebElement enterSecondEmployerLeavingReason() {
			return driver.findElement(By.id("reasonForLeaving-two"));
		}
		public static WebElement enterThirdEmployerWorkStart() {
			return driver.findElement(By.id("dateStart-three"));
		}
		public static WebElement enterThirdEmployerWorkTo() {
			return driver.findElement(By.id("dateTo-three"));
		}
		public static WebElement enterThirdEmployerName() {
			return driver.findElement(By.id("employeeName-three"));
		}
		public static WebElement enterThirdEmployerAddress() {
			return driver.findElement(By.id("employeeAddress-three"));
		}
		public static WebElement enterThirdEmployerSalary() {
			return driver.findElement(By.id("salary-three"));
		}
		public static WebElement enterThirdEmployerPosition() {
			return driver.findElement(By.id("position-three"));
		}
		public static WebElement enterThirdEmployerLeavingReason() {
			return driver.findElement(By.id("reasonForLeaving-three"));
		}
		public static WebElement enterReferenceName() {
			return driver.findElement(By.id("referenceName-one"));
		}
		public static WebElement enterReferencePhoneNo() {
			return driver.findElement(By.id("referencePhone#-one"));
		}
		public static WebElement enterReferenceAddress() {
			return driver.findElement(By.id("referenceAddress-one"));
		}
		public static WebElement enterReferenceOccupation() {
			return driver.findElement(By.id("referenceOccupation-one"));
		}
		public static WebElement enterReferenceYearKnown() {
			return driver.findElement(By.id("referenceKnown-one"));
		}
		public static WebElement enterSecondReferenceName() {
			return driver.findElement(By.id("referenceName-two"));
		}
		public static WebElement enterSecondReferencePhoneNo() {
			return driver.findElement(By.id("referencePhone#-two"));
		}
		public static WebElement enterSecondReferenceAddress() {
			return driver.findElement(By.id("referenceAddress-two"));
		}
		public static WebElement enterSecondReferenceOccupation() {
			return driver.findElement(By.id("referenceOccupation-two"));
		}
		public static WebElement enterSecondReferenceYearKnown() {
			return driver.findElement(By.id("referenceKnown-two"));
		}
		public static WebElement enterThirdReferenceName() {
			return driver.findElement(By.id("referenceName-three"));
		}
		public static WebElement enterThirdReferencePhoneNo() {
			return driver.findElement(By.id("referencePhone#-three"));
		}
		public static WebElement enterThirdReferenceAddress() {
			return driver.findElement(By.id("referenceAddress-three"));
		}
		public static WebElement enterThirdReferenceOccupation() {
			return driver.findElement(By.id("referenceOccupation-three"));
		}
		public static WebElement enterThirdReferenceYearKnown() {
			return driver.findElement(By.id("referenceKnown-three"));
		}
		public static WebElement enterEmergencyContactName() {
			return driver.findElement(By.id("emergencyContactName"));
		}
		public static WebElement enterEmergencyContactCell() {
			return driver.findElement(By.id("emergencyContactCell"));
		}
		public static WebElement enterEmergencyContactPhone() {
			return driver.findElement(By.id("emergencyContactPhone#"));
		}
		public static WebElement enterEmergencyContactAddress() {
			return driver.findElement(By.id("emergencyContactAddress"));
		}
		public static WebElement enterEmergencyContactRelationship() {
			return driver.findElement(By.id("emergencyContactRelationship"));
		}
		public static WebElement clickYesToHealthRepot() {
			return driver.findElement(By.id("yesToHealth"));
		}
		public static WebElement clickAcknowledgement() {
			return driver.findElement(By.id("agreeToTerms"));
		}
		public static WebElement clickSubmit() {
			return driver.findElement(By.id("submitApplication"));
		}
}
