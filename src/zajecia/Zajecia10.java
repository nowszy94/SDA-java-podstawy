package zajecia;

import java.util.Random;

/**
 * Created by Szymon on 2017-04-20.
 */
public class Zajecia10 {
    public static void main(String[] args) {
//        System.out.println(find("Ala ma kota", 'm'));
//        System.out.println(find("Ala ma kota", 'k'));
//        System.out.println(find("Ala ma kota", 'z'));
//        System.out.println(countAll("Ala ma kota", 'a'));
//        System.out.println(countAll("Ala ma kota", 'm'));
//        System.out.println(countAll("Ala ma kota", 'z'));
//        Zajecia4.displayArray(stringStatistics("aaabbbcccdddzzz"));
//        int[] statistics = stringStatistics("aabbbbbcceezzz");
//        int[] statistics = stringStatistics("Ala ma kota");
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
//        printStringStatistics(statistics);
//        printStringStatistics(array);
//        System.out.println(multiplyDigits(123));
//        System.out.println(multiplyDigits(1234));
//        System.out.println(multiplyDigits(12345));
        int[][] ints = randomMatrix(3, 10, -5);
        System.out.println(avg(ints));
        double[][] avg = avg(randomMatrix(3, 10, -5), randomMatrix(3, 15, 5));
    }

    //01234
    //Ala ma kota, m -> 4
    public static int find(String message, char sentence) {
        char[] charArray = message.toCharArray();
        int i = 0;
        while (i < charArray.length && charArray[i] != sentence) {
            i++;
        }
        return (i == charArray.length) ? -1 : i;
    }

    //Ala ma kota, a -> 3
    public static int countAll(String message, char sentence) {
        char[] charArray = message.toCharArray();
        int counter = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (toLowerCase(charArray[i]) == toLowerCase(sentence)) {
                counter++;
            }
        }
        return counter;
    }

    public static char toLowerCase(char a) {
        if (a >= 65 && a <= 90) {
            a += 32;
        }
        return a;
    }

    //aabbbbbccee -> {2, 4, 2, 0, 2, ...}
    //Ala ma kota i borsuka -> {5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, ...}
    public static int[] stringStatistics(String message) {
        char[] charArray = message.toCharArray();
        int[] ints = new int[26];
        for (int i = 0; i < charArray.length; i++) {
            char charInLowerCase = toLowerCase(charArray[i]);
            if (charInLowerCase >= 97 && charInLowerCase <= 122) {
                ints[charInLowerCase - 97]++;
            }
        }
        return ints;
    }

    //{2, 4, 2, 0, 2, ...} -> aabbbbbccee
    public static void printStringStatistics(int[] array) {
//        String message = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i]; j++) {
                System.out.print((char)(i + 97));
//                message += (char) (i + 97);
            }
        }
//        System.out.println(message);
//        return message;
    }
    //123 -> 1 * 2 * 3 = 6
    public static int multiplyDigits(int number) {
        int product = 1;
        while (number != 0) {
            product *= number % 10;
            number /= 10;
        }
        return product;
    }
    public static double avg(int[][] matrix) {
        int sum = sum(matrix);
        return sum /(double)(matrix.length * matrix[0].length);
    }
    public static int sum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public static double[][] avg(int[][] matrix1, int[][] matrix2) {
        double[][] resultMatrix = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                resultMatrix[i][j] = (matrix1[i][j] + matrix2[i][j]) / 2.0;
            }
        }
        return resultMatrix;
    }

    public static int[][] randomMatrix(int size, int bounds, int offset) {
        Random random = new Random();
        int[][] resultMatrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                resultMatrix[i][j] = random.nextInt(bounds) + offset;
            }
        }
        return resultMatrix;
    }
    //DO domu
    public static String toBinary(int number) {
        return null;
    }
    //DO domu
    public static int toNumber(String binaryCode) {
        return 0;
    }
    //DO domu
    //#FF0050 -> {255, 0, 80}
    public static int[] rgbToValues(String rgb) {
        return null;
    }

    //01234567
    //Ala ma kota, kota -> 7
    public static int find(String message, String sentence) {
        return 0;
    }

    //Ala ma kota i ma tez psa, ma -> 2
    public static int countAll(String message, String sentence) {
        return 0;
    }

    //((2+2)*2) -> true
    //(2+2)*2) -> false
    //)(2+2)*2 -> false
    public static boolean checkRoundBraces(String expression) {
        return true;
    }
}