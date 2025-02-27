package bbw.fcoi.bad;

public class Engine {
	private EngineType type;

	/**
	 * In order to start an engine, we need to know its type.
	 */
	public Engine(EngineType type) {
		this.type = type;
	}

	/**
	 * Because there is no abstraction, we need to check the type of engine in order to start it.
	 * This is bad because if a new type of engine was introduced, we would have to change this class,
	 * which increases the potential of causing bugs.
	 */
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
