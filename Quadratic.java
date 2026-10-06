import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			double desc = Math.pow(b, 2) - 4 * a * c;
			if (desc < 0) {
				System.out.println("No Solution");
			}
			else {
				double sol1 = (-b + Math.pow(desc, 0.5)) / (2.0 * a);
				double sol2 = (-b + Math.pow(desc, 0.5)) / (2.0 * a);
				System.out.println("Solutions on x = " + ((desc == 0) ? sol1 : (sol1 + " , " + sol2)));
			}
		}
	}
}
