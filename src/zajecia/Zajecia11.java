package zajecia;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Szymon on 2017-04-21.
 */
public class Zajecia11 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Szymon\\projekt\\SDA-java-podstawy\\file.txt");
//        readFromFileTest(file);
//        writeToFileTest(file, "Hello World");
//        readIntegersFromFile(file);
//        System.out.println(countOddIntegers(file));
//        Scanner scanner = new Scanner(file);
//        System.out.println(scanner.nextLine());
//        System.out.println(scanner.next());
        System.out.println(countOddIntegers(file));
        System.out.println(countOddIntegers(file));
    }

    public static int countWordsIn(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        int counter = 0;
        while (scanner.hasNext()) {
            scanner.next();
            counter++;
        }
        scanner.close();
        return counter;
//        int counter = 0;
//        try (Scanner scanner = new Scanner(file)) {
//            while (scanner.hasNext()) {
//                scanner.next();
//                counter++;
//            }
//        }
//        return counter;
    }

    public static int countOddIntegers(File file) throws FileNotFoundException {
        int counter = 0;
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextInt()) {
            if (scanner.nextInt() % 2 == 1) {
                counter++;
            }
        }
        return counter;
    }

    public static int[] readIntegersFromFile(File file) throws FileNotFoundException {
        int[] array = new int[getLength(file)];
        Scanner scanner = new Scanner(file);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int getLength(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        int counter = 0;
        while (scanner.hasNext()) {
            counter++;
            scanner.nextLine();
        }
        return counter;
    }

    public static void readFromFileTest(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }

    public static void writeToFileTest(File file, String message) throws IOException {
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(message);
        }
//        try (ajdnaskdnaksdm) {
//            asdasd
//        }
    }
}
