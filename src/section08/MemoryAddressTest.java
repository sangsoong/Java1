package section08;

public class MemoryAddressTest {
    public static void main(String[] args) {
        String str1 = "Hello!";
        String str2 = "Hello!";
        String str3 = str2;
        String str4 = new String("Hello!");

        System.out.printf("str1: %s\n", System.identityHashCode(str1));
        System.out.printf("str2: %s\n", System.identityHashCode(str2));
        System.out.printf("str3: %s\n", System.identityHashCode(str3));
        System.out.printf("str4: %s", System.identityHashCode(str4));
    }
}
