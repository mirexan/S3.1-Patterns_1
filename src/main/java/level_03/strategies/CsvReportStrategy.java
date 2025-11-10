package level_03.strategies;

import level_03.interficie_strategy.ReportStrategy;

public class CsvReportStrategy implements ReportStrategy {
	@Override
	public String generate() {
		return "CSV report generated";
	}
}
