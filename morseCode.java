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


        decode(code, 1);

        
    }

    public static void morseToString(String x) {
        for (int i = 0; i < morseCodes.length; i++ ) {
            if (morseCodes[i].equals(x)) {
                System.out.print(alphabet[i]);
            } else {
                continue;
            }
        }
    }

    // recursively call code in blocks , use pos int to indicate which block was used

    public static void decode(String code, int pos) {
        if (code.length() == 1) {
            System.out.print(morseToString(code));
        } else {
            for (int i = 0; i < code.length(); i++) {
                
            }

        }
    }
}