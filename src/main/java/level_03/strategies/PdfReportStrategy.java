package level_03.strategies;

import level_03.interficie_strategy.ReportStrategy;

public class PdfReportStrategy implements ReportStrategy {
	@Override
	public String generate() {
		return "PDF report generated";
	}
}
