import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; ++i) {
			String input = sc.next();
			
			System.out.println(input.charAt(0) - '0' + input.charAt(2) - '0');
		}
		
		sc.close();
	}
	
}
