package lab12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Task1Main {
    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<>();

        students.put("Иванов", new Undergraduate("Иванов", 1, 4, 2));
        students.put("Петров", new Undergraduate("Петров", 2, 5, 1));
        students.put("Сидоров", new Undergraduate("Сидоров", 3, 3, 3));

        students.put("Смирнов", new Graduate("Смирнов", 4, 5, "Искусственный интеллект"));
        students.put("Кузнецов", new Graduate("Кузнецов", 5, 4, "Базы данных"));
        students.put("Попов", new Graduate("Попов", 6, 3, "Сети"));

        students.put("Васильев", new PhD("Васильев", 7, 5, 10));
        students.put("Соколов", new PhD("Соколов", 8, 4, 5));

        Set<String> keys = students.keySet();
        Iterator<String> iterator = keys.iterator();

        while (iterator.hasNext()) {
            String key = iterator.next();
            Student value = students.get(key);
            System.out.println("Ключ: " + key + " -> Значение: " + value);
        }
    }
}