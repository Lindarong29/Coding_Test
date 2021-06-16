import java.util.*;


/*영문 대문자를 입력받아 
'A'이면 “Excellent”, 
'B'이면 “Good”,
'C'이면 “Usually”, 
'D'이면 “Effort”, 
'F'이면 “Failure”, 
그 외 문자이면 “error” 라고 출력하는 프로그램을 작성하시오.*/

public class Selection_Control_Statement_7{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String A = scanner.next();
		
		switch (A){
			case "A":
				System.out.println("Excellent");
				break;
				
			case "B":
				System.out.println("Good");
				break;	
				
			case "C":
				System.out.println("Usually");
				break;
				
			case "D":
				System.out.println("Effort");
				break;
				
			case "F":
				System.out.println("Failure");
				break;
				
			default:
				// 어느 조건에도 일치하지 않았을 경우에 실행
				System.out.println("error");
				break;
	
		}


	
	}

}