

/* 아래와 같이 나라 이름을 출력하고 숫자를 입력받아 
 * 해당하는 나라의 수도를 출력하는 작업을 반복하다가 
 * 해당하는 번호 이외의 숫자가 입력되면 "none"라고 출력한 후 
 * 종료하는 프로그램을 작성하시오.

* 각 나라의 수도 : 
대한민국 = 서울(Seoul)
미국 = 워싱턴(Washington)
일본 = 동경(Tokyo)
중국 = 북경(Beijing)

* 입출력시 모양은 "입·출력예"와 같이 하시오.*/

import java.util.*;
public class Repetitive_Control_Statement_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		int num = 1;
		
		while (num < 5 && num > 0) {
			
			System.out.println("1. Korea");
			System.out.println("2. USA");
			System.out.println("3. Japan");
			System.out.println("4. China");
			System.out.printf("number? ");
			
			num = scanner.nextInt();
					
			if (num==1) {
				System.out.printf("\nSeoul\n\n");
			}
			
			else if (num==2) {
				System.out.printf("\nWashington\n\n");
			}
			
			else if (num==3) {
				System.out.printf("\nTokyo\n\n");
			}
			
			else if (num==4) {
				System.out.printf("\nBeijing\n\n");
			}
			
	
			
		}
		

		System.out.printf("\nnone");
		
	}

}
