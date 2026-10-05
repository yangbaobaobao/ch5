import java.util.Random;
import java.util.Scanner;

public class GuessStarter {
	public static int guess;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("Guess a number between 1-100");
        ask(sc, 1, number);
    }

    public static int ask(Scanner sc, int depth, int num) {
		guess = sc.nextInt();
        if (depth == 3) {
			System.out.println("You're are off by " + Math.abs(num - guess) + ", I was thinking of " + num);
			return -1;
        }
        if (guess == num) {
			System.out.println("You guessed correctly after " + depth + " tries");
			return -1;
		}
		else {
			System.out.println("Wrong, try again, " + (3 - depth) + " tries left");
			System.out.println("Your number is too " + ((num > guess) ? "small" : "large"));
			return ask(sc, depth + 1, num);
		}
    } 
}
