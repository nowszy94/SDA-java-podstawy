package zajecia;

import java.util.Scanner;

public class Zajecia5 {
    public static void main(String[] args) {
        Zajecia4.displayArray(getArray(10));
        Zajecia4.displayArray(getArray(11));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert value:");
        int someValue = scanner.nextInt();
        int anotherValue = 24;
        Zajecia4.displayArray(getArray(someValue));
        Zajecia4.displayArray(getArray(anotherValue));
    }

    public static int[] getArray(int value) {
        int size = value / 2;
        int[] array = new int[size];
        for (int i = 0 ; i< array.length; i++) {
            array[i] = 2 * i + value % 2;
        }
        return array;
    }
}
