import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			System.out.println("You " + ((a < b+c || b < a+c || c < a+b) ? "can " : "cannot ") + "make a triangle");
		}
	}
}
