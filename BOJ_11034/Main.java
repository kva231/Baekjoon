import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			System.out.println(Math.max(b - a - 1, c - b - 1));
		}
		
		sc.close();
	}
	
}
