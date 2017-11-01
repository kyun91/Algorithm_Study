package ArrayString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Standard_1 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("문자열 입력 : ");
		String str = br.readLine();
		boolean answer =isUniqueChars(str);
		
		if(answer){
			System.out.println("중복된 문자열이 없습니다.");
		}else{
			System.out.println("중복된 문자열이 존재합니다.");
		}
		
	}
	//ASCII는 0부터 128까지 포함.
	static boolean isUniqueChars(String str){
		if(str.length()>128) return false;
		boolean[] char_set = new boolean[128];
		for(int i=0; i<str.length(); i++){
			int val = str.charAt(i);
			//배열 공간 활용.
			if(char_set[val]){
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}
}
