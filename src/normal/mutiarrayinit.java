/*레기드 배열
 * 레기드배열 선언
 * 레기드배열 초기화
 */
package normal;

public class mutiarrayinit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] rag = new int[2][];
		rag[0] = new int[2];
		rag[1] = new int[3];

		rag[0][0] = 1;
		rag[0][1] = 2;
		rag[1][0] = 3;
		rag[1][1] = 4;
		rag[1][2] = 5;

		for (int i = 0; i < rag.length; i++) {
			for (int j = 0; j < rag[i].length; j++)
				System.out.printf("%d ", rag[i][j]);
			System.out.println("");
		}

		int rag2[][] = { { 1, 2 }, { 3, 4, 5 } };

		for (int i = 0; i < rag.length; i++) {
			for (int j = 0; j < rag[i].length; j++)
				System.out.printf("%d ", rag[i][j]);
			System.out.println("");
		}

	}

}
