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
//Report in the form of excel file for TriNETSOI
public class OpenReport {
	public static void openExcel() throws FileNotFoundException, IOException{
		XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream("src/data.xlsx"));
		XSSFSheet sheet = wb.getSheet("myReport");
		CellStyle style = wb.createCellStyle();
        XSSFFont font = wb.createFont();
        font.setColor(HSSFColor.GREEN.index);
        font.setBold(true);
        style.setFont(font);
        int i;
		try{
			for(i = 0; i < Data.myList.length; i++){
				if(Data.myList[i].contentEquals(TriNetSOI.verifyFirstParagraph().getAttribute("innerHTML"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(TriNetSOI.verifyFirstParagraph().getAttribute("innerHTML"));
					cellSeven.setCellValue("Passed");
					cellSeven.setCellStyle(style);
				}
				if(Data.myList[i].contentEquals(TriNetSOI.verifyAddressChanges().getAttribute("innerHTML"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(TriNetSOI.verifyAddressChanges().getAttribute("innerHTML"));
					cellSeven.setCellValue("Passed");
					cellSeven.setCellStyle(style);
				}
				if(Data.myList[i].contentEquals(TriNetSOI.verifyFormsAssistance().getAttribute("innerHTML"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(TriNetSOI.verifyFormsAssistance().getAttribute("innerHTML"));
					cellSeven.setCellValue("Passed");
					cellSeven.setCellStyle(style);
				}
				if(Data.myList[i].contentEquals(TriNetSOI.verifyPayRollAndYTDReports().getAttribute("innerHTML"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(TriNetSOI.verifyPayRollAndYTDReports().getAttribute("innerHTML"));
					cellSeven.setCellValue("Passed");
					cellSeven.setCellStyle(style);
				}
				if(Data.myList[i].contentEquals(TriNetSOI.verifyGovernmentEmplVerification().getAttribute("innerHTML"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(TriNetSOI.verifyGovernmentEmplVerification().getAttribute("innerHTML"));
					cellSeven.setCellValue("Passed");
					cellSeven.setCellStyle(style);
				}
				if(Data.myList[i].contentEquals(TriNetSOI.verifyHealthPlanEligibilityQuestion().getAttribute("innerHTML"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(TriNetSOI.verifyHealthPlanEligibilityQuestion().getAttribute("innerHTML"));
					cellSeven.setCellValue("Passed");
					cellSeven.setCellStyle(style);
				}
				if(Data.myList[i].contentEquals(TriNetSOI.verifyCreditableCoverage().getAttribute("innerHTML"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(TriNetSOI.verifyCreditableCoverage().getAttribute("innerHTML"));
					cellSeven.setCellValue("Passed");
					cellSeven.setCellStyle(style);
				}
				if(Data.myList[i].contentEquals(TriNetSOI.verifyCheckHistoryReport().getAttribute("innerHTML"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(TriNetSOI.verifyCheckHistoryReport().getAttribute("innerHTML"));
					cellSeven.setCellValue("Passed");
					cellSeven.setCellStyle(style);
				}
				if(Data.myList[i].contentEquals(TriNetSOI.verifyWebsiteNavigation().getAttribute("innerHTML"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(TriNetSOI.verifyWebsiteNavigation().getAttribute("innerHTML"));
					cellSeven.setCellValue("Passed");
					cellSeven.setCellStyle(style);
				}
				if(Data.myList[i].contentEquals(TriNetSOI.verifyPayrollTracking().getAttribute("innerHTML"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(TriNetSOI.verifyPayrollTracking().getAttribute("innerHTML"));
					cellSeven.setCellValue("Passed");
					cellSeven.setCellStyle(style);
				}
				if(Data.myList[i].contentEquals(TriNetSOI.verifyW2Reprint().getAttribute("innerHTML"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(TriNetSOI.verifyW2Reprint().getAttribute("innerHTML"));
					cellSeven.setCellValue("Passed");
					cellSeven.setCellStyle(style);
				}
				if(Data.myList[i].contentEquals(TriNetSOI.verifyCall().getAttribute("innerHTML"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(TriNetSOI.verifyCall().getAttribute("innerHTML"));
					cellSeven.setCellValue("Passed");
					cellSeven.setCellStyle(style);
				}
				if(Data.myList[i].contentEquals(TriNetSOI.verifyPhoneNo().getAttribute("innerHTML"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(TriNetSOI.verifyPhoneNo().getAttribute("innerHTML"));
					cellSeven.setCellValue("Passed");
					cellSeven.setCellStyle(style);
				}
				if(Data.myList[i].contentEquals(TriNetSOI.verifySpanishSpeakingRepresentative().getAttribute("innerHTML"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(TriNetSOI.verifySpanishSpeakingRepresentative().getAttribute("innerHTML"));
					cellSeven.setCellValue("Passed");
					cellSeven.setCellStyle(style);
				}
				if(Data.myList[i].contentEquals(TriNetSOI.verifyEmail().getAttribute("innerHTML"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(TriNetSOI.verifyEmail().getAttribute("innerHTML"));
					cellSeven.setCellValue("Passed");
					cellSeven.setCellStyle(style);
				}
				if(Data.myList[i].contentEquals(TriNetSOI.verifyFirstEmail().getAttribute("innerHTML"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(TriNetSOI.verifyFirstEmail().getAttribute("innerHTML"));
					cellSeven.setCellValue("Passed");
					cellSeven.setCellStyle(style);
				}
				if(Data.myList[i].contentEquals(TriNetSOI.verifyHours().getAttribute("innerHTML"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(TriNetSOI.verifyHours().getAttribute("innerHTML"));
					cellSeven.setCellValue("Passed");
					cellSeven.setCellStyle(style);
				}
				if(Data.myList[i].contentEquals(TriNetSOI.verifySevenToNine().getAttribute("innerHTML"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(TriNetSOI.verifySevenToNine().getAttribute("innerHTML"));
					cellSeven.setCellValue("Passed");
					cellSeven.setCellStyle(style);
				}
				if(Data.myList[i].contentEquals(TriNetSOI.verifySixToEight().getAttribute("innerHTML"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(TriNetSOI.verifySixToEight().getAttribute("innerHTML"));
					cellSeven.setCellValue("Passed");
					cellSeven.setCellStyle(style);
				}
				if(Data.myList[i].contentEquals(TriNetSOI.verifyFourToSix().getAttribute("innerHTML"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(TriNetSOI.verifyFourToSix().getAttribute("innerHTML"));
					cellSeven.setCellValue("Passed");
					cellSeven.setCellStyle(style);
				}
				if(Data.myList[i].contentEquals(TriNetSOI.verifyFirstAddress().getAttribute("innerHTML"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(TriNetSOI.verifyFirstAddress().getAttribute("innerHTML"));
					cellSeven.setCellValue("Passed");
					cellSeven.setCellStyle(style);
				}
				if(Data.myList[i].contentEquals(TriNetSOI.verifyPoBox().getAttribute("innerHTML"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(TriNetSOI.verifyPoBox().getAttribute("innerHTML"));
					cellSeven.setCellValue("Passed");
					cellSeven.setCellStyle(style);
				}
			}
			wb.write(new FileOutputStream("src/data.xlsx"));
			wb.close();
			Runtime.getRuntime().exec("cmd /c start src/data.xlsx");
	    }catch(IOException  e){  
	        e.printStackTrace();  
	    }
	}
}
