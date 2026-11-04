package lab14;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) throws IOException {
        Random random = new Random();

        try (FileWriter f = new FileWriter("Task3.1.txt");
             FileWriter g = new FileWriter("Task3.2.txt");
             FileWriter h = new FileWriter("Task3.3.txt")) {

            for (int i = 0; i < 20; i++) {
                int num = random.nextInt(200) + 1;
                f.write(num + " ");

                if (num < 100) {
                    g.write(num + " ");
                } else {
                    h.write(num + " ");
                }
            }
        }
        System.out.println("Файлы Task3.1.txt, Task3.2.txt и Task3.3.txt успешно созданы.");
    }
}