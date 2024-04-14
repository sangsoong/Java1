package section07;

import java.util.ArrayList;

public class Smartphone {
    static class File {
        private int id;
        private String name;
        private Object content;

        File(int id, String name, Object content) {
            this.id = id;
            this.name = name;
            this.content = content;
        }

        public void info() {
            System.out.printf("id: %-3dname: %-30scontent: %s\n", id, name, content.toString());
        }
    }

    static private int id;
    static public ArrayList<File> storage = new ArrayList<File>();

    static class Calc {
        public static int plus(int a, int b) {
            return a + b;
        }

        public static int minus(int a, int b) {
            return a - b;
        }

        public static int times(int a, int b) {
            return a * b;
        }

        public static int divide(int a, int b) {
            return a / b;
        }
    }

    static class Memo {
        public static void write(String name, Object content) {
            File file = new File(id++, name, content);
            Smartphone.storage.add(file);
        }
    }
}
