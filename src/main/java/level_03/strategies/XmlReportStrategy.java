package level_03.strategies;

import level_03.interficie_strategy.ReportStrategy;

public class XmlReportStrategy implements ReportStrategy {
	@Override
	public String generate() {
		return "XML report generated";
	}
}
