import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		System.out.println("Задачи If");

		// if1
		int a = 1;
		if (a > 0) {a++;}
		// или if (a > 0) {a = a + 1;}
		System.out.println(a);

		// if2
		int a = -2;
		if (a > 0) {
			a++;
		} else {
			a = a - 2;
		}
		System.out.println(a);

		// if3
		int a = 0;
		if (a > 0) {
			a++;
		} else if (a < 0) {
			a = a - 2;
		} else {
			a = 10;
		}
		System.out.println(a);

		// if4
		int a = 2, b = 3, c = 4, n = 0;
		if (a > 0) {
			n++;
		}
		if (b > 0) {
			n++;
		}
		if (c > 0) {
			n++;
		}
		System.out.println(n);

		// if5
		int a = 1, b = 3, с = -5, p = 0, o = 0;
		if (a > 0) {
			p++;
		}
		if (b > 0) {
			p++;
		}
		if (с > 0) {
			p++;
		}
		o = 3 - p;
		System.out.println(p);
		System.out.println(o);

		// if11
		int A = 7, B = 6;
		if (A != B) {
			A = B = Math.max(A, B);
		} else {
			A = B = 0;
		}
		System.out.println(A);
		System.out.println(B);

		// if22 - 1) можно просто взять 4 if
		int x = -3, y = 3, Q = 0;
		if (x > 0 && y > 0) {
			Q = 1;
		} else if (x < 0 && y > 0) {
			Q = 2;
		} else if (x < 0 && y < 0) {
			Q = 3;
		} else {
			Q = 4;
		}
		System.out.println(Q);

		// if26
		double x = 1.5, y;
		if (x <= 0) {
			y = -x;
		} else if (x >= 2) {
			y = 4;
		} else {
			y = x * x;
		}
		System.out.println(y);

		//if27
		double x = -57.6;
		int y, z;
		z = (int) x; // поменяли вещественную переменную на целочисленную!!! т.е. целой z присвоили значение х 
		//т.е. отбросили дробную часть
		if (z < 0) {
			y = 0;
		} else if (z % 2 == 0) {
			y = 1;
		} else {
			y = -1;
		}
		System.out.println(y);

		// if28 - 3 варианта I вариант
		int y = -1200, d;
		if (y % 100 == 0 && y % 400 != 0) {
			d = 365;
		} else if (y % 4 == 0) {
			d = 366;
		} else {
			d = 365;
		}
		System.out.println(d);

		//if28 - II вариант
		int y = 1200, d = 365;
		 if (y % 400 == 0 || y % 4 == 0 && y % 100 != 0)
		{d = 366;
		}
//		if (y % 4 != 0 || y % 400 != 0 && y % 100 == 0) {
//			d = 365;
//		} else {
//			d = 366;
//		}
		System.out.println(d);

		// if28 - III вариант (тернарная операция)
		int y = 1200, d;
		d = y % 4 != 0 || y % 400 != 0 && y % 100 == 0 ? 365 : 366;
		System.out.println(d);

		// if29
		Scanner in = new Scanner(System.in);
		System.out.print("Введите число: ");
		int ch = in.nextInt();
		if (ch > 0 && ch % 2 == 0) {
			System.out.println("данное число положительное четное");
		} else if (ch > 0 && ch % 2 != 0) {
			System.out.println("данное число положительное нечетное");
		} else if (ch < 0 && ch % 2 == 0) {
			System.out.println("данное число отрицательное четное");
		} else if (ch < 0 && ch % 2 != 0) {
			System.out.println("данное число отрицательное нечетное");
		} else {
			System.out.println("данное число - ноль");}

		// if30 - 2 варианта - I вариант
		Scanner in = new Scanner(System.in);
		System.out.print("Введите число: ");
		int ch = in.nextInt();
		if (ch % 2 == 0) {
			System.out.println("четное");
		} else {
			System.out.println("нечетное");
		}
		if (ch > 99) {
			System.out.println("трехзначное");
		} else if (ch > 9) {
			System.out.println("двухзначное");
		} else {System.out.println("однозначное");}
		
		//if30 - 2 варианта  - II вариант
		Scanner in = new Scanner(System.in);
		System.out.print("Введите число: ");
		int ch = in.nextInt();
		if (ch > 0 && ch < 10 && ch % 2 == 0) {
			System.out.println("число - однозначное четное");
		} else if (ch > 0 && ch < 10 && ch % 2 != 0) {
			System.out.println("число - однозначное нечетное");
		} else if (ch > 9 && ch < 100 && ch % 2 == 0) {
			System.out.println("число - двухзначное четное");
		} else if (ch > 9 && ch < 100 && ch % 2 != 0) {
			System.out.println("число - двухзначное нечетное");
		} else if (ch < 1000 && ch % 2 == 0) {
			System.out.println("число - трехзначное четное");
		} else {
			System.out.println("число - трехзначное нечетное");}


	}
}
