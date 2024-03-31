package section04;

class Cat {

}

class Character {
	String charClass;

	Character(String charClass) {
		this.charClass = charClass;
	}
}

class Car {
	public int maxSpeed;
	public String carName;
	
	public void printInfo() {
		System.out.println("차량: " + carName);
		System.out.println("연식: " + maxSpeed);
	}
	
	public int returnMaxSpeed() {		
		return maxSpeed;
	}
}

public class ClassTest {
	public static void main(String[] args) {

		Cat cat = new Cat();

		// =====
		
		Character character1 = new Character("warrior");
		Character character2 = new Character("archer");
		System.out.println(character1.charClass);
		System.out.println(character2.charClass);

		// =====
		
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.maxSpeed = 200;
		car1.carName = "그랜저";
		car2.maxSpeed = 300;
		car2.carName = "벤츠";
		
		car1.printInfo();
		car2.printInfo();
		
		int car1speed = car1.returnMaxSpeed();
		System.out.println(car1speed);
	}
}
