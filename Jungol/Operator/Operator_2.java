/* 정수 2개를 입력받아서 첫 번째 수에는 100을 증가시켜 저장하고 
 * 두 번째 수는 10으로 나눈 나머지를 저장한 후 
 * 두 수를 차례로 출력하는 프로그램을 작성하시오.*/

import java.util.*;
public class Operator_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int c = a+100;
		int d = b%10;
		
		System.out.println(""+c+" "+d+"");
	}

}
