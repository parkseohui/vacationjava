package normal;

public class gettersettertest {
public static void main(String[] args) {
	creditcard parkcard=new creditcard();
	creditcard leecard=new creditcard();
	
	parkcard.owner="뽀로로";
	parkcard.setnumber(3432_3242_5432_6444l);
	leecard.owner="케로로";
	leecard.setnumber(2343_7654_6564_3453l);
	
	parkcard.use(100000);
	leecard.use(100000);
	parkcard.paybill(50000);
	leecard.paybill(203000);
	
}
}
