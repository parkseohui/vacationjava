package normal;

public class creditcard {
	private long number;
	public String owner;
	private int point;
	private int balance;
	
	public void use(int amount) {
		balance=balance+amount;
		System.out.println("���� ī�� ����: "+balance);
	}
	
	public void paybill(int amount) {
		balance=balance-amount;
		System.out.println("���Ҿ�: "+amount+" �����ܾ�: "+balance);
		addpoint(amount);
	}
	private void addpoint(int amount) {
		point=point+amount/1000;
		System.out.println("���ʽ� ����Ʈ: "+point);
	}
public static void main (String[] args)
{
	creditcard mycard=new creditcard();
	
	mycard.number=9238_1312_3214_5946l;
	mycard.owner="�ڼ���";
	System.out.println("ī���ȣ: "+mycard.number);
	System.out.println("ī�������: "+mycard.owner);
	mycard.use(30000);
	mycard.paybill(10000);
}
}
