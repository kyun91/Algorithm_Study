package ArrayString;

public class StringToChar {
	//toCharArray() ���ڹ迭�� ��ȯ�ϴ� �޼ҵ� ���

	String line_data = new String();
	char [] data = line_data.toCharArray();
	 
	 public static void main(String[] args){

	  String name="Hello World";         // ���ڿ� ��ü
	  char[] a = name.toCharArray(); // ���ڿ��� ���ڹ迭�� ��ȯ
	  String s = new String(a);          //���ڹ迭 ���ڿ��� ��ȯ
	  System.out.println(s);  
	}
	
}
