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
	int maxSpeed;
	String carName;
	String maker;
	
	Car(String maker){
		this.maker = maker;
	}
	
	void printInfo() {
		System.out.println("차량: " + carName);
		System.out.println("연식: " + maxSpeed);
		System.out.println("메이커: " + maker);
	}
	
	int returnMaxSpeed() {		
		return maxSpeed;
	}
	
	String returnMaxSpeedString() {
		String name = this.carName;
		return name + "의 최대속도: " + maxSpeed;
	}
}

public class ClassTest {
	public static void main(String[] args) {

		Cat cat = new Cat();
		System.out.println(cat);
		
		System.out.println("====================");
		// =====
		
		Character character1 = new Character("warrior");
		Character character2 = new Character("archer");
		System.out.println(character1.charClass);
		System.out.println(character2.charClass);

		System.out.println("====================");
		// =====
		
		Car car1 = new Car("a");
		Car car2 = new Car("b"); 
		
		car1.maxSpeed = 200;
		car1.carName = "그랜저";
		car2.maxSpeed = 300;
		car2.carName = "벤츠";
		
		car1.printInfo();
		System.out.println("====================");
		car2.printInfo();
		System.out.println("====================");
		
		int car1speed1 = car1.returnMaxSpeed();
		System.out.println(car1speed1);
		String car1speed2 = car1.returnMaxSpeedString();
		System.out.println(car1speed2);
		
	}
}
