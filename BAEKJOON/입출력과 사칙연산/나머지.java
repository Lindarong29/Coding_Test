/*
 * (A+B)%C�� ((A%C) + (B%C))%C �� ������?
 * (A��B)%C�� ((A%C) �� (B%C))%C �� ������?
 * �� �� A, B, C�� �־����� ��, ���� �� ���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * ���
 * ù° �ٿ� (A+B)%C, ��° �ٿ� ((A%C) + (B%C))%C, ��° �ٿ� (A��B)%C, ��° �ٿ� ((A%C) �� (B%C))%C�� ����Ѵ�.
 */

import java.util.*;
public class ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println( (A*B)%C );
		System.out.println( ((A%C) * (B%C))%C );
	}

}
