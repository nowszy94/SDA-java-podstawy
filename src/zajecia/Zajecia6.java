package zajecia;

import java.util.Random;
import java.util.Scanner;

public class Zajecia6 {
    public static void main(String[] args) {
//        Random random = new Random();
//        int result = game(random.nextInt(100));
//        System.out.println("You finished in " + result + " steps.");
        System.out.println("3 " + numberOfDigits(357));
        System.out.println("4 " + numberOfDigits(3576));
        System.out.println("5 " + numberOfDigits(35767));
        System.out.println("6 " + numberOfDigits(357678));
        System.out.println("8 " + numberOfDigits(35767123));
        System.out.println("1 " + numberOfDigits(2));
        System.out.println("2 " + numberOfDigits(34));
        System.out.println("1 " + numberOfDigits(0));
    }

    public static int numberOfDigits(int number) {
        int counter = 0;
        while (number != 0) {
            number /= 10;
            counter++;
        }
        return counter;
    }

    public static int sumOfDigits(int number) {
        return 0;
    }

    //zadanie domowe
    //-10, 20
    public static int sumOfRandom(int value) {
        return 0;
    }

    public static int game(int number) {
        Scanner scanner = new Scanner(System.in);
        int numberFromUser = -1;
        int stepsCounter = 0;
        while (numberFromUser != number) {
            System.out.println("Insert next number<0-99>: ");
            numberFromUser = scanner.nextInt();
            stepsCounter++;

            if (numberFromUser < number) {
                System.out.println("Number is to low");
            } else if (numberFromUser > number) {
                System.out.println("Number is to big");
            }
        }
        return stepsCounter;
    }

    public static void whileTest() {
        int number = 10;
        int counter = 0;
        Random random = new Random();
        while (number > 0) {
            counter++;
            number -= random.nextInt(3);
//            number = number - random.nextInt(3);
        }
        System.out.println(counter);

    }


    public static boolean sumUntil(int[] array, int sum) {
        int arraySum = 0;
        int i = 0;
        while (arraySum < sum && i < array.length) {
            arraySum += array[i];
            i++;
        }
//        if (arraySum < sum) {
//            return false;
//        } else {
//            return true;
//        }

        return arraySum >= sum;
    }

    public static boolean avgUntil(int[] array, int avg) {
        int arraySum = array[0];
        int i = 1;
        while (arraySum/i < avg && i < array.length) {
            arraySum += array[i];
            i++;
        }
        return arraySum/i >= avg;
    }

    public static void printPowersOf2(int number) {
        int value = 1;
        while (value < number) {
            System.out.println(value);
            value *= 2;
        }
    }

}














