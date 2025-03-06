package bbw.fcoi.good;
import java.util.UUID;

public class Main {
	public static void main(String[] args) {
		Car car = new Car(new CombustionEngine());
		car.start();
		car.incrementDrivenKilometers();
		car.incrementDrivenKilometers();
		car.incrementDrivenKilometers();
		car.incrementDrivenKilometers();
		System.out.printf("The car with the chassi number %s was driven for %s km.", car.getChassisNumber(), car.getDrivenKilometers());

		// Now if we want to change the engine to an electric one, we can do it easily without having to instantiate a new car.
		car.setEngine(new ElectricEngine());
		car.start();
		car.incrementDrivenKilometers();
		car.incrementDrivenKilometers();
		System.out.printf("The car with the chassi number %s was driven for %s km.", car.getChassisNumber(), car.getDrivenKilometers());
	}
}
