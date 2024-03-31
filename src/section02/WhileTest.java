package section02;

public class WhileTest {

	public static void main(String[] args) {

		int sum = 0;
		int i = 0;

		while (true) {
			i++;
			sum += i;
			if (i == 100)
				break;
		}

		System.out.println(sum);

	}

}
