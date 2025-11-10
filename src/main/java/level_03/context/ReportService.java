package level_03.context;

import level_03.interficie_strategy.ReportStrategy;

public class ReportService {
	private ReportStrategy strategy;
	public void setStrategy(ReportStrategy strategy) {
		this.strategy = strategy;
	}
	public String generateReport() {
		if (this.strategy == null) {
			throw new IllegalStateException("There is no report strategy defined");
		}
		return this.strategy.generate();
	}
}

