/*2개의 정수를 입력 받아서 첫 번째 수를 두 번째 수로 나눈 몫을 출력하고, 
첫 번째 수를 실수로 변환하여 두 번째 수로 나눈 값을 구한 후 반올림하여 소수 둘째 자리까지 출력하는 프로그램을 작성하고, 
프로그램 내용에 관한 설명을 주석으로 표시하시오.
*/

import java.util.*;
public class Debugging_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.printf("%d ",a/b);
		System.out.printf("%.2f",(double)a/b);
	}

}
