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

    // start from front of code variable, check every letter individually, then recursively call it
    // again using substring to remove the front letter- repeat. once code.length() = 0, break.
    public static void decode(String code, String[] decrypter, String[] alphabet) {
        if (code.length() == 0) {
            System.out.println("end");
        } else {
            for (int i = 0; i < code.length(); i++) {
                for (int j = 0; j < decrypter.length; j++) {
                    if ((code.substring(0, i)).equals(decrypter[j])) {
                        System.out.print(alphabet[j] + " ");
                    } else {
                        continue;
                    }
                }
            }
            System.out.println("");
            decode(code.substring(1,code.length() - 1), decrypter, alphabet);
        }
    }
}