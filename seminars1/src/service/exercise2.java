package service;

public class exercise2 {
	// Galvenā funkcija.
	public static void main(String[] args) {
		int number = 6;
		try {
			int rezultats = factorialForLoop(number);
			System.out.println("-- For Loop --");
			System.out.println("Skaitļa "+number+" faktoriāls ir "+rezultats+".");
			int rezultats2 = factorialRecursive(number);
			System.out.println("-- Recursive --");
			System.out.println("Skaitļa "+number+" faktoriāls ir "+rezultats2+".");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	// Darbību funkcija.
	private static int factorialForLoop(int N) throws Exception {
		if (N >= 0) {
			int faktorials = 1;
			if (N > 1) {
				for (int i = 2; i < N+1; i++) {
					faktorials *= i; 
				}
				return faktorials;
			} else {
				return faktorials;
			}
		} else {
			System.out.println("Ievadītais skaitlis ir negatīvs!");
			throw new Exception("Skaitlim ir jābut nullei vai pozitīvam!");
		}
	}
	private static int factorialRecursive(int N) throws Exception {
		if (N >= 0) {
			if (N > 1) {
				return N * factorialRecursive(N - 1);
			} else {
				return 1;
			}
		} else {
			System.out.println("Ievadītais skaitlis ir negatīvs!");
			throw new Exception("Skaitlim ir jābut nullei vai pozitīvam!");
		}
	}
}
