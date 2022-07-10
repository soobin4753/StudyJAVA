package test2;

public class Instance_test1 {

	public static void main(String[] args) {
		
		/*
		 * Account 인스턴스(acc) 생성 후 다음과 같이 초기화 및 출력
		 * ------------------------------------------
		 * 계좌번호 : 111-1111-111
		 * 예금주명 : 홍길동
		 * 현재잔고 : 10000원
		 */
		
		Account acc = new Account();
		acc.accountNo = "111-1111-111";
		acc.ownerName = "홍길동";
		acc.balance = 10000;
		
		System.out.println("계좌번호 : " + acc.accountNo);
		System.out.println("예금주명 : " + acc.ownerName);
		System.out.println("잔고 : " + acc.balance);
		
		
		
		
		

	} // main() 끝

} //test1 클래스 끝

/*
 * 은행계좌(Account) 클래스 정의
 * 멤버변수 - 계좌번호(accountNo, 문자열) -> "111-1111-111"
 * 			  예금주명(ownerName, 문자열) -> "홍길동"
 * 			  현재잔고(balance, 정수) -> 10000
 */

	class Account {
		String accountNo;
		String ownerName;
		int balance;
	}