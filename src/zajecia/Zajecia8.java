package zajecia;

public class Zajecia8 {

    public static void main(String[] args) {
//        System.out.println(countCharacterIn("Ala ma kota", 'a'));
//        System.out.println(countCharacterIn("Ala ma kota i dwa psy", 'a'));
//        System.out.println(countCharacterIn("ala ma kota i dwa psy", 'a'));
//        System.out.println(countCharacterIn("ala ma kota i dwa ply", 'l'));
//        String pokemonMessage = "AjhGFhJifFeRyhhjI";
//        System.out.println(countCapitalLetters(pokemonMessage));
//        System.out.println(countSmallLetters(pokemonMessage));
//        System.out.println(countWords("Ala ma kota"));
//        System.out.println(switchCase("Ala Ma Kota"));
//        System.out.println(ananimOf("Ala Ma Kota"));

//        long a = 2;
//
//        for (int i = 0; i < 64; i++) {
//            if (i == 60) {
//                System.out.println("ASdasdas");
//            }
//            a *= 2;
//        }
        System.out.println(sumOfNumbers("Ala ma 23 koty i 3 psy i 2 kanarki"));
    }

    public static String switchCase(String message) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 97 && charArray[i] <= 122) {
                charArray[i] -= 32;
            } else if (charArray[i] >= 65 && charArray[i] <= 90) {
                charArray[i] += 32;
            }
        }
        return String.valueOf(charArray);
    }

    public static int countWords(String message) {
        char[] charArray = message.toCharArray();
        int counter = 1;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ') {
                counter++;
            }
        }
//        return message.split(" ").length;
        return counter;
    }

    public static int countSmallLetters(String message) {
        char[] charArray = message.toCharArray();
        int counter = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 97 && charArray[i] <= 122) {
                counter++;
            }
//            counter += (charArray[i] >= 97 && charArray[i] <= 122) ? 1: 0;
        }
        return counter;
    }

    //message wspak
    public static String ananimOf(String message) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            char tmp = charArray[i];
            charArray[i] = charArray[charArray.length - 1 - i];
            charArray[charArray.length - 1 - i] = tmp;
        }
        return String.valueOf(charArray);
    }

    public static boolean isPalindrome(String message) {
        char[] charArray = message.toCharArray();
        boolean palindrome = true;
        int i = 0;
        while (palindrome && i < charArray.length / 2) {
            if (charArray[i] != charArray[charArray.length - i - 1]) {
                palindrome = false;
            }
            i++;
        }
        String a = "blabla";
        String b = "blabla";
        return palindrome;
//        return message.equals(ananimOf(message));
    }

    public static boolean startsWith(String message, String someValue) {
        char[] messageCharacters = message.toCharArray();
        char[] someValueCharacters = someValue.toCharArray();
        boolean flag = true;
        int i = 0;
        while (flag && i < someValueCharacters.length) {
            if (someValueCharacters[i] != messageCharacters[i]) {
                flag = false;
            }
//            flag = !(someValueCharacters[i] != messageCharacters[i]);
//            flag = (someValueCharacters[i] == messageCharacters[i]);
            i++;
        }
        return flag;
        /////////////////////
//        boolean flag = true;
//        int i = 0;
//        while (flag && i < someValue.length()) {
//            flag = !(message.charAt(i) != someValue.charAt(i));
//            i++;
//        }
//        return flag;
    }

    public static String toUpperCase(String message) {
        char[] charArray = message.toCharArray();
        if (charArray[0] >= 97 && charArray[0] <= 122) {
            charArray[0] = (char)(charArray[0] - 32);
        }
//        charArray[0] -= (charArray[0] >= 97 && charArray[0] <= 122) ? 32 : 0;
        return String.valueOf(charArray);
    }

    public static String toLowerCase(String message) {
        char[] charArray = message.toCharArray();
        if (charArray[0] >= 65 && charArray[0] <= 90) {
            charArray[0] = (char)(charArray[0] + 32);
        }
//        charArray[0] += (charArray[0] >= 65 && charArray[0] <= 90) ? 32 : 0;
        return String.valueOf(charArray);
    }

    //Ala ma 2 koty i 3 psy - > (normalna -> 2 + 3 + 5, super -> 2 +35)
    public static int sumOfNumbers(String message) {
        char[] charArray = message.toCharArray();
        int sum = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] > 48 && charArray[i] <= 57) {
                sum += charArray[i] - 48;
//                sum += Character.getNumericValue(charArray[i]);
            }
        }
        return sum;
    }

    //subString("Ala ma kota", 4) -> "ma kota"
    public static String subString(String message, int startIndex) {
        return null;
    }

    //subString("Ala ma kota", 4, 6) -> "ma"
    public static String subString(String message, int startIndex, int endIndex) {
        return null;
    }

    public static int countCapitalLetters(String message) {
        char[] charArray = message.toCharArray();
        int counter = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 65 && charArray[i] <= 90) {
                counter++;
            }
        }
        return counter;
    }

    public static int countCharacterIn(String message, char character) {
        int counter = 0;
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == character) {
                counter++;
            }
        }
        return counter;
    }

    public static void charAndStringTest() {
        String message = "Ala ma kota";
        char znak = 'a';
        for (int i = 0; i < 26; i++) {
            System.out.print(znak + ", ");
            znak++;
        }
        char[] charArray = message.toCharArray();
        System.out.println(message.length());
    }
}
