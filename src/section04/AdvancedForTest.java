package section04;

import java.util.Arrays;

public class AdvancedForTest {

	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		
		int count = 1;
		
		for(int i = 0; i < 5; i++)
			for(int j = 0; j < 5; j++)
				arr[i][j] = count++;
		
		System.out.println(Arrays.deepToString(arr));
		
		// =====
	
		int[] i = {0,1,2,3,4};
		int[] j = {0,1,2,3,4};
		
		for(int item:i) {
			for(int jtem:j) {
				arr[item][jtem] = count++;
			}
		}
		
		System.out.println(Arrays.deepToString(arr));
		
	}

}
