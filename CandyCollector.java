import java.util.Scanner;

public class CandyCollector {
	public static void main(String[] args) {
		long n; // number of candies
		long k; // the types of candies
		long collected;
		long missingCandy = 0;

		Scanner scanner = new Scanner(System.in);
		k = scanner.nextInt(); // first input is types of candy
		n = scanner.nextInt(); // next input is amount of candy
		long[] candies = new long[(int) n]; // array for candies
		for (int i = 0; i < n; i++) { // put the types of candy into the array
			candies[i] = scanner.nextInt();
		}

		// i is the type of candies. going through all of the types of candies
		// i is 1 atm and k is 5
		for (long i = 1; i <= k; i++) { // 1 is less 5
			collected = 0;
			// iterate through the whole array length
			// the length of the candy array length is 10
			for (long j = 0; j < candies.length; j++) {
				// check if the the type of candy is in the array.
				// if it is collected is 1.
				if (candies[(int) j] == i) { // if the candy index at 0 is equal to 1 than collected will be set to 1
					collected++; //
					
				}
				// System.out.println("theses are the collected: " + collected);
				// collected is 1 don't do this ifstatement
				// collect is 0 check also check 0+1 is it equal to 10...no than missing candy ++
				if (collected == 0 && j + 1 == candies.length) {
					missingCandy++;
//					System.out.println("this is the missing candy: " + missingCandy);
//					System.out.println("this is j:" + j);
				}
				// System.out.println("theses are the collected: " + collected);
			}

		}
		// System.out.println("theses are the collected: " + collected);
		// System.out.println("these are the missing candies: " + missingCandy);

		if (missingCandy == 0) {

			System.out.println("Yay! all " + k + " type(s) of candies collected.");
		} else {
			System.out.println("Missing " + missingCandy + " type(s) of candy.");
		}

	}
}