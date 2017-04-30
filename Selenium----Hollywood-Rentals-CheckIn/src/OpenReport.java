import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//Report in the form of excel file for Hollywood Rentals Login Form
public class OpenReport {
	public static void openExcel() throws FileNotFoundException, IOException{
		XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream("src/data.xlsx"));
		XSSFSheet sheet = wb.getSheet("myReport");
		int i;
		try{
			for(i = 0;  i < Data.myList.length; i++){
				if(Data.myList[i].contentEquals(HollyWoodRentals.enterTodayDate().getAttribute("value"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(HollyWoodRentals.enterTodayDate().getAttribute("value"));
					cellSeven.setCellValue("Passed");
				}
				if(Data.myList[i].contentEquals(HollyWoodRentals.selectGraveYardShift().getAttribute("value"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(HollyWoodRentals.selectGraveYardShift().getAttribute("value"));
					cellSeven.setCellValue("Passed");
				}
				if(Data.myList[i].contentEquals(HollyWoodRentals.enterOfficerName().getAttribute("value"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(HollyWoodRentals.enterOfficerName().getAttribute("value"));
					cellSeven.setCellValue("Passed");
				}
				if(Data.myList[i].contentEquals(HollyWoodRentals.enterFirstDriverName().getAttribute("value"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(HollyWoodRentals.enterFirstDriverName().getAttribute("value"));
					cellSeven.setCellValue("Passed");
				}
				if(Data.myList[i].contentEquals(HollyWoodRentals.enterFirstDriverLic().getAttribute("value"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(HollyWoodRentals.enterFirstDriverLic().getAttribute("value"));
					cellSeven.setCellValue("Passed");
				}
				if(Data.myList[i].contentEquals(HollyWoodRentals.enterFirstProductionName().getAttribute("value"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(HollyWoodRentals.enterFirstProductionName().getAttribute("value"));
					cellSeven.setCellValue("Passed");
				}
				if(Data.myList[i].contentEquals(HollyWoodRentals.enterFirstVehiclePlate().getAttribute("value"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(HollyWoodRentals.enterFirstVehiclePlate().getAttribute("value"));
					cellSeven.setCellValue("Passed");
				}
				if(Data.myList[i].contentEquals(HollyWoodRentals.enterFirstVehicleId().getAttribute("value"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(HollyWoodRentals.enterFirstVehicleId().getAttribute("value"));
					cellSeven.setCellValue("Passed");
				}
				if(Data.myList[i].contentEquals(HollyWoodRentals.enterFirstTimeIn().getAttribute("value"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(HollyWoodRentals.enterFirstTimeIn().getAttribute("value"));
					cellSeven.setCellValue("Passed");
				}
				if(Data.myList[i].contentEquals(HollyWoodRentals.enterFirstTimeOut().getAttribute("value"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(HollyWoodRentals.enterFirstTimeOut().getAttribute("value"));
					cellSeven.setCellValue("Passed");
				}
				if(Data.myList[i].contentEquals(HollyWoodRentals.enterSecondDriverName().getAttribute("value"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(11).createCell(7);
					cellFive.setCellValue(HollyWoodRentals.enterSecondDriverName().getAttribute("value"));
					cellSeven.setCellValue("Passed");
				}
				if(Data.myList[i].contentEquals(HollyWoodRentals.enterSecondDriverLic().getAttribute("value"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(12).createCell(7);
					cellFive.setCellValue(HollyWoodRentals.enterSecondDriverLic().getAttribute("value"));
					cellSeven.setCellValue("Passed");
				}
				if(Data.myList[i].contentEquals(HollyWoodRentals.enterSecondProductionName().getAttribute("value"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(HollyWoodRentals.enterSecondProductionName().getAttribute("value"));
					cellSeven.setCellValue("Passed");
				}
				if(Data.myList[i].contentEquals(HollyWoodRentals.enterSecondVehiclePlate().getAttribute("value"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(HollyWoodRentals.enterSecondVehiclePlate().getAttribute("value"));
					cellSeven.setCellValue("Passed");
				}
				if(Data.myList[i].contentEquals(HollyWoodRentals.enterSecondVehicleId().getAttribute("value"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(15).createCell(7);
					cellFive.setCellValue(HollyWoodRentals.enterSecondVehicleId().getAttribute("value"));
					cellSeven.setCellValue("Passed");
				}
				if(Data.myList[i].contentEquals(HollyWoodRentals.enterSecondTimeIn().getAttribute("value"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(HollyWoodRentals.enterSecondTimeIn().getAttribute("value"));
					cellSeven.setCellValue("Passed");
				}
				if(Data.myList[i].contentEquals(HollyWoodRentals.enterSecondTimeOut().getAttribute("value"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(HollyWoodRentals.enterSecondTimeOut().getAttribute("value"));
					cellSeven.setCellValue("Passed");
				}
				if(Data.myList[i].contentEquals(HollyWoodRentals.enterThirdDriverName().getAttribute("value"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(HollyWoodRentals.enterThirdDriverName().getAttribute("value"));
					cellSeven.setCellValue("Passed");
				}
				if(Data.myList[i].contentEquals(HollyWoodRentals.enterThirdDriverLic().getAttribute("value"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(HollyWoodRentals.enterThirdDriverLic().getAttribute("value"));
					cellSeven.setCellValue("Passed");
				}
				if(Data.myList[i].contentEquals(HollyWoodRentals.enterThirdProductionName().getAttribute("value"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(HollyWoodRentals.enterThirdProductionName().getAttribute("value"));
					cellSeven.setCellValue("Passed");
				}
				if(Data.myList[i].contentEquals(HollyWoodRentals.enterThirdVehiclePlate().getAttribute("value"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(HollyWoodRentals.enterThirdVehiclePlate().getAttribute("value"));
					cellSeven.setCellValue("Passed");
				}
				if(Data.myList[i].contentEquals(HollyWoodRentals.enterThirdVehicleId().getAttribute("value"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(HollyWoodRentals.enterThirdVehicleId().getAttribute("value"));
					cellSeven.setCellValue("Passed");
				}
				if(Data.myList[i].contentEquals(HollyWoodRentals.enterThirdTimeIn().getAttribute("value"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(HollyWoodRentals.enterThirdTimeIn().getAttribute("value"));
					cellSeven.setCellValue("Passed");
				}
				if(Data.myList[i].contentEquals(HollyWoodRentals.enterThirdTimeOut().getAttribute("value"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(HollyWoodRentals.enterThirdTimeOut().getAttribute("value"));
					cellSeven.setCellValue("Passed");
				}
				if(Data.myList[i].contentEquals(HollyWoodRentals.enterFourthDriverName().getAttribute("value"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(HollyWoodRentals.enterFourthDriverName().getAttribute("value"));
					cellSeven.setCellValue("Passed");
				}
				if(Data.myList[i].contentEquals(HollyWoodRentals.enterFourthDriverLic().getAttribute("value"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(HollyWoodRentals.enterFourthDriverLic().getAttribute("value"));
					cellSeven.setCellValue("Passed");
				}
				if(Data.myList[i].contentEquals(HollyWoodRentals.enterFourthProductionName().getAttribute("value"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(HollyWoodRentals.enterFourthProductionName().getAttribute("value"));
					cellSeven.setCellValue("Passed");
				}
				if(Data.myList[i].contentEquals(HollyWoodRentals.enterFourthVehiclePlate().getAttribute("value"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(HollyWoodRentals.enterFourthVehiclePlate().getAttribute("value"));
					cellSeven.setCellValue("Passed");
				}
				if(Data.myList[i].contentEquals(HollyWoodRentals.enterFourthVehicleId().getAttribute("value"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(HollyWoodRentals.enterFourthVehicleId().getAttribute("value"));
					cellSeven.setCellValue("Passed");
				}
				if(Data.myList[i].contentEquals(HollyWoodRentals.enterFourthTimeIn().getAttribute("value"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(HollyWoodRentals.enterFourthTimeIn().getAttribute("value"));
					cellSeven.setCellValue("Passed");
				}
				if(Data.myList[i].contentEquals(HollyWoodRentals.enterFourthTimeOut().getAttribute("value"))) {
					XSSFCell cellFive = sheet.getRow(i+1).createCell(5);
					XSSFCell cellSeven = sheet.getRow(i+1).createCell(7);
					cellFive.setCellValue(HollyWoodRentals.enterFourthTimeOut().getAttribute("value"));
					cellSeven.setCellValue("Passed");
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
