package ArrayString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main_1 {
	public static void main(String args[]) throws IOException{
		Set<Object> hash = new HashSet<Object>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("���ڿ� �Է� : ");
		String str = br.readLine();
		
		int len = str.length();
		
		for(int i=0; i<len; i++){
			hash.add(str.charAt(i));
		}
		
		if(len == hash.size()){
			System.out.println("�ߺ��� ���ڰ� �����ϴ�.");
		}
		else{
			System.out.println("�ߺ��� ���ڰ� �����մϴ�.");
		}
		
	}
}
