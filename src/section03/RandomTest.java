package section03;

public class RandomTest {
	
	public static void main(String[] args) {
	
		// Math.random() = 0 ~ 1
		// Math.random()*30 = 0 ~ 30
		
		int[] nums = new int[10];
		
		for(int i = 0; i < nums.length; i++)
			nums[i] = (int)(Math.random()*99 + 1);
		
		for(int i:nums)
			System.out.printf("%d\t", i);
		
	}
	
}
