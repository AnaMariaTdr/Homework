package homework_12_01_2019_1;

public abstract class BMW extends Car {

	public BMW(int fuelTankSize, double availableFuel, String fuelType, int totalGears, double consumptionPer100Km,
			String chassisNumber) {
		super(fuelTankSize, availableFuel, fuelType, totalGears, consumptionPer100Km, chassisNumber);

	}



	public class X1 extends BMW {
		public X1(int availableFuel, String chassisNumber) {
			super(60, availableFuel, "Diesel", 6,6.1, chassisNumber);
		}

		@Override
		public void start() {
			
			super.start();
		}

		@Override
		public void stop() {

			super.stop();
		}

		@Override
		public void drive(double n) {
			
			super.drive(n);
		}


	}
	
	public class I8 extends BMW {
		public I8(int availableFuel, String chassisNumber) {
			super(60, availableFuel, "Gasoline", 6, 2.1, chassisNumber);
		}

		@Override
		public void start() {
			
			super.start();
		}

		@Override
		public void stop() {
		
			super.stop();
		}

		@Override
		public void drive(double n) {
			
			super.drive(n);
		}

	
		
	}
}
