import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Matrix {
	public static void main(String[] args) {

		// Заполнение матрицы последовательными числами по строкам
		int M = 5, N = 5, C = 1;
		int A[][] = new int[M][N];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				A[i][j] = C;
				C++;
			}
		}
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				System.out.printf("%4d", A[i][j]);
			}
			System.out.println();
		}

		// Вывод на печать нижней треугольной матрицы
//		int M = 5, N = 5, C = 1;
//		int A[][] = new int[M][N];
//		for (int i = 0; i < A.length; i++) {
//			for (int j = 0; j < A[i].length; j++) {
//				A[i][j] = C;
//				C++;
//			}
//		}
//		for (int i = 0; i < A.length; i++) {
//			for (int j = 0; j < i+1; j++) {
//					System.out.printf("%4d", A[i][j]);
//			}
//			System.out.println();
//		}

		// Вставка значения в массив
//		int a[] = { 1, 2, 3, 5, 6, 7, 8, 9, 9 };
//		for (int i = 8; i > 3; i--) {			//сдвинаем элементы массива "влево"
//			a[i] = a[i-1];
//		}
//		a[3] = 4; // в 4-й элемент массива присваиваем значение "4"
//		//for (int b : a) { System.out.print(b+" "); } // вывод значений массива не в виде массива, лучше вариант ниже:
//		System.out.println(Arrays.toString(a));

		// Удаление значения из массива по определенному адресу
//		int N = 9;
//		int a[] = new int [N];
//		for (int i = 0; i < N; i++) {
//			a[i] = (i + 1);
//		}
//		for (int i = 5; i < N-1; i++) { // сдвигаем элементы массива "вправо", убирая шестерку  5-я позиция элемента
//			a[i] = a[i + 1];
//		}
//		//for (int b : a) {
//			//System.out.print(b+" ");
//		//}
//		System.out.println(Arrays.toString(a));

		// Сортировка массива методом ВСПЛЫВАЮЩЕГО пузырька
//		int a[] = { 3, 5, 1, 6, 2, 4 };
//		for (int i = 0; i <  a.length - 1; i++) { 	// в этом цикле берем позицию 0, а во вложенном сверяем ее с остальными
//			int min = a[i];							// поиск минимального значения элемента, начиная с 0-й позиции (3-ка), находим 1 и меняем их местами 
//			int pos = i;							// из { 3, 5, 1, 6, 2, 4 } получается { 1, 5, 3, 6, 2, 4 }, потом осуществляем поиск со 1-й позиции и т.д.
//													// из { 1, 5, 3, 6, 2, 4 } получается { 1, 2, 3, 6, 5, 4 } и далее { 1, 2, 3, 4, 5, 6 }
//			
//			for (int j = i + 1; j < a.length; j++) {	// вложенный цикл отвечает за поиск МИНИМАЛЬНОГО значения элемента
//				if (min > a[j]) {						// он берет ВСЕ по очереди элементы и сравнивает с текущим (напрмер с 0-вым)
//					pos = j;							// если текщий меньше любого из сверяемых, то меняет их местами
//					min = a[j];
//				}
//			}
//			int t = a[i];							// временная переменная для замены значений 
//			a[i] = a[pos];
//			a[pos] = t;
//			}
//		System.out.println(Arrays.toString(a));

		// Matrix1
//		int M = 3, N = 5;
//		int A[][] = new int [M][N];
//		for (int i = 0; i < A.length; i++) {
//			for (int j = 0; j < A[i].length; j++) {
//				A[i][j] = (j + 1) * 10;
//			}
//		}
//		for (int i = 0; i < A.length; i++) {
//			for (int j = 0; j < A[i].length; j++) {
//				System.out.printf("%4d",A[i][j]) ;
//			}
//			System.out.println();
//		}

		// Matrix4
//		int A[] = { 1, 2, 3, 4 };
//		int M = 3, N =4;
//		int MN[][] = new int[M][N];
//		for (int i = 0; i < M; i++) {
//			for (int j = 0; j < N; j++) {
//				MN[i][j] = A[j];
//			}
//		}
//		for (int i = 0; i < M; i++) {
//			for (int j = 0; j < N; j++) {
//				System.out.printf("%4d", MN[i][j]);
//			}
//			System.out.println();
//		}

//		Matrix17
//		int M = 4, N = 4, K = 3, sum = 0, pro = 1;
//		int A[][] = new int[M][N];
//		for (int i = 0; i < A.length; i++) {
//			for (int j = 0; j < A[i].length; j++) {
//				A[i][j] = (j + 1);
//			}
//		}
//		for (int i = 0; i < A.length; i++) {
//			for (int j = 0; j < A[i].length; j++) {
//				System.out.printf("%4d",A[i][j]) ;
//			}
//			System.out.println();
//		}
//		
//		
//		for (int j = 0; j < A[K].length; j++) {
//			sum += A[K][j];
//			pro *= A[K][j];
//		}
//		
//		System.out.println(sum);
//		System.out.println(pro);	

//		int M = 2, Yr = 2020;
//		int m1[] = {1,3,5,7,8,10,12};
//		int m2[] = {4,6,9,11};
//		int days = 1;
//		for (int i = 0; i < m1.length; i++) {
//			if (M == m1[i]) {days = 31;
//			}
//			else if (M == 2 && (Yr % 400 == 0 || Yr % 4 == 0 && Yr % 100 != 0)) {days = 29;
//			}
//			else if (M == m2[i]) {days = 30;
//			}
//			else days = 28;	
//		}
//		System.out.println(days);
		
	}

}
