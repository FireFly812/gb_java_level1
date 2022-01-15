package ru.geekbrains.lesson1;

/**
 * @author Sveta
 */
public class HomeWorkApp {
	public static void main(String[] args) {
		printThreeWords();
		checkSumSign();
		printColor();
		compareNumbers();
	}

	public static void printThreeWords() {
		System.out.println("Orange");
		System.out.println("Banana");
		System.out.println("Apple");
	}

	public static void checkSumSign() {
		int a = -2;
		int b = 0;
		int c = a + b;
		System.out.println(c < 0 ? "Сумма отрицательная" : "Сумма положительная");
	}

	public static void printColor() {
		int value = 101;
		if (value <= 0) {
			System.out.println("Красный");
		}
		if (value > 0 && value <= 100) {
			System.out.println("Желтьй");
		}
		if (value > 100) {
			System.out.println("Зеленый");
		}
	}

	public static void compareNumbers() {
		int a = 20;
		int b = 20;
		if (a >= b) {
			System.out.println("a >= b");
		} else {
			System.out.println("a < b");
		}
	}
}
