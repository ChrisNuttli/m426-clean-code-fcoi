package bbw.fcoi.bad;

public class Main {
	public static void main(String[] args) {
		// In this example, we are locked in to what type of engine is built into the instantiated Car-object
		ElectricCar electricCar = new ElectricCar();
		electricCar.start();

		// If we want to change the engine to an electric one, we have to instantiate a new ElectricCar-object
		CombustionCar combustionCar = new CombustionCar();
		combustionCar.start();
	}
}
