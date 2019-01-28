package homework_12_01_2019_1;

public class A7 extends Audi {
	public A7(double availableFuel, String chassisNumber) {
		super(60, availableFuel, "Diesel", 6, 7.0, chassisNumber);
	}

	public void shiftGear(int gear) {
		double adjustConsumption = 0;
		if ((gear < getGears()) && (gear > getCurrentGear())) {

			adjustConsumption = (double) 10 / 100;
		}
		setAverageFuelConsumption(adjustConsumption);
		super.shiftGear(gear);

	}

	public void drive(double n) {
		super.drive(n);
	}
}
