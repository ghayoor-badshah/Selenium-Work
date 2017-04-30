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
//Report in the form of excel file for Allied Time Attendence Instruction
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
			for(i = 0;  i < Data.myList.length; i++){
				if(Data.myList[i].contentEquals(TimeAttendenceSystem.verifyAllied().getText())) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(TimeAttendenceSystem.verifyAllied().getText());
					cellSeven.setCellValue("Passed");
					cellSeven.setCellStyle(style);
				}
				if(Data.myList[i].contentEquals(TimeAttendenceSystem.verifyConsultingSecurity().getText())) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(TimeAttendenceSystem.verifyConsultingSecurity().getText());
					cellSeven.setCellValue("Passed");
					cellSeven.setCellStyle(style);
				}
				if(Data.myList[i].contentEquals(TimeAttendenceSystem.verifyTimeAndAttendenceSystem().getText())) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(TimeAttendenceSystem.verifyTimeAndAttendenceSystem().getText());
					cellSeven.setCellValue("Passed");
					cellSeven.setCellStyle(style);
				}
				if(Data.myList[i].contentEquals(TimeAttendenceSystem.verifyInstructionOne().getText())) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(TimeAttendenceSystem.verifyInstructionOne().getText());
					cellSeven.setCellValue("Passed");
					cellSeven.setCellStyle(style);
				}
				if(Data.myList[i].contentEquals(TimeAttendenceSystem.veriftyInstructionTwo().getText())) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(TimeAttendenceSystem.veriftyInstructionTwo().getText());
					cellSeven.setCellValue("Passed");
					cellSeven.setCellStyle(style);
				}
				if(Data.myList[i].contentEquals(TimeAttendenceSystem.verifyPhoneNo().getText())) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(TimeAttendenceSystem.verifyPhoneNo().getText());
					cellSeven.setCellValue("Passed");
					cellSeven.setCellStyle(style);
				}
				if(Data.myList[i].contentEquals(TimeAttendenceSystem.verifyIdNoOne().getText())) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(TimeAttendenceSystem.verifyIdNoOne().getText());
					cellSeven.setCellValue("Passed");
					cellSeven.setCellStyle(style);
				}
				if(Data.myList[i].contentEquals(TimeAttendenceSystem.verifyPasswordOne().getText())) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(TimeAttendenceSystem.verifyPasswordOne().getText());
					cellSeven.setCellValue("Passed");
					cellSeven.setCellStyle(style);
				}
				if(Data.myList[i].contentEquals(TimeAttendenceSystem.verifyEmpIdOne().getText())) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(TimeAttendenceSystem.verifyEmpIdOne().getText());
					cellSeven.setCellValue("Passed");
					cellSeven.setCellStyle(style);
				}
				if(Data.myList[i].contentEquals(TimeAttendenceSystem.verifyShiftDateOne().getText())) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(TimeAttendenceSystem.verifyShiftDateOne().getText());
					cellSeven.setCellValue("Passed");
					cellSeven.setCellStyle(style);
				}
				if(Data.myList[i].contentEquals(TimeAttendenceSystem.verifyRecordClockInOne().getText())) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(11).createCell(7);
					cellFive.setCellValue(TimeAttendenceSystem.verifyRecordClockInOne().getText());
					cellSeven.setCellValue("Passed");
					cellSeven.setCellStyle(style);
				}
				if(Data.myList[i].contentEquals(TimeAttendenceSystem.verifyIdNoTwo().getText())) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(12).createCell(7);
					cellFive.setCellValue(TimeAttendenceSystem.verifyIdNoTwo().getText());
					cellSeven.setCellValue("Passed");
					cellSeven.setCellStyle(style);
				}
				if(Data.myList[i].contentEquals(TimeAttendenceSystem.verifyPasswordTwo().getText())) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(TimeAttendenceSystem.verifyPasswordTwo().getText());
					cellSeven.setCellValue("Passed");
					cellSeven.setCellStyle(style);
				}
				if(Data.myList[i].contentEquals(TimeAttendenceSystem.verifyEmpIdTwo().getText())) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(TimeAttendenceSystem.verifyEmpIdTwo().getText());
					cellSeven.setCellValue("Passed");
					cellSeven.setCellStyle(style);
				}
				if(Data.myList[i].contentEquals(TimeAttendenceSystem.verifyShiftDateTwo().getText())) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(TimeAttendenceSystem.verifyShiftDateTwo().getText());
					cellSeven.setCellValue("Passed");
					cellSeven.setCellStyle(style);
				}
				if(Data.myList[i].contentEquals(TimeAttendenceSystem.verifyRecordClockInTwo().getText())) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(TimeAttendenceSystem.verifyRecordClockInTwo().getText());
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
