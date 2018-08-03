package normal;

public class cardtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
creditcard urcard=new creditcard();

urcard.owner=new String ("사랑해");
System.out.println("카드소유자 : "+urcard.owner );
urcard.use(100000);
urcard.use(150000);
urcard.paybill(10000);
	}

}
