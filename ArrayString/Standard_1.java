package ArrayString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Standard_1 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("���ڿ� �Է� : ");
		String str = br.readLine();
		boolean answer =isUniqueChars(str);
		
		if(answer){
			System.out.println("�ߺ��� ���ڿ��� �����ϴ�.");
		}else{
			System.out.println("�ߺ��� ���ڿ��� �����մϴ�.");
		}
		
	}
	//ASCII�� 0���� 128���� ����.
	static boolean isUniqueChars(String str){
		if(str.length()>128) return false;
		boolean[] char_set = new boolean[128];
		for(int i=0; i<str.length(); i++){
			int val = str.charAt(i);
			//�迭 ���� Ȱ��.
			if(char_set[val]){
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}
}
