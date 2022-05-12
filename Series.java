import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
//		int B[] = new int[3];
//		for (int i = 0; i < B.length; i++) {
//			B[i] = i * 10;
//		}
//		for (int i = 0; i < B.length; i++) {
//			System.out.println(B[i]);
//		}
//		System.out.println(Arrays.toString(B));
//		
//		int A[][] = new int[3][3];
//		for (int i = 0; i < A.length; i++) {
//			for (int j = 0; j < A[i].length; j++) {
//				A[i][j] = i+j;
//			}
//		}
//		
//		for (int i = 0; i < A.length; i++) {
//			for (int j = 0; j < A[i].length; j++) {
//				System.out.printf("%2d",A[i][j]) ;
//			}
//			System.out.println();
//		}
		
		
		
		//Series1
//		Random R = new Random();
//		double A[] = new double[10], sum = 0;
//		for (int i = 0; i < A.length; i++) {
//			A[i] = R.nextDouble(); //набираем R. и выбираем тип переменной
//			//A[i] = R.nextInt(21); //рандом целого от 0 до 20(!) включительно
//			sum +=A[i];
//		}
//		System.out.println(Arrays.toString(A));
//		System.out.println(sum);
		
		//Series2
//		Random R = new Random();
//		double B[] = new double[10], pro = 1;
//		for (int i = 0; i < B.length; i++) {
//			B[i] = R.nextDouble();
//			B[i] = R.nextInt(21);
//			pro *=B[i];
//		}
//		System.out.println(Arrays.toString(B));
//		System.out.println(pro);
		
		//Series3
//		Random R = new Random();
//		double C[] = new double[10], sum = 0, average = 0;
//		for (int i = 0; i < C.length; i++) {
//			C[i] = R.nextDouble();
//			//C[i] = R.nextInt(5);
//			sum += C[i];
//			average = sum / C.length;
//		}
//		System.out.println(Arrays.toString(C));
//		System.out.println(sum);
//		System.out.println(average);
		
		//Series4
//		Random R = new Random();
//		int N = 7;
//		double D[] = new double [N], sum = 0;
//		for (int i = 0; i < D.length; i++) {
//			//D[i] = R.nextDouble();
//			D[i] = R.nextInt(5);
//			sum += D[i];
//				}
//		System.out.println(Arrays.toString(D));
//		System.out.println(sum);

		
		
		//Series5 с рандомом и без
//		double A[] = {2.1, 1.2, 3.3, 1.4, 5.5}, sum = 0;
//		for (int i = 0; i < A.length; i++) {
//			int B = (int)A[i]; //приведение к типу INT!!!
//			System.out.print(B+ " ");
//			sum +=B; //sum = B + B
//		}
//		System.out.println("\n" +sum);

		//Series6
//		double A[] = {2.3, 1.2, 3.3, 1.4, 5.5}, pro = 1;
//		for (int i = 0; i < A.length; i++) {
//			double B = A[i]%1; //вычленение дробной части
//			System.out.print(B+ " ");
//			pro *=B; //pro = B * B
//		}
//		System.out.println("\n" +pro);
		
		//или заполнение массива рандомными элементами
//		Random R = new Random();
//		int N = 5;
//		double A[] = new double[N], pro = 1;
//		for (int i = 0; i < A.length; i++) {
//			A[i] = R.nextDouble();
//			//A[i] = R.nextInt(5); // не имеет смысла в данной задаче, т.к. дробчая часть INT = 0
//			double B = A[i]%1; //вычленение дробной части
//			System.out.print(B+ " ");
//			pro *=B; //pro = B * B
//		}
//		System.out.println("\n" +pro);
		
		//Series7 с рандомом и без
//		double A[] = {2.1, 1.7, 3.5, 1.2, 5.5}, sum = 0 ;
//		for (int i = 0; i < A.length; i++) {
//			double B = Math.round(A[i]); //огругление до целого
//			System.out.print(B+ " ");
//		sum +=B; //sum = B + B
//		}
//		System.out.println("\n" +sum);
		
		//или заполнение массива рандомными элементами
//		Random R = new Random();
//		int N = 3;
//		double A[] = new double[N], sum = 0;
//		for (int i = 0; i < A.length; i++) {
//			A[i] = R.nextDouble();
//			  //A[i] = R.nextInt(55);
//			double B = Math.round(A[i]); //округление до целого
//			System.out.print(B+ " ");
//			sum +=B; //sum = B + B
//		}
//		System.out.println("\n" +sum);
		
		
		//Series8
//		int A[] = {4, 6, 28, 4, 3, 17, 21, 1, 4, 8}, num = 0;
//		for (int i = 0; i < A.length; i++) { 
//			if (A[i]%2==0) {
//				System.out.print(A[i] + ", ");
//				num ++;
//			};
//		}
//			System.out.println("\n" +num);

		//или заполнение массива рандомными элементами
//		Random R = new Random();
//		int N = 21, num = 0;
//		int A[] = new int[N];
//		for (int i = 0; i < A.length; i++) {
//			A[i] = R.nextInt(101);
//			//System.out.print(A[i] + ", "); // - ??? как напечатать данные массива, а потом четные
//			if (A[i] % 2 == 0) {
//				System.out.print(A[i] + ", ");
//				num++;
//			}
//		}
//		System.out.println("\n" +num);
			
			
		//Series9
//		int A[] = {4, 7, 28, 4, 3, 17, 21, 1, 4, 8}, num = 0;
//		for (int i = 0; i < A.length; i++) { 
//			if (A[i]%2 != 0) {
//				System.out.print(i + ", "); //индексы в массиве начинаются с 0 (нуля)!
//				num ++;
//			};
//		}
//			System.out.println("\n" +num);
			
		//Series10
//		int A[] = { 4, 1, 3, 17, 21, 1, 4, 8 };
//		boolean flag = true;
//		for (int i = 0; i < A.length; i++) {
//			if (A[i] <= 0) {
//				flag = false;
//				break;
//			}
//		}
//		System.out.print(flag);
	
		//Series12
//		int A[] = { 4, 1, 3, 17, 21, 1, 4, 8 }, K = 2;
//		boolean flag = false;
//		for (int i = 0; i < A.length; i++) {
//			if (A[i] < K) {
//				flag = true;
//				break;
//			}
//		}
//		System.out.print(flag);
			
		//Series12
//		int A[] = { 4, -1, 4, 17, 1, 1, 4, 0 }, num = 0;
//		for (int i = 0; i < A.length; i++) {
//			if (A[i] == 0) {
//				break;
//			} num++;
//		}
//		System.out.print(num);
			
		//Series13	
//		int A[] = { 4, 3, 4, 5, 3, 3, 4, 0 }, sum = 0;
//		for (int i = 0; i < A.length; i++) {
//			if (A[i] == 0) {
//				break;
//			}
//			if ((A[i] > 0 && A[i] % 2 == 0)) {
//			sum += A[i];}
//		}
//		System.out.print(sum);
			
		//Series14	
//		int A[] = { 2, -1, 3, 17, 7, -8, 4, 0 }, num = 0, K = 4;
//		for (int i = 0; i < A.length; i++) {
//			if (A[i] == 0) {
//				break;
//			}
//			if (A[i] < K) {num++;}
//		}
//		System.out.print(num);
			
		//Series15
//		int A[] = { 2, 2, 55, 2, 29, -8, 4, 0 }, K = 27;
//		for (int i = 0; i < A.length; i++) {
//			if (A[i] == 0) {
//				System.out.println(A[i]);
//				break;
//			}
//			if (A[i] > K) {
//				System.out.println(i);
//				break;
//			}
//		}

		
		//Series16
//		int A[] = {2, 2, 57, 2, -8, 49, 0}, K = 27, N = 0;
//		for (int i = 0; i < A.length; i++) {
//			if (A[i] > K) {
//				N = i;
//			}
//			if (N == -1) {
//				System.out.println(0);
//			}
//		}
//		System.out.println(N);
			
		//Series17
//		double B = 2.5;
//		double A[] = { 1.1, 1.2, 1.5, 1.7, 3.1, B };
//		Arrays.sort(A);
//		System.out.println(Arrays.toString(A));
	
		
		
		
		
	
		//Series18
//		int A[] = { 2, 2, 2, 2, 3, 3, 4, 4, 5 }, tmp = 0;
//		for (int i = 0; i < A.length; i++) {
//			if (tmp == A[i])
//				continue;
//			System.out.println(A[i]);
//		tmp = A[i];
//		}

	}

}


