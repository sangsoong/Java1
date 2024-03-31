package section02;

public class ForTest {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0)
				sum += i;
		}

		System.out.printf("0~99 사이 2의 배수의 합계: %d", sum);
		
	}

}
