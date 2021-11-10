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
        ArrayList<String> wordThing = new ArrayList<String>();

        for (int i = 0; i < wordThing.size(); i++) {
            wordThing.add(code.substring(i));
        }


        decode(code, 0);

        
    }

    public static String morseToString(String x) {
        for (int i = 0; i < morseCodes.length; i++ ) {
            if (morseCodes[i].equals(x)) {
                return alphabet[i];
            } else {
                continue;
            }
        }
        return "";
    }

    // start from front of code variable, check every letter individually, then recursively call it
    // again using substring to remove the front letter- repeat. once code.length() = 0, break.
    public static void decode(String code, int pos) {
        
        String combo = "";
        if (code.length() == 1) {
            System.out.print(morseToString(code));
        } else {
            for (int i = 0; i < code.length(); i++) {
                System.out.print(morseToString(code.substring(i)));
            }
            System.out.println(" ");
            decode(code.substring(1), pos + 1);
            decode(code.substring(0, code.length() - 1), code.length());

        }
    }
}