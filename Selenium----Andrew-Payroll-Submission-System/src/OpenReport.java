import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//Report in the form of excel file for Andrew's Payroll System
public class OpenReport {
	public static void openExcel() throws FileNotFoundException, IOException{
		XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream("src/data.xlsx"));
		XSSFSheet sheet = wb.getSheet("myReport");
		CellStyle style = wb.createCellStyle();
        XSSFFont font = wb.createFont();
        font.setColor(HSSFColor.GREEN.index);
        font.setBold(true);
        style.setFont(font);
		try{
			if(Data.myList[0].contentEquals(AndrewPayRoll.enterFromName().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(1).createCell(5);
				XSSFCell cellSeven = sheet.getRow(1).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFromName().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[1].contentEquals(AndrewPayRoll.enterTodayDate().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(2).createCell(5);
				XSSFCell cellSeven = sheet.getRow(2).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterTodayDate().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[2].contentEquals(AndrewPayRoll.enterOfficerContactNo().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(3).createCell(5);
				XSSFCell cellSeven = sheet.getRow(3).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterOfficerContactNo().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[3].contentEquals(AndrewPayRoll.enterOfficerName().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(4).createCell(5);
				XSSFCell cellSeven = sheet.getRow(4).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterOfficerName().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[4].contentEquals(AndrewPayRoll.enterOfficerSSN().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(5).createCell(5);
				XSSFCell cellSeven = sheet.getRow(5).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterOfficerSSN().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[5].contentEquals(AndrewPayRoll.enterWeekDate().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(6).createCell(5);
				XSSFCell cellSeven = sheet.getRow(6).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterWeekDate().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[6].contentEquals(AndrewPayRoll.enterFirstFridayDate().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(7).createCell(5);
				XSSFCell cellSeven = sheet.getRow(7).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFirstFridayDate().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[7].contentEquals(AndrewPayRoll.enterFirstFridayLocation().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(8).createCell(5);
				XSSFCell cellSeven = sheet.getRow(8).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFirstFridayLocation().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[8].contentEquals(AndrewPayRoll.enterFirstFridayTimeIn().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(9).createCell(5);
				XSSFCell cellSeven = sheet.getRow(9).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFirstFridayTimeIn().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[9].contentEquals(AndrewPayRoll.enterFirstFridayMealStart().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(10).createCell(5);
				XSSFCell cellSeven = sheet.getRow(10).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFirstFridayMealStart().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[10].contentEquals(AndrewPayRoll.enterFirstFridayMealEnd().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(11).createCell(5);
				XSSFCell cellSeven = sheet.getRow(11).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFirstFridayMealEnd().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[11].contentEquals(AndrewPayRoll.enterFirstFridayTimeOut().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(12).createCell(5);
				XSSFCell cellSeven = sheet.getRow(12).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFirstFridayTimeOut().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[12].contentEquals(AndrewPayRoll.verifyFirstFridayTotal().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(13).createCell(5);
				XSSFCell cellSeven = sheet.getRow(13).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.verifyFirstFridayTotal().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[13].contentEquals(AndrewPayRoll.enterSecondFridayLocation().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(14).createCell(5);
				XSSFCell cellSeven = sheet.getRow(14).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterSecondFridayLocation().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[14].contentEquals(AndrewPayRoll.enterSecondFridayTimeIn().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(15).createCell(5);
				XSSFCell cellSeven = sheet.getRow(15).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterSecondFridayTimeIn().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[15].contentEquals(AndrewPayRoll.enterSecondFridayMealStart().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(16).createCell(5);
				XSSFCell cellSeven = sheet.getRow(16).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterSecondFridayMealStart().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[16].contentEquals(AndrewPayRoll.enterSecondFridayMealEnd().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(17).createCell(5);
				XSSFCell cellSeven = sheet.getRow(17).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterSecondFridayMealEnd().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[17].contentEquals(AndrewPayRoll.enterSecondFridayTimeOut().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(18).createCell(5);
				XSSFCell cellSeven = sheet.getRow(18).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterSecondFridayTimeOut().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[18].contentEquals(AndrewPayRoll.verifySecondFridayTotal().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(19).createCell(5);
				XSSFCell cellSeven = sheet.getRow(19).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.verifySecondFridayTotal().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[19].contentEquals(AndrewPayRoll.enterFirstSaturdayDate().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(20).createCell(5);
				XSSFCell cellSeven = sheet.getRow(20).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFirstSaturdayDate().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[20].contentEquals(AndrewPayRoll.enterFirstSaturdayLocation().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(21).createCell(5);
				XSSFCell cellSeven = sheet.getRow(21).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFirstSaturdayLocation().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[21].contentEquals(AndrewPayRoll.enterFirstSaturdayTimeIn().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(22).createCell(5);
				XSSFCell cellSeven = sheet.getRow(22).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFirstSaturdayTimeIn().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[22].contentEquals(AndrewPayRoll.enterFirstSaturdayMealStart().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(23).createCell(5);
				XSSFCell cellSeven = sheet.getRow(23).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFirstSaturdayMealStart().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[23].contentEquals(AndrewPayRoll.enterFirstSaturdayMealEnd().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(24).createCell(5);
				XSSFCell cellSeven = sheet.getRow(24).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFirstSaturdayMealEnd().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[24].contentEquals(AndrewPayRoll.enterFirstSaturdayTimeOut().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(25).createCell(5);
				XSSFCell cellSeven = sheet.getRow(25).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFirstSaturdayTimeOut().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[25].contentEquals(AndrewPayRoll.verifyFirstSaturdayTotal().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(26).createCell(5);
				XSSFCell cellSeven = sheet.getRow(26).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.verifyFirstSaturdayTotal().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[26].contentEquals(AndrewPayRoll.enterSecondSaturdayLocation().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(27).createCell(5);
				XSSFCell cellSeven = sheet.getRow(27).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterSecondSaturdayLocation().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[27].contentEquals(AndrewPayRoll.enterSecondSaturdayTimeIn().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(28).createCell(5);
				XSSFCell cellSeven = sheet.getRow(28).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterSecondSaturdayTimeIn().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[28].contentEquals(AndrewPayRoll.enterSecondSaturdayMealStart().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(29).createCell(5);
				XSSFCell cellSeven = sheet.getRow(29).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterSecondSaturdayMealStart().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[29].contentEquals(AndrewPayRoll.enterSecondSaturdayMealEnd().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(30).createCell(5);
				XSSFCell cellSeven = sheet.getRow(30).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterSecondSaturdayMealEnd().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[30].contentEquals(AndrewPayRoll.enterSecondSaturdayTimeOut().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(31).createCell(5);
				XSSFCell cellSeven = sheet.getRow(31).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterSecondSaturdayTimeOut().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[31].contentEquals(AndrewPayRoll.verifySecondSaturdayTotal().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(32).createCell(5);
				XSSFCell cellSeven = sheet.getRow(32).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.verifySecondSaturdayTotal().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[32].contentEquals(AndrewPayRoll.enterFirstSundayDate().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(33).createCell(5);
				XSSFCell cellSeven = sheet.getRow(33).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFirstSundayDate().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[33].contentEquals(AndrewPayRoll.enterFirstSundayLocation().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(34).createCell(5);
				XSSFCell cellSeven = sheet.getRow(34).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFirstSundayLocation().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[34].contentEquals(AndrewPayRoll.enterFirstSundayTimeIn().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(35).createCell(5);
				XSSFCell cellSeven = sheet.getRow(35).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFirstSundayTimeIn().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[35].contentEquals(AndrewPayRoll.enterFirstSundayMealStart().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(36).createCell(5);
				XSSFCell cellSeven = sheet.getRow(36).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFirstSundayMealStart().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[36].contentEquals(AndrewPayRoll.enterFirstSundayMealEnd().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(37).createCell(5);
				XSSFCell cellSeven = sheet.getRow(37).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFirstSundayMealEnd().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[37].contentEquals(AndrewPayRoll.enterFirstSundayTimeOut().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(38).createCell(5);
				XSSFCell cellSeven = sheet.getRow(38).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFirstSundayTimeOut().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[38].contentEquals(AndrewPayRoll.verifyFirstSundayTotal().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(39).createCell(5);
				XSSFCell cellSeven = sheet.getRow(39).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.verifyFirstSundayTotal().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[39].contentEquals(AndrewPayRoll.enterSecondSundayLocation().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(40).createCell(5);
				XSSFCell cellSeven = sheet.getRow(40).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterSecondSundayLocation().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[40].contentEquals(AndrewPayRoll.enterSecondSundayTimeIn().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(41).createCell(5);
				XSSFCell cellSeven = sheet.getRow(41).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterSecondSundayTimeIn().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[41].contentEquals(AndrewPayRoll.enterSecondSundayMealStart().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(42).createCell(5);
				XSSFCell cellSeven = sheet.getRow(42).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterSecondSundayMealStart().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[42].contentEquals(AndrewPayRoll.enterSecondSundayMealEnd().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(43).createCell(5);
				XSSFCell cellSeven = sheet.getRow(43).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterSecondSundayMealEnd().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[43].contentEquals(AndrewPayRoll.enterSecondSundayTimeOut().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(44).createCell(5);
				XSSFCell cellSeven = sheet.getRow(44).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterSecondSundayTimeOut().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[44].contentEquals(AndrewPayRoll.verifySecondSundayTotal().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(45).createCell(5);
				XSSFCell cellSeven = sheet.getRow(45).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.verifySecondSundayTotal().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[45].contentEquals(AndrewPayRoll.enterFirstMondayDate().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(46).createCell(5);
				XSSFCell cellSeven = sheet.getRow(46).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFirstMondayDate().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[46].contentEquals(AndrewPayRoll.enterFirstMondayLocation().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(47).createCell(5);
				XSSFCell cellSeven = sheet.getRow(47).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFirstMondayLocation().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[47].contentEquals(AndrewPayRoll.enterFirstMondayTimeIn().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(48).createCell(5);
				XSSFCell cellSeven = sheet.getRow(48).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFirstMondayTimeIn().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[48].contentEquals(AndrewPayRoll.enterFirstMondayMealStart().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(49).createCell(5);
				XSSFCell cellSeven = sheet.getRow(49).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFirstMondayMealStart().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[49].contentEquals(AndrewPayRoll.enterFirstMondayMealEnd().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(50).createCell(5);
				XSSFCell cellSeven = sheet.getRow(50).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFirstMondayMealEnd().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[50].contentEquals(AndrewPayRoll.enterFirstMondayTimeOut().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(51).createCell(5);
				XSSFCell cellSeven = sheet.getRow(51).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFirstMondayTimeOut().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[51].contentEquals(AndrewPayRoll.verifyFirstMondayTotal().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(52).createCell(5);
				XSSFCell cellSeven = sheet.getRow(52).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.verifyFirstMondayTotal().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[52].contentEquals(AndrewPayRoll.enterSecondMondayLocation().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(53).createCell(5);
				XSSFCell cellSeven = sheet.getRow(53).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterSecondMondayLocation().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[53].contentEquals(AndrewPayRoll.enterSecondMondayTimeIn().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(54).createCell(5);
				XSSFCell cellSeven = sheet.getRow(54).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterSecondMondayTimeIn().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[54].contentEquals(AndrewPayRoll.enterSecondMondayMealStart().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(55).createCell(5);
				XSSFCell cellSeven = sheet.getRow(55).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterSecondMondayMealStart().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[55].contentEquals(AndrewPayRoll.enterSecondMondayMealEnd().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(56).createCell(5);
				XSSFCell cellSeven = sheet.getRow(56).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterSecondMondayMealEnd().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[56].contentEquals(AndrewPayRoll.enterSecondMondayTimeOut().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(57).createCell(5);
				XSSFCell cellSeven = sheet.getRow(57).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterSecondMondayTimeOut().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[57].contentEquals(AndrewPayRoll.verifySecondMondayTotal().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(58).createCell(5);
				XSSFCell cellSeven = sheet.getRow(58).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.verifySecondMondayTotal().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[58].contentEquals(AndrewPayRoll.enterFirstTuesdayDate().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(59).createCell(5);
				XSSFCell cellSeven = sheet.getRow(59).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFirstTuesdayDate().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[59].contentEquals(AndrewPayRoll.enterFirstTuesdayLocation().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(60).createCell(5);
				XSSFCell cellSeven = sheet.getRow(60).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFirstTuesdayLocation().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[60].contentEquals(AndrewPayRoll.enterFirstTuesdayTimeIn().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(61).createCell(5);
				XSSFCell cellSeven = sheet.getRow(61).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFirstTuesdayTimeIn().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[61].contentEquals(AndrewPayRoll.enterFirstTuesdayMealStart().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(62).createCell(5);
				XSSFCell cellSeven = sheet.getRow(62).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFirstTuesdayMealStart().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[62].contentEquals(AndrewPayRoll.enterFirstTuesdayMealEnd().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(63).createCell(5);
				XSSFCell cellSeven = sheet.getRow(63).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFirstTuesdayMealEnd().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[63].contentEquals(AndrewPayRoll.enterFirstTuesdayTimeOut().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(64).createCell(5);
				XSSFCell cellSeven = sheet.getRow(64).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFirstTuesdayTimeOut().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[64].contentEquals(AndrewPayRoll.verifyFirstTuesdayTotal().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(65).createCell(5);
				XSSFCell cellSeven = sheet.getRow(65).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.verifyFirstTuesdayTotal().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[65].contentEquals(AndrewPayRoll.enterSecondTuesdayLocation().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(66).createCell(5);
				XSSFCell cellSeven = sheet.getRow(66).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterSecondTuesdayLocation().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[66].contentEquals(AndrewPayRoll.enterSecondTuesdayTimeIn().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(67).createCell(5);
				XSSFCell cellSeven = sheet.getRow(67).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterSecondTuesdayTimeIn().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[67].contentEquals(AndrewPayRoll.enterSecondTuesdayMealStart().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(68).createCell(5);
				XSSFCell cellSeven = sheet.getRow(68).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterSecondTuesdayMealStart().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[68].contentEquals(AndrewPayRoll.enterSecondTuesdayMealEnd().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(69).createCell(5);
				XSSFCell cellSeven = sheet.getRow(69).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterSecondTuesdayMealEnd().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[69].contentEquals(AndrewPayRoll.enterSecondTuesdayTimeOut().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(70).createCell(5);
				XSSFCell cellSeven = sheet.getRow(70).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterSecondTuesdayTimeOut().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[70].contentEquals(AndrewPayRoll.verifySecondTuesdayTotal().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(71).createCell(5);
				XSSFCell cellSeven = sheet.getRow(71).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.verifySecondTuesdayTotal().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[71].contentEquals(AndrewPayRoll.enterFirstWednesdayDate().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(72).createCell(5);
				XSSFCell cellSeven = sheet.getRow(72).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFirstWednesdayDate().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[72].contentEquals(AndrewPayRoll.enterFirstWednesdayLocation().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(73).createCell(5);
				XSSFCell cellSeven = sheet.getRow(73).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFirstWednesdayLocation().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[73].contentEquals(AndrewPayRoll.enterFirstWednesdayTimeIn().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(74).createCell(5);
				XSSFCell cellSeven = sheet.getRow(74).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFirstWednesdayTimeIn().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[74].contentEquals(AndrewPayRoll.enterFirstWednesdayMealStart().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(75).createCell(5);
				XSSFCell cellSeven = sheet.getRow(75).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFirstWednesdayMealStart().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[75].contentEquals(AndrewPayRoll.enterFirstWednesdayMealEnd().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(76).createCell(5);
				XSSFCell cellSeven = sheet.getRow(76).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFirstWednesdayMealEnd().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[76].contentEquals(AndrewPayRoll.enterFirstWednesdayTimeOut().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(77).createCell(5);
				XSSFCell cellSeven = sheet.getRow(77).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFirstWednesdayTimeOut().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[77].contentEquals(AndrewPayRoll.verifyFirstWednesdayTotal().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(78).createCell(5);
				XSSFCell cellSeven = sheet.getRow(78).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.verifyFirstWednesdayTotal().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[78].contentEquals(AndrewPayRoll.enterSecondWednesdayLocation().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(79).createCell(5);
				XSSFCell cellSeven = sheet.getRow(79).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterSecondWednesdayLocation().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[79].contentEquals(AndrewPayRoll.enterSecondWednesdayTimeIn().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(80).createCell(5);
				XSSFCell cellSeven = sheet.getRow(80).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterSecondWednesdayTimeIn().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[80].contentEquals(AndrewPayRoll.enterSecondWednesdayMealStart().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(81).createCell(5);
				XSSFCell cellSeven = sheet.getRow(81).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterSecondWednesdayMealStart().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[81].contentEquals(AndrewPayRoll.enterSecondWednesdayMealEnd().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(82).createCell(5);
				XSSFCell cellSeven = sheet.getRow(82).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterSecondWednesdayMealEnd().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[82].contentEquals(AndrewPayRoll.enterSecondWednesdayTimeOut().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(83).createCell(5);
				XSSFCell cellSeven = sheet.getRow(83).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterSecondWednesdayTimeOut().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[83].contentEquals(AndrewPayRoll.verifySecondWednesdayTotal().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(84).createCell(5);
				XSSFCell cellSeven = sheet.getRow(84).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.verifySecondWednesdayTotal().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[84].contentEquals(AndrewPayRoll.enterFirstThursdayDate().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(85).createCell(5);
				XSSFCell cellSeven = sheet.getRow(85).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFirstThursdayDate().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[85].contentEquals(AndrewPayRoll.enterFirstThursdayLocation().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(86).createCell(5);
				XSSFCell cellSeven = sheet.getRow(86).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFirstThursdayLocation().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[86].contentEquals(AndrewPayRoll.enterFirstThursdayTimeIn().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(87).createCell(5);
				XSSFCell cellSeven = sheet.getRow(87).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFirstThursdayTimeIn().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[87].contentEquals(AndrewPayRoll.enterFirstThursdayMealStart().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(88).createCell(5);
				XSSFCell cellSeven = sheet.getRow(88).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFirstThursdayMealStart().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[88].contentEquals(AndrewPayRoll.enterFirstThursdayMealEnd().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(89).createCell(5);
				XSSFCell cellSeven = sheet.getRow(89).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFirstThursdayMealEnd().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[89].contentEquals(AndrewPayRoll.enterFirstThursdayTimeOut().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(90).createCell(5);
				XSSFCell cellSeven = sheet.getRow(90).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterFirstThursdayTimeOut().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[90].contentEquals(AndrewPayRoll.verifyFirstThursdayTotal().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(91).createCell(5);
				XSSFCell cellSeven = sheet.getRow(91).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.verifyFirstThursdayTotal().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[91].contentEquals(AndrewPayRoll.enterSecondThursdayLocation().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(92).createCell(5);
				XSSFCell cellSeven = sheet.getRow(92).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterSecondThursdayLocation().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[92].contentEquals(AndrewPayRoll.enterSecondThursdayTimeIn().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(93).createCell(5);
				XSSFCell cellSeven = sheet.getRow(93).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterSecondThursdayTimeIn().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[93].contentEquals(AndrewPayRoll.enterSecondThursdayMealStart().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(94).createCell(5);
				XSSFCell cellSeven = sheet.getRow(94).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterSecondThursdayMealStart().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[94].contentEquals(AndrewPayRoll.enterSecondThursdayMealEnd().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(95).createCell(5);
				XSSFCell cellSeven = sheet.getRow(95).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterSecondThursdayMealEnd().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[95].contentEquals(AndrewPayRoll.enterSecondThursdayTimeOut().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(96).createCell(5);
				XSSFCell cellSeven = sheet.getRow(96).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterSecondThursdayTimeOut().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[96].contentEquals(AndrewPayRoll.verifySecondThursdayTotal().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(97).createCell(5);
				XSSFCell cellSeven = sheet.getRow(97).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.verifySecondThursdayTotal().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[97].contentEquals(AndrewPayRoll.enterEmployeeSignature().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(98).createCell(5);
				XSSFCell cellSeven = sheet.getRow(98).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterEmployeeSignature().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[98].contentEquals(AndrewPayRoll.verifyRegularHours().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(99).createCell(5);
				XSSFCell cellSeven = sheet.getRow(99).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.verifyRegularHours().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[99].contentEquals(AndrewPayRoll.enterOverTimeAuthorizedBy().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(100).createCell(5);
				XSSFCell cellSeven = sheet.getRow(100).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterOverTimeAuthorizedBy().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[100].contentEquals(AndrewPayRoll.verifyOverTimeHours().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(101).createCell(5);
				XSSFCell cellSeven = sheet.getRow(101).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.verifyOverTimeHours().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[101].contentEquals(AndrewPayRoll.enterOverTimeReason().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(102).createCell(5);
				XSSFCell cellSeven = sheet.getRow(102).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterOverTimeReason().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[102].contentEquals(AndrewPayRoll.verifyDoubleTime().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(103).createCell(5);
				XSSFCell cellSeven = sheet.getRow(103).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.verifyDoubleTime().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[103].contentEquals(AndrewPayRoll.enterDoubleTimeAuthorizedBy().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(104).createCell(5);
				XSSFCell cellSeven = sheet.getRow(104).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterDoubleTimeAuthorizedBy().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[104].contentEquals(AndrewPayRoll.verifyHolidayWork().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(105).createCell(5);
				XSSFCell cellSeven = sheet.getRow(105).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.verifyHolidayWork().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[105].contentEquals(AndrewPayRoll.enterDoubleTimeReason().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(106).createCell(5);
				XSSFCell cellSeven = sheet.getRow(106).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.enterDoubleTimeReason().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[106].contentEquals(AndrewPayRoll.verifyHolidayOff().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(107).createCell(5);
				XSSFCell cellSeven = sheet.getRow(107).createCell(7);
				cellFive.setCellValue(AndrewPayRoll.verifyHolidayOff().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}	
			wb.write(new FileOutputStream("src/data.xlsx"));
			wb.close();
			Runtime.getRuntime().exec("cmd /c start src/data.xlsx");
	    }catch(IOException  e){  
	        e.printStackTrace();  
	    }
	}
}
