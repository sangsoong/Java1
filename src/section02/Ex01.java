package section02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		int score = 0;
		String grade = "";

		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.printf("점수 입력 >>> ");
			String input = scn.nextLine();

			try {
				score = Integer.parseInt(input);
				if ((score < 0) || (score > 100))
					throw new NumberFormatException();
			} catch (NumberFormatException e) {
				System.out.println("0~100 사이의 숫자를 입력해 주세요");
				continue;
			} catch (Exception e) {
				System.out.printf("오류 : %s\n", e);
			}

			break;
		}
		scn.close();

		if (score >= 90)
			grade = "A";
		else if (score >= 80)
			grade = "B";
		else if (score >= 70)
			grade = "C";
		else if (score >= 60)
			grade = "D";
		else
			grade = "F";

		System.out.printf("성적은 %s 입니다", grade);

	}

}
