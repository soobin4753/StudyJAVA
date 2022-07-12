package package_sec01_ex;

public class VariableScopeExample {

	public static void main(String[] args) {
		
		// 변수 사용 번위
		int v1 = 15;
		
		if(v1 > 10) {
			int v2;
			v2 = v1 - 10;
			System.out.println(v2);
			
			int v3 = v1 + v2 + 5; //v2를 활용하고싶다면 if문 안으로
			System.out.println(v3);
		}
//		int v3 = v1 + v2 + 5;  // v2 변수를 사용할 수 없기 때문에 컴파일 에러 발생
		// 변수는 자신이 선언된 위치로부터 자신이 속한 블록 내부에서만 사용 가능
	}

}
