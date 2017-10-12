package IOStream;

import java.util.Scanner;

public class IOStringBuilder {
	public static void main(String args[]){
		//java.lang.StringBuilder
		//출력해야 하는 것이 많은 경우에는
		//StringBuilder를 이용해 문자열을 만들고, 출력하는 것이 좋다.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=n; i++){
			sb.append(i+"\n");
		}
		System.out.println(sb);
	}
}
