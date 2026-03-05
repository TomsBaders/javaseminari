package service;

import java.util.Arrays;

public class exercise7 {
	// Galvenā funkcija.
	public static void main(String[] args) {
		int n = 5;
		try {
			String pascals = pascalsTriangle(n);
			System.out.println(pascals);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	// Darbību funkcija.
	private static String pascalsTriangle(int level) throws Exception {
		if (level < 1) {
			throw new Exception("Nevar izvadīt rezultātu, ja "+level+" ir mazāks par 1.");
		}
		
		int[] array = new int[level];
		array[0] = 1;
		
		for (int i = 1; i < level; i++) {
			array[i] = array[i - 1] * (level - i) / i;
		}
		
		String result = Arrays.toString(array);
		
		return result;
	}
}
