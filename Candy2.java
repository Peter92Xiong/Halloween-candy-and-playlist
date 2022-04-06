import java.util.Scanner;

public class Candy2 {
	public static void main(String[] args) {

		int numTypes, numCars;
		Scanner getInput = new Scanner(System.in);
// Get number of types of cars and total number of cars
		numTypes = getInput.nextInt();
		numCars = getInput.nextInt();

// Get cars
		int[] cars = new int[numCars];
		for (int i = 0; i < numCars; i++) {
			cars[i] = getInput.nextInt();
		}

		int missing = 0;
		int contains = 0;
		for (int i = 1; i <= numTypes; i++) {
			contains = 0;
			for (int j = 0; j < cars.length; j++) {
				if (cars[j] == i) {
					contains = 1;
					break;
				}

				if (j + 1 == cars.length && contains == 0)
					missing += 1;

			}

		}
		if (missing > 0)
			System.out.println(missing + " types(s) of cars are missing from the system");
		else
			System.out.println("All " + numTypes + " type(s) of cars are in the system");

		getInput.close();
	}
}