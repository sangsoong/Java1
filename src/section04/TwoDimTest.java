package section04;

public class TwoDimTest {

	public static void main(String[] args) {
		
		// 가변배열
		int[][] td1 = new int[5][5];
		
		for(int i = 0; i < 5; i++)
			for(int j = 0; j < 5; j++)
				td1[i][j] = (i+1)*10 + (j+1);
		
		for(int[] row:td1) {
			for(int column:row)
				System.out.printf("%d ", column);
			System.out.println();
		}

	}

}
