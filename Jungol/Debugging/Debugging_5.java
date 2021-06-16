/*아래의 프로그램을 작성하여 디버깅을 하면서 디버깅 창에서 ① 위치에서의 a의 값이 얼마인지 구하여 그 값을 출력하는 프로그램을 작성하시오.
 * #include <stdio.h>
 * int main()
 * {
 * 		int a=5;
 * 		a+=10;
 * 		a = a-1;  --①
 * 		ptintf("%d\n",1); //여기에서 출력될 1을 ①위치에서의 a값으로 바꾸어준다.
 * 		return 0;
 */ 
public class Debugging_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		a += 10; // a=15
		a = a-1; // --① 이 문장이 끝난 다음 줄에서는 a=14지만, 
				 // ①의 위치인 이 문장에서는 a=15
		System.out.printf("%d\n",15);
	}

}
