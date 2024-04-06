package section04;

class Robot {
    public int add(int a, int b) {
        System.out.printf("%d + %d\n", a, b);
        return a + b;
    }

    public int sum(int val) {
        int sum = 0;
        for (int i = 0; i < val; i++) {
            if (i % 2 == 0) {
                System.out.print("(짝수) ");
            } else {
                System.out.printf("+%d ", i);
                sum += i;
            }
        }
        System.out.println();

        return sum;
    }
}