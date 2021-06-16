//세 개의 정수를 입력 받아서 합계와 평균을 출력하시오. 
//(단 평균은 소수 이하를 버리고 정수부분만 출력한다.)
/*출력 예
 * sum : 68
 * avg : 22 */

import java.awt.print.Printable;
import java.util.*;
public class Operator_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int sum = a+b+c ;
		int avg = sum / 3;
		System.out.println("sum : "+sum+"");
		System.out.println("avg : "+avg+"");
		
	}

}
