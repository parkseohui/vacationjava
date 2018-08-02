package normal;

public class arraycopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] copyfrom= {1,2,3,4,5,6,7,8,9};
int[] copyto= {10,20,30,40,50,60,70,80,90};

System.arraycopy(copyfrom, 4, copyto, 1, 3);
// 어떤걸 몇번째부터 어디로 어디에 몇개
for(int i=0;i<copyfrom.length;i++)
	System.out.print(copyfrom[i]+" ");
System.out.println();

for(int value:copyto)
	System.out.print(value+" ");
	}

}
