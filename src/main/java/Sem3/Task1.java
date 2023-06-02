package Sem3;

// Задание. Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task1 {
    static Random random = new Random();
    static List<Integer> numbers = new ArrayList<>();
    static List<Integer> list = new ArrayList<>();
    static double average = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }

        for (int number1 : numbers) {
            if (number1 % 2 != 0) {
                list.add(number1);
            }
        }

        System.out.println("Дан произвольный список целых чисел: " + numbers);
        System.out.println("Список целых чисел без чётных чисел: " + list);
        System.out.println("Минимальное значение: " + Collections.min(numbers));
        System.out.println("Максимальное значение: " + Collections.max(numbers));

        for (int i = 0; i < numbers.size(); i++) {
            average = average + numbers.get(i);
        }
        System.out.println("Среднее значение: " + average/numbers.size());
    }
}