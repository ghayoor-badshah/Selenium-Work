import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//Report in the form of excel file for Command Guard Services Timesheet Report
public class OpenReport {
	public static void openExcel() throws FileNotFoundException, IOException{
		XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream("src/data.xlsx"));
		XSSFSheet sheet = wb.getSheet("myReport");
		try{
			if(Data.myList[0].contentEquals(TimeSheet.enterWorkSite().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(1).createCell(5);
				XSSFCell cellSeven = sheet.getRow(1).createCell(7);
				cellFive.setCellValue(TimeSheet.enterWorkSite().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[1].contentEquals(TimeSheet.enterFirstSatDate().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(2).createCell(5);
				XSSFCell cellSeven = sheet.getRow(2).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstSatDate().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[2].contentEquals(TimeSheet.enterFirstSatTimeOnDuty().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(3).createCell(5);
				XSSFCell cellSeven = sheet.getRow(3).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstSatTimeOnDuty().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[3].contentEquals(TimeSheet.enterFirstSatEmployeeName().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(4).createCell(5);
				XSSFCell cellSeven = sheet.getRow(4).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstSatEmployeeName().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[4].contentEquals(TimeSheet.enterFirstSatBreakStart().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(5).createCell(5);
				XSSFCell cellSeven = sheet.getRow(5).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstSatBreakStart().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[5].contentEquals(TimeSheet.enterFirstSatBreakEnd().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(6).createCell(5);
				XSSFCell cellSeven = sheet.getRow(6).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstSatBreakEnd().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[6].contentEquals(TimeSheet.enterFirstSatTimeOff().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(7).createCell(5);
				XSSFCell cellSeven = sheet.getRow(7).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstSatTimeOff().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[7].contentEquals(TimeSheet.enterFirstSatTotalHour().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(8).createCell(5);
				XSSFCell cellSeven = sheet.getRow(8).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstSatTotalHour().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[8].contentEquals(TimeSheet.enterFirstSatEmployeeSignature().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(9).createCell(5);
				XSSFCell cellSeven = sheet.getRow(9).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstSatEmployeeSignature().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[9].contentEquals(TimeSheet.enterFirstSatClientSignature().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(10).createCell(5);
				XSSFCell cellSeven = sheet.getRow(10).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstSatClientSignature().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[10].contentEquals(TimeSheet.enterSecondSatDate().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(11).createCell(5);
				XSSFCell cellSeven = sheet.getRow(11).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondSatDate().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[11].contentEquals(TimeSheet.enterSecondSatTimeOnDuty().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(12).createCell(5);
				XSSFCell cellSeven = sheet.getRow(12).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondSatTimeOnDuty().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[12].contentEquals(TimeSheet.enterSecondSatEmployeeName().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(13).createCell(5);
				XSSFCell cellSeven = sheet.getRow(13).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondSatEmployeeName().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[13].contentEquals(TimeSheet.enterSecondSatBreakStart().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(14).createCell(5);
				XSSFCell cellSeven = sheet.getRow(14).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondSatBreakStart().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[14].contentEquals(TimeSheet.enterSecondSatBreakEnd().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(15).createCell(5);
				XSSFCell cellSeven = sheet.getRow(15).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondSatBreakEnd().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[15].contentEquals(TimeSheet.enterSecondSatTimeOff().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(16).createCell(5);
				XSSFCell cellSeven = sheet.getRow(16).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondSatTimeOff().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[16].contentEquals(TimeSheet.enterSecondSatTotalHour().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(17).createCell(5);
				XSSFCell cellSeven = sheet.getRow(17).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondSatTotalHour().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[17].contentEquals(TimeSheet.enterSecondSatEmployeeSignature().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(18).createCell(5);
				XSSFCell cellSeven = sheet.getRow(18).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondSatEmployeeSignature().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[18].contentEquals(TimeSheet.enterSecondSatClientSignature().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(19).createCell(5);
				XSSFCell cellSeven = sheet.getRow(19).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondSatClientSignature().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[19].contentEquals(TimeSheet.enterFirstSunDate().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(20).createCell(5);
				XSSFCell cellSeven = sheet.getRow(20).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstSunDate().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[20].contentEquals(TimeSheet.enterFirstSunTimeOnDuty().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(21).createCell(5);
				XSSFCell cellSeven = sheet.getRow(21).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstSunTimeOnDuty().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[21].contentEquals(TimeSheet.enterFirstSunEmployeeName().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(22).createCell(5);
				XSSFCell cellSeven = sheet.getRow(22).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstSunEmployeeName().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[22].contentEquals(TimeSheet.enterFirstSunBreakStart().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(23).createCell(5);
				XSSFCell cellSeven = sheet.getRow(23).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstSunBreakStart().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[23].contentEquals(TimeSheet.enterFirstSunBreakEnd().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(24).createCell(5);
				XSSFCell cellSeven = sheet.getRow(24).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstSunBreakEnd().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[24].contentEquals(TimeSheet.enterFirstSunTimeOff().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(25).createCell(5);
				XSSFCell cellSeven = sheet.getRow(25).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstSunTimeOff().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[25].contentEquals(TimeSheet.enterFirstSunTotalHour().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(26).createCell(5);
				XSSFCell cellSeven = sheet.getRow(26).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstSunTotalHour().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[26].contentEquals(TimeSheet.enterFirstSunEmployeeSignature().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(27).createCell(5);
				XSSFCell cellSeven = sheet.getRow(27).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstSunEmployeeSignature().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[27].contentEquals(TimeSheet.enterFirstSunClientSignature().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(28).createCell(5);
				XSSFCell cellSeven = sheet.getRow(28).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstSunClientSignature().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[28].contentEquals(TimeSheet.enterSecondSunDate().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(29).createCell(5);
				XSSFCell cellSeven = sheet.getRow(29).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondSunDate().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[29].contentEquals(TimeSheet.enterSecondSunTimeOnDuty().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(30).createCell(5);
				XSSFCell cellSeven = sheet.getRow(30).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondSunTimeOnDuty().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[30].contentEquals(TimeSheet.enterSecondSunEmployeeName().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(31).createCell(5);
				XSSFCell cellSeven = sheet.getRow(31).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondSunEmployeeName().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[31].contentEquals(TimeSheet.enterSecondSunBreakStart().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(32).createCell(5);
				XSSFCell cellSeven = sheet.getRow(32).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondSunBreakStart().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[32].contentEquals(TimeSheet.enterSecondSunBreakEnd().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(33).createCell(5);
				XSSFCell cellSeven = sheet.getRow(33).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondSunBreakEnd().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[33].contentEquals(TimeSheet.enterSecondSunTimeOff().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(34).createCell(5);
				XSSFCell cellSeven = sheet.getRow(34).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondSunTimeOff().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[34].contentEquals(TimeSheet.enterSecondSunTotalHour().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(35).createCell(5);
				XSSFCell cellSeven = sheet.getRow(35).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondSunTotalHour().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[35].contentEquals(TimeSheet.enterSecondSunEmployeeSignature().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(36).createCell(5);
				XSSFCell cellSeven = sheet.getRow(36).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondSunEmployeeSignature().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[36].contentEquals(TimeSheet.enterSecondSunClientSignature().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(37).createCell(5);
				XSSFCell cellSeven = sheet.getRow(37).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondSunClientSignature().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[37].contentEquals(TimeSheet.enterFirstMonDate().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(38).createCell(5);
				XSSFCell cellSeven = sheet.getRow(38).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstMonDate().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[38].contentEquals(TimeSheet.enterFirstMonTimeOnDuty().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(39).createCell(5);
				XSSFCell cellSeven = sheet.getRow(39).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstMonTimeOnDuty().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[39].contentEquals(TimeSheet.enterFirstMonEmployeeName().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(40).createCell(5);
				XSSFCell cellSeven = sheet.getRow(40).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstMonEmployeeName().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[40].contentEquals(TimeSheet.enterFirstMonBreakStart().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(41).createCell(5);
				XSSFCell cellSeven = sheet.getRow(41).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstMonBreakStart().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[41].contentEquals(TimeSheet.enterFirstMonBreakEnd().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(42).createCell(5);
				XSSFCell cellSeven = sheet.getRow(42).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstMonBreakEnd().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[42].contentEquals(TimeSheet.enterFirstMonTimeOff().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(43).createCell(5);
				XSSFCell cellSeven = sheet.getRow(43).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstMonTimeOff().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[43].contentEquals(TimeSheet.enterFirstMonTotalHour().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(44).createCell(5);
				XSSFCell cellSeven = sheet.getRow(44).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstMonTotalHour().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[44].contentEquals(TimeSheet.enterFirstMonEmployeeSignature().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(45).createCell(5);
				XSSFCell cellSeven = sheet.getRow(45).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstMonEmployeeSignature().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[45].contentEquals(TimeSheet.enterFirstMonClientSignature().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(46).createCell(5);
				XSSFCell cellSeven = sheet.getRow(46).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstMonClientSignature().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[46].contentEquals(TimeSheet.enterSecondMonDate().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(47).createCell(5);
				XSSFCell cellSeven = sheet.getRow(47).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondMonDate().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[47].contentEquals(TimeSheet.enterSecondMonTimeOnDuty().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(48).createCell(5);
				XSSFCell cellSeven = sheet.getRow(48).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondMonTimeOnDuty().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[48].contentEquals(TimeSheet.enterSecondMonEmployeeName().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(49).createCell(5);
				XSSFCell cellSeven = sheet.getRow(49).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondMonEmployeeName().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[49].contentEquals(TimeSheet.enterSecondMonBreakStart().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(50).createCell(5);
				XSSFCell cellSeven = sheet.getRow(50).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondMonBreakStart().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[50].contentEquals(TimeSheet.enterSecondMonBreakEnd().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(51).createCell(5);
				XSSFCell cellSeven = sheet.getRow(51).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondMonBreakEnd().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[51].contentEquals(TimeSheet.enterSecondMonTimeOff().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(52).createCell(5);
				XSSFCell cellSeven = sheet.getRow(52).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondMonTimeOff().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[52].contentEquals(TimeSheet.enterSecondMonTotalHour().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(53).createCell(5);
				XSSFCell cellSeven = sheet.getRow(53).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondMonTotalHour().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[53].contentEquals(TimeSheet.enterSecondMonEmployeeSignature().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(54).createCell(5);
				XSSFCell cellSeven = sheet.getRow(54).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondMonEmployeeSignature().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[54].contentEquals(TimeSheet.enterSecondMonClientSignature().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(55).createCell(5);
				XSSFCell cellSeven = sheet.getRow(55).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondMonClientSignature().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[55].contentEquals(TimeSheet.enterFirstTueDate().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(56).createCell(5);
				XSSFCell cellSeven = sheet.getRow(56).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstTueDate().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[56].contentEquals(TimeSheet.enterFirstTueTimeOnDuty().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(57).createCell(5);
				XSSFCell cellSeven = sheet.getRow(57).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstTueTimeOnDuty().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[57].contentEquals(TimeSheet.enterFirstTueEmployeeName().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(58).createCell(5);
				XSSFCell cellSeven = sheet.getRow(58).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstTueEmployeeName().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[58].contentEquals(TimeSheet.enterFirstTueBreakStart().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(59).createCell(5);
				XSSFCell cellSeven = sheet.getRow(59).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstTueBreakStart().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[59].contentEquals(TimeSheet.enterFirstTueBreakEnd().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(60).createCell(5);
				XSSFCell cellSeven = sheet.getRow(60).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstTueBreakEnd().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[60].contentEquals(TimeSheet.enterFirstTueTimeOff().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(61).createCell(5);
				XSSFCell cellSeven = sheet.getRow(61).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstTueTimeOff().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[61].contentEquals(TimeSheet.enterFirstTueTotalHour().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(62).createCell(5);
				XSSFCell cellSeven = sheet.getRow(62).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstTueTotalHour().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[62].contentEquals(TimeSheet.enterFirstTueEmployeeSignature().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(63).createCell(5);
				XSSFCell cellSeven = sheet.getRow(63).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstTueEmployeeSignature().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[63].contentEquals(TimeSheet.enterFirstTueClientSignature().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(64).createCell(5);
				XSSFCell cellSeven = sheet.getRow(64).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstTueClientSignature().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[64].contentEquals(TimeSheet.enterSecondTueDate().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(65).createCell(5);
				XSSFCell cellSeven = sheet.getRow(65).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondTueDate().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[65].contentEquals(TimeSheet.enterSecondTueTimeOnDuty().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(66).createCell(5);
				XSSFCell cellSeven = sheet.getRow(66).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondTueTimeOnDuty().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[66].contentEquals(TimeSheet.enterSecondTueEmployeeName().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(67).createCell(5);
				XSSFCell cellSeven = sheet.getRow(67).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondTueEmployeeName().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[67].contentEquals(TimeSheet.enterSecondTueBreakStart().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(68).createCell(5);
				XSSFCell cellSeven = sheet.getRow(68).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondTueBreakStart().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[68].contentEquals(TimeSheet.enterSecondTueBreakEnd().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(69).createCell(5);
				XSSFCell cellSeven = sheet.getRow(69).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondTueBreakEnd().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[69].contentEquals(TimeSheet.enterSecondTueTimeOff().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(70).createCell(5);
				XSSFCell cellSeven = sheet.getRow(70).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondTueTimeOff().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[70].contentEquals(TimeSheet.enterSecondTueTotalHour().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(71).createCell(5);
				XSSFCell cellSeven = sheet.getRow(71).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondTueTotalHour().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[71].contentEquals(TimeSheet.enterSecondTueEmployeeSignature().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(72).createCell(5);
				XSSFCell cellSeven = sheet.getRow(72).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondTueEmployeeSignature().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[72].contentEquals(TimeSheet.enterSecondTueClientSignature().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(73).createCell(5);
				XSSFCell cellSeven = sheet.getRow(73).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondTueClientSignature().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[73].contentEquals(TimeSheet.enterFirstWedDate().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(74).createCell(5);
				XSSFCell cellSeven = sheet.getRow(74).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstWedDate().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[74].contentEquals(TimeSheet.enterFirstWedTimeOnDuty().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(75).createCell(5);
				XSSFCell cellSeven = sheet.getRow(75).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstWedTimeOnDuty().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[75].contentEquals(TimeSheet.enterFirstWedEmployeeName().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(76).createCell(5);
				XSSFCell cellSeven = sheet.getRow(76).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstWedEmployeeName().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[76].contentEquals(TimeSheet.enterFirstWedBreakStart().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(77).createCell(5);
				XSSFCell cellSeven = sheet.getRow(77).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstWedBreakStart().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[77].contentEquals(TimeSheet.enterFirstWedBreakEnd().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(78).createCell(5);
				XSSFCell cellSeven = sheet.getRow(78).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstWedBreakEnd().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[78].contentEquals(TimeSheet.enterFirstWedTimeOff().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(79).createCell(5);
				XSSFCell cellSeven = sheet.getRow(79).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstWedTimeOff().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[79].contentEquals(TimeSheet.enterFirstWedTotalHour().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(80).createCell(5);
				XSSFCell cellSeven = sheet.getRow(80).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstWedTotalHour().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[80].contentEquals(TimeSheet.enterFirstWedEmployeeSignature().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(81).createCell(5);
				XSSFCell cellSeven = sheet.getRow(81).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstWedEmployeeSignature().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[81].contentEquals(TimeSheet.enterFirstWedClientSignature().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(82).createCell(5);
				XSSFCell cellSeven = sheet.getRow(82).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstWedClientSignature().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[82].contentEquals(TimeSheet.enterSecondWedDate().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(83).createCell(5);
				XSSFCell cellSeven = sheet.getRow(83).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondWedDate().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[83].contentEquals(TimeSheet.enterSecondWedTimeOnDuty().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(84).createCell(5);
				XSSFCell cellSeven = sheet.getRow(84).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondWedTimeOnDuty().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[84].contentEquals(TimeSheet.enterSecondWedEmployeeName().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(85).createCell(5);
				XSSFCell cellSeven = sheet.getRow(85).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondWedEmployeeName().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[85].contentEquals(TimeSheet.enterSecondWedBreakStart().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(86).createCell(5);
				XSSFCell cellSeven = sheet.getRow(86).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondWedBreakStart().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[86].contentEquals(TimeSheet.enterSecondWedBreakEnd().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(87).createCell(5);
				XSSFCell cellSeven = sheet.getRow(87).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondWedBreakEnd().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[87].contentEquals(TimeSheet.enterSecondWedTimeOff().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(88).createCell(5);
				XSSFCell cellSeven = sheet.getRow(88).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondWedTimeOff().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[88].contentEquals(TimeSheet.enterSecondWedTotalHour().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(89).createCell(5);
				XSSFCell cellSeven = sheet.getRow(89).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondWedTotalHour().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[89].contentEquals(TimeSheet.enterSecondWedEmployeeSignature().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(90).createCell(5);
				XSSFCell cellSeven = sheet.getRow(90).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondWedEmployeeSignature().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[90].contentEquals(TimeSheet.enterSecondWedClientSignature().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(91).createCell(5);
				XSSFCell cellSeven = sheet.getRow(91).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondWedClientSignature().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[91].contentEquals(TimeSheet.enterFirstThurDate().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(92).createCell(5);
				XSSFCell cellSeven = sheet.getRow(92).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstThurDate().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[92].contentEquals(TimeSheet.enterFirstThurTimeOnDuty().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(93).createCell(5);
				XSSFCell cellSeven = sheet.getRow(93).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstThurTimeOnDuty().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[93].contentEquals(TimeSheet.enterFirstThurEmployeeName().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(94).createCell(5);
				XSSFCell cellSeven = sheet.getRow(94).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstThurEmployeeName().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[94].contentEquals(TimeSheet.enterFirstThurBreakStart().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(95).createCell(5);
				XSSFCell cellSeven = sheet.getRow(95).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstThurBreakStart().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[95].contentEquals(TimeSheet.enterFirstThurBreakEnd().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(96).createCell(5);
				XSSFCell cellSeven = sheet.getRow(96).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstThurBreakEnd().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[96].contentEquals(TimeSheet.enterFirstThurTimeOff().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(97).createCell(5);
				XSSFCell cellSeven = sheet.getRow(97).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstThurTimeOff().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[97].contentEquals(TimeSheet.enterFirstThurTotalHour().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(98).createCell(5);
				XSSFCell cellSeven = sheet.getRow(98).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstThurTotalHour().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[98].contentEquals(TimeSheet.enterFirstThurEmployeeSignature().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(99).createCell(5);
				XSSFCell cellSeven = sheet.getRow(99).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstThurEmployeeSignature().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[99].contentEquals(TimeSheet.enterFirstThurClientSignature().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(100).createCell(5);
				XSSFCell cellSeven = sheet.getRow(100).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstThurClientSignature().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[100].contentEquals(TimeSheet.enterSecondThurDate().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(101).createCell(5);
				XSSFCell cellSeven = sheet.getRow(101).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondThurDate().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[101].contentEquals(TimeSheet.enterSecondThurTimeOnDuty().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(102).createCell(5);
				XSSFCell cellSeven = sheet.getRow(102).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondThurTimeOnDuty().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[102].contentEquals(TimeSheet.enterSecondThurEmployeeName().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(103).createCell(5);
				XSSFCell cellSeven = sheet.getRow(103).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondThurEmployeeName().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[103].contentEquals(TimeSheet.enterSecondThurBreakStart().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(104).createCell(5);
				XSSFCell cellSeven = sheet.getRow(104).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondThurBreakStart().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[104].contentEquals(TimeSheet.enterSecondThurBreakEnd().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(105).createCell(5);
				XSSFCell cellSeven = sheet.getRow(105).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondThurBreakEnd().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[105].contentEquals(TimeSheet.enterSecondThurTimeOff().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(106).createCell(5);
				XSSFCell cellSeven = sheet.getRow(106).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondThurTimeOff().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[106].contentEquals(TimeSheet.enterSecondThurTotalHour().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(107).createCell(5);
				XSSFCell cellSeven = sheet.getRow(107).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondThurTotalHour().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[107].contentEquals(TimeSheet.enterSecondThurEmployeeSignature().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(108).createCell(5);
				XSSFCell cellSeven = sheet.getRow(108).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondThurEmployeeSignature().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[108].contentEquals(TimeSheet.enterSecondThurClientSignature().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(109).createCell(5);
				XSSFCell cellSeven = sheet.getRow(109).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondThurClientSignature().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[109].contentEquals(TimeSheet.enterFirstFriDate().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(110).createCell(5);
				XSSFCell cellSeven = sheet.getRow(110).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstFriDate().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[110].contentEquals(TimeSheet.enterFirstFriTimeOnDuty().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(111).createCell(5);
				XSSFCell cellSeven = sheet.getRow(111).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstFriTimeOnDuty().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[111].contentEquals(TimeSheet.enterFirstFriEmployeeName().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(112).createCell(5);
				XSSFCell cellSeven = sheet.getRow(112).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstFriEmployeeName().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[112].contentEquals(TimeSheet.enterFirstFriBreakStart().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(113).createCell(5);
				XSSFCell cellSeven = sheet.getRow(113).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstFriBreakStart().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[113].contentEquals(TimeSheet.enterFirstFriBreakEnd().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(114).createCell(5);
				XSSFCell cellSeven = sheet.getRow(114).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstFriBreakEnd().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[114].contentEquals(TimeSheet.enterFirstFriTimeOff().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(115).createCell(5);
				XSSFCell cellSeven = sheet.getRow(115).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstFriTimeOff().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[115].contentEquals(TimeSheet.enterFirstFriTotalHour().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(116).createCell(5);
				XSSFCell cellSeven = sheet.getRow(116).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstFriTotalHour().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[116].contentEquals(TimeSheet.enterFirstFriEmployeeSignature().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(117).createCell(5);
				XSSFCell cellSeven = sheet.getRow(117).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstFriEmployeeSignature().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[117].contentEquals(TimeSheet.enterFirstFriClientSignature().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(118).createCell(5);
				XSSFCell cellSeven = sheet.getRow(118).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstFriClientSignature().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[118].contentEquals(TimeSheet.enterSecondFriDate().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(119).createCell(5);
				XSSFCell cellSeven = sheet.getRow(119).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondFriDate().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[119].contentEquals(TimeSheet.enterSecondFriTimeOnDuty().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(120).createCell(5);
				XSSFCell cellSeven = sheet.getRow(120).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondFriTimeOnDuty().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[120].contentEquals(TimeSheet.enterSecondFriEmployeeName().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(121).createCell(5);
				XSSFCell cellSeven = sheet.getRow(121).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondFriEmployeeName().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[121].contentEquals(TimeSheet.enterSecondFriBreakStart().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(122).createCell(5);
				XSSFCell cellSeven = sheet.getRow(122).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondFriBreakStart().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[122].contentEquals(TimeSheet.enterSecondFriBreakEnd().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(123).createCell(5);
				XSSFCell cellSeven = sheet.getRow(123).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondFriBreakEnd().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[123].contentEquals(TimeSheet.enterSecondFriTimeOff().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(124).createCell(5);
				XSSFCell cellSeven = sheet.getRow(124).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondFriTimeOff().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[124].contentEquals(TimeSheet.enterSecondFriTotalHour().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(125).createCell(5);
				XSSFCell cellSeven = sheet.getRow(125).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondFriTotalHour().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[125].contentEquals(TimeSheet.enterSecondFriEmployeeSignature().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(126).createCell(5);
				XSSFCell cellSeven = sheet.getRow(126).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondFriEmployeeSignature().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[126].contentEquals(TimeSheet.enterSecondFriClientSignature().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(127).createCell(5);
				XSSFCell cellSeven = sheet.getRow(127).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondFriClientSignature().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[127].contentEquals(TimeSheet.enterFirstEmployeeInitial().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(128).createCell(5);
				XSSFCell cellSeven = sheet.getRow(128).createCell(7);
				cellFive.setCellValue(TimeSheet.enterFirstEmployeeInitial().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[128].contentEquals(TimeSheet.enterSecondEmployeeInitial().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(129).createCell(5);
				XSSFCell cellSeven = sheet.getRow(129).createCell(7);
				cellFive.setCellValue(TimeSheet.enterSecondEmployeeInitial().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[129].contentEquals(TimeSheet.enterEmployeeSig().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(130).createCell(5);
				XSSFCell cellSeven = sheet.getRow(130).createCell(7);
				cellFive.setCellValue(TimeSheet.enterEmployeeSig().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			if(Data.myList[130].contentEquals(TimeSheet.verifyTotalHours().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(131).createCell(5);
				XSSFCell cellSeven = sheet.getRow(131).createCell(7);
				cellFive.setCellValue(TimeSheet.verifyTotalHours().getAttribute("value"));
				cellSeven.setCellValue("Passed");
			}
			wb.write(new FileOutputStream("src/data.xlsx"));
			wb.close();
			Runtime.getRuntime().exec("cmd /c start src/data.xlsx");
	    }catch(IOException  e){  
	        e.printStackTrace();  
	    }
	}
}
