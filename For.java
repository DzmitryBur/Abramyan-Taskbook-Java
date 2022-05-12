import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		System.out.println("Task For");

		// For1
//		int K = 3, N = 5;
//		for (int i = 0; i < N; i++)
//			System.out.println(K);

		// For2
//		int A = 1, B = 5;
//		for (int i = A; i <= B; i++) 
//			System.out.println(i);
//			System.out.println(B - A + 1);

		// For3
//		int A = -1, B = 5;
//		for (int i = B - 1; i > A; i--)
//		System.out.println(i);
//		System.out.println(B - A - 1);

		// For7
//		int A = 0, B = 5, sum = 0;
//		for (int i = A; i <= B; i++)
//			sum += i;
//			System.out.println(sum);

		// For8
//		int A = 1, B = 6, fact = 1;
//		for (int i = A; i <= B; i++)
//			fact = fact * i;
//		System.out.println(fact);

		// For10
//		double N = 5, sum = 0;
//		for (int i = 1; i <= N; i++) {
//			sum +=1./i;
//			System.out.println(sum);
//		}

		// For11
//		int N = 2 , sum = 0;
//		for (int i = 0; i < N; i++)
//		{
//			int a = (N + i) * (N + i);
//			sum += a; 
//		}
//		System.out.println(sum);

		// For12
//		double N = 5, pro = 1; //когда инициализируем УМНОЖЕНИЕ, то переменная не должна быть 0!!!
//		for (int i = 1; i <= N; i++) {
//			pro *= 1 + 0.1 * i ;
//			System.out.println(pro);
//		}

		// For13 правильный вариант
//		int N = 2;
//		double sum = 0, a, sign = -1;
//		for (int i = 1; i <= N; i++) {
//		a = 1 + 0.1 * i;
//		sign *= -1;
//		sum += a * sign;
//		}
////		System.out.println(sum);
//		System.out.printf("% .1f",sum); // округление результата до одного знака после запятой

		// For13 неправильный вариант
//		int N = 7;
//		double sum = 0, k = 1, x = 1.1;
//		for (int i = 0; i < N; i++) { 
//		sum = sum + (x * k);
//		x = x + 0.1;
//		k = k * (-1);
//		System.out.println(sum);
//		}

		// For29
//		int A = 2, B = 10, N = 4;
//		double H, sum;
//		H = (B - A) / N;
//		System.out.println(H);
//		for (int i = 0; i <= N; i++) {
//			sum = A + i * H;
//			System.out.println(sum);
//		}

		// For30
//		int N = 3;
//		double A = 1, B = 7, H, x, f;
//		H = (B - A) / N;
//		System.out.println("Длина отрезка составляет: " + H);
//		for (int i = 0; i <= N; i++) {
//		x = A + i * H;
////		System.out.println(x);
////		f = 1 - Math.sin(x);
//		System.out.println(1 - Math.sin(x));
////		}

		// For31
//		int N = 5; 
//		double A = 2;
//		for (int i = 0; i < N; i++) {// переменная цикла НЕ участвует дальше
//		A = 2 + 1 / A;
//		System.out.println(A);
//		}

		// For32
//		int N = 10;
//		double A = 1;
//		for (int i = 1; i <= N; i++) {// переменная цикла участвует дальше
//			A = (A + 1) / i;
//			System.out.println(A);
//		}
//		double n = 15.3;	
//		System.out.println(n%1);
		
	}

}
