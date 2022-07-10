package test2;

public class Instance1 {

	// main 메서드는 자바 프로그램의 시작점이다
	// => main() 메서드에서부터 객체를 생성하고 사용할 수 있다
	// 단, main() 메서드에서만 가능한 것은 아니고
	// main() 메서드가 호출하는 다른 메서드에서도 사용 가능
	public static void main(String[] args) {
		
		/*
		 * 정의한 클래스는 설계도에 해당하므로 실제 사용을 위해서는
		 * 반드시 실체(=객체)를 생성해야 한다!
		 * => 클래스를 이용하여 메모리에 생성된 객체(실체)를
		 *    인스턴스(Instance)라고 함
		 *    
		 * < 클래스에 대한 인스턴스 생성 기본 문법 >
		 * 클래스명 변수명 = new 클래스명();
		 * 
		 * < 인스턴스 접근 기본 문법(멤버변수 접근 및 메서드 호출) >
		 * 참조변수명.멤버변수 또는 참조변수명.메서드()
		 * ※ 참조변수 = 클래스변수
		 * 
		 */
		
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.id = 1;
		s1.className = "클라우드 기반 파이썬 네트워크 정보시스템 과정";
		System.out.println("이름 : " + s1.name);
		System.out.println("번호 : " + s1.id);
		System.out.println("과정명 : " + s1.className);
		s1.study("JAVA");
		s1.rest();
		
		
		
		
		
		
	} // main() 메서드 끝

} // Ex 클래스 끝

//하나의 java 파일 내에 여러개의 클래스를 정의 할 수 있다
//단! 파일명과 동일한 이름의 클래스 외에는 public 키워드를 붙일 수 없다!

//학생(Student) 클래스 정의
//속성 : 이름(name, 문자열), 번호(id, 정수), 과정명(className, 문자열)
//메서드
//1) 공부(study()) - 리턴값 없음, 매개변수 - 과목명(subjectName, 문자열)
//					  => "XXX 과목 공부!" 출력
//2) 휴식(rest()) - 리턴값 없음, 매개변수 없음 => "휴식!" 출력

	class Student {
		String name;
		int id;
		String className;
		
		public void study(String subjectName) {
			System.out.println(subjectName + "과목 공부");
		}
		
		public void rest() {
			System.out.println("휴식");
		}
	}






















