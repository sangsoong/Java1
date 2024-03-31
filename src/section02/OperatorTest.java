package section02;

public class OperatorTest {

	public static void main(String[] args) {
		/*
		 * a++ : a = a + 1
		 * a-- : a = a - 1
		 * 1 : true
		 * 0 : false
		 * !true : false
		 * a && b : (a == true) and (b == true)
		 * a || b : (a == true) or (b == true)
		 * 'a'+'b' : 'ab'
		 * 9 / 3 : 3
		 * 9 / 3.0 : 3.0
		 * 7 % 3 : 1
		 * c = (a > b)? a : b; : c = bigger
		 */

		/*
		 * dead code
		 * 
		 * num = 0;
		 * if (false) {
		 * num = 1;
		 * } else {
		 * num = 2;
		 * }
		 */

		String color = "green";
		if (color == "red") {
			System.out.println("빨강");
		} else if (color == "green") {
			System.out.println("초록");
		} else {
			System.out.println("파랑");
		}

		switch (color) {
			case "red":
				System.out.println("빨강");
				break;

			case "green":
				System.out.println("초록");
				break;

			case "blue":
				System.out.println("파랑");
				break;

			default:
				System.out.println("오류");
		}
	}

}
