package section03;

import java.util.Arrays;

public class SortTest {

	public static void main(String[] args) {
		
		int[] arr = new int[100];
		
		for(int i = 0; i < arr.length; i++)
			arr[i] = (int) (Math.random()*100+1);
		for(int i:arr)
			System.out.printf("%d ", i);
		System.out.println("\n");
		
		Arrays.sort(arr);
		for(int i:arr)
			System.out.printf("%d ", i);
		System.out.println("\n");
		
	}

}
