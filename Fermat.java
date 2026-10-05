import java.util.Scanner;

public class Fermat {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int n = sc.nextInt();
		
		if (n <= 2) {
			System.out.println("n has to be greater than 2!");
		}
		else {
			if (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n))
				System.out.println("Fermat is a fraud");
			else
				System.out.println("Fermat is right");
		}
    }
}
