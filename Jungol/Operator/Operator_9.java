/*국어 영어 수학 컴퓨터 과목의 점수를 정수로 입력받아서 
 * 총점과 평균을 구하는 프로그램을 작성하시오. 
 * (단 평균의 소수점 이하는 버림 한다.)
 */

import java.util.*;
public class Operator_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		
		int sum = a+b+c+d;
		int avg = sum / 4 ;
		
		System.out.printf("sum %d\navg %d",sum,avg);
	}
}
