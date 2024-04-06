package section05;

public class RandomTest {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int sum = 0;

        for (int i = 0; i < 100; i++) {
            int ran = (int) ((Math.random() * 10000) % 10) + 1;
            arr[i] = ran;
            sum += ran;
        }

        for (int i = 0; i < 100; i++) {
            System.out.printf("%d ", arr[i]);
        }

        System.out.println();
        System.out.println(sum);
        System.out.println(sum / 100);
    }
}
