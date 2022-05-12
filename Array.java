import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

	

public class Array {
	public static void main(String[] args) {
		
		//Array1
//		int N = 5;
//		int A[] = new int[N];
//		for (int i = 0; i < A.length; i++) {
//			A[i] = (i + 1) * 2 - 1;
//			}
//		System.out.println(Arrays.toString(A));
		
		//Array3
//		int N = 5, A = 1, D = 3;
//		int B[] = new int[N];
//		for (int i = 0; i < B.length; i++) {
//		B[i] = A + i * D;
//		}
//		System.out.println(Arrays.toString(B));
		
		//Array7
//		int A[] = { 7, 0, 2, -2, 3, 9, 4, 4, 5 };
//		for (int i = A.length - 1; i >= 0; i--) {
//			System.out.println(A[i]);
//		}

//		Array8
//		int A[] = { 7, 0, 2, -2, 3, 9, 4, 4, 5 }, sum = 0;
//		for (int i = 0; i < A.length; i++) {
//			if (A[i] % 2 != 0) {
//				sum++;
//				System.out.printf("%2d", A[i]);
//			}
//		}
//		System.out.printf("%5d", sum);
	
		
		
//		Array9	
//		int A[] = { 7, 2, 4, 6, 3, 9, 2, 8, 5 }, sum = 0;
//		for (int i = A.length - 1; i >= 0; i--) {
//			if (A[i] % 2 == 0) {
//				sum++;
//				System.out.printf("%4d", A[i]);
//			}
//		}
//		System.out.printf("%8d", sum);
	
//		Array20 // два!!! for - первый для наполнения массива значениями
//		Random R = new Random();
//		int A[] = new int[10], sum = 0, K = 0, L = 2;
////		int A[] = { 1, 3, 3, 3, 5, 7 }, sum = 0, K = 4, L = 5;
//		for (int i = 0; i < A.length; i++) {
//			A[i] = R.nextInt(21);
//		}
//		for (int i = K; i <= L; i++) {
//			sum +=A[i];
//		}
//		System.out.println(Arrays.toString(A));
//		System.out.println(sum);
	
		//Array21 // два!!! for - первый для наполнения массива значениями
//		Random R = new Random();
//		int K = 8, L = 9;
//		double A[] = new double[10];
//		double average = 0, sum = 0;
//		//double A[] = { 1, 3, 3, 3, 5, 7 }, average = 0, K = 4, L = 5; // 'ручной' массив 
//		for (int i = 0; i < A.length; i++) {
//			A[i] = R.nextInt(21);
//		}
//		for (int i = K; i <= L; i++) {
//			sum +=A[i];
//			average = sum / (L - K + 1);
//		}
//		System.out.println(Arrays.toString(A));
//		System.out.println(average);
	
		
		//Array51 1-й вариант
//		int A[] = { 1, 2, 3 }, temp = 0;
//		int B[] = { 4, 5, 6 };
//		for (int i = 0; i < A.length; i++) {
//				temp = A[i];
//				A[i] = B[i];
//				B[i] = temp;
//			}
//		System.out.println(Arrays.toString(A));
		
		
		//Array51 2-й вариант
//		int A[] = { 1, 2, 3 }, temp = 0;
//		int B[] = { 4, 5, 6 };
//		for (int i = 0; i < A.length; i++) {
//			for (int j = B.length - 1; j >= 0; j--) {
//				temp = A[i];
//				A[i] = B[j];
//				B[j] = temp;
//			}
//		}
//		System.out.println(Arrays.toString(A));
//		System.out.println(Arrays.toString(B));
	
		//Array53
//		int A[] = { 7, 2, 5 };
//		int B[] = { 4, 5, 6 };
//		int C[] = new int [3];
//		for (int i = 0; i < A.length; i++) {
//				C[i] = Math.max(A[i], B[i]);	
//		}
//		System.out.println(Arrays.toString(C));
		
		
	}
}
		
	

