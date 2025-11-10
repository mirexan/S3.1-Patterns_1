package level_03.strategies;

import level_03.interficie_strategy.ReportStrategy;

public class HtmlReportStrategy implements ReportStrategy {
	@Override
	public String generate() {
		return "HTML report generated";
	}
}
