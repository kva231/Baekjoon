import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while (t > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int oneLegChicken = m * 2 - n;
			
			System.out.println(oneLegChicken + " " + (m - oneLegChicken));
			
			--t;
		}
		
		sc.close();
	}
	
}
