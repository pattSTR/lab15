package lab14;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        try (FileWriter writer = new FileWriter("Task2.txt")) {
            System.out.println("Введите 10 целых чисел:");
            for (int i = 0; i < 10; i++) {
                int num = scanner.nextInt();
                writer.write(num + "\n");
            }
        }

        int positiveCount = 0;
        System.out.println("\nЧисла из файла:");
        try (BufferedReader reader = new BufferedReader(new FileReader("Task2.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int num = Integer.parseInt(line.trim());
                System.out.print(num + " ");
                if (num > 0) {
                    positiveCount++;
                }
            }
        }
        System.out.println("\nКоличество положительных чисел: " + positiveCount);
    }
}