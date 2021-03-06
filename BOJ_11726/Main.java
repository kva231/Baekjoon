import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		sc.close();
		
		if (n == 1) {
			System.out.print(1);
			System.exit(0);
		}
		
		int[] dp = new int[n + 1];
		
		dp[1] = 1;
		dp[2] = 2;
		
		// 1 2 3 5 8 13 21 34 55
		for (int i = 3; i <= n; ++i) {
			dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
		}
		
		System.out.print(dp[n]);
	}

}
