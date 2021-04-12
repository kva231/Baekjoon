import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		HashMap<String, String> map = new HashMap<>();
		
		for (int i = 0; i < n; ++i) {
			st = new StringTokenizer(br.readLine());
			
			map.put(st.nextToken(), st.nextToken());
		}
		
		StringBuilder answer = new StringBuilder();
		
		for (int i = 0; i < m; ++i) {
			answer.append(map.get(br.readLine())).append("\n");
		}
		
		br.close();
		
		System.out.print(answer);
	}

}