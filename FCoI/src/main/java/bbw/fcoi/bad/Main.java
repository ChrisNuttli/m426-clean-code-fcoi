package bbw.fcoi.bad;

public class Main {
	public static void main(String[] args) {
		// In this example, we are locked in to what type of engine is built into the instantiated Car-object

		Car car = new ElectricCar();
		car.start();
		car.incrementDrivenKilometers();
		car.incrementDrivenKilometers();
		car.incrementDrivenKilometers();
		car.incrementDrivenKilometers();
		System.out.printf("The car with the chassis number %s was driven for %s km.", car.getChassisNumber(), car.getDrivenKilometers());

		// Now if we want to change the engine to an electric one, we can only do this by instantiating a new car.
		// This creates the problem, that any properties in the old car object, that cannot be assigned to the new car
		// object, will be lost or changed.
		car = new CombustionCar();
		car.start();
		car.incrementDrivenKilometers();
		car.incrementDrivenKilometers();
		System.out.printf("The car with the chassis number %s was driven for %s km.", car.getChassisNumber(), car.getDrivenKilometers());
	}
}
