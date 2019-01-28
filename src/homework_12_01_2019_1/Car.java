package homework_12_01_2019_1;

public abstract class Car implements Vehicle {
	private final String chassisNumber;
	private final int fuelTankSize;
	private final String fuelType;
	private final int gears;
	private final double declaredConsumptionPer100Km;
	private double availableFuel;
	private int currentGear;
	private boolean engineOn = false;
	private double averageFuelConsumption;
	private double cruiseKm;
	private double fuelConsumed;
	private double tempFuelConsumed;
	public double adjustConsumption;

	public Car(int fuelTankSize, double availableFuel2, String fuelType, int gears, double d, String chassisNumber) {
		this.fuelTankSize = fuelTankSize;
		this.fuelType = fuelType;
		this.gears = gears;
		this.declaredConsumptionPer100Km = d;
		if (availableFuel2 <= fuelTankSize && availableFuel2 >= 0) {
			this.availableFuel = availableFuel2;
		} else if (availableFuel2 < 0) {
			this.availableFuel = 0;
		} else {
			this.availableFuel = fuelTankSize;
		}
		this.chassisNumber = chassisNumber;
	}

	public void start() {
		this.setEngineOn(true);
		this.averageFuelConsumption = 0;
		this.cruiseKm = 0;
		this.fuelConsumed = 0;
		this.adjustConsumption = 0;
	}

	public void stop() {
		this.setEngineOn(false);
		this.averageFuelConsumption = (double) (this.fuelConsumed * 100 / this.cruiseKm);
	}

	public void shiftGear(int gear) {
		if (gear <= this.gears) {
			this.currentGear = gear;
		} else {
			System.out.println("There are maximum " + this.gears + " gears.");
		}
	}

	public void drive(double n) {
		this.cruiseKm += n;
		this.tempFuelConsumed = (float) (n * this.declaredConsumptionPer100Km / 100 * (1 + this.adjustConsumption));
		this.fuelConsumed += this.tempFuelConsumed;
		this.availableFuel -= this.tempFuelConsumed;

	}

	public double getAvailableFuel() {
		return availableFuel;
	}

	public void setAvailableFuel(float availableFuel) {
		this.availableFuel = availableFuel;
	}

	public String getChassisNumber() {
		return chassisNumber;
	}

	public int getCurrentGear() {
		return currentGear;
	}

	public double getAverageFuelConsumption() {
		return averageFuelConsumption;
	}

	public double getCruiseKm() {
		return cruiseKm;
	}

	public double getFuelConsumed() {
		return fuelConsumed;
	}

	public double getConsumptionPer100Km() {
		return declaredConsumptionPer100Km;
	}

	public int getFuelTankSize() {
		return fuelTankSize;
	}

	public String getFuelType() {
		return fuelType;
	}

	public int getGears() {
		return gears;
	}

	public void setCurrentGear(int currentGear) {
		this.currentGear = currentGear;
	}

	public void setAverageFuelConsumption(double averageFuelConsumption) {
		this.averageFuelConsumption = averageFuelConsumption;
	}

	public void setCruiseKm(double cruiseKm) {
		this.cruiseKm = cruiseKm;
	}

	public void setFuelConsumed(float fuelConsumed) {
		this.fuelConsumed = fuelConsumed;
	}

	public double getTempFuelConsumed() {
		return tempFuelConsumed;
	}

	public void setTempFuelConsumed(double tempFuelConsumed) {
		this.tempFuelConsumed = tempFuelConsumed;
	}

	public double getAdjustConsumption() {
		return adjustConsumption;
	}

	public void setAdjustConsumption(double adjustConsumption) {
		this.adjustConsumption = adjustConsumption;
	}

	public double getDeclaredConsumptionPer100Km() {
		return declaredConsumptionPer100Km;
	}

	public boolean isEngineOn() {
		return engineOn;
	}

	public void setEngineOn(boolean engineOn) {
		this.engineOn = engineOn;
	}

}