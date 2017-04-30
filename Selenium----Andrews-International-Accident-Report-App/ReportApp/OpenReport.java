import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//Report in the form of excel file for Andrews International Incident Report
public class OpenReport {
	public static void openExcel() throws FileNotFoundException, IOException{
		XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream("ReportApp/data.xlsx"));
		XSSFSheet sheet = wb.getSheet("myReport");
		try{
			if(Data.myList[0].contentEquals(ReportApp.enterDrNo().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(1).createCell(5);
				XSSFCell cellSeven = sheet.getRow(1).createCell(7);
				cellFive.setCellValue(ReportApp.enterDrNo().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[1].contentEquals(ReportApp.enterInvestigationTopic().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(2).createCell(5);
				XSSFCell cellSeven = sheet.getRow(2).createCell(7);
				cellFive.setCellValue(ReportApp.enterInvestigationTopic().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[2].contentEquals(ReportApp.enterExtra().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(3).createCell(5);
				XSSFCell cellSeven = sheet.getRow(3).createCell(7);
				cellFive.setCellValue(ReportApp.enterExtra().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[3].contentEquals(ReportApp.enterAddressOfOccurrence().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(4).createCell(5);
				XSSFCell cellSeven = sheet.getRow(4).createCell(7);
				cellFive.setCellValue(ReportApp.enterAddressOfOccurrence().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[4].contentEquals(ReportApp.enterDateAndTimeOccurrence().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(5).createCell(5);
				XSSFCell cellSeven = sheet.getRow(5).createCell(7);
				cellFive.setCellValue(ReportApp.enterDateAndTimeOccurrence().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[5].contentEquals(ReportApp.enterDateAndTimeReported().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(6).createCell(5);
				XSSFCell cellSeven = sheet.getRow(6).createCell(7);
				cellFive.setCellValue(ReportApp.enterDateAndTimeReported().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[6].contentEquals(ReportApp.enterExactLocationOnPremisses().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(7).createCell(5);
				XSSFCell cellSeven = sheet.getRow(7).createCell(7);
				cellFive.setCellValue(ReportApp.enterExactLocationOnPremisses().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[7].contentEquals(ReportApp.enterNotificationPerson().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(8).createCell(5);
				XSSFCell cellSeven = sheet.getRow(8).createCell(7);
				cellFive.setCellValue(ReportApp.enterNotificationPerson().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[8].contentEquals(ReportApp.enterConnectedRepots().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(9).createCell(5);
				XSSFCell cellSeven = sheet.getRow(9).createCell(7);
				cellFive.setCellValue(ReportApp.enterConnectedRepots().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[9].contentEquals(ReportApp.enterTypeOfPropertyTakenLost().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(10).createCell(5);
				XSSFCell cellSeven = sheet.getRow(10).createCell(7);
				cellFive.setCellValue(ReportApp.enterTypeOfPropertyTakenLost().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[10].contentEquals(ReportApp.enterStolenLost().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(11).createCell(5);
				XSSFCell cellSeven = sheet.getRow(11).createCell(7);
				cellFive.setCellValue(ReportApp.enterStolenLost().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[11].contentEquals(ReportApp.enterRecoverd().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(12).createCell(5);
				XSSFCell cellSeven = sheet.getRow(12).createCell(7);
				cellFive.setCellValue(ReportApp.enterRecoverd().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[12].contentEquals(ReportApp.enterEstimatedDamage().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(13).createCell(5);
				XSSFCell cellSeven = sheet.getRow(13).createCell(7);
				cellFive.setCellValue(ReportApp.enterEstimatedDamage().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[13].contentEquals(ReportApp.enterVehicleInvolved().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(14).createCell(5);
				XSSFCell cellSeven = sheet.getRow(14).createCell(7);
				cellFive.setCellValue(ReportApp.enterVehicleInvolved().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[14].contentEquals(ReportApp.enterYear().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(15).createCell(5);
				XSSFCell cellSeven = sheet.getRow(15).createCell(7);
				cellFive.setCellValue(ReportApp.enterYear().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[15].contentEquals(ReportApp.enterMake().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(16).createCell(5);
				XSSFCell cellSeven = sheet.getRow(16).createCell(7);
				cellFive.setCellValue(ReportApp.enterMake().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[16].contentEquals(ReportApp.enterModel().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(17).createCell(5);
				XSSFCell cellSeven = sheet.getRow(17).createCell(7);
				cellFive.setCellValue(ReportApp.enterModel().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[17].contentEquals(ReportApp.enterType().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(18).createCell(5);
				XSSFCell cellSeven = sheet.getRow(18).createCell(7);
				cellFive.setCellValue(ReportApp.enterType().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[18].contentEquals(ReportApp.enterColor().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(19).createCell(5);
				XSSFCell cellSeven = sheet.getRow(19).createCell(7);
				cellFive.setCellValue(ReportApp.enterColor().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[19].contentEquals(ReportApp.enterLicensePlate().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(20).createCell(5);
				XSSFCell cellSeven = sheet.getRow(20).createCell(7);
				cellFive.setCellValue(ReportApp.enterLicensePlate().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[20].contentEquals(ReportApp.enterState().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(21).createCell(5);
				XSSFCell cellSeven = sheet.getRow(21).createCell(7);
				cellFive.setCellValue(ReportApp.enterState().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[21].contentEquals(ReportApp.enterBodyDamage().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(22).createCell(5);
				XSSFCell cellSeven = sheet.getRow(22).createCell(7);
				cellFive.setCellValue(ReportApp.enterBodyDamage().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[22].contentEquals(ReportApp.enterWindowsDamage().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(23).createCell(5);
				XSSFCell cellSeven = sheet.getRow(23).createCell(7);
				cellFive.setCellValue(ReportApp.enterWindowsDamage().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[23].contentEquals(ReportApp.enterPointOfEntry().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(24).createCell(5);
				XSSFCell cellSeven = sheet.getRow(24).createCell(7);
				cellFive.setCellValue(ReportApp.enterPointOfEntry().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[24].contentEquals(ReportApp.enterMethodOfEntry().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(25).createCell(5);
				XSSFCell cellSeven = sheet.getRow(25).createCell(7);
				cellFive.setCellValue(ReportApp.enterMethodOfEntry().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[25].contentEquals(ReportApp.enterInstrumentToolsUsed().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(26).createCell(5);
				XSSFCell cellSeven = sheet.getRow(26).createCell(7);
				cellFive.setCellValue(ReportApp.enterInstrumentToolsUsed().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[26].contentEquals(ReportApp.enterTypeOfWindowOrDoor().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(27).createCell(5);
				XSSFCell cellSeven = sheet.getRow(27).createCell(7);
				cellFive.setCellValue(ReportApp.enterTypeOfWindowOrDoor().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[27].contentEquals(ReportApp.enterFirstSex().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(28).createCell(5);
				XSSFCell cellSeven = sheet.getRow(28).createCell(7);
				cellFive.setCellValue(ReportApp.enterFirstSex().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[28].contentEquals(ReportApp.enterFirstDesc().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(29).createCell(5);
				XSSFCell cellSeven = sheet.getRow(29).createCell(7);
				cellFive.setCellValue(ReportApp.enterFirstDesc().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[29].contentEquals(ReportApp.enterFirstHair().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(30).createCell(5);
				XSSFCell cellSeven = sheet.getRow(30).createCell(7);
				cellFive.setCellValue(ReportApp.enterFirstHair().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[30].contentEquals(ReportApp.enterFirstEyes().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(31).createCell(5);
				XSSFCell cellSeven = sheet.getRow(31).createCell(7);
				cellFive.setCellValue(ReportApp.enterFirstEyes().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[31].contentEquals(ReportApp.enterFirstHeight().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(32).createCell(5);
				XSSFCell cellSeven = sheet.getRow(32).createCell(7);
				cellFive.setCellValue(ReportApp.enterFirstHeight().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[32].contentEquals(ReportApp.enterFirstWeight().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(33).createCell(5);
				XSSFCell cellSeven = sheet.getRow(33).createCell(7);
				cellFive.setCellValue(ReportApp.enterFirstWeight().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[33].contentEquals(ReportApp.enterFirstAge().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(34).createCell(5);
				XSSFCell cellSeven = sheet.getRow(34).createCell(7);
				cellFive.setCellValue(ReportApp.enterFirstAge().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[34].contentEquals(ReportApp.enterFirstClothingNameDob().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(35).createCell(5);
				XSSFCell cellSeven = sheet.getRow(35).createCell(7);
				cellFive.setCellValue(ReportApp.enterFirstClothingNameDob().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[35].contentEquals(ReportApp.enterSecondSex().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(36).createCell(5);
				XSSFCell cellSeven = sheet.getRow(36).createCell(7);
				cellFive.setCellValue(ReportApp.enterSecondSex().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[36].contentEquals(ReportApp.enterSecondDesc().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(37).createCell(5);
				XSSFCell cellSeven = sheet.getRow(37).createCell(7);
				cellFive.setCellValue(ReportApp.enterSecondDesc().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[37].contentEquals(ReportApp.enterSecondHair().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(38).createCell(5);
				XSSFCell cellSeven = sheet.getRow(38).createCell(7);
				cellFive.setCellValue(ReportApp.enterSecondHair().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[38].contentEquals(ReportApp.enterSecondEyes().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(39).createCell(5);
				XSSFCell cellSeven = sheet.getRow(39).createCell(7);
				cellFive.setCellValue(ReportApp.enterSecondEyes().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[39].contentEquals(ReportApp.enterSecondHeight().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(40).createCell(5);
				XSSFCell cellSeven = sheet.getRow(40).createCell(7);
				cellFive.setCellValue(ReportApp.enterSecondHeight().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[40].contentEquals(ReportApp.enterSecondWeight().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(41).createCell(5);
				XSSFCell cellSeven = sheet.getRow(41).createCell(7);
				cellFive.setCellValue(ReportApp.enterSecondWeight().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[41].contentEquals(ReportApp.enterSecondAge().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(42).createCell(5);
				XSSFCell cellSeven = sheet.getRow(42).createCell(7);
				cellFive.setCellValue(ReportApp.enterSecondAge().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[42].contentEquals(ReportApp.enterSecondClothingNameDob().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(43).createCell(5);
				XSSFCell cellSeven = sheet.getRow(43).createCell(7);
				cellFive.setCellValue(ReportApp.enterSecondClothingNameDob().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[43].contentEquals(ReportApp.enterFirstCode().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(44).createCell(5);
				XSSFCell cellSeven = sheet.getRow(44).createCell(7);
				cellFive.setCellValue(ReportApp.enterFirstCode().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[44].contentEquals(ReportApp.enterFirstNameAndDob().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(45).createCell(5);
				XSSFCell cellSeven = sheet.getRow(45).createCell(7);
				cellFive.setCellValue(ReportApp.enterFirstNameAndDob().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[45].contentEquals(ReportApp.enterFirstResidence().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(46).createCell(5);
				XSSFCell cellSeven = sheet.getRow(46).createCell(7);
				cellFive.setCellValue(ReportApp.enterFirstResidence().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[46].contentEquals(ReportApp.enterFirstTelephone().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(47).createCell(5);
				XSSFCell cellSeven = sheet.getRow(47).createCell(7);
				cellFive.setCellValue(ReportApp.enterFirstTelephone().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[47].contentEquals(ReportApp.enterSecondCode().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(48).createCell(5);
				XSSFCell cellSeven = sheet.getRow(48).createCell(7);
				cellFive.setCellValue(ReportApp.enterSecondCode().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[48].contentEquals(ReportApp.enterFirstOccupationAndDriverLic().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(49).createCell(5);
				XSSFCell cellSeven = sheet.getRow(49).createCell(7);
				cellFive.setCellValue(ReportApp.enterFirstOccupationAndDriverLic().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[49].contentEquals(ReportApp.enterFirstBusinessResidence().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(50).createCell(5);
				XSSFCell cellSeven = sheet.getRow(50).createCell(7);
				cellFive.setCellValue(ReportApp.enterFirstBusinessResidence().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[50].contentEquals(ReportApp.enterSecondTelephone().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(51).createCell(5);
				XSSFCell cellSeven = sheet.getRow(51).createCell(7);
				cellFive.setCellValue(ReportApp.enterSecondTelephone().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[51].contentEquals(ReportApp.enterThirdCode().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(52).createCell(5);
				XSSFCell cellSeven = sheet.getRow(52).createCell(7);
				cellFive.setCellValue(ReportApp.enterThirdCode().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[52].contentEquals(ReportApp.enterSecondNameAndDob().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(53).createCell(5);
				XSSFCell cellSeven = sheet.getRow(53).createCell(7);
				cellFive.setCellValue(ReportApp.enterSecondNameAndDob().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[53].contentEquals(ReportApp.enterSecondResidence().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(54).createCell(5);
				XSSFCell cellSeven = sheet.getRow(54).createCell(7);
				cellFive.setCellValue(ReportApp.enterSecondResidence().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[54].contentEquals(ReportApp.enterThirdTelephone().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(55).createCell(5);
				XSSFCell cellSeven = sheet.getRow(55).createCell(7);
				cellFive.setCellValue(ReportApp.enterThirdTelephone().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[55].contentEquals(ReportApp.enterFourthCode().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(56).createCell(5);
				XSSFCell cellSeven = sheet.getRow(56).createCell(7);
				cellFive.setCellValue(ReportApp.enterFourthCode().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[56].contentEquals(ReportApp.enterSecondOccupationAndDriverLic().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(57).createCell(5);
				XSSFCell cellSeven = sheet.getRow(57).createCell(7);
				cellFive.setCellValue(ReportApp.enterSecondOccupationAndDriverLic().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[57].contentEquals(ReportApp.enterSecondBusinessResidence().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(58).createCell(5);
				XSSFCell cellSeven = sheet.getRow(58).createCell(7);
				cellFive.setCellValue(ReportApp.enterSecondBusinessResidence().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[58].contentEquals(ReportApp.enterFourthTelephone().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(59).createCell(5);
				XSSFCell cellSeven = sheet.getRow(59).createCell(7);
				cellFive.setCellValue(ReportApp.enterFourthTelephone().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[59].contentEquals(ReportApp.enterFifthCode().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(60).createCell(5);
				XSSFCell cellSeven = sheet.getRow(60).createCell(7);
				cellFive.setCellValue(ReportApp.enterFifthCode().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[60].contentEquals(ReportApp.enterThirdNameAndDob().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(61).createCell(5);
				XSSFCell cellSeven = sheet.getRow(61).createCell(7);
				cellFive.setCellValue(ReportApp.enterThirdNameAndDob().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[61].contentEquals(ReportApp.enterThirdResidence().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(62).createCell(5);
				XSSFCell cellSeven = sheet.getRow(62).createCell(7);
				cellFive.setCellValue(ReportApp.enterThirdResidence().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[62].contentEquals(ReportApp.enterFifthTelephone().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(63).createCell(5);
				XSSFCell cellSeven = sheet.getRow(63).createCell(7);
				cellFive.setCellValue(ReportApp.enterFifthTelephone().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[63].contentEquals(ReportApp.enterSixthCode().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(64).createCell(5);
				XSSFCell cellSeven = sheet.getRow(64).createCell(7);
				cellFive.setCellValue(ReportApp.enterSixthCode().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[64].contentEquals(ReportApp.enterThirdOccupationAndDriverLic().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(65).createCell(5);
				XSSFCell cellSeven = sheet.getRow(65).createCell(7);
				cellFive.setCellValue(ReportApp.enterThirdOccupationAndDriverLic().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[65].contentEquals(ReportApp.enterThirdBusinessResidence().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(66).createCell(5);
				XSSFCell cellSeven = sheet.getRow(66).createCell(7);
				cellFive.setCellValue(ReportApp.enterThirdBusinessResidence().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[66].contentEquals(ReportApp.enterSixthTelephone().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(67).createCell(5);
				XSSFCell cellSeven = sheet.getRow(67).createCell(7);
				cellFive.setCellValue(ReportApp.enterSixthTelephone().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[67].contentEquals(ReportApp.enterSeventhCode().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(68).createCell(5);
				XSSFCell cellSeven = sheet.getRow(68).createCell(7);
				cellFive.setCellValue(ReportApp.enterSeventhCode().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[68].contentEquals(ReportApp.enterFourthNameAndDob().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(69).createCell(5);
				XSSFCell cellSeven = sheet.getRow(69).createCell(7);
				cellFive.setCellValue(ReportApp.enterFourthNameAndDob().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[69].contentEquals(ReportApp.enterFourthResidence().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(70).createCell(5);
				XSSFCell cellSeven = sheet.getRow(70).createCell(7);
				cellFive.setCellValue(ReportApp.enterFourthResidence().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[70].contentEquals(ReportApp.enterSeventhTelephone().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(71).createCell(5);
				XSSFCell cellSeven = sheet.getRow(71).createCell(7);
				cellFive.setCellValue(ReportApp.enterSeventhTelephone().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[71].contentEquals(ReportApp.enterEighthCode().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(72).createCell(5);
				XSSFCell cellSeven = sheet.getRow(72).createCell(7);
				cellFive.setCellValue(ReportApp.enterEighthCode().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[72].contentEquals(ReportApp.enterFourthOccupationDriverLic().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(73).createCell(5);
				XSSFCell cellSeven = sheet.getRow(73).createCell(7);
				cellFive.setCellValue(ReportApp.enterFourthOccupationDriverLic().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[73].contentEquals(ReportApp.enterFourthBusinessResidence().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(74).createCell(5);
				XSSFCell cellSeven = sheet.getRow(74).createCell(7);
				cellFive.setCellValue(ReportApp.enterFourthBusinessResidence().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[74].contentEquals(ReportApp.enterEighthTelephone().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(75).createCell(5);
				XSSFCell cellSeven = sheet.getRow(75).createCell(7);
				cellFive.setCellValue(ReportApp.enterEighthTelephone().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[75].contentEquals(ReportApp.enterSupervisorApproving().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(76).createCell(5);
				XSSFCell cellSeven = sheet.getRow(76).createCell(7);
				cellFive.setCellValue(ReportApp.enterSupervisorApproving().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[76].contentEquals(ReportApp.enterInvestigatingOfficer().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(77).createCell(5);
				XSSFCell cellSeven = sheet.getRow(77).createCell(7);
				cellFive.setCellValue(ReportApp.enterInvestigatingOfficer().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[77].contentEquals(ReportApp.enterPersonReporting().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(78).createCell(5);
				XSSFCell cellSeven = sheet.getRow(78).createCell(7);
				cellFive.setCellValue(ReportApp.enterPersonReporting().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			wb.write(new FileOutputStream("ReportApp/data.xlsx"));
			wb.close();
			Runtime.getRuntime().exec("cmd /c start ReportApp/data.xlsx");
	    }catch(IOException  e){  
	        e.printStackTrace();  
	    }
	}
}
