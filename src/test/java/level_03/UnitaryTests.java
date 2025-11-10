package level_03;

import level_03.context.ReportService;
import level_03.strategies.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UnitaryTests {
	ReportService reportService = new ReportService();
	@Test
	public void testGenerateHtmlReport(){
		reportService.setStrategy(new HtmlReportStrategy());
		Assertions.assertEquals("HTML report generated",reportService.generateReport());
	}
	@Test
	public void testGenerateJsonReport(){
		reportService.setStrategy(new JsonReportStrategy());
		Assertions.assertEquals("JSON report generated",reportService.generateReport());
	}
	@Test
	public void testGenerateCsvReport(){
		reportService.setStrategy(new CsvReportStrategy());
		Assertions.assertEquals("CSV report generated",reportService.generateReport());
	}
	@Test
	public void testGenerateExcelReport(){
		reportService.setStrategy(new ExcelReportStrategy());
		Assertions.assertEquals("Excel report generated",reportService.generateReport());
	}
	@Test
	public void testGeneratePdfReport(){
		reportService.setStrategy(new PdfReportStrategy());
		Assertions.assertEquals("PDF report generated",reportService.generateReport());
	}
	@Test
	public void testGenerateWordReport(){
		reportService.setStrategy(new WordReportStrategy());
		Assertions.assertEquals("Word report generated",reportService.generateReport());
	}
	@Test
	public void testGenerateXmlReport(){
		reportService.setStrategy(new XmlReportStrategy());
		Assertions.assertEquals("XML report generated",reportService.generateReport());
	}
}
