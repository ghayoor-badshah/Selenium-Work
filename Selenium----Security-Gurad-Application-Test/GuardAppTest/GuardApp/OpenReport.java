import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//Report in the form of excel file for security-guard-application
public class OpenReport {
	public static void openExcel() throws FileNotFoundException, IOException{
		XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx"));
		XSSFSheet sheet = wb.getSheet("sheet1");
		try{
			if(Data.name().contentEquals(GuardApp.enterName().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(1).createCell(5);
				XSSFCell cellSeven = sheet.getRow(1).createCell(7);
				cellFive.setCellValue(GuardApp.enterName().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.date().contentEquals(GuardApp.enterDate().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(2).createCell(5);;
				XSSFCell cellSeven = sheet.getRow(2).createCell(7);
				cellFive.setCellValue(GuardApp.enterDate().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.address().contentEquals(GuardApp.enterAddress().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(3).createCell(5);
				XSSFCell cellSeven = sheet.getRow(3).createCell(7);
				cellFive.setCellValue(GuardApp.enterAddress().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.city().contentEquals(GuardApp.enterCity().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(4).createCell(5);
				XSSFCell cellSeven = sheet.getRow(4).createCell(7);
				cellFive.setCellValue(GuardApp.enterCity().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.state().contentEquals(GuardApp.enterState().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(5).createCell(5);
				XSSFCell cellSeven = sheet.getRow(5).createCell(7);
				cellFive.setCellValue(GuardApp.enterState().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.zip().contentEquals(GuardApp.enterZip().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(6).createCell(5);
				XSSFCell cellSeven = sheet.getRow(6).createCell(7);
				cellFive.setCellValue(GuardApp.enterZip().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.phone().contentEquals(GuardApp.enterPhone().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(7).createCell(5);
				XSSFCell cellSeven = sheet.getRow(7).createCell(7);
				cellFive.setCellValue(GuardApp.enterPhone().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.phoneHome().contentEquals(GuardApp.enterHomePhone().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(8).createCell(5);
				XSSFCell cellSeven = sheet.getRow(8).createCell(7);
				cellFive.setCellValue(GuardApp.enterHomePhone().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.yes18years().contentEquals(GuardApp.clickYes18Years().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(9).createCell(5);
				XSSFCell cellSeven = sheet.getRow(9).createCell(7);
				cellFive.setCellValue(GuardApp.clickYes18Years().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.dateOfBirth().contentEquals(GuardApp.enterDateOfBirth().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(10).createCell(5);
				XSSFCell cellSeven = sheet.getRow(10).createCell(7);
				cellFive.setCellValue(GuardApp.enterDateOfBirth().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.emailAddress().contentEquals(GuardApp.enterEmail().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(11).createCell(5);
				XSSFCell cellSeven = sheet.getRow(11).createCell(7);
				cellFive.setCellValue(GuardApp.enterEmail().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.referredBy().contentEquals(GuardApp.enterReferedBy().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(12).createCell(5);
				XSSFCell cellSeven = sheet.getRow(12).createCell(7);
				cellFive.setCellValue(GuardApp.enterReferedBy().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.referedRelationship().contentEquals(GuardApp.enterReferedRelationship().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(13).createCell(5);
				XSSFCell cellSeven = sheet.getRow(13).createCell(7);
				cellFive.setCellValue(GuardApp.enterReferedRelationship().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.hair().contentEquals(GuardApp.enterHair().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(14).createCell(5);
				XSSFCell cellSeven = sheet.getRow(14).createCell(7);
				cellFive.setCellValue(GuardApp.enterHair().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.eyes().contentEquals(GuardApp.enterEyes().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(15).createCell(5);
				XSSFCell cellSeven = sheet.getRow(15).createCell(7);
				cellFive.setCellValue(GuardApp.enterEyes().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.height().contentEquals(GuardApp.enterHeight().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(16).createCell(5);
				XSSFCell cellSeven = sheet.getRow(16).createCell(7);
				cellFive.setCellValue(GuardApp.enterHeight().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.shirtSize().contentEquals(GuardApp.enterShirtSize().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(17).createCell(5);
				XSSFCell cellSeven = sheet.getRow(17).createCell(7);
				cellFive.setCellValue(GuardApp.enterShirtSize().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.yesWorkRight().contentEquals(GuardApp.clickYesWorkRight().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(18).createCell(5);
				XSSFCell cellSeven = sheet.getRow(18).createCell(7);
				cellFive.setCellValue(GuardApp.clickYesWorkRight().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.yesOwnVehicle().contentEquals(GuardApp.clickYesOwnVehicle().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(19).createCell(5);
				XSSFCell cellSeven = sheet.getRow(19).createCell(7);
				cellFive.setCellValue(GuardApp.clickYesOwnVehicle().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.yesValidDriverLic().contentEquals(GuardApp.clickYesDriverLic().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(20).createCell(5);
				XSSFCell cellSeven = sheet.getRow(20).createCell(7);
				cellFive.setCellValue(GuardApp.clickYesDriverLic().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.licenseNo().contentEquals(GuardApp.enterDriverLicNo().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(21).createCell(5);
				XSSFCell cellSeven = sheet.getRow(21).createCell(7);
				cellFive.setCellValue(GuardApp.enterDriverLicNo().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.noOfMiles().contentEquals(GuardApp.enterNoOfMiles().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(22).createCell(5);
				XSSFCell cellSeven = sheet.getRow(22).createCell(7);
				cellFive.setCellValue(GuardApp.enterNoOfMiles().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.yesSubstanceTest().contentEquals(GuardApp.clickYesSubstanceTest().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(23).createCell(5);
				XSSFCell cellSeven = sheet.getRow(23).createCell(7);
				cellFive.setCellValue(GuardApp.clickYesSubstanceTest().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.noCrime().contentEquals(GuardApp.clickNoToCrime().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(24).createCell(5);
				XSSFCell cellSeven = sheet.getRow(24).createCell(7);
				cellFive.setCellValue(GuardApp.clickNoToCrime().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.securityGuard().contentEquals(GuardApp.clickSecurityGuard().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(25).createCell(5);
				XSSFCell cellSeven = sheet.getRow(25).createCell(7);
				cellFive.setCellValue(GuardApp.clickSecurityGuard().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.unArmed().contentEquals(GuardApp.clickUnarmed().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(26).createCell(5);
				XSSFCell cellSeven = sheet.getRow(26).createCell(7);
				cellFive.setCellValue(GuardApp.clickUnarmed().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.sunday().contentEquals(GuardApp.clickSunday().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(27).createCell(5);
				XSSFCell cellSeven = sheet.getRow(27).createCell(7);
				cellFive.setCellValue(GuardApp.clickSunday().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.saturday().contentEquals(GuardApp.clickSaturday().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(28).createCell(5);
				XSSFCell cellSeven = sheet.getRow(28).createCell(7);
				cellFive.setCellValue(GuardApp.clickSaturday().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.anyShift().contentEquals(GuardApp.clickAnyShift().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(29).createCell(5);
				XSSFCell cellSeven = sheet.getRow(29).createCell(7);
				cellFive.setCellValue(GuardApp.clickAnyShift().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.currentlyEmployed().contentEquals(GuardApp.clickCurrentlyEmployed().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(30).createCell(5);
				XSSFCell cellSeven = sheet.getRow(30).createCell(7);
				cellFive.setCellValue(GuardApp.clickCurrentlyEmployed().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.yesContact().contentEquals(GuardApp.clickYesContact().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(31).createCell(5);
				XSSFCell cellSeven = sheet.getRow(31).createCell(7);
				cellFive.setCellValue(GuardApp.clickYesContact().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.employerNameAndAddress().contentEquals(GuardApp.enterEmployerNameAndAddress().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(32).createCell(5);
				XSSFCell cellSeven = sheet.getRow(32).createCell(7);
				cellFive.setCellValue(GuardApp.enterEmployerNameAndAddress().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.noWorkForMaximus().contentEquals(GuardApp.clickNoWorkForMaximus().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(33).createCell(5);
				XSSFCell cellSeven = sheet.getRow(33).createCell(7);
				cellFive.setCellValue(GuardApp.clickNoWorkForMaximus().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.yesForAnotherCompany().contentEquals(GuardApp.clickYesForAnotherCompany().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(34).createCell(5);
				XSSFCell cellSeven = sheet.getRow(34).createCell(7);
				cellFive.setCellValue(GuardApp.clickYesForAnotherCompany().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.whenAndWhere().contentEquals(GuardApp.enterWhenAndWhere().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(35).createCell(5);
				XSSFCell cellSeven = sheet.getRow(35).createCell(7);
				cellFive.setCellValue(GuardApp.enterWhenAndWhere().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.startWorkingDate().contentEquals(GuardApp.enterStartingWorkDate().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(36).createCell(5);
				XSSFCell cellSeven = sheet.getRow(36).createCell(7);
				cellFive.setCellValue(GuardApp.enterStartingWorkDate().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.lastPayRate().contentEquals(GuardApp.enterLastPayRate().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(37).createCell(5);
				XSSFCell cellSeven = sheet.getRow(37).createCell(7);
				cellFive.setCellValue(GuardApp.enterLastPayRate().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.minAcceptablePayRate().contentEquals(GuardApp.enterMinAcceptablePayRate().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(38).createCell(5);
				XSSFCell cellSeven = sheet.getRow(38).createCell(7);
				cellFive.setCellValue(GuardApp.enterMinAcceptablePayRate().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.languageProfeciency().contentEquals(GuardApp.enterLanguageProfeciency().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(39).createCell(5);
				XSSFCell cellSeven = sheet.getRow(39).createCell(7);
				cellFive.setCellValue(GuardApp.enterLanguageProfeciency().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.education().contentEquals(GuardApp.enterEducation().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(40).createCell(5);
				XSSFCell cellSeven = sheet.getRow(40).createCell(7);
				cellFive.setCellValue(GuardApp.enterEducation().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.nameAndLocationOfSchool().contentEquals(GuardApp.enterNameAndLocationOfSchool().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(41).createCell(5);
				XSSFCell cellSeven = sheet.getRow(41).createCell(7);
				cellFive.setCellValue(GuardApp.enterNameAndLocationOfSchool().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.noOfYearsSchoolAttended().contentEquals(GuardApp.enterNoOfYearsSchoolAttended().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(42).createCell(5);
				XSSFCell cellSeven = sheet.getRow(42).createCell(7);
				cellFive.setCellValue(GuardApp.enterNoOfYearsSchoolAttended().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.yesGraduated().contentEquals(GuardApp.clickYesGraduated().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(43).createCell(5);
				XSSFCell cellSeven = sheet.getRow(43).createCell(7);
				cellFive.setCellValue(GuardApp.clickYesGraduated().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.graducationYear().contentEquals(GuardApp.enterGraduationYear().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(44).createCell(5);
				XSSFCell cellSeven = sheet.getRow(44).createCell(7);
				cellFive.setCellValue(GuardApp.enterGraduationYear().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.guardCard().contentEquals(GuardApp.clickGuardCardPermit().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(45).createCell(5);
				XSSFCell cellSeven = sheet.getRow(45).createCell(7);
				cellFive.setCellValue(GuardApp.clickGuardCardPermit().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.guardCardNo().contentEquals(GuardApp.enterGuardCardPermitNo().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(46).createCell(5);
				XSSFCell cellSeven = sheet.getRow(46).createCell(7);
				cellFive.setCellValue(GuardApp.enterGuardCardPermitNo().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.guardCardExpiration().contentEquals(GuardApp.enterGuardCardExpiration().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(47).createCell(5);
				XSSFCell cellSeven = sheet.getRow(47).createCell(7);
				cellFive.setCellValue(GuardApp.enterGuardCardExpiration().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.firstAidCard().contentEquals(GuardApp.clickFirstAidCard().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(48).createCell(5);
				XSSFCell cellSeven = sheet.getRow(48).createCell(7);
				cellFive.setCellValue(GuardApp.clickFirstAidCard().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.firstAidCardNo().contentEquals(GuardApp.enterFirstAidCardNo().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(49).createCell(5);
				XSSFCell cellSeven = sheet.getRow(49).createCell(7);
				cellFive.setCellValue(GuardApp.enterFirstAidCardNo().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.firstAidCardExpiration().contentEquals(GuardApp.enterFirstAidCardExpiration().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(50).createCell(5);
				XSSFCell cellSeven = sheet.getRow(50).createCell(7);
				cellFive.setCellValue(GuardApp.enterFirstAidCardExpiration().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.cprCard().contentEquals(GuardApp.clickCPRCard().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(51).createCell(5);
				XSSFCell cellSeven = sheet.getRow(51).createCell(7);
				cellFive.setCellValue(GuardApp.clickCPRCard().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.cprCardNo().contentEquals(GuardApp.enterCPRCardNo().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(52).createCell(5);
				XSSFCell cellSeven = sheet.getRow(52).createCell(7);
				cellFive.setCellValue(GuardApp.enterCPRCardNo().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.cprCardExpiration().contentEquals(GuardApp.enterCPRCardExpiration().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(53).createCell(5);
				XSSFCell cellSeven = sheet.getRow(53).createCell(7);
				cellFive.setCellValue(GuardApp.enterCPRCardExpiration().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.aedCard().contentEquals(GuardApp.clickAEDPermit().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(54).createCell(5);
				XSSFCell cellSeven = sheet.getRow(54).createCell(7);
				cellFive.setCellValue(GuardApp.clickAEDPermit().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.aedCardNo().contentEquals(GuardApp.enterAEDPermitNo().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(55).createCell(5);
				XSSFCell cellSeven = sheet.getRow(55).createCell(7);
				cellFive.setCellValue(GuardApp.enterAEDPermitNo().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.aedCardExpiration().contentEquals(GuardApp.enterAEDPermitExpiration().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(56).createCell(5);
				XSSFCell cellSeven = sheet.getRow(56).createCell(7);
				cellFive.setCellValue(GuardApp.enterAEDPermitExpiration().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.otherCard().contentEquals(GuardApp.clickOtherPermit().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(57).createCell(5);
				XSSFCell cellSeven = sheet.getRow(57).createCell(7);
				cellFive.setCellValue(GuardApp.clickOtherPermit().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.otherCardNo().contentEquals(GuardApp.enterOtherPermitNo().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(58).createCell(5);
				XSSFCell cellSeven = sheet.getRow(58).createCell(7);
				cellFive.setCellValue(GuardApp.enterOtherPermitNo().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.otherCardExpiration().contentEquals(GuardApp.enterOtherPermitExpiration().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(59).createCell(5);
				XSSFCell cellSeven = sheet.getRow(59).createCell(7);
				cellFive.setCellValue(GuardApp.enterOtherPermitExpiration().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.pepperSpray().contentEquals(GuardApp.clickPepperSpary().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(60).createCell(5);
				XSSFCell cellSeven = sheet.getRow(60).createCell(7);
				cellFive.setCellValue(GuardApp.clickPepperSpary().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.pepperSprayNo().contentEquals(GuardApp.enterPepperSparyNo().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(61).createCell(5);
				XSSFCell cellSeven = sheet.getRow(61).createCell(7);
				cellFive.setCellValue(GuardApp.enterPepperSparyNo().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.baton().contentEquals(GuardApp.clickBaton().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(62).createCell(5);
				XSSFCell cellSeven = sheet.getRow(62).createCell(7);
				cellFive.setCellValue(GuardApp.clickBaton().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.batonNo().contentEquals(GuardApp.enterBatonNo().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(63).createCell(5);
				XSSFCell cellSeven = sheet.getRow(63).createCell(7);
				cellFive.setCellValue(GuardApp.enterBatonNo().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.fireArm().contentEquals(GuardApp.clickFirArm().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(64).createCell(5);
				XSSFCell cellSeven = sheet.getRow(64).createCell(7);
				cellFive.setCellValue(GuardApp.clickFirArm().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.fireArmNo().contentEquals(GuardApp.enterFirArmNo().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(65).createCell(5);
				XSSFCell cellSeven = sheet.getRow(65).createCell(7);
				cellFive.setCellValue(GuardApp.enterFirArmNo().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.fireArmCaliber().contentEquals(GuardApp.enterFirArmCaliber().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(66).createCell(5);
				XSSFCell cellSeven = sheet.getRow(66).createCell(7);
				cellFive.setCellValue(GuardApp.enterFirArmCaliber().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.fireArmExpiration().contentEquals(GuardApp.enterFirArmExpiration().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(67).createCell(5);
				XSSFCell cellSeven = sheet.getRow(67).createCell(7);
				cellFive.setCellValue(GuardApp.enterFirArmExpiration().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.yesOwnFireArm().contentEquals(GuardApp.clickYesOwnFireArm().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(68).createCell(5);
				XSSFCell cellSeven = sheet.getRow(68).createCell(7);
				cellFive.setCellValue(GuardApp.clickYesOwnFireArm().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.yesFireArmAvailable().contentEquals(GuardApp.clickYesFireArmAvailable().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(69).createCell(5);
				XSSFCell cellSeven = sheet.getRow(69).createCell(7);
				cellFive.setCellValue(GuardApp.clickYesFireArmAvailable().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.fireArmMake().contentEquals(GuardApp.enterFireArmMake().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(70).createCell(5);
				XSSFCell cellSeven = sheet.getRow(70).createCell(7);
				cellFive.setCellValue(GuardApp.enterFireArmMake().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.fireArmModel().contentEquals(GuardApp.enterFireArmModel().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(71).createCell(5);
				XSSFCell cellSeven = sheet.getRow(71).createCell(7);
				cellFive.setCellValue(GuardApp.enterFireArmModel().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.fireArmSerialNo().contentEquals(GuardApp.enterFireArmSerialNo().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(72).createCell(5);
				XSSFCell cellSeven = sheet.getRow(72).createCell(7);
				cellFive.setCellValue(GuardApp.enterFireArmSerialNo().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.fireArmFacilityName().contentEquals(GuardApp.enterFireArmFacilityName().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(73).createCell(5);
				XSSFCell cellSeven = sheet.getRow(73).createCell(7);
				cellFive.setCellValue(GuardApp.enterFireArmFacilityName().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.fireArmFacilityAddress().contentEquals(GuardApp.enterFireArmFacilityAddress().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(74).createCell(5);
				XSSFCell cellSeven = sheet.getRow(74).createCell(7);
				cellFive.setCellValue(GuardApp.enterFireArmFacilityAddress().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.fireArmFacilityPhone().contentEquals(GuardApp.enterFireArmFacilityPhoneNo().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(75).createCell(5);
				XSSFCell cellSeven = sheet.getRow(75).createCell(7);
				cellFive.setCellValue(GuardApp.enterFireArmFacilityPhoneNo().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.militaryBranch().contentEquals(GuardApp.enterMilitaryBranch().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(76).createCell(5);
				XSSFCell cellSeven = sheet.getRow(76).createCell(7);
				cellFive.setCellValue(GuardApp.enterMilitaryBranch().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.militaryRank().contentEquals(GuardApp.enterMilitaryRank().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(77).createCell(5);
				XSSFCell cellSeven = sheet.getRow(77).createCell(7);
				cellFive.setCellValue(GuardApp.enterMilitaryRank().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.militaryService().contentEquals(GuardApp.enterMilitaryService().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(78).createCell(5);
				XSSFCell cellSeven = sheet.getRow(78).createCell(7);
				cellFive.setCellValue(GuardApp.enterMilitaryService().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.honorableDischarge().contentEquals(GuardApp.clickYesHonorableDischarge().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(79).createCell(5);
				XSSFCell cellSeven = sheet.getRow(79).createCell(7);
				cellFive.setCellValue(GuardApp.clickYesHonorableDischarge().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.separationDate().contentEquals(GuardApp.enterSeparatinDate().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(80).createCell(5);
				XSSFCell cellSeven = sheet.getRow(80).createCell(7);
				cellFive.setCellValue(GuardApp.enterSeparatinDate().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.militarySkill().contentEquals(GuardApp.enterMilatarySkill().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(81).createCell(5);
				XSSFCell cellSeven = sheet.getRow(81).createCell(7);
				cellFive.setCellValue(GuardApp.enterMilatarySkill().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.firstEmployerWorkStart().contentEquals(GuardApp.enterFirstEmployerWorkStart().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(82).createCell(5);
				XSSFCell cellSeven = sheet.getRow(82).createCell(7);
				cellFive.setCellValue(GuardApp.enterFirstEmployerWorkStart().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.firstEmployerWorkTo().contentEquals(GuardApp.enterFirstEmployerWorkTo().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(83).createCell(5);
				XSSFCell cellSeven = sheet.getRow(83).createCell(7);
				cellFive.setCellValue(GuardApp.enterFirstEmployerWorkTo().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.firstEmployerName().contentEquals(GuardApp.enterFirstEmployerName().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(84).createCell(5);
				XSSFCell cellSeven = sheet.getRow(84).createCell(7);
				cellFive.setCellValue(GuardApp.enterFirstEmployerName().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.firstEmployerAddress().contentEquals(GuardApp.enterFirstEmployerAddress().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(85).createCell(5);
				XSSFCell cellSeven = sheet.getRow(85).createCell(7);
				cellFive.setCellValue(GuardApp.enterFirstEmployerAddress().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.firstEmployerSalary().contentEquals(GuardApp.enterFirstEmployerSalary().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(86).createCell(5);
				XSSFCell cellSeven = sheet.getRow(86).createCell(7);
				cellFive.setCellValue(GuardApp.enterFirstEmployerSalary().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.firstEmployerPosition().contentEquals(GuardApp.enterFirstEmployerPosition().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(87).createCell(5);
				XSSFCell cellSeven = sheet.getRow(87).createCell(7);
				cellFive.setCellValue(GuardApp.enterFirstEmployerPosition().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.firstEmployerLeavingReason().contentEquals(GuardApp.enterFirstEmployerLeavingReason().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(88).createCell(5);
				XSSFCell cellSeven = sheet.getRow(88).createCell(7);
				cellFive.setCellValue(GuardApp.enterFirstEmployerLeavingReason().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.secondEmployerWorkStart().contentEquals(GuardApp.enterSecondEmployerWorkStart().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(89).createCell(5);
				XSSFCell cellSeven = sheet.getRow(89).createCell(7);
				cellFive.setCellValue(GuardApp.enterSecondEmployerWorkStart().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.secondEmployerWorkTo().contentEquals(GuardApp.enterSecondEmployerWorkTo().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(90).createCell(5);
				XSSFCell cellSeven = sheet.getRow(90).createCell(7);
				cellFive.setCellValue(GuardApp.enterSecondEmployerWorkTo().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.secondEmployerName().contentEquals(GuardApp.enterSecondEmployerName().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(91).createCell(5);
				XSSFCell cellSeven = sheet.getRow(91).createCell(7);
				cellFive.setCellValue(GuardApp.enterSecondEmployerName().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.secondEmployerAddress().contentEquals(GuardApp.enterSecondEmployerAddress().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(92).createCell(5);
				XSSFCell cellSeven = sheet.getRow(92).createCell(7);
				cellFive.setCellValue(GuardApp.enterSecondEmployerAddress().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.secondEmployerSalary().contentEquals(GuardApp.enterSecondEmployerSalary().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(93).createCell(5);
				XSSFCell cellSeven = sheet.getRow(93).createCell(7);
				cellFive.setCellValue(GuardApp.enterSecondEmployerSalary().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.secondEmployerPosition().contentEquals(GuardApp.enterSecondEmployerPosition().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(94).createCell(5);
				XSSFCell cellSeven = sheet.getRow(94).createCell(7);
				cellFive.setCellValue(GuardApp.enterSecondEmployerPosition().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.secondEmployerLeavingReason().contentEquals(GuardApp.enterSecondEmployerLeavingReason().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(95).createCell(5);
				XSSFCell cellSeven = sheet.getRow(95).createCell(7);
				cellFive.setCellValue(GuardApp.enterSecondEmployerLeavingReason().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.thirdEmployerWorkStart().contentEquals(GuardApp.enterThirdEmployerWorkStart().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(96).createCell(5);
				XSSFCell cellSeven = sheet.getRow(96).createCell(7);
				cellFive.setCellValue(GuardApp.enterThirdEmployerWorkStart().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.thirdEmployerWorkTo().contentEquals(GuardApp.enterThirdEmployerWorkTo().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(97).createCell(5);
				XSSFCell cellSeven = sheet.getRow(97).createCell(7);
				cellFive.setCellValue(GuardApp.enterThirdEmployerWorkTo().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.thirdEmployerName().contentEquals(GuardApp.enterThirdEmployerName().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(98).createCell(5);
				XSSFCell cellSeven = sheet.getRow(98).createCell(7);
				cellFive.setCellValue(GuardApp.enterThirdEmployerName().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.thirdEmployerAddress().contentEquals(GuardApp.enterThirdEmployerAddress().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(99).createCell(5);
				XSSFCell cellSeven = sheet.getRow(99).createCell(7);
				cellFive.setCellValue(GuardApp.enterThirdEmployerAddress().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.thirdEmployerSalary().contentEquals(GuardApp.enterThirdEmployerSalary().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(100).createCell(5);
				XSSFCell cellSeven = sheet.getRow(100).createCell(7);
				cellFive.setCellValue(GuardApp.enterThirdEmployerSalary().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.thirdEmployerPosition().contentEquals(GuardApp.enterThirdEmployerPosition().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(101).createCell(5);
				XSSFCell cellSeven = sheet.getRow(101).createCell(7);
				cellFive.setCellValue(GuardApp.enterThirdEmployerPosition().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.thirdEmployerLeavingReason().contentEquals(GuardApp.enterThirdEmployerLeavingReason().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(102).createCell(5);
				XSSFCell cellSeven = sheet.getRow(102).createCell(7);
				cellFive.setCellValue(GuardApp.enterThirdEmployerLeavingReason().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.referenceName().contentEquals(GuardApp.enterReferenceName().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(103).createCell(5);
				XSSFCell cellSeven = sheet.getRow(103).createCell(7);
				cellFive.setCellValue(GuardApp.enterReferenceName().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.referencePhone().contentEquals(GuardApp.enterReferencePhoneNo().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(104).createCell(5);
				XSSFCell cellSeven = sheet.getRow(104).createCell(7);
				cellFive.setCellValue(GuardApp.enterReferencePhoneNo().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.referenceAddress().contentEquals(GuardApp.enterReferenceAddress().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(105).createCell(5);
				XSSFCell cellSeven = sheet.getRow(105).createCell(7);
				cellFive.setCellValue(GuardApp.enterReferenceAddress().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.referenceOccupation().contentEquals(GuardApp.enterReferenceOccupation().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(106).createCell(5);
				XSSFCell cellSeven = sheet.getRow(106).createCell(7);
				cellFive.setCellValue(GuardApp.enterReferenceOccupation().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.referenceYearsKnown().contentEquals(GuardApp.enterReferenceYearKnown().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(107).createCell(5);
				XSSFCell cellSeven = sheet.getRow(107).createCell(7);
				cellFive.setCellValue(GuardApp.enterReferenceYearKnown().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.secondReferenceName().contentEquals(GuardApp.enterSecondReferenceName().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(108).createCell(5);
				XSSFCell cellSeven = sheet.getRow(108).createCell(7);
				cellFive.setCellValue(GuardApp.enterSecondReferenceName().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.secondReferencePhone().contentEquals(GuardApp.enterSecondReferencePhoneNo().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(109).createCell(5);
				XSSFCell cellSeven = sheet.getRow(109).createCell(7);
				cellFive.setCellValue(GuardApp.enterSecondReferencePhoneNo().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.secondReferenceAddress().contentEquals(GuardApp.enterSecondReferenceAddress().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(110).createCell(5);
				XSSFCell cellSeven = sheet.getRow(110).createCell(7);
				cellFive.setCellValue(GuardApp.enterSecondReferenceAddress().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.secondReferenceOccupation().contentEquals(GuardApp.enterSecondReferenceOccupation().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(111).createCell(5);
				XSSFCell cellSeven = sheet.getRow(111).createCell(7);
				cellFive.setCellValue(GuardApp.enterSecondReferenceOccupation().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.secondReferenceYearsKnown().contentEquals(GuardApp.enterSecondReferenceYearKnown().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(112).createCell(5);
				XSSFCell cellSeven = sheet.getRow(112).createCell(7);
				cellFive.setCellValue(GuardApp.enterSecondReferenceYearKnown().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.thirdReferenceName().contentEquals(GuardApp.enterThirdReferenceName().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(113).createCell(5);
				XSSFCell cellSeven = sheet.getRow(113).createCell(7);
				cellFive.setCellValue(GuardApp.enterThirdReferenceName().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.thirdReferencePhone().contentEquals(GuardApp.enterThirdReferencePhoneNo().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(114).createCell(5);
				XSSFCell cellSeven = sheet.getRow(114).createCell(7);
				cellFive.setCellValue(GuardApp.enterThirdReferencePhoneNo().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.thirdReferenceAddress().contentEquals(GuardApp.enterThirdReferenceAddress().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(115).createCell(5);
				XSSFCell cellSeven = sheet.getRow(115).createCell(7);
				cellFive.setCellValue(GuardApp.enterThirdReferenceAddress().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.thirdReferenceOccupation().contentEquals(GuardApp.enterThirdReferenceOccupation().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(116).createCell(5);
				XSSFCell cellSeven = sheet.getRow(116).createCell(7);
				cellFive.setCellValue(GuardApp.enterThirdReferenceOccupation().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.thirdReferenceYearsKnown().contentEquals(GuardApp.enterThirdReferenceYearKnown().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(117).createCell(5);
				XSSFCell cellSeven = sheet.getRow(117).createCell(7);
				cellFive.setCellValue(GuardApp.enterThirdReferenceYearKnown().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.emergencyContactName().contentEquals(GuardApp.enterEmergencyContactName().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(118).createCell(5);
				XSSFCell cellSeven = sheet.getRow(118).createCell(7);
				cellFive.setCellValue(GuardApp.enterEmergencyContactName().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.emergencyContactCell().contentEquals(GuardApp.enterEmergencyContactCell().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(119).createCell(5);
				XSSFCell cellSeven = sheet.getRow(119).createCell(7);
				cellFive.setCellValue(GuardApp.enterEmergencyContactCell().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.emergencyContactPhone().contentEquals(GuardApp.enterEmergencyContactPhone().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(120).createCell(5);
				XSSFCell cellSeven = sheet.getRow(120).createCell(7);
				cellFive.setCellValue(GuardApp.enterEmergencyContactPhone().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.emergencyContactAddress().contentEquals(GuardApp.enterEmergencyContactAddress().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(121).createCell(5);
				XSSFCell cellSeven = sheet.getRow(121).createCell(7);
				cellFive.setCellValue(GuardApp.enterEmergencyContactAddress().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.emergencyContactRelationship().contentEquals(GuardApp.enterEmergencyContactRelationship().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(122).createCell(5);
				XSSFCell cellSeven = sheet.getRow(122).createCell(7);
				cellFive.setCellValue(GuardApp.enterEmergencyContactRelationship().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.yesToHealthReport().contentEquals(GuardApp.clickYesToHealthRepot().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(123).createCell(5);
				XSSFCell cellSeven = sheet.getRow(123).createCell(7);
				cellFive.setCellValue(GuardApp.clickYesToHealthRepot().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.yesAcknowledgement().contentEquals(GuardApp.clickAcknowledgement().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(124).createCell(5);
				XSSFCell cellSeven = sheet.getRow(124).createCell(7);
				cellFive.setCellValue(GuardApp.clickAcknowledgement().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			if(Data.submit().contentEquals(GuardApp.clickSubmit().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(125).createCell(5);
				XSSFCell cellSeven = sheet.getRow(125).createCell(7);
				cellFive.setCellValue(GuardApp.clickSubmit().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				}
			wb.write(new FileOutputStream("GuardApp/data.xlsx"));
			wb.close();
			Runtime.getRuntime().exec("cmd /c start GuardApp\\data.xlsx");
	    }catch(IOException  e){  
	        e.printStackTrace();  
	    }
	}
}
