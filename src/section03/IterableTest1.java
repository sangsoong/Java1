package section03;

public class IterableTest1 {

	public static void main(String[] args) {
		
		int[] array1 = {1,2,3};
		char[] array2 = {'a', 'b'};
		float[] array3 = {0.5f, 1.1f, 2.3f};
		
		System.out.printf("%d\n", array1[0]);
		
		for(int i:array1)
			System.out.printf("%d\t", i);
		System.out.println();
		
		for(char c:array2)
			System.out.printf("%c\t", c);
		System.out.println();
		
		for(float f:array3)
			System.out.printf("%f\t", f);
		System.out.println();
		
	}

}
