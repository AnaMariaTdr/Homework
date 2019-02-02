package homework_12_01_2019_1;

public class App {
	public static void main(String[] args) {

		Car car = new Q7(27, "WBAFG04580L328038");
		car.start();

		car.shiftGear(1);

		car.drive(0.01);// drives 0.01 KMs

		car.shiftGear(2);

		car.drive(0.02);

		car.shiftGear(3);

		car.drive(0.5);

		car.shiftGear(4);

		car.drive(0.5);

		car.shiftGear(4);

		car.drive(0.5);

		car.shiftGear(5);

		car.drive(10);

		car.shiftGear(4);

		car.drive(0.5);

		car.shiftGear(3);

		car.drive(0.1);

		car.stop();

		Vehicle vehicle = new I8(30, "WBAFG01080L328038");

		vehicle.start();

		vehicle.drive(1);

		vehicle.stop();

		car = (Car) vehicle;

		car.start();
		car.shiftGear(1);

		car.shiftGear(5);
		car.drive(200);
		car.drive(153);

		car.stop();

		double availableFuel = car.getAvailableFuel();

		double fuleConsumedPer100Km = car.getAverageFuelConsumption();

		System.out.println(car.getFuelConsumed());
		System.out.println(availableFuel);
		System.out.println(car.getCruiseKm());
		System.out.println(fuleConsumedPer100Km);

	}

}
