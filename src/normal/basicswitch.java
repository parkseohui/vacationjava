package normal;
import java.util.Scanner;

public class basicswitch {

	public static void main(String[] args)
	{
		double x,y;
		int op;
		Scanner input=new Scanner(System.in);
		System.out.println("두 실수 입력");
		x=input.nextDouble();
		y=input.nextDouble();
		System.out.println("번호 선택 1=+, 2=-, 3=*, 4=/");
		op=input.nextInt();
		
		switch(op) {
		case 1:
			System.out.printf("%.2f+%.2f=%.2f\n",x,y,x+y);
			break;
		case 2:
			System.out.printf("%.2f-%.2f=%.2f\n",x,y,x-y);
			break;
		case 3:
			System.out.printf("%.2f*%.2f=%.2f\n",x,y,x*y);
			break;
		case 4:
			System.out.printf("%.2f/%.2f=%.2f\n",x,y,x/y);
			break;
			default:
				System.out.printf("연산자 번호를 잘못 입력했습니다.\n");
				break;
		}
	}
	
}
