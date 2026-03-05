package service;

import java.nio.charset.StandardCharsets;

public class exercise6 {
	// Galvenā funkcija.
	public static void main(String[] args) {
		byte[] array = {72, 101, 108, 108, 111, 33, 32, 77, 121, 32, 115, 107, 105, 108, 108, 115, 32, 97, 114, 101,
			32, 103, 114, 101, 97, 116, 32, 97, 108, 114, 101, 97, 100, 121, 33};
		String text = getTextFromBytes(array);
		System.out.println(text);
	}
	// Darbību funkcija.
	private static String getTextFromBytes(byte[] array) {
		String result = new String(array, StandardCharsets.UTF_8);
		return result;
	}
}
