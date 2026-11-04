package lab14;

import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) throws IOException {
        Random random = new Random();

        try (FileWriter writer = new FileWriter("Task5.txt")) {
            for (int i = 0; i < 10; i++) {
                writer.write(random.nextInt(100) + "\n");
            }
        }

        int count = 0;
        System.out.println("Числа из файла:");
        try (BufferedReader reader = new BufferedReader(new FileReader("Task5.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int num = Integer.parseInt(line.trim());
                System.out.print(num + " ");
                if (num % 2 == 0 && num % 3 == 0) {
                    count++;
                }
            }
        }
        System.out.println("\nКоличество чисел, кратных 2 и 3 одновременно: " + count);
    }
}