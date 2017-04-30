import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GuardAppTest {
	public static void main(String [] args) throws FileNotFoundException, IOException, InterruptedException {
		System.setProperty("webdriver.edge.driver", "GuardApp/MicrosoftWebDriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("localhost/security-guard-application.html");
		System.out.println(driver.getTitle());
		new GuardApp(driver);
		GuardApp.enterName().sendKeys(Data.name());
		GuardApp.enterDate().sendKeys(Data.date());
		GuardApp.enterAddress().sendKeys(Data.address());
		GuardApp.enterCity().sendKeys(Data.city());
		GuardApp.enterState().sendKeys(Data.state());
		GuardApp.enterZip().sendKeys(Data.zip());
		GuardApp.enterPhone().sendKeys(Data.phone());
		GuardApp.enterHomePhone().sendKeys(Data.phoneHome());
		GuardApp.clickYes18Years().click();
		GuardApp.enterDateOfBirth().sendKeys(Data.dateOfBirth());
		GuardApp.enterEmail().sendKeys(Data.emailAddress());
		GuardApp.enterReferedBy().sendKeys(Data.referredBy());
		GuardApp.enterReferedRelationship().sendKeys(Data.referedRelationship());
		GuardApp.enterHair().sendKeys(Data.hair());
		GuardApp.enterEyes().sendKeys(Data.eyes());
		GuardApp.enterHeight().sendKeys(Data.height());
		GuardApp.enterShirtSize().sendKeys(Data.shirtSize());
		GuardApp.clickYesWorkRight().click();
		GuardApp.clickYesOwnVehicle().click();
		GuardApp.clickYesDriverLic().click();
		GuardApp.enterDriverLicNo().sendKeys(Data.licenseNo());
		GuardApp.enterNoOfMiles().sendKeys(Data.noOfMiles());
		GuardApp.clickYesSubstanceTest().click();
		GuardApp.clickNoToCrime().click();
		GuardApp.clickSecurityGuard().click();
		GuardApp.clickUnarmed().click();
		GuardApp.clickSunday().click();
		GuardApp.clickSaturday().click();
		GuardApp.clickAnyShift().click();
		GuardApp.clickCurrentlyEmployed().click();
		GuardApp.clickYesContact().click();
		GuardApp.enterEmployerNameAndAddress().sendKeys(Data.employerNameAndAddress());
		GuardApp.clickNoWorkForMaximus().click();
		GuardApp.clickYesForAnotherCompany().click();
		GuardApp.enterWhenAndWhere().sendKeys(Data.whenAndWhere());
		GuardApp.enterStartingWorkDate().sendKeys(Data.startWorkingDate());
		GuardApp.enterLastPayRate().sendKeys(Data.lastPayRate());
		GuardApp.enterMinAcceptablePayRate().sendKeys(Data.minAcceptablePayRate());
		GuardApp.enterLanguageProfeciency().sendKeys(Data.languageProfeciency());
		GuardApp.enterEducation().sendKeys(Data.education());
		GuardApp.enterNameAndLocationOfSchool().sendKeys(Data.nameAndLocationOfSchool());
		GuardApp.enterNoOfYearsSchoolAttended().sendKeys(Data.noOfYearsSchoolAttended());
		GuardApp.clickYesGraduated().click();
		GuardApp.enterGraduationYear().sendKeys(Data.graducationYear());
		GuardApp.clickGuardCardPermit().click();
		GuardApp.enterGuardCardPermitNo().sendKeys(Data.guardCardNo());
		GuardApp.enterGuardCardExpiration().sendKeys(Data.guardCardExpiration());
		GuardApp.clickFirstAidCard().click();
		GuardApp.enterFirstAidCardNo().sendKeys(Data.firstAidCardNo());
		GuardApp.enterFirstAidCardExpiration().sendKeys(Data.firstAidCardExpiration());
		GuardApp.clickCPRCard().click();
		GuardApp.enterCPRCardNo().sendKeys(Data.cprCardNo());
		GuardApp.enterCPRCardExpiration().sendKeys(Data.cprCardExpiration());
		GuardApp.clickAEDPermit().click();
		GuardApp.enterAEDPermitNo().sendKeys(Data.aedCardNo());
		GuardApp.enterAEDPermitExpiration().sendKeys(Data.aedCardExpiration());
		GuardApp.clickOtherPermit().click();
		GuardApp.enterOtherPermitNo().sendKeys(Data.otherCardNo());
		GuardApp.enterOtherPermitExpiration().sendKeys(Data.otherCardExpiration());
		GuardApp.clickPepperSpary().click();
		GuardApp.enterPepperSparyNo().sendKeys(Data.pepperSprayNo());
		GuardApp.clickBaton().click();
		GuardApp.enterBatonNo().sendKeys(Data.batonNo());
		GuardApp.clickFirArm().click();
		GuardApp.enterFirArmNo().sendKeys(Data.fireArmNo());
		GuardApp.enterFirArmCaliber().sendKeys(Data.fireArmCaliber());
		GuardApp.enterFirArmExpiration().sendKeys(Data.fireArmExpiration());
		GuardApp.clickYesOwnFireArm().click();
		GuardApp.clickYesFireArmAvailable().click();
		GuardApp.enterFireArmMake().sendKeys(Data.fireArmMake());
		GuardApp.enterFireArmModel().sendKeys(Data.fireArmModel());
		GuardApp.enterFireArmSerialNo().sendKeys(Data.fireArmSerialNo());
		GuardApp.enterFireArmFacilityName().sendKeys(Data.fireArmFacilityName());
		GuardApp.enterFireArmFacilityAddress().sendKeys(Data.fireArmFacilityAddress());
		GuardApp.enterFireArmFacilityPhoneNo().sendKeys(Data.fireArmFacilityPhone());
		GuardApp.enterMilitaryBranch().sendKeys(Data.militaryBranch());
		GuardApp.enterMilitaryRank().sendKeys(Data.militaryRank());
		GuardApp.enterMilitaryService().sendKeys(Data.militaryService());
		GuardApp.clickYesHonorableDischarge().click();
		GuardApp.enterSeparatinDate().sendKeys(Data.separationDate());
		GuardApp.enterMilatarySkill().sendKeys(Data.militarySkill());
		GuardApp.enterFirstEmployerWorkStart().sendKeys(Data.firstEmployerWorkStart());
		GuardApp.enterFirstEmployerWorkTo().sendKeys(Data.firstEmployerWorkTo());
		GuardApp.enterFirstEmployerName().sendKeys(Data.firstEmployerName());
		GuardApp.enterFirstEmployerAddress().sendKeys(Data.firstEmployerAddress());
		GuardApp.enterFirstEmployerSalary().sendKeys(Data.firstEmployerSalary());
		GuardApp.enterFirstEmployerPosition().sendKeys(Data.firstEmployerPosition());
		GuardApp.enterFirstEmployerLeavingReason().sendKeys(Data.firstEmployerLeavingReason());
		GuardApp.enterSecondEmployerWorkStart().sendKeys(Data.secondEmployerWorkStart());
		GuardApp.enterSecondEmployerWorkTo().sendKeys(Data.secondEmployerWorkTo());
		GuardApp.enterSecondEmployerName().sendKeys(Data.secondEmployerName());
		GuardApp.enterSecondEmployerAddress().sendKeys(Data.secondEmployerAddress());
		GuardApp.enterSecondEmployerSalary().sendKeys(Data.secondEmployerSalary());
		GuardApp.enterSecondEmployerPosition().sendKeys(Data.secondEmployerPosition());
		GuardApp.enterSecondEmployerLeavingReason().sendKeys(Data.secondEmployerLeavingReason());
		GuardApp.enterThirdEmployerWorkStart().sendKeys(Data.thirdEmployerWorkStart());
		GuardApp.enterThirdEmployerWorkTo().sendKeys(Data.thirdEmployerWorkTo());
		GuardApp.enterThirdEmployerName().sendKeys(Data.thirdEmployerName());
		GuardApp.enterThirdEmployerAddress().sendKeys(Data.thirdEmployerAddress());
		GuardApp.enterThirdEmployerSalary().sendKeys(Data.thirdEmployerSalary());
		GuardApp.enterThirdEmployerPosition().sendKeys(Data.thirdEmployerPosition());
		GuardApp.enterThirdEmployerLeavingReason().sendKeys(Data.thirdEmployerLeavingReason());
		GuardApp.enterReferenceName().sendKeys(Data.referenceName());
		GuardApp.enterReferencePhoneNo().sendKeys(Data.referencePhone());
		GuardApp.enterReferenceAddress().sendKeys(Data.referenceAddress());
		GuardApp.enterReferenceOccupation().sendKeys(Data.referenceOccupation());
		GuardApp.enterReferenceYearKnown().sendKeys(Data.referenceYearsKnown());
		GuardApp.enterSecondReferenceName().sendKeys(Data.secondReferenceName());
		GuardApp.enterSecondReferencePhoneNo().sendKeys(Data.secondReferencePhone());
		GuardApp.enterSecondReferenceAddress().sendKeys(Data.secondReferenceAddress());
		GuardApp.enterSecondReferenceOccupation().sendKeys(Data.secondReferenceOccupation());
		GuardApp.enterSecondReferenceYearKnown().sendKeys(Data.secondReferenceYearsKnown());
		GuardApp.enterThirdReferenceName().sendKeys(Data.thirdReferenceName());
		GuardApp.enterThirdReferencePhoneNo().sendKeys(Data.thirdReferencePhone());
		GuardApp.enterThirdReferenceAddress().sendKeys(Data.thirdReferenceAddress());
		GuardApp.enterThirdReferenceOccupation().sendKeys(Data.thirdReferenceOccupation());
		GuardApp.enterThirdReferenceYearKnown().sendKeys(Data.thirdReferenceYearsKnown());
		GuardApp.enterEmergencyContactName().sendKeys(Data.emergencyContactName());
		GuardApp.enterEmergencyContactCell().sendKeys(Data.emergencyContactCell());
		GuardApp.enterEmergencyContactPhone().sendKeys(Data.emergencyContactPhone());
		GuardApp.enterEmergencyContactAddress().sendKeys(Data.emergencyContactAddress());
		GuardApp.enterEmergencyContactRelationship().sendKeys(Data.emergencyContactRelationship());
		GuardApp.clickYesToHealthRepot().click();
		GuardApp.clickAcknowledgement().click();
		GuardApp.clickSubmit().click();
		OpenReport.openExcel();
		driver.quit();
	}

}
