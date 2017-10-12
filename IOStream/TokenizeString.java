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
		//StringTokenizer �������� �� ��° �������ڴ� �����ڸ� ��ū���� �����ϴ��� �����ĸ� �����Ѵ�.
		//true�� ���޵Ǹ� �����ڵ� ��ū���� ���ְ� �Ǿ� nextToken �޼ҵ��� ȣ�⿡ ���� ��ȯ �ȴ�.
		//�׷��� false�� ���޵Ǹ� �����ڴ� ��ū���� ���ֵ��� �ʴ´�.
		
		
		while(st3.hasMoreTokens())
			System.out.println(st3.nextToken());
		
		//��� : 
		// num
		// +
		// =
		// 1
		       
	}

}
