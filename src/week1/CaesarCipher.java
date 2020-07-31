package week1;

public class CaesarCipher {

    public static void main(String[] args) {
        System.out.println(caesarShift("anish sachdeva", 0));
        System.out.println(caesarShift("secret message", 3));
    }

    private static String caesarShift(String string, int shift) {
        StringBuilder accumulator = new StringBuilder();
        for (int index = 0 ; index < string.length() ; index++) {
            char character = string.charAt(index);
            accumulator.append((char) ((character + shift) % 128));
        }
        return accumulator.toString();
    }
}
