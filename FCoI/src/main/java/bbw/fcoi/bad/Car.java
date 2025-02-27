package bbw.fcoi.bad;

public class Car extends Engine {
	/**
	 * Just like a real car, a car needs an engine to start.
	 * Since there are different types of engines, we need to pass the type of engine that the car uses.
	 * This is bad because if a new type of engine was introduced, we would have to change the Engine class,
	 * which increases the potential of causing bugs.
	 * @param type The type of engine that the car uses.
	 */
	public Car(EngineType type) {
		super(type);
	}
}
