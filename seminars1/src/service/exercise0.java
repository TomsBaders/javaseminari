package service;

public class exercise0 {
	public static void main(String[] args) {
		String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt",
			"Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron",
		"Kate" };
			
		int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393,
		299, 343, 317, 265 };
			
		int elementlength = names.length;
		if (names.length > times.length) {
			elementlength = times.length; 
		}
			
		for (int i = 0; i < elementlength; i++) {
			System.out.println(names[i] + " " + times[i]);
		}
	}
}
