package ArrayString;

public class StringToChar {
	//toCharArray() 문자배열로 변환하는 메소드 사용

	String line_data = new String();
	char [] data = line_data.toCharArray();
	 
	 public static void main(String[] args){

	  String name="Hello World";         // 문자열 객체
	  char[] a = name.toCharArray(); // 문자열을 문자배열로 변환
	  String s = new String(a);          //문자배열 문자열로 변환
	  System.out.println(s);  
	}
	
}
