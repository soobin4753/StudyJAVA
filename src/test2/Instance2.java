package test2;

public class Instance2 {

	public static void main(String[] args) {
		Person p = new Person();
		p.name = "홍길동";
		p.age = 20;
		p.print();
		
		
		
	} // main() 끝
	
	
	
	

} //Instance2 클래스 끝

//사람(Person) 클래스 정의

	class Person {
		// 멤버변수 선언
		String name;
		int age;
		
		// 메서드 정의
		// 자신의 인스턴스에 저장된 이름, 나이를 출력하는 print() 메서드 정의
		// => 매개변수 없음, 리턴값 없음
		public void print() {
			System.out.println("이름 : " + name);
			System.out.println("나이 : " + age);
		}
		
	}
