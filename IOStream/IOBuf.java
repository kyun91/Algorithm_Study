package IOStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOBuf {
	public static void main(String args[]) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�Է�");
		String[] line = bf.readLine().split(" ");//���� �������� 
		String a = line[0] + line[1];
		String b = line[2] + line[3];
		
		long ans = Long.valueOf(a) + Long.valueOf(b);
		System.out.println(ans);
		
		//�鸸�� 7�ڸ��� 14�ڸ��� int���� ��� ���� long����
		//BufferedReader���� read�� readLine�� �ֱ� ������, ������ �Ľ��� �ؾ� �Ѵ�.
		
	}
}
