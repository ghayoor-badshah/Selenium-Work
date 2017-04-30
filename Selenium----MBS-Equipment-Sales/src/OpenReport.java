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
//Report in the form of excel file MBS Equipment Sales
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
			if(Data.myList[0].contentEquals(MBSEquipment.verifyMbsEquipment().getText())) {
				XSSFCell cellFive = sheet.getRow(1).createCell(5);
				XSSFCell cellSeven = sheet.getRow(1).createCell(7);
				cellFive.setCellValue(MBSEquipment.verifyMbsEquipment().getText());
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[1].contentEquals(MBSEquipment.enterTodayDate().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(2).createCell(5);
				XSSFCell cellSeven = sheet.getRow(2).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterTodayDate().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[2].contentEquals(MBSEquipment.enterCurrentTime().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(3).createCell(5);
				XSSFCell cellSeven = sheet.getRow(3).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterCurrentTime().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[3].contentEquals(MBSEquipment.enterQuote().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(4).createCell(5);
				XSSFCell cellSeven = sheet.getRow(4).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterQuote().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[4].contentEquals(MBSEquipment.enterPageNo().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(5).createCell(5);
				XSSFCell cellSeven = sheet.getRow(5).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterPageNo().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[5].contentEquals(MBSEquipment.enterQuoteNo().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(6).createCell(5);
				XSSFCell cellSeven = sheet.getRow(6).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterQuoteNo().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[6].contentEquals(MBSEquipment.enterOrderDescription().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(7).createCell(5);
				XSSFCell cellSeven = sheet.getRow(7).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterOrderDescription().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[7].contentEquals(MBSEquipment.enterCustomerName().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(8).createCell(5);
				XSSFCell cellSeven = sheet.getRow(8).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterCustomerName().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[8].contentEquals(MBSEquipment.enterPackageType().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(9).createCell(5);
				XSSFCell cellSeven = sheet.getRow(9).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterPackageType().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[9].contentEquals(MBSEquipment.enterBillingAddress().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(10).createCell(5);
				XSSFCell cellSeven = sheet.getRow(10).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterBillingAddress().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[10].contentEquals(MBSEquipment.enterOthers().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(11).createCell(5);
				XSSFCell cellSeven = sheet.getRow(11).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterOthers().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[11].contentEquals(MBSEquipment.enterPhoneNo().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(12).createCell(5);
				XSSFCell cellSeven = sheet.getRow(12).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterPhoneNo().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[12].contentEquals(MBSEquipment.enterShipDate().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(13).createCell(5);
				XSSFCell cellSeven = sheet.getRow(13).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterShipDate().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[13].contentEquals(MBSEquipment.enterCustomerContact().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(14).createCell(5);
				XSSFCell cellSeven = sheet.getRow(14).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterCustomerContact().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[14].contentEquals(MBSEquipment.enterTerms().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(15).createCell(5);
				XSSFCell cellSeven = sheet.getRow(15).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterTerms().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[15].contentEquals(MBSEquipment.enterBillType().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(16).createCell(5);
				XSSFCell cellSeven = sheet.getRow(16).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterBillType().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[16].contentEquals(MBSEquipment.enterSalesPerson().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(17).createCell(5);
				XSSFCell cellSeven = sheet.getRow(17).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterSalesPerson().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[17].contentEquals(MBSEquipment.enterShipMethod().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(18).createCell(5);
				XSSFCell cellSeven = sheet.getRow(18).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterShipMethod().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[18].contentEquals(MBSEquipment.enterRentalAgent().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(19).createCell(5);
				XSSFCell cellSeven = sheet.getRow(19).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterRentalAgent().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[19].contentEquals(MBSEquipment.enterPayType().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(20).createCell(5);
				XSSFCell cellSeven = sheet.getRow(20).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterPayType().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[20].contentEquals(MBSEquipment.enterPO().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(21).createCell(5);
				XSSFCell cellSeven = sheet.getRow(21).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterPO().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[21].contentEquals(MBSEquipment.enterFirstStockNo().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(22).createCell(5);
				XSSFCell cellSeven = sheet.getRow(22).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterFirstStockNo().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[22].contentEquals(MBSEquipment.enterFirstDescription().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(23).createCell(5);
				XSSFCell cellSeven = sheet.getRow(23).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterFirstDescription().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[23].contentEquals(MBSEquipment.enterFirstQuantityOrder().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(24).createCell(5);
				XSSFCell cellSeven = sheet.getRow(24).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterFirstQuantityOrder().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[24].contentEquals(MBSEquipment.enterFirstQuantityShipped().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(25).createCell(5);
				XSSFCell cellSeven = sheet.getRow(25).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterFirstQuantityShipped().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[25].contentEquals(MBSEquipment.enterFirstToGoOut().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(26).createCell(5);
				XSSFCell cellSeven = sheet.getRow(26).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterFirstToGoOut().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[26].contentEquals(MBSEquipment.enterSecondStockNo().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(27).createCell(5);
				XSSFCell cellSeven = sheet.getRow(27).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterSecondStockNo().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[27].contentEquals(MBSEquipment.enterSecondDescription().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(28).createCell(5);
				XSSFCell cellSeven = sheet.getRow(28).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterSecondDescription().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[28].contentEquals(MBSEquipment.enterSecondQuantityOrder().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(29).createCell(5);
				XSSFCell cellSeven = sheet.getRow(29).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterSecondQuantityOrder().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[29].contentEquals(MBSEquipment.enterSecondQuantityShipped().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(30).createCell(5);
				XSSFCell cellSeven = sheet.getRow(30).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterSecondQuantityShipped().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[30].contentEquals(MBSEquipment.enterSecondToGoOut().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(31).createCell(5);
				XSSFCell cellSeven = sheet.getRow(31).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterSecondToGoOut().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[31].contentEquals(MBSEquipment.enterThirdStockNo().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(32).createCell(5);
				XSSFCell cellSeven = sheet.getRow(32).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterThirdStockNo().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[32].contentEquals(MBSEquipment.enterThirdDescription().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(33).createCell(5);
				XSSFCell cellSeven = sheet.getRow(33).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterThirdDescription().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[33].contentEquals(MBSEquipment.enterThirdQuantityOrder().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(34).createCell(5);
				XSSFCell cellSeven = sheet.getRow(34).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterThirdQuantityOrder().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[34].contentEquals(MBSEquipment.enterThirdQuantityShipped().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(35).createCell(5);
				XSSFCell cellSeven = sheet.getRow(35).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterThirdQuantityShipped().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[35].contentEquals(MBSEquipment.enterThirdToGoOut().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(36).createCell(5);
				XSSFCell cellSeven = sheet.getRow(36).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterThirdToGoOut().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[36].contentEquals(MBSEquipment.enterFourthStockNo().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(37).createCell(5);
				XSSFCell cellSeven = sheet.getRow(37).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterFourthStockNo().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[37].contentEquals(MBSEquipment.enterFourthDescription().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(38).createCell(5);
				XSSFCell cellSeven = sheet.getRow(38).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterFourthDescription().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[38].contentEquals(MBSEquipment.enterFourthQuantityOrder().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(39).createCell(5);
				XSSFCell cellSeven = sheet.getRow(39).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterFourthQuantityOrder().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[39].contentEquals(MBSEquipment.enterFourthQuantityShipped().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(40).createCell(5);
				XSSFCell cellSeven = sheet.getRow(40).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterFourthQuantityShipped().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[40].contentEquals(MBSEquipment.enterFourthToGoOut().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(41).createCell(5);
				XSSFCell cellSeven = sheet.getRow(41).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterFourthToGoOut().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[41].contentEquals(MBSEquipment.enterFifthStockNo().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(42).createCell(5);
				XSSFCell cellSeven = sheet.getRow(42).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterFifthStockNo().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[42].contentEquals(MBSEquipment.enterFifthDescription().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(43).createCell(5);
				XSSFCell cellSeven = sheet.getRow(43).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterFifthDescription().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[43].contentEquals(MBSEquipment.enterFifthQuantityOrder().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(44).createCell(5);
				XSSFCell cellSeven = sheet.getRow(44).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterFifthQuantityOrder().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[44].contentEquals(MBSEquipment.enterFifthQuantityShipped().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(45).createCell(5);
				XSSFCell cellSeven = sheet.getRow(45).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterFifthQuantityShipped().getAttribute("value"));
				cellSeven.setCellValue("Passed");
				cellSeven.setCellStyle(style);
			}
			if(Data.myList[45].contentEquals(MBSEquipment.enterFifthToGoOut().getAttribute("value"))) {
				XSSFCell cellFive = sheet.getRow(46).createCell(5);
				XSSFCell cellSeven = sheet.getRow(46).createCell(7);
				cellFive.setCellValue(MBSEquipment.enterFifthToGoOut().getAttribute("value"));
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
