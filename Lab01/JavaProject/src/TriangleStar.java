import java.util.Scanner;
public class TriangleStar {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please input n:");
		int n = keyboard.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println(" ".repeat(n-1-i) + "*".repeat(2*i+1));
		}
		
		
		keyboard.close();
	}
}