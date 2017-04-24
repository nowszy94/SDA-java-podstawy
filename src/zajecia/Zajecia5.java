package zajecia;

import java.util.Random;
import java.util.Scanner;

public class Zajecia5 {
    public static void main(String[] args) {
//        randomTest();
//        Zajecia4.displayArray(getArray(10));
//        Zajecia4.displayArray(getArray(11));
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Insert value:");
//        int someValue = scanner.nextInt();
//        int anotherValue = 24;
//        Zajecia4.displayArray(getArray(someValue));
//        Zajecia4.displayArray(getArray(anotherValue));
//        Zajecia4.displayArray(getRandomArray(5, 10, 5));
//        Zajecia4.displayArray(getRandomArray(10, 10));
//        Zajecia4.displayArray(getRandomArray(10));
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Insert numberOfBooks:");
//        int numberOfBooks = scanner.nextInt();
//        System.out.println("Insert bound:");
//        int bound = scanner.nextInt();
//        System.out.println("Insert offset:");
//        int offset = scanner.nextInt();
//
//        Zajecia4.statistics(getRandomArray(10));
//        System.out.println();
//        System.out.println();
//        Zajecia4.statistics(getRandomArray(10, 15));
//        System.out.println();
//        System.out.println();
//        Zajecia4.statistics(getRandomArray(numberOfBooks, bound, offset));
//
//        printSquare(5);
//        System.out.println();
//
//        printRectangle(4, 7);
//        System.out.println();
//
//        printTriangle(5);
//        System.out.println();
//
//        printMatrixOfNumbers(4);
//        System.out.println();
//
//        chessBoard(4);
//        System.out.println();
//
//        printEmptySquare(5);
//        System.out.println();
//
//        tree(6);

        homework();
        lineOfNumbers(5);
        lineOfNumbers(7);
    }

    public static void randomTest() {
        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(10) - 5);
        System.out.println(random.nextInt(15) + 5);
    }

    public static int[] getRandomArray(int size) {
        return getRandomArray(size, Integer.MAX_VALUE);
    }

    public static int[] getRandomArray(int size, int bound) {
        return getRandomArray(size, bound, 0);
    }

    public static int[] getRandomArray(int size, int bound, int offset) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(bound) + offset;
        }
        return array;
    }

    public static int[] getArray(int value) {
        int size = value / 2;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = 2 * i + value % 2;
        }
        return array;
    }

    public static void printSquare(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printRectangle(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //*
    //* *
    //* * *
    public static void printTriangle(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 1 2 3
    // 4 5 6
    // 7 8 9
    public static void printMatrixOfNumbers(int a) {
//        int number = 1;
//        for (int i = 0; i < a; i++) {
//            for (int j = 0 ; j < a; j++) {
//                System.out.print(number + " ");
//                number++;
//            }
//            System.out.println();
//        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print((a * i) + (j + 1) + " ");
            }
            System.out.println();
        }
    }

    //1 0 0
    //0 1 0
    //0 0 1
    public static void printOneMatrix(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i == j) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    //1 0 1 0
    //0 1 0 1
    //1 0 1 0
    //0 1 0 1
    public static void chessBoard(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    //1 1 1 1
    //1     1
    //1     1
    //1 1 1 1
    public static void printEmptySquare(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if ((i == 0 || i == (a - 1)) || (j == 0 || j == (a - 1))) {
                    System.out.print("1 ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    //a = 3
    //    *
    //  * * *
    //* * * * *
    //    *
    //    *
    //    *
    public static void tree(int a) {
        for (int i = 0; i < a; i++) {
            //spacje
            for (int j = 0; j < a - i - 1; j++) {
                System.out.print("  ");
            }
            //gwiazdki
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - 1; j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }
    }

    public static void homework() {
        //losujemy liczbe z przedzialu 15 - 25
        //wywolac metode getArray()
        //uzyc wygenerowanej tablicy w metodzie Zajecia4.statistics
        //dla wylosowanej liczby - 12 wywolali metode tree(number -12)
        Random random = new Random();
        int number = (random.nextInt(10) + 15);
        int[] array = getArray(number);
        Zajecia4.statistics(array);
        tree(number - 12);
//        Zajecia4.statistics(getRandomArray(10, 10, 15));
//        System.out.println();
//        System.out.println();
//        Zajecia4.statistics(getRandomArray(10, 10, 15));
//        System.out.println();
//        System.out.println();
//        Zajecia4.statistics(getRandomArray(10, 10, 15));
//        System.out.println();
    }

    //1
    //  2
    //    3
    //      4
    public static void lineOfNumbers(int value) {
        for (int i = 0; i < value - 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            System.out.println(i + 1);
        }
    }
}
