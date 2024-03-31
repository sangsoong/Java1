package section02;

public class Ex02 {

	public static void main(String[] args) {

		for (int dan = 2; dan < 10; dan++) {
			for (int gop = 1; gop < 10; gop++)
				System.out.printf("%dx%d=%d\t", dan, gop, dan * gop);
			System.out.println();
		}
		
		System.out.println();

		for (int gop = 1; gop < 10; gop++) {
			for (int dan = 2; dan < 10; dan++)
				System.out.printf("%dx%d=%d\t", dan, gop, dan * gop);
			System.out.println();
		}

	}

}
