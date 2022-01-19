package ru.geekbrains.lesson3;

import java.util.Arrays;

/**
 * @author Sveta
 * @version 18.1.2022
 */
public class HomeWorkApp {

	public static void main(String[] args) {
		replacingDigits();
		fillArray();
        changeNubber();
		fillDiagonal(10);
		System.out.println(Arrays.toString(metod5(10, 7)));
	}

	/*
	 * 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С
	 * помощью цикла и условия заменить 0 на 1, 1 на 0;
	 */
	static void replacingDigits() {
		int[] arr = { 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0 };
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] == 1 ? 0 : 1;
		}
		System.out.println(Arrays.toString(arr));
	}

	/*
	 * 2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
	 */

	static void fillArray() {
		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;

		}
		System.out.println(Arrays.toString(arr));
	}

	/*
	 * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
	 * 
	 */
	static void changeNubber() {
		int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 6) {
				arr[i] = arr[i] * 2;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	/*
	 * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью
	 * цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
	 * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть
	 * [0][0], [1][1], [2][2], …, [n][n];
	 */

	static void fillDiagonal(int len) {
		int[][] arr = new int[len][len];
		for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
			arr[i][i] = 1;
			arr[i][j] = 1;
		}
		print2DArray(arr);
	}

	/*
	 * 5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа
	 * int длиной len, каждая ячейка которого равна initialValue;
	 */

	static int[] metod5(int len, int initialValue) {
		int[] arr = new int[len];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = initialValue;
		}
		return arr;
	}

	public static void print2DArray(int[][] arr) {
		System.out.print("x ");

		for (int i = 0; i < arr[0].length; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("--");
		for (int i = 0; i < arr[0].length; i++) {
			System.out.print("--");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + "|");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
