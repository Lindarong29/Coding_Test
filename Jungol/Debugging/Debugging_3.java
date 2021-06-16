/*정수로 된 3과목의 점수를 입력받아 평균을 구한 후 
 * 반올림하여 소수 첫째자리까지 출력하는 프로그램을 작성하시오.
 */

import java.util.*;
public class Debugging_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//int로 받아버리면 avg도 int로 계산이 돼. int로 계산된 값의 형태를 double로 저장하는 것 뿐이야.
		//그래서 아예 double로 받아서 double로 계산하고 double로 저장!
		double a = scanner.nextDouble(); 
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		
		double avg = (a+b+c)/3 ;
		
		System.out.printf("%.1f",avg);
	}

}
