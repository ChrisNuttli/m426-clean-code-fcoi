package bbw.fcoi.good;

public class Main {
	public static void main(String[] args) {
		Car car = new Car(new CombustionEngine());
		car.start();

		// now if we want to change the engine to an electric one, we can do it easily
		car.setEngine(new ElectricEngine());
		car.start();
	}
}
