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
		System.out.println("문자열 입력 : ");
		String str = br.readLine();
		
		int len = str.length();
		
		for(int i=0; i<len; i++){
			hash.add(str.charAt(i));
		}
		
		if(len == hash.size()){
			System.out.println("중복된 문자가 없습니다.");
		}
		else{
			System.out.println("중복된 문자가 존재합니다.");
		}
		
	}
}
