package studio2;

import java.util.Scanner; 

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("How many days do you want to play? ");
		int totalSimulations = in.nextInt();

		System.out.print("Enter Start Amount: ");
		double startAmount = in.nextDouble();

		System.out.print("Enter Win Chance: ");
		double winChance = in.nextDouble();

		System.out.print("Enter Win Limit: ");
		double winLimit = in.nextDouble();

		double i = startAmount;

		for (int j = 0; j < totalSimulations; j++) {
			int counter = 0;

			while (i < winLimit && i > 0) {
				double rand = Math.random();
				int integernum = (int) Math.round(rand * 100);
				

				if(integernum <= winChance) {
					i++;
				}
				else {
					i--;
				}
				
				counter++;
			}
			
			if (i == 0) {
				int done = j + 1;
				System.out.println("Simulation " + done + ": " + counter + " LOSE");
			}
			
			else if (i == winLimit) {
				int done = j + 1;
				System.out.println("Simulation " + done + ": " + counter + " WIN");
			}
			
			i = startAmount;
		}

	}

}
