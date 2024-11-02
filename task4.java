// Задача 4*. Нахождение максимального из трех чисел
// Реализуйте две функции:
// 1. Функция findMaxOfTwo должна принимать два числа и возвращать
// максимальное из них, используя только знак сравнения.
// 2. Функция findMaxOfThree должна принимать три числа и находить
// максимальное из них, используя первую функцию.


class answer3 {
    public int findMaxOfTwo(int a, int b) {
        
        return (a > b) ? a : b;
    }

    public int findMaxOfThree(int a, int b, int c) {
        return findMaxOfTwo(findMaxOfTwo(a, b), c);

    }
}


public class task4 {
    
    public static void main(String[] args) {
        int a = 5, b = 10, c = 3;

        if (args.length == 3) {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            c = Integer.parseInt(args[2]);
        }

        answer3 ans3 = new answer3();
        int res = ans3.findMaxOfThree(a, b, c);
        System.out.println(res);
    }
}
