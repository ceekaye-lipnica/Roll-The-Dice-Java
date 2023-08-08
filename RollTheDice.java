import java.util.Scanner;

public class RollTheDice {

	public static void main(String[] args) {
		System.out.println("Program by: Chelsea Kate M. Lipnica");
		System.out.println("BSIT 2 - 1");
		System.out.println("Activity 2.1");

		
		Scanner dice = new Scanner(System.in);
		
		char again; 
		char ans = ' ';
		
		do {
			System.out.println("\n");
			System.out.println("+-+-+- WELCOME TO ROLL THE DICE -+-+-+");
			System.out.println("What is the sum you want to bet?");
			int bet = dice.nextInt();
		
			System.out.println("\n+-+-+-+-+-+-+ START +-+-+-+-+-+-+");
			
		for (int x = 0; x < 10; x++) {
			
			int roll1 = (int)(Math.random() * 6 ) + 1;
			int roll2 = (int)(Math.random() * 6 ) + 1;
			int sum = roll1 + roll2;
			
			if (bet < 2 || bet > 12) {
				System.out.println("\nInvalid input of numbers. Type numbers from 2 to 12 only.");
				break;
			}
			
			if (bet != sum || ans == 'y') {
				System.out.println("\nYour " + (x+1)+ " roll has the sum of " + sum);
				System.out.println("Try again? (y/n)");
				ans = dice.next().charAt(0);
			} 
			if (bet == sum ){
				System.out.println("Congratulations! You got it for the " + (x+1) + " time!");
				System.out.println("The right answer is " + sum);
				System.out.println("+-+-+-+-+-+-+ GAME OVER +-+-+-+-+-+-+");
				break;
			} 
			if (x == 9) {
				System.out.println("\n");
				System.out.println("Sorry, you ran out of tries! Better luck next time. ");
				System.out.println("+-+-+-+-+-+-+ GAME OVER +-+-+-+-+-+-+");
				break;
			}
			if (ans == 'n') {
				System.out.println("\n");
				System.out.println("Thank you for playing. See you next time!");
				break;
			}
		} 
		
		System.out.println("\n");	
		System.out.println("Do you want to play again? (y/n)");
		again = dice.next().charAt(0);
			
		} while (again == 'y');
		
		System.out.println("\n== End of Program ==");
		
		
	}

}
