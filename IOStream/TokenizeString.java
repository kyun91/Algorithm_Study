package IOStream;

import java.util.StringTokenizer;

public class TokenizeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phoneNum = "TEL 82-02-997-2059";
		String javaCode = "num+=1";
		
		System.out.println("First Result.......");
		StringTokenizer st1 = new StringTokenizer(phoneNum);
		while(st1.hasMoreTokens())
			System.out.println(st1.nextToken());
		
		System.out.println("\nSecond Result.......");
		StringTokenizer st2 = new StringTokenizer(phoneNum," -");
		
		while(st2.hasMoreTokens())
			System.out.println(st2.nextToken());
		
		System.out.println("\nThird Result.......");
		StringTokenizer st3 = new StringTokenizer(javaCode,"+=", true);
		//StringTokenizer 생성자의 세 번째 전달인자는 구분자를 토큰으로 간주하느냐 마느냐를 결정한다.
		//true가 전달되면 구분자도 토큰으로 간주가 되어 nextToken 메소드의 호출에 의해 반환 된다.
		//그러나 false가 전달되면 구분자는 토큰으로 간주되지 않는다.
		
		
		while(st3.hasMoreTokens())
			System.out.println(st3.nextToken());
		
		//결과 : 
		// num
		// +
		// =
		// 1
		       
	}

}
