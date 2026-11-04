package lab14;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) throws IOException {
        File file = new File("Task1.txt");

        try (FileWriter writer = new FileWriter(file)) {
            writer.write("Семья: Джахджах\nМама - Наталья\nПапа - Отсутствует\nСын - Саша");
        }

        System.out.println("Имя файла: " + file.getName());
        System.out.println("Путь: " + file.getAbsolutePath());
        System.out.println("Размер: " + file.length() + " байт");
        System.out.println("Существует: " + file.exists());

        System.out.println("\nСодержимое файла:");
        try (FileReader reader = new FileReader(file)) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        }
        System.out.println();
    }
}