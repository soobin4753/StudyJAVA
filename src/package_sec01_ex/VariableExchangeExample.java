package package_sec01_ex;

public class VariableExchangeExample {

	public static void main(String[] args) {
		
		//변수값 교환
		int x = 3;
		int y = 5;
		System.out.println("x : " + x + ", y : " + y);
		
		System.out.println("--------------------------------------");
		
		int temp = x; // 변수 x값 3을 변수 temp에 저장
		x = y; // 변수 y값 5를 변수 x에 저장
		y = temp; // 변수 temp값 3을 변수 y에 저장
		System.out.println("x : " + x + ", y : " + y);
		
		
		
		
	}

}
