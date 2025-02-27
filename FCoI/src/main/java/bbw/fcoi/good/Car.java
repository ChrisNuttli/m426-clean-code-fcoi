package bbw.fcoi.good;

public class Car {
	private IEngine engine;

	/**
	 * Just like a real car, a car needs an engine to start.
	 * Since there are different types of engines, we use an interface to abstract it, which makes it interchangeable.
	 * Now, if a new type of engine was introduced, we could just implement the IEngine interface and pass it to
	 * the car, without having to change existing code.
	 * @param engine The engine that the car uses.
	 */
	public Car(IEngine engine) {
		this.engine = engine;
	}

	public void start() {
		engine.start();
	}
}
