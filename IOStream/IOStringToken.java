package IOStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IOStringToken {
	public static void main(String args[])throws IOException{
		//java.util.StringTokenizer
		//문자열을 토큰으로 잘라야 할 때 사용하면 편하다.
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String line = bf.readLine();
		StringTokenizer st = new StringTokenizer(line);//공백으로 구분한 문자 구별
		int sum =0;
		
		while(st.hasMoreTokens()){ 
			sum += Integer.valueOf(st.nextToken());
		}
		System.out.println(sum);
	}
}
