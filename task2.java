// Задача 2. Вывод всех четных чисел от 1 до 100
// Напишите метод printEvenNums, который выведет на экран все четные числа
// в промежутке от 1 до 100, каждое на новой строке.


class answer1 {
    public static void printEvenNums() {

        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }
    }
}

public class task2 {

    public static void main(String[] args) {
        answer1 ans1 = new answer1();

        ans1.printEvenNums();
    }
}