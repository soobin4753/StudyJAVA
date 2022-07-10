package test2;

public class Instance2_test2 {

	public static void main(String[] args) {
		
		Account1 acc1 = new Account1();
		acc1.accountNo = "111-1111-1111";
		acc1.ownerName = "홍길동";
		acc1.balance = 10000;
		acc1.showAccountInfo();
		
		
		
		
		

	} // main() 끝

} // test2 클래스 끝

/*
 * 은행계좌(Account) 클래스 정의
 * 멤버변수 - 계좌번호(accountNo, 문자열) -> "111-1111-111"
 * 			  예금주명(ownerName, 문자열) -> "홍길동"
 * 			  현재잔고(balance, 정수) -> 10000
 * 
 * 메서드
 * - showAccountInfo() => 리턴값 없음, 매개변수 없음
 * 	 => 계좌번호, 예금주명, 현재잔고를 출력하는 메서드 정의
 *   ex) 계좌번호 : 111-1111-111
 *       예금주명 : 홍길동
 *       현재잔고 : 10000원	
 */

	class Account1 {
		String accountNo;
		String ownerName;
		int balance;
		
		public void showAccountInfo() {
			System.out.println("계좌번호 : " + accountNo);
			System.out.println("예금주명 : " + ownerName);
			System.out.println("잔고 : " + balance + "원");
		}
	}
