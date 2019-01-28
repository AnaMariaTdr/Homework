package homework_12_01_2019_1;

public class Q7 extends Audi {

	public Q7(double availableFuel, String chassisNumber) {
		super(60, availableFuel, "Diesel", 6, 7, chassisNumber);
	}

	public void shiftGear(int gear) {
		double adjustConsumption = 0;
		if ((gear < getGears()) && (gear > getCurrentGear())) {

			adjustConsumption = (float) 10 / 100;
		}
		setAdjustConsumption(adjustConsumption);
		super.shiftGear(gear);

	}

	public void drive(double n) {
		super.drive(n);
	}

}
