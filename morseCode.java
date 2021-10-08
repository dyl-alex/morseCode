import java.util.*;
class morseCode {
    public static String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
    "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
    "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8",
    "9", "0"};
    public static String[] morseCodes = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
    "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
    "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
    "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
    "-....", "--...", "---..", "----.", "-----"};
    public static void main(String args[]) {
        Scanner kbReader = new Scanner(System.in);
        System.out.println("Please enter your code");
        String code = kbReader.nextLine();

        decode(code, morseCodes, alphabet);
    }

    public static void decode(String code, String[] decrypter, String[] alphabet) {
        for (int i = 0; i < decrypter.length; i++) {
          
        }
    }
}