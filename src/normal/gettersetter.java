package normal;

public class gettersetter {
public String owner;
private long number;
private int point;
private int balance;

public void use(int amount) {
	balance=balance+amount;
	
}
public void paybill(int amount) {
	balance=balance-amount;
	addpoint(amount);
}

private void addpoint(int amount) {
	point=point+amount/1000;
}
public long getnumber() {
	return number;
}

public void setnumber(long number) {
	if(number<1000_0000_0000_0000l) {
		System.err.println("잘못된 카드 번호입니다.");
		return;
	}
	this.number=number;
}
public int getpoint() {
	return point;
}

public void setpoint(int point) {
	this.point=point;
}

public int getbalance() {
	return balance;
}
public void setbalance(int balance) {
	this.balance=balance;
}
}
