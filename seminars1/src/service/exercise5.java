package service;

import java.util.Random;

public class exercise5 {
	// Galvenā funkcija.
	public static void main(String[] args) {
		int skaits = 1000;
		try {
			double[] moneta = coinFlip(skaits);
			System.out.println("Heads = "+moneta[0]+", Tails = "+moneta[1]+", Ratio = "+moneta[2]);
			int[] kaulins = rollDice(skaits);
			System.out.println("[1] = "+kaulins[0]+", [2] = "+kaulins[1]+", [3] = "+kaulins[2]+", [4] = "+kaulins[3]+", [5] = "+kaulins[4]+", [6] = "+kaulins[5]);
			int kaulini = roll2Dices();
			System.out.println("Aizņēma "+kaulini+" reizes lai uzmestu 12.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	// Darbību funkcijas.
	private static double[] coinFlip(int N) throws Exception {
		if (N < 10) {
			throw new Exception("Nevar izvadit rezultātu, jo skaits "+N+" ir mazāks par 10.");
		}
		
		double[] result = new double[N];
		double min = 0;
		double max = 2;
		Random rand = new Random();
		
		for (int i = 0; i < N; i++) {
			double luck = rand.nextDouble(min, max);
			if (luck < 0.5) {
				result[0] += 1;
			} else {
				result[1] += 1;
			}
		}
		if (result[0] < result[1]) {
			result[2] = result[0]/result[1];
		} else {
			result[2] = result[1]/result[0];
		}
		return result;
	}
	private static int[] rollDice(int N) throws Exception {
		if (N < 1) {
			throw new Exception("Nevar izvadit rezultātu, jo skaits "+N+" ir mazāks par 1.");
		}
		
		int[] result = new int[N];
		int min = 1;
		int max = 7;
		Random rand = new Random();
		
		for (int i = 0; i < N; i++) {
			int luck = rand.nextInt(min, max);
			if (luck == 1) {
				result[0] += 1;
			} else if (luck == 2) {
				result[1] += 1;
			} else if (luck == 3) {
				result[2] += 1;
			} else if (luck == 4) {
				result[3] += 1;
			} else if (luck == 5) {
				result[4] += 1;
			} else if (luck == 6) {
				result[5] += 1;
			}
		}
		
		return result;
	}
	private static int roll2Dices() {
		int luck1 = 0;
		int luck2 = 0;
		int attempts = 0;
		Random rand = new Random();
		
		while (luck1 != 6 || luck2 != 6) {
			luck1 = rand.nextInt(1, 7);
			luck2 = rand.nextInt(1, 7);
			attempts += 1;
		}
		
		return attempts;
	}

}
