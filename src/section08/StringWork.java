package section08;

class StringWork {
    public static String removeInt(String str) {
        String text = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int asciiNum = ch;
            if ((asciiNum >= 65) && (asciiNum <= 90) || (asciiNum >= 97) && (asciiNum <= 122)) {
                text += ch;
            } else {
                text += " ";
            }
        }

        return text;
    }
}