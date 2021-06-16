import java.util.Scanner;

public class A_divide_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double A = scanner.nextDouble();
		double B = scanner.nextDouble();
		// float를 쓸 경우 소수점 아래 8자리까지만 나와서 정답으로 인정X
		// (문제 조건에서 오차범위 확인)
		
		System.out.println(A/B);
	}
	
}
