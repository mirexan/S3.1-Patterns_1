package level_03.strategies;

import level_03.interficie_strategy.ReportStrategy;

public class JsonReportStrategy implements ReportStrategy {
	@Override
	public String generate() {
		return "JSON report generated";
	}
}
