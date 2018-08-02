/*2차원 행렬의 가로를 셀때는 mtrx[0].length
 * 행렬의 크기는 행이 몇개인지 나온다 mtrx.length
 */
package normal;

public class multiarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int mtrx[][];

mtrx=new int[2][3];

mtrx[0][0]=3; mtrx[0][1]=4; mtrx[0][2]=5;
mtrx[1][0]=6; mtrx[1][1]=7; mtrx[1][2]=8;

for(int i=0;i<mtrx.length;i++) {
	for(int j=0;j<mtrx[0].length;j++)
		System.out.print(mtrx[i][j]+" ");
System.out.println("");
	}
	}
}
