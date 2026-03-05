package service;

import java.util.Random;

public class exercise4 {
	// Galvenā funkcija.
	public static void main(String[] args) {
		int length = 4;
		int izvrinda = 2;
		int izvkolonna = 1;
		try {
			// Masīva izveide.
			double[][] masivs = generateMatrix(length);
			for (int i = 0; i < length; i++) {
				for (int j = 0; j < length; j++) {
					System.out.println(masivs[i][j]);
				}
				System.out.println(" ");
			}
			// Elementa izvade.
			System.out.println("Izvēlētais produkts no "+izvrinda+". rindas un "+izvkolonna+". kolonnas ir "+getProduct(masivs, izvrinda, izvkolonna)+".");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	// Darbību funkcijas.
	private static double[][] generateMatrix(int N) throws Exception {
		if (N < 0) {
			throw new Exception("Nevar izvadit masivu, kuram garums ir "+N+".");
		}
		
		double[][] result = new double[N][N];
		double min = 1;
		double max = 10;
		Random rand = new Random();
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				result[i][j] = rand.nextDouble(min, max);
			}
		}
		return result;
	}
	private static double getProduct(double[][] matrix, int i, int j) {
		return matrix[i-1][j-1];
	}
}
