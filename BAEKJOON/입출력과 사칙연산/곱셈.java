import java.util.*;
public class 곱셈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		int B1 = B%10; //B의 1의 자리수
		int B2 = (B%100)-B1; //B의 10의 자리수
		int B3 = (B%1000)-B2-B1; //B의 100의 자리수
		
		int R3 = A*B1; //3번 결과
		int R4 = A*B2; //4번 결과
		int R5 = A*B3; //5번 결과
		
		System.out.println(R3); //3번 결과
		System.out.println(R4/10); //4번 결과. 뒤의 0 제거해주기 위해서 10으로 나눔 (위치로 자릿수 표시하기 때문)
		System.out.println(R5/100); //5번 결과. 뒤의 00 제거 위해서 100 나눔
		System.out.println(R3 + R4 + R5); 
	}

}
