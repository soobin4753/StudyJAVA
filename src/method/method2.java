package method;

public class method2 {

	public static void main(String[] args) {
		
	// 2. 매개변수는 없고, 리턴값만 있는 메서드 호출
		System.out.println("동생아 물 좀 떠온나");
//		sister_2();
		
		// 메서드 호출 후 리턴값(문자열 "물")을 result 변수에 저장
//		String result = sister_2();
//		System.out.println("동생이 가져다 준 것 : " + result);
		
		//  리턴값을 변수에 저장하지 않고 출력문 등에서 직접 사용도 가능함
//		System.out.println("동생이 가져다 준 것 : " + "물");
		System.out.println("동생이 가져다 준 것 : " + sister_2());
		
	} // main() 메서드 끝

	// 2. 매개변수는 없고, 리턴값만 있는 메서드 정의
	// => 매개변수가 없으므로 메서드명 뒤의 소괄호() 안에 아무것도 명시하지 않음
	// => 리턴값이 있으므로 리턴타입 부분에 리턴할 데이터의 타입을 명시
	//    (ex. 문자열 리턴 시 : String 타입을 명시, 정수 리턴 시 : int 타입을 명시)
	// => 주의! 리턴타입을 void 가 아닌 다른 타입으로 명시할 경우 반드시 해당 타입 값을 리턴해야한다!
	public static String sister_2() {
		System.out.println("동생 : 오빠가 물 떠오라고 시켰다");
		
		// return 문을 사용하여 리턴할 데이터를 지정하면 해당 데이터를 가지고 원래 위치로 돌아감
		
		// 1. return 문에 리터럴을 직접 지정하는 방법
//		return "물";
		
		// 2. 변수에 값을 저장한 후 return 문에 변수를 지정하는 방법
		String str = "물";
		return str;
	}
} // method2 클래스 끝
