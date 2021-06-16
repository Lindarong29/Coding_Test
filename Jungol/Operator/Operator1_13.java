/*민수와 기영이의 키와 몸무게를 입력받아 
 * 민수가 키도 크고 몸무게도 크면 1 그렇지 않으면 0을 
 * 출력하는 프로그램을 작성하시오.
 * (JAVA는 1 이면 true, 0 이면 false를 출력한다.)
 */

import java.util.*;
public class Operator1_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int minsu_cm = scanner.nextInt();
		int minsu_kg = scanner.nextInt();
		int giyoung_cm = scanner.nextInt();
		int giyoung_kg = scanner.nextInt();
		
		if ((minsu_cm>giyoung_cm)&&(minsu_kg>giyoung_kg)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
