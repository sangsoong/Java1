package section08;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int[][] ma = new int[3][3];
        int count = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ma[i][j] = count++;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(ma[i][j]);
            }
            System.out.println();
        }
    }
}
