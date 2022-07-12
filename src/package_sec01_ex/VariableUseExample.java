package package_sec01_ex;

public class VariableUseExample {

	public static void main(String[] args) {
		
		// 변수 사용
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시 " + minute + "분");
		
		System.out.println("----------------------------------");
		
		int totalMinute = (hour*60) + minute;
		System.out.println("총 " + totalMinute + "분");
		
		
		
	}

}
