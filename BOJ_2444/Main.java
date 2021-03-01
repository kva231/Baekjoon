import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		sc.close();
		
		for (int i = 1; i <= n; ++i) {
			for (int j = n - i; j > 0; --j) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= 2 * i - 1; ++j) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for (int i = 1; i < n; ++i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print(" ");
			}
			
			for (int j = 2 * n - 2 * i; j > 1; --j) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
}
