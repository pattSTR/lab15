package lab14;

import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        try (FileWriter writer = new FileWriter("Task4.txt")) {
            System.out.println("Введите 15 значений концентрации:");
            for (int i = 0; i < 15; i++) {
                double value = scanner.nextDouble();
                writer.write(value + "\n");
            }
        }

        double sum = 0;
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("Task4.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sum += Double.parseDouble(line.trim());
                count++;
            }
        }

        double average = sum / count;
        System.out.println("Средняя концентрация: " + average);
    }
}