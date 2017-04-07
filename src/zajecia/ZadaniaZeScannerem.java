package zajecia;

import java.util.Scanner;

public class ZadaniaZeScannerem {
    public static void main(String[] args) {
//        max();
//        isEven();
//        displayEvenElements();
//        addPreviousElement();
        fillArrayWithUnknownSize();
    }

    public static void addElementsMultipliedBy() {
        // pytamy o rozmiar tablicy
        // tworzymy tablice
        // w petli for dodajemy elementy do tablicy
            //jezeli element jest pierwszy to po prostu dodajemy
            //jezeli element nie jest pierwszy
        //na koniec wyswietlamy tylko elementy podzielne przez 3
        //oraz wyswietlamy srednia wszystkich elementow
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0 ; i< array.length; i++) {
            System.out.println("Insert next number: ");
            int element = scanner.nextInt();
            if (i == 0) {
                array[i] = element;
            } else {
                array[i] = array[i-1] * element;
            }
        }
        int sum = 0;
        for (int i = 0 ; i <array.length; i++) {
            sum += array[i];
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }
        System.out.println(sum / (double)array.length);
    }

    public static void incrementElements() {
        int[] array = {2, -3, 4, 5, 6, -7, 9, 11, 13};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i]++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void addPreviousElement() {
        int[] array = {2, -3, 4, 5, 6, -7, 9, 11, 13};
        for (int i = 1; i < array.length; i++) {
            array[i] += array[i - 1];
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    //kazdy element dodatni podzielny przez 3 mnozymy razy 2
    public static void multiplyBy2() {
        int[] array = {2, 3, 4, 5, -6, -12, 9, 11, 15, 13};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0 && array[i] > 0) {
                array[i] *= 2; //e = e * 2
            }
        }
    }

    public static void fillArrayWithKnownSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Insert next number: ");
            int number = scanner.nextInt();
            array[i] = number;
        }
    }

    public static void fillArrayWithUnknownSize() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[100];
        int element = 1;
        int i = 0;
        while (element != 0) {
            System.out.println("Insert next number. Press 0 to break.");
            element = scanner.nextInt();
            array[i] = element;
            i++;
        }
        for (int j = 0; j < i; j++) {
            System.out.println(array[j]);
        }
    }

    //co drugi element
    public static void displayEvenElements() {
        int[] array = {2, 3, 4, 5, 6, 7, 9, 11, 13};
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }

    //elementy o wartosciach nieparzystych
    public static void sumOddElements() {
        int[] array = {2, 3, 4, 5, 6, 7, 9, 11, 13};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) { //to samo co == 1
                sum += array[i];
            }
        }
        System.out.println();
    }

    //zliczamy ile jest elementow parzystych
    public static void countEvenElements() {
        int[] array = {2, 3, 4, 5, 6, 7, 9, 11, 13};
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                counter++; //counter = counter + 1 lub counter += 1
            }
        }
    }

    public static void max() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert first number: ");
        int number = scanner.nextInt();
        System.out.println("Insert second number: ");
        int number2 = scanner.nextInt();
        if (number > number2) {
            System.out.println("First number is bigger");
        } else if (number == number2) {
            System.out.println("Numbers are equal");
        } else {
            System.out.println("Second number is bigger");
        }
    }

    public static void isEven() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
