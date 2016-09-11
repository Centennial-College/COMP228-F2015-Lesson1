import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myName = "";
		float myNumber = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name: ");

		myName = input.nextLine();
		System.out.printf("Your name is: %s", myName);
		System.out.println("\n");
		System.out.print("Rate this program from 1 to 10: ");
		myNumber = input.nextFloat();
		System.out.printf("Your Rating is: %.2f", myNumber);
	}

}