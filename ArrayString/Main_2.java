package ArrayString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * [순열]
 * 1부터 5까지 적힌 카드가 한 장씩 있을때, 이 중 세장을 뽑아서 세 자리 숫자를 만드는
 * 방법의 경우의 수
 * 1.백의 자리 카드 뽑을 때 1~5 중 가능. 총 다섯 가지
 * 2.십의 자리 카드를 뽑을 때는 1. 뽑은 카드를 제외한 네 장중 하나 뽑기 가능. 총 네가지
 * 3.일의 자리 카드를 뽑을 때는 1., 2.에서 뽑은 카드를 제외한 세 장중에서 하나 뽑기 가능. 총 세가지
 * 
 *  연달아 일어나는 사건이므로 곱의 법칙을 이용하면 다섯 장의 카드 중
 *  세 장의 카드를 뽑아서 숫자를 만드는 방법은 5*4*3 = 60가지 이다.
 *  위 예에서 카드를 뽑아서 순서대로 놓은것. 이것을 순열이라고 한다.
 *  이름 그대로 순서대로 뽑아서 줄을 세우는 것을 순열이라 한다
 *  
 *  <Permutation>
 *  n개 중에서 r개를 뽑아서 줄을 세우는 걸 nPr이라고 한다.
 *  위의 예에서는 총 다섯 장의 카드 중에서 세 장을 뽑는 건 5P3이라 쓴다.
 *  
*/

/*
 * 만일 두 문자열이 서로 순열 관계에 있다면, 이 둘은 같은 문자로 구성되어 있고 순서만 다를 것이다.
 * 문자열을 따라서 정렬하면 둘 다 같은 결과가 나와야한다. 그 뒤에는 정렬된 문자열이 같은지만 비교해 보면 된다.
*/
public class Main_2 {

	public static String sort(String s){
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
	
	public static boolean permutation(String s, String t){
		if(s.length() != t.length()){
			return false;
		}
		return s.equals(t);
	}
	
	
	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("첫 번째 문자열 입력 : ");
		String str1 = br.readLine();
		str1 = sort(str1);
		System.out.println("두 번째 문자열 입력 : ");
		String str2 = br.readLine();
		str2 = sort(str2);
		
		boolean flag = permutation(str1, str2);
		
		
		if(flag){
			System.out.println("순열이 존재합니다.");
		}
		else{
			System.out.println("순열이 존재하지 않습니다.");
		}
		
		
		
	}
}
