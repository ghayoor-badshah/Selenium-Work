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
//Report in the form of excel file for DMV Driver License/ID Form
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
			if(Data.myList[0].contentEquals(DMVCardForm.verifyDmvHeading().getAttribute("innerHTML"))) {
				XSSFCell cellFive = sheet.getRow(1).createCell(5);
				XSSFCell cellSeven = sheet.getRow(1).createCell(7);
				cellFive.setCellValue(DMVCardForm.verifyDmvHeading().getAttribute("innerHTML"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[1].contentEquals(DMVCardForm.verifyDriverLicenseText().getAttribute("innerHTML"))) {
				XSSFCell cellFive = sheet.getRow(2).createCell(5);
				XSSFCell cellSeven = sheet.getRow(2).createCell(7);
				cellFive.setCellValue(DMVCardForm.verifyDriverLicenseText().getAttribute("innerHTML"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[2].contentEquals(DMVCardForm.verifyGetIdCardFirstTimeText().getAttribute("innerHTML"))) {
				XSSFCell cellFive = sheet.getRow(3).createCell(5);
				XSSFCell cellSeven = sheet.getRow(3).createCell(7);
				cellFive.setCellValue(DMVCardForm.verifyGetIdCardFirstTimeText().getAttribute("innerHTML"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[3].contentEquals(DMVCardForm.verifyNoToPreviusHistoryText().getAttribute("innerHTML"))) {
				XSSFCell cellFive = sheet.getRow(4).createCell(5);
				XSSFCell cellSeven = sheet.getRow(4).createCell(7);
				cellFive.setCellValue(DMVCardForm.verifyNoToPreviusHistoryText().getAttribute("innerHTML"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[4].contentEquals(DMVCardForm.enterFirstName().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(5).createCell(5);
				XSSFCell cellSeven = sheet.getRow(5).createCell(7);
				cellFive.setCellValue(DMVCardForm.enterFirstName().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[5].contentEquals(DMVCardForm.enterLastName().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(6).createCell(5);
				XSSFCell cellSeven = sheet.getRow(6).createCell(7);
				cellFive.setCellValue(DMVCardForm.enterLastName().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[6].contentEquals(DMVCardForm.enterMiddleName().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(7).createCell(5);
				XSSFCell cellSeven = sheet.getRow(7).createCell(7);
				cellFive.setCellValue(DMVCardForm.enterMiddleName().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[7].contentEquals(DMVCardForm.enterSuffix().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(8).createCell(5);
				XSSFCell cellSeven = sheet.getRow(8).createCell(7);
				cellFive.setCellValue(DMVCardForm.enterSuffix().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[8].contentEquals(DMVCardForm.verifyNoToDifferentNameText().getAttribute("innerHTML"))) {
				XSSFCell cellFive = sheet.getRow(9).createCell(5);
				XSSFCell cellSeven = sheet.getRow(9).createCell(7);
				cellFive.setCellValue(DMVCardForm.verifyNoToDifferentNameText().getAttribute("innerHTML"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[9].contentEquals(DMVCardForm.enterDateOfBirth().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(10).createCell(5);
				XSSFCell cellSeven = sheet.getRow(10).createCell(7);
				cellFive.setCellValue(DMVCardForm.enterDateOfBirth().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[10].contentEquals(DMVCardForm.verifyMaleText().getAttribute("innerHTML"))) {
				XSSFCell cellFive = sheet.getRow(11).createCell(5);
				XSSFCell cellSeven = sheet.getRow(11).createCell(7);
				cellFive.setCellValue(DMVCardForm.verifyMaleText().getAttribute("innerHTML"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[11].contentEquals(DMVCardForm.enterHairColor().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(12).createCell(5);
				XSSFCell cellSeven = sheet.getRow(12).createCell(7);
				cellFive.setCellValue(DMVCardForm.enterHairColor().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[12].contentEquals(DMVCardForm.enterEyeColor().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(13).createCell(5);
				XSSFCell cellSeven = sheet.getRow(13).createCell(7);
				cellFive.setCellValue(DMVCardForm.enterEyeColor().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[13].contentEquals(DMVCardForm.enterHeight().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(14).createCell(5);
				XSSFCell cellSeven = sheet.getRow(14).createCell(7);
				cellFive.setCellValue(DMVCardForm.enterHeight().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[14].contentEquals(DMVCardForm.enterWeight().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(15).createCell(5);
				XSSFCell cellSeven = sheet.getRow(15).createCell(7);
				cellFive.setCellValue(DMVCardForm.enterWeight().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[15].contentEquals(DMVCardForm.enterMailingAddress().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(16).createCell(5);
				XSSFCell cellSeven = sheet.getRow(16).createCell(7);
				cellFive.setCellValue(DMVCardForm.enterMailingAddress().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[16].contentEquals(DMVCardForm.verifyYesToSocialSecurityText().getAttribute("innerHTML"))) {
				XSSFCell cellFive = sheet.getRow(17).createCell(5);
				XSSFCell cellSeven = sheet.getRow(17).createCell(7);
				cellFive.setCellValue(DMVCardForm.verifyYesToSocialSecurityText().getAttribute("innerHTML"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[17].contentEquals(DMVCardForm.enterFirstThreeDigitOfSocial().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(18).createCell(5);
				XSSFCell cellSeven = sheet.getRow(18).createCell(7);
				cellFive.setCellValue(DMVCardForm.enterFirstThreeDigitOfSocial().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[18].contentEquals(DMVCardForm.enterMiddleTwoDigitOfSocial().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(19).createCell(5);
				XSSFCell cellSeven = sheet.getRow(19).createCell(7);
				cellFive.setCellValue(DMVCardForm.enterMiddleTwoDigitOfSocial().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[19].contentEquals(DMVCardForm.enterLastThreeDigitOfSocial().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(20).createCell(5);
				XSSFCell cellSeven = sheet.getRow(20).createCell(7);
				cellFive.setCellValue(DMVCardForm.enterLastThreeDigitOfSocial().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[20].contentEquals(DMVCardForm.enterApplicantSignature().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(21).createCell(5);
				XSSFCell cellSeven = sheet.getRow(21).createCell(7);
				cellFive.setCellValue(DMVCardForm.enterApplicantSignature().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[21].contentEquals(DMVCardForm.enterToDayDate().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(22).createCell(5);
				XSSFCell cellSeven = sheet.getRow(22).createCell(7);
				cellFive.setCellValue(DMVCardForm.enterToDayDate().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[22].contentEquals(DMVCardForm.verifyNoForMedicalConditionText().getAttribute("innerHTML"))) {
				XSSFCell cellFive = sheet.getRow(23).createCell(5);
				XSSFCell cellSeven = sheet.getRow(23).createCell(7);
				cellFive.setCellValue(DMVCardForm.verifyNoForMedicalConditionText().getAttribute("innerHTML"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[23].contentEquals(DMVCardForm.verifyNoToVeteranText().getAttribute("innerHTML"))) {
				XSSFCell cellFive = sheet.getRow(24).createCell(5);
				XSSFCell cellSeven = sheet.getRow(24).createCell(7);
				cellFive.setCellValue(DMVCardForm.verifyNoToVeteranText().getAttribute("innerHTML"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[24].contentEquals(DMVCardForm.verifyNoToOrganDonationText().getAttribute("innerHTML"))) {
				XSSFCell cellFive = sheet.getRow(25).createCell(5);
				XSSFCell cellSeven = sheet.getRow(25).createCell(7);
				cellFive.setCellValue(DMVCardForm.verifyNoToOrganDonationText().getAttribute("innerHTML"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[25].contentEquals(DMVCardForm.verifyYesToUSCitizenText().getAttribute("innerHTML"))) {
				XSSFCell cellFive = sheet.getRow(26).createCell(5);
				XSSFCell cellSeven = sheet.getRow(26).createCell(7);
				cellFive.setCellValue(DMVCardForm.verifyYesToUSCitizenText().getAttribute("innerHTML"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[26].contentEquals(DMVCardForm.verifyYesToEligibleToVoteText().getAttribute("innerHTML"))) {
				XSSFCell cellFive = sheet.getRow(27).createCell(5);
				XSSFCell cellSeven = sheet.getRow(27).createCell(7);
				cellFive.setCellValue(DMVCardForm.verifyYesToEligibleToVoteText().getAttribute("innerHTML"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[27].contentEquals(DMVCardForm.verifyRegisterToVoteText().getAttribute("innerHTML"))) {
				XSSFCell cellFive = sheet.getRow(28).createCell(5);
				XSSFCell cellSeven = sheet.getRow(28).createCell(7);
				cellFive.setCellValue(DMVCardForm.verifyRegisterToVoteText().getAttribute("innerHTML"));
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
