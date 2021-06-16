/*두 정수를 입력받아 첫 번째 수는 전치증가연산자를 사용하고 
 * 두 번째 수는 후치감소연산자를 사용하여 출력하고 
 * 바뀐 값을 다시 출력하는 프로그램을 작성하시오.
 */

import java.util.*;
public class Operator1_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.printf("%d %d\n",++a, b--);
		System.out.printf("%d %d",a, b);

	}

}
