package level_03.strategies;

import level_03.interficie_strategy.ReportStrategy;

public class ExcelReportStrategy implements ReportStrategy {
	@Override
	public String generate() {
		return "Excel report generated";
	}
}
