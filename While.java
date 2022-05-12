import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		System.out.println("Task While");
		// While1
//		int A = 10, B = 3;
//		while (A > B) {
//			A -= B; // аналогично записи A = A - B
//		}
//		System.out.println(A);

		// While2
//		int A = 16, B = 3, num = 0;
//		while (A > B) {
//			A -= B; // аналогично записи A = A - B
//			num ++;
//		}
//		System.out.println(num);

		// While17
//		int N = 369;
//		while (N > 0) {
//			System.out.println(N % 10);
//			N /= 10;
//		}	

		// While18
//		int N = 12345, sum = 0, num = 0; // num - счетчик
//		while (N > 0) {
//			num = num + 1; //или num++; - счетчик внутри цикла
//			sum = sum + N % 10; // или sum +=n%10; суммирование едииц, десятков, сотен и т.д.: 5+4+3+2+1 = 15
//			N = N / 10; // или N /= 10;
//		}
//		System.out.println(num);
//		System.out.println(sum);

		// While21
		int N = 878;
		boolean flag = false;
		while (N > 0) {
			if (N % 2 != 0) {
				flag = true;
				break;
			}
			N = N / 10;
		}
		System.out.println(flag);

//				
	}

}
