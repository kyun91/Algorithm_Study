package IOStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IOStringToken2 {
	public static void main(String args[]) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line = bf.readLine();
		StringTokenizer st = new StringTokenizer(line,",");//ÄÞ¸¶´Â ±âÁØ
		int sum =0;
		while(st.hasMoreTokens()){
			sum += Integer.valueOf(st.nextToken());
		}
		System.out.println(sum);
	}
}
