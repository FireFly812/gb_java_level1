/**
 * @author Sveta
 * @version 16.01.2022
 */
public class HomeWorkApp {

	public static void main(String[] args) {
		checkSum(10, 20);
		checkNumberPrintResult(-1);
		checkPositiveNumber(0);
		printText("test text", 3);
	}
	/*
	 * 1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
	 * (включительно), если да – вернуть true, в противном случае – false.
	 */

	public static boolean checkSum(int a, int b) {
		if (a + b >= 10 && a + b <= 20) {
			return true;
		} else
			return false;
	}

	// вариант 2
	public static boolean checkSumVar2(int a, int b) {
		int c = a + b;
		return c >= 10 && c <= 20;
	}

	/*
	 * 2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
	 * положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
	 * 
	 */

	public static void checkNumberPrintResult(int a) {
		if (a >= 0) {
			System.out.println("Число положительное");
		} else {
			System.out.println("Число отрицательное");
		}
	}

	/*
	 * 3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число
	 * отрицательное, и вернуть false если положительное.
	 */

	static boolean checkPositiveNumber(int a) {
		if (a >= 0) {
			return true;
		} else
			return false;
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