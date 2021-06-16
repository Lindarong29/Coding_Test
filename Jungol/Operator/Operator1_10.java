/*직사각형의 가로와 세로의 길이를 정수형 값으로 입력받은 후 
 * 가로의 길이는 5 증가시키고 세로의 길이는 2배하여 저장한 후 
 * 가로의 길이 세로의 길이 넓이를 차례로 출력하는 프로그램을 작성하시오.
 */

import java.util.*;
public class Operator1_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int W = scanner.nextInt();
		int L = scanner.nextInt();
		
		int width = W+5;
		int length = L*2;
		int area = width*length ;
		
		System.out.println("width = "+width+"");
		System.out.println("length = "+length+"");
		System.out.println("area = "+area+"");

	}

}
