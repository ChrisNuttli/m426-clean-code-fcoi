package bbw.fcoi.good;

public class Car {
	private IEngine engine;

	public Car(IEngine engine) {
		this.engine = engine;
	}

	public void start() {
		engine.start();
	}
}
