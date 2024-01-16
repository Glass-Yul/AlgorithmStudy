package algorithm.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InputTest {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String inputStr = br.readLine();
		
		StringTokenizer st = new StringTokenizer(inputStr); // 기본적으로 공백을 기준으로 짜름
		
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
		
		String[] strArr = inputStr.split(" ");
		

	}

}
