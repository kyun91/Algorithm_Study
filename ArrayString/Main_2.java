package ArrayString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * [����]
 * 1���� 5���� ���� ī�尡 �� �徿 ������, �� �� ������ �̾Ƽ� �� �ڸ� ���ڸ� �����
 * ����� ����� ��
 * 1.���� �ڸ� ī�� ���� �� 1~5 �� ����. �� �ټ� ����
 * 2.���� �ڸ� ī�带 ���� ���� 1. ���� ī�带 ������ �� ���� �ϳ� �̱� ����. �� �װ���
 * 3.���� �ڸ� ī�带 ���� ���� 1., 2.���� ���� ī�带 ������ �� ���߿��� �ϳ� �̱� ����. �� ������
 * 
 *  ���޾� �Ͼ�� ����̹Ƿ� ���� ��Ģ�� �̿��ϸ� �ټ� ���� ī�� ��
 *  �� ���� ī�带 �̾Ƽ� ���ڸ� ����� ����� 5*4*3 = 60���� �̴�.
 *  �� ������ ī�带 �̾Ƽ� ������� ������. �̰��� �����̶�� �Ѵ�.
 *  �̸� �״�� ������� �̾Ƽ� ���� ����� ���� �����̶� �Ѵ�
 *  
 *  <Permutation>
 *  n�� �߿��� r���� �̾Ƽ� ���� ����� �� nPr�̶�� �Ѵ�.
 *  ���� �������� �� �ټ� ���� ī�� �߿��� �� ���� �̴� �� 5P3�̶� ����.
 *  
*/

/*
 * ���� �� ���ڿ��� ���� ���� ���迡 �ִٸ�, �� ���� ���� ���ڷ� �����Ǿ� �ְ� ������ �ٸ� ���̴�.
 * ���ڿ��� ���� �����ϸ� �� �� ���� ����� ���;��Ѵ�. �� �ڿ��� ���ĵ� ���ڿ��� �������� ���� ���� �ȴ�.
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
		System.out.println("ù ��° ���ڿ� �Է� : ");
		String str1 = br.readLine();
		str1 = sort(str1);
		System.out.println("�� ��° ���ڿ� �Է� : ");
		String str2 = br.readLine();
		str2 = sort(str2);
		
		boolean flag = permutation(str1, str2);
		
		
		if(flag){
			System.out.println("������ �����մϴ�.");
		}
		else{
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
		
		
		
	}
}
