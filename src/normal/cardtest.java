package normal;

public class cardtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
creditcard urcard=new creditcard();

urcard.owner=new String ("�����");
System.out.println("ī������� : "+urcard.owner );
urcard.use(100000);
urcard.use(150000);
urcard.paybill(10000);
	}

}
