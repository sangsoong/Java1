package section01;

public class Hello {

	// 생성자
	Hello(){
		
	}

	// 메소드
	public static void main(String[] args) {
		System.out.println("Hello Java!");
		System.out.printf("%s\n", "str");
		System.out.printf("%d\n", 123);
		System.out.printf("%f\n", 0.12);

		String name = "baejunwoo";
		int age = 19;
		double height = 164.1;

		System.out.printf("%s\n", name);
		System.out.printf("%d\n", age);
		System.out.printf("%f\n", height);
	}

}