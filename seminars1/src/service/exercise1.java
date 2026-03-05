package service;

public class exercise1 {
	// Galvenā funkcija.
	public static void main(String[] args) {
		double gravity = -9.81; // Earth's gravity in m/s^2
		double initialVelocity = 0.0;
		double fallingTime = 10.0;
		double initialPosition = 0.0;
		double finalPosition = 0.0;
		
		System.out.println("Pos in "+fallingTime+" sec : "+finalPosition);
		
		try {
			double rezultats = positionCalc(gravity, initialVelocity, initialPosition, fallingTime);
			System.out.println("Rezultats: "+rezultats);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	// Darbību funkcija.
	private static double positionCalc(double gravity, double initialVelocity, double initialPosition, double fallingTime) throws Exception {
		if (initialVelocity >= 0 && initialPosition >= 0 && fallingTime >= 0) {
			double result = 0.5 * gravity*Math.pow(fallingTime, 2) + initialVelocity*fallingTime + initialPosition;
			return result;
		} else {
			System.out.println("Kada no ievades datiem nav pareiza vertiba!");
			throw new Exception("Kads no ievades datiem nav pareizs!");
		}
	}
}
