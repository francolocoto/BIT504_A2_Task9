import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
				System.out.println("What is your name? ");
				String input = scanner.next();
				System.out.println("Hello, " + input + "!");
				
				System.out.println("It is nice to meet you!\n");
				System.out.println("What do you like to order:\n" +
				"1. Chocolate\n2. Vanilla\n3. Strawberry.\n");


	}
}
