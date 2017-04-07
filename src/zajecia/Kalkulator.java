package zajecia;


import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnozenie");
        System.out.println("4. Dzielenie");
        System.out.println("5. Wartosc Bezwzgledna"); //* z roznicy
        System.out.println("10. Suma elementow mniejszy od");
        System.out.println("100. Srednia elementow");

        Scanner scanner = new Scanner(System.in);
        int selected = scanner.nextInt();

        int a = 0;
        int b = 0;
        if (selected < 10) {
            System.out.println("Insert first number");
            a = scanner.nextInt();
            System.out.println("Insert second number");
            b = scanner.nextInt();
        } else if (selected < 100){
            System.out.println("Insert number");
            a = scanner.nextInt();
        }

        if (selected == 1) {
            sum(a,b);
        } else if (selected == 2) {
            division(a,b);
        } else if (selected == 3) {
            multiply(a,b);
        } else if (selected == 4) {
            divide(a, b);
        } else if (selected == 5) {
            abs(a, b);
        } else if (selected == 10) {
            sumLessThan(a);
        } else if (selected == 100) {
            int[] array = {1,2,3,4,5,6,7,8,1,2,6,4,2,7};
            avg(array);
        }
    }

    public static void isEven(int number) {
        
    }

    public static void avg(int[] array) {
        int sum = 0;
        for (int i = 0 ; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Avg: " + (sum/(double)array.length));
    }

    public static void sumLessThan(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            sum += i; //sum = sum + i
        }
        System.out.println("Sum: " + sum);
    }

    public static void sum(int number1, int number2) {
        System.out.println(number1 + " + " + number2 + " = " + (number1+number2));
    }

    public static void division(int number1, int number2) {
        System.out.println(number1 + " - " + number2 + " = " + (number1-number2));
    }

    public static void multiply(int number1, int number2) {
        System.out.println(number1 + " * " + number2 + " = " + (number1*number2));
    }

    public static void divide(int number1, int number2) {
        if (number2 == 0) {
            System.out.println("Incorrect data");
        } else {
            System.out.println(number1 + " / " + number2 + " = " + (number1 / (double)number2));
        }
    }

    public static void abs(int number1, int number2) {
        int abs = number1 - number2;
        if (abs < 0){
            abs *= -1;
        }
        System.out.println("|" + number1 + " - " + number2 + "| = " + abs);
    }
}
