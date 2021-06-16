/*실수로 된 3과목의 점수를 입력받아 
 * 총점은 정수부분의 합계를 출력하고, 평균은 실수의 평균을 구한 뒤 
 * 정수부분만 출력하는 프로그램을 작성하시오.
 */

import java.util.*;

public class Debugging_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		double a = scanner.nextDouble(); 
		double b = scanner.nextDouble(); 
		double c = scanner.nextDouble(); 
		
		int sum = ((int)a + (int)b + (int)c);
		double avg = (a+b+c)/3 ;
		
		System.out.printf("sum %d\n",sum);
		System.out.printf("avg %d",(int)avg);
	}

}
