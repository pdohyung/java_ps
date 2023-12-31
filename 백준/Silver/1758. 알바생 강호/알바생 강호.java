import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Integer[] tip = new Integer[n];

		for (int i = 0; i < n; i++)
			tip[i] = Integer.parseInt(br.readLine());

		Arrays.sort(tip, Collections.reverseOrder());

		long result = 0;
		for (int i = 0; i < n; i++) {
			int give = tip[i] - i;

			if (give >= 0)
				result += give;
		}
		System.out.println(result);
	}
}