import java.util.*;
public class ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		int B1 = B%10; //B�� 1�� �ڸ���
		int B2 = (B%100)-B1; //B�� 10�� �ڸ���
		int B3 = (B%1000)-B2-B1; //B�� 100�� �ڸ���
		
		int R3 = A*B1; //3�� ���
		int R4 = A*B2; //4�� ���
		int R5 = A*B3; //5�� ���
		
		System.out.println(R3); //3�� ���
		System.out.println(R4/10); //4�� ���. ���� 0 �������ֱ� ���ؼ� 10���� ���� (��ġ�� �ڸ��� ǥ���ϱ� ����)
		System.out.println(R5/100); //5�� ���. ���� 00 ���� ���ؼ� 100 ����
		System.out.println(R3 + R4 + R5); 
	}

}
