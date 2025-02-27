package bbw.fcoi.bad;

public class Engine {
	private EngineType type;

	public Engine(EngineType type) {
		this.type = type;
	}

	public void start() {
		switch (type) {
			case Combustion:
				System.out.println("Starting combustion engine");
				break;
			case Electric:
				System.out.println("Starting electric engine");
				break;
		}
	}
}
