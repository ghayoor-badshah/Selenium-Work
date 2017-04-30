import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//Getting data from data.xlsx files for entering data to security-guard-application
public class Data {
	
	@SuppressWarnings("resource")
	public static String name() throws FileNotFoundException, IOException{
		return new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(1).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String date() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(2).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String address() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(3).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String city() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(4).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String state() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(5).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String zip() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(6).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String phone() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(7).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String phoneHome() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(8).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String yes18years() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(9).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String dateOfBirth() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(10).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String emailAddress() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(11).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String referredBy() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(12).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String referedRelationship() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(13).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String hair() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(14).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String eyes() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(15).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String height() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(16).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String shirtSize() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(17).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String yesWorkRight() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(18).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String yesOwnVehicle() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(19).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String yesValidDriverLic() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(20).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String licenseNo() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(21).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String noOfMiles() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(22).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String yesSubstanceTest() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(23).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String noCrime() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(24).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String securityGuard() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(25).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String unArmed() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(26).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String sunday() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(27).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String saturday() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(28).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String anyShift() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(29).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String currentlyEmployed() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(30).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String yesContact() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(31).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String employerNameAndAddress() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(32).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String noWorkForMaximus() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(33).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String yesForAnotherCompany() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(34).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String whenAndWhere() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(35).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String startWorkingDate() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(36).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String lastPayRate() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(37).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String minAcceptablePayRate() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(38).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String languageProfeciency() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(39).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String education() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(40).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String nameAndLocationOfSchool() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(41).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String noOfYearsSchoolAttended() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(42).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String yesGraduated() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(43).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String graducationYear() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(44).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String guardCard() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(45).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String guardCardNo() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(46).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String guardCardExpiration() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(47).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String firstAidCard() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(48).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String firstAidCardNo() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(49).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String firstAidCardExpiration() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(50).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String cprCard() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(51).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String cprCardNo() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(52).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String cprCardExpiration() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(53).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String aedCard() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(54).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String aedCardNo() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(55).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String aedCardExpiration() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(56).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String otherCard() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(57).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String otherCardNo() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(58).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String otherCardExpiration() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(59).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String pepperSpray() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(60).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String pepperSprayNo() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(61).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String baton() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(62).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String batonNo() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(63).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String fireArm() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(64).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String fireArmNo() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(65).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String fireArmCaliber() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(66).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String fireArmExpiration() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(67).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String yesOwnFireArm() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(68).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String yesFireArmAvailable() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(69).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String fireArmMake() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(70).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String fireArmModel() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(71).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String fireArmSerialNo() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(72).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String fireArmFacilityName() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(73).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String fireArmFacilityAddress() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(74).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String fireArmFacilityPhone() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(75).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String militaryBranch() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(76).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String militaryRank() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(77).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String militaryService() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(78).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String honorableDischarge() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(79).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String separationDate() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(80).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String militarySkill() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(81).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String firstEmployerWorkStart() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(82).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String firstEmployerWorkTo() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(83).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String firstEmployerName() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(84).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String firstEmployerAddress() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(85).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String firstEmployerSalary() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(86).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String firstEmployerPosition() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(87).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String firstEmployerLeavingReason() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(88).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String secondEmployerWorkStart() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(89).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String secondEmployerWorkTo() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(90).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String secondEmployerName() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(91).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String secondEmployerAddress() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(92).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String secondEmployerSalary() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(93).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String secondEmployerPosition() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(94).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String secondEmployerLeavingReason() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(95).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String thirdEmployerWorkStart() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(96).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String thirdEmployerWorkTo() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(97).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String thirdEmployerName() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(98).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String thirdEmployerAddress() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(99).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String thirdEmployerSalary() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(100).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String thirdEmployerPosition() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(101).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String thirdEmployerLeavingReason() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(102).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String referenceName() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(103).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String referencePhone() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(104).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String referenceAddress() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(105).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String referenceOccupation() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(106).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String referenceYearsKnown() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(107).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String secondReferenceName() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(108).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String secondReferencePhone() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(109).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String secondReferenceAddress() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(110).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String secondReferenceOccupation() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(111).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String secondReferenceYearsKnown() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(112).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String thirdReferenceName() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(113).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String thirdReferencePhone() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(114).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String thirdReferenceAddress() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(115).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String thirdReferenceOccupation() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(116).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String thirdReferenceYearsKnown() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(117).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String emergencyContactName() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(118).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String emergencyContactCell() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(119).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String emergencyContactPhone() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(120).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String emergencyContactAddress() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(121).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String emergencyContactRelationship() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(122).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String yesToHealthReport() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(123).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String yesAcknowledgement() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(124).getCell(4).getStringCellValue();
	}
	@SuppressWarnings("resource")
	public static String submit() throws FileNotFoundException, IOException{
		return  new XSSFWorkbook(new FileInputStream("GuardApp/data.xlsx")).getSheet("sheet1").getRow(125).getCell(4).getStringCellValue();
	}
}
