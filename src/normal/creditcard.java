package normal;

public class creditcard {
	private long number;
	public String owner;
	private int point;
	private int balance;
	
	public void use(int amount) {
		balance=balance+amount;
		System.out.println("현재 카드 사용액: "+balance);
	}
	
	public void paybill(int amount) {
		balance=balance-amount;
		System.out.println("지불액: "+amount+" 지불잔액: "+balance);
		addpoint(amount);
	}
	private void addpoint(int amount) {
		point=point+amount/1000;
		System.out.println("보너스 포인트: "+point);
	}
public static void main (String[] args)
{
	creditcard mycard=new creditcard();
	
	mycard.number=9238_1312_3214_5946l;
	mycard.owner="박서희";
	System.out.println("카드번호: "+mycard.number);
	System.out.println("카드소유주: "+mycard.owner);
	mycard.use(30000);
	mycard.paybill(10000);
}
}
