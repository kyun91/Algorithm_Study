package IOStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOBuf {
	public static void main(String args[]) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("입력");
		String[] line = bf.readLine().split(" ");//공백 기준으로 
		String a = line[0] + line[1];
		String b = line[2] + line[3];
		
		long ans = Long.valueOf(a) + Long.valueOf(b);
		System.out.println(ans);
		
		//백만은 7자리라 14자리는 int형을 벗어남 따라서 long으로
		//BufferedReader에는 read와 readLine만 있기 때문에, 정수는 파싱을 해야 한다.
		
	}
}
