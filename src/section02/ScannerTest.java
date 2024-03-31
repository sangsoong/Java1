package section02;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.printf("값 입력 >>> ");
		String input = scn.nextLine();
		scn.close();
		
		System.out.printf("입력값은 \'%s\' 입니다.", input);
		
	}

}
