package method;

public class method3 {

	public static void main(String[] args) {
		
		// 3. 매개변수만 있고, 리턴값은 없는 메서드 호출
		System.out.println("동생아! 200원 줄테니 새우깡 사 먹어라!");
		
//		sister_3(200); // 메서드 호출 시 리터럴을 직접 전달
		
		// 메서드 호출 시 변수에 저장된 값을 전달
		int coin = 200;
		sister_3(coin);
		
	} // main() 메서드 끝
	
	// 3. 매개변수만 있고, 리턴값은 없는 메서드 정의
	// => 리턴값이 없으므로 리턴타입 부분에 void 명시(리턴할 데이터가 없다는 의미의 특수한 타입)
	// => 외부에서 데이터를 전달하므로 데이터를 전달받아 저장할 매개변수를 선언
	//    (전달인자 데이터타입이 int 이므로 int 타입 변수 1개 선언 필요)
	public static void sister_3(int money) {
		// 전달받은 값(전달인자)은 money 변수에 저장되어 있으며
		// 메서드가 끝날 때까지 해당 변수는 유지됨
		System.out.println("동생 : 오빠가 과자 사먹으로 " + money + " 원을 줬다!");
		money -= 200;
		System.out.println("동생 : 과자 사먹고 남은돈 " + money + "원");
		
		// 리턴할 데이터가 없으므로(리턴타입 void) return 문을 생략하거나 return; 으로 사용 가능
	}
	
} // method3 클래스 끝
