/**
 * @author Sveta
 * @version 16.01.2022
 */
public class HomeWorkApp {

    public static void main(String[] args) {
        checkSum(10, 20);
        checkNumberPrintResult(0);
        checkNumberPrintResult(-1);
        checkPositiveNumber(0);
        printText("test text", 3);
    }
    /*
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
     * (включительно), если да – вернуть true, в противном случае – false.
     */

    static boolean checkSum(int a, int b) {
        return (a + b >= 10 && a + b <= 20);
    }

    /*
     * 2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
     * положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
     *
     */

    static void checkNumberPrintResult(int a) {
        System.out.println(a >= 0 ? "Число положительное" : "Число отрицательное");
    }

    /*
     * 3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число
     * отрицательное, и вернуть false если положительное.
     */

    static boolean checkPositiveNumber(int a) {
        return (a >= 0);
    }

    /*
     * 4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль
     * указанную строку, указанное количество раз;
     *
     */

    static void printText(String text, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(text);
        }

    }
}