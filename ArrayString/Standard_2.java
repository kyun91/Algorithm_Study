package ArrayString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Standard_2 {
	
	
	public static boolean permutation(String str1, String str2){
		
		char st1[] = str1.toCharArray();
		int len = st1.length;
		int string[] = new int[128];
		
		if(len != str2.length()) return false;
		
		
		for(int i=0; i<len; i++){
			int value = st1[i];
			string[value]++;
		}
		
		for(int i=0; i<len; i++){
			int c = (int)str2.charAt(i);
			string[c]--;
			if(string[c] < 0){
				return false;
			}
		}
		
		return true;
	}
	
	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("첫 번째 문자열 입력 : ");
		String str1 = br.readLine();
		System.out.println("두 번째 문자열 입력 : ");
		String str2 = br.readLine();
		
		boolean flag = permutation(str1,str2);
		
		if(flag){
			System.out.println("순열이 존재한다.");
		}else{
			System.out.println("순열이 존재하지 않는다.");
		}
	}
}
