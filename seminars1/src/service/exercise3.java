package service;

import java.util.Random;

public class exercise3 {
	// Galvena funkcija.
	public static void main(String[] args) {
		int length = 4;
		double min = 46;
		double max = 104;
		
		try {
			// Masīva izveide.
			double[] masivs = generateArray(length, min, max);
			for (int i = 0; i < length; i++) {
				System.out.println(masivs[i]);
			}
			// Mean vērtiba.
			double mean = getMean(masivs);
			System.out.println("Mean vertiba: "+mean+".");
			// Minimala vērtiba.
			double minvalue = getMin(masivs);
			System.out.println("Mazaka vertiba: "+minvalue+".");
			// Maksimala vērtiba.
			double maxvalue = getMax(masivs);
			System.out.println("Lielaka vertiba: "+maxvalue+".");
			// Sakārtots masīvs.
			double[] jaunsmasivs = arraySort(masivs);
			for (int i = 0; i < length; i++) {
				System.out.println(jaunsmasivs[i]);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	// Darbību funkcijas.
	private static double[] generateArray(int N, double lower, double upper) throws Exception {
		if (N < 0) {
			throw new Exception("Nevar izvadit masivu, kuram garums ir "+N+".");
		}
		
		double[] result = new double[N];
		Random rand = new Random();
		
		for (int i = 0; i < result.length; i++) {
			result[i] = rand.nextDouble(lower, upper);
		}
		return result;
	}
	private static double getMean(double[] array) throws Exception {
		if(array == null || array.length == 0) {
			throw new Exception("Masivs neeksiste vai taja nav elementu!");
		}
		double sum = 0;
		
		for (double tempA : array) {
			sum += tempA;
		}
		
		double meanvalue = sum/array.length;
		return meanvalue;
	}
	private static double getMin(double[] array) throws Exception {
		if(array == null || array.length == 0) {
			throw new Exception("Masivs neeksiste vai taja nav elementu!");
		}
		double min = array[0];
		for (int i = 1; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }
		return min;
	}
	private static double getMax(double[] array) throws Exception {
		if(array == null || array.length == 0) {
			throw new Exception("Masivs neeksiste vai taja nav elementu!");
		}
		double max = array[0];
		for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
		return max;
	}
	private static double[] arraySort(double[] array) throws Exception {
		if(array == null || array.length == 0) {
			throw new Exception("Masivs neeksiste vai taja nav elementu!");
		}
		double newarray[] = array;
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length-1; j++) {
				if (array[j] > array[j+1]) {
					double elem1 = array[j];
					double elem2 = array[j+1];
					array[j] = elem2;
					array[j+1] = elem1;
				}
			}
		}
		return newarray;
	}
}
