package normal;

public class arrayinit {
public static void main(String[] args) {
	int score[];
	
	score=new int[] {1,2,3,4};//초기화할때 []안에 숫자는 안쓰기!
	for(int i=0;i<4;i++) {
	System.out.println(score[i]);
	}
}
}
