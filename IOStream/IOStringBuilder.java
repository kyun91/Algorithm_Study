package IOStream;

import java.util.Scanner;

public class IOStringBuilder {
	public static void main(String args[]){
		//java.lang.StringBuilder
		//����ؾ� �ϴ� ���� ���� ��쿡��
		//StringBuilder�� �̿��� ���ڿ��� �����, ����ϴ� ���� ����.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=n; i++){
			sb.append(i+"\n");
		}
		System.out.println(sb);
	}
}
