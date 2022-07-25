import java.util.Arrays;
import java.util.Scanner;

public class Proc {

	public static void main(String[] args) {

		int a = sign(2);
		System.out.println("Proc16 - Функция Sign(x): " + a);

		int KOR = rootsCount(1, 5, 1);
		System.out.println("Proc17 - Количество корней в уравнении: " + KOR);

		a = sumRange(1, 5);
		System.out.println("Proc21 - Cумма всех целых чисел от A до B включительно: " + a);

		double N = calc(4.5, 2, 4);
		System.out.println("Proc22 - Результат операции: " + N);

		boolean K;
		K = even(3);
		System.out.println("Proc24 - " + K);

		System.out.println("Proc29 - Количество цифр в числе: " + digitCount(456322));

		double D;
		System.out.println("Proc32 - Количество радиан: " + degToRad(57));

		System.out.println(("Proc50 - Количество часов, минут, секунд: " + Arrays.toString(timeToHMS(3661))));

		System.out.println(("Proc51 - Количество часов, минут, секунд с учетом добавленных: "
				+ Arrays.toString(incTime(1, 1, 50, 20))));

		boolean Y;
		Y = isLeapYear(2020);
		System.out.println("Proc52 - " + Y);

		int d;
		d = monthDays(1, 2020);
		System.out.println("Proc53 - Количество дней в месяце: " + d);

		System.out.println(("Proc54 - Предыдущая дата: " + Arrays.toString(prevDate(1, 1, 2022))));
		
		System.out.println(("Proc55 - Следующая дата: " + Arrays.toString(nextDate(31, 12, 2021))));
		
		System.out.println("Число Фибоначчи: " + fibonachi(8));
		

	}

	// Proc16
	static int sign(double x) {
		return x < 0 ? -1 : x > 0 ? 1 : 0;
	}

	// Proc17
	static int rootsCount(double A, double B, double C) {
		int KOR = 0;
		double D = (B * B) - (4 * A * C);
		if (D > 0) {
			KOR = 2;
		} else if (D < 0) {
			KOR = 0;
		} else
			KOR = 1;
		return KOR;
	}

	// Proc21
	static int sumRange(int A, int B) {
		int sum = 0;
		for (int i = A; i <= B; i++) {
			sum += i;
		}
		return sum;
	}

	// Proc22
	static double calc(double Aa, double Bb, int Op) {
//		Scanner in = new Scanner(System.in);
//		System.out.print("Введите номер операции (1 - вычитание, 2 - умножение, 3 - деление, 4 - сложение): ");
		double N = 0;
		switch (Op) {
		case 1:
			N = Aa - Bb;
			break;
		case 2:
			N = Aa * Bb;
			break;
		case 3:
			N = Aa / Bb;
			break;
		case 4:
			N = Aa + Bb;
			break;
		}
		return N;
	}

	// Proc24 (2 варианта с циклом и без)
	static boolean even(int K) {
//		if (K % 2 == 0) {
//			return true;
//		} else
//			return false;
		return K % 2 == 0;
	}

	// Proc29
	static int digitCount(int K) {
		int cocokokokocount = 0;
		while (K > 0) {
			K /= 10;
			cocokokokocount++;
		}
		return cocokokokocount;
	}

	// Proc32
	static double degToRad(double D) {
		return D * Math.PI / 180;

	}

	// Proc50
	static int[] timeToHMS(int T) {
		int x[] = { 0, 0, 0 };
		x[0] = T / 3600;
		x[1] = T / 60 % 60;
		x[2] = T % 60;
		return x;
	}

	// Proc51
	static int[] incTime(int H, int M, int S, int TSec) {
		return timeToHMS(H * 3600 + M * 60 + S + TSec);
	}

//	мой вариант
//	static int [] incTime(int TSec) {
//		int a[] = {10,59,50};
//		int tOld = a[0] * 3600 + a[1] * 60 + a[2]; //привел текущее время к секундам
//		int tNew = tOld + TSec; // прибавил к полученным секундам новые, дальше аналогично Proc50 
//		int b[] = {0,0,0};
//		b[0] = tNew/3600;
//		b[1] = tNew/60%60;
//		b[2] = tNew%60;
//		return b;
//	}

	// Proc52
	static boolean isLeapYear(int Y) {
		return Y % 400 == 0 || Y % 4 == 0 && Y % 100 != 0;
	}

	// Proc53
	static int monthDays(int M, int Y) {
		int d = 0;
		if (M == 4 || M == 6 || M == 9 || M == 11)
			d = 30;
		else if (M == 2)
			d = isLeapYear(Y) ? 29 : 28;
		else
			d = 31;
		return d;
	}

	// Proc54
	static int[] prevDate(int D, int M, int Y) {
		if (--D > 0)
			return new int[] { D, M, Y };
		if (--M > 0)
			return new int[] { monthDays(M, Y), M, Y };
		else
			return new int[] { monthDays(M, Y), 12, Y - 1 };
	}

	
	// Proc55
	static int[] nextDate(int D, int M, int Y) {
		int X = monthDays(M, Y);
		if (++D <= X)
			return new int[] { D, M, Y };
		if (++M <= 12)
			return new int[] { 1, M, Y };
		else
			return new int[] { 1, 1, Y + 1 };
	}
	
	//Фибоначчи - РЕКУРСИВНЫЙ метод - метод, который используется внутри себя
	static int fibonachi(int n){ 
	    if (n == 0){
	        return 0;
	    }
	    if (n == 1){
	        return 1;
	    }
	    else{
	        return fibonachi(n - 1) + fibonachi(n - 2); // использование метода внутри себя
	    }
	}

	
}