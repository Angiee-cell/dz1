// Задача 3. Подсчет суммы цифр числа
// Напишите метод sumDigits, который принимает целое число n и возвращает
// сумму его цифр.


class answer2 {
    public int sumDigits(int n) {

        int sum = 0;

        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}


public class task3 {
    
    public static void main(String[] args) {
        int n = 12345;

        if (args.length > 0) {
            n = Integer.parseInt(args[0]);
        }

        answer2 ans2 = new answer2();
        int itresume_result = ans2.sumDigits(n);
        System.out.println(itresume_result);
    }
}
