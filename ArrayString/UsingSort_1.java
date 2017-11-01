package ArrayString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import javax.naming.ldap.SortControl;

public class UsingSort_1 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("���ڿ� �Է�  : ");
		String str = br.readLine();
		
		char str1[] = str.toCharArray();
		int len = str1.length;
	
		Arrays.sort(str1);
		
		boolean flag = true;
		
		for(int i=1; i<len; i++){
			if(str1[i-1] == str1[i]){
				flag = false;
				break;
			}
		}
		
		if(flag){
			System.out.println("�ߺ��� ���ڿ��� �����ϴ�.");
		}
		else{
			System.out.println("�ߺ��� ���ڿ��� �����մϴ�.");
		}
		
	}
}
