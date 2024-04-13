package section06;

public class InherentTest {

    /**
     * Animal
     */
    public interface Animal {

        public abstract void cry();
    }

    public static class Dog implements Animal {
        public void cry() {
            System.out.println("멍멍");
        }
    }

    public static class Cat implements Animal {
        public void cry() {
            System.out.println("야옹");
        }
    }

    public static void main(String[] args) {
        FriendlyUnit f1 = new FriendlyUnit();

        Unit u1 = new FriendlyUnit();
        Unit u2 = f1;

        System.out.printf("f1과 u2가 같은 메모리를 참조하고있는가?: %b\n", (f1 == u2));
        System.out.println("\n====================\n");

        // ====================

        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.cry();
        cat.cry();

    }
}