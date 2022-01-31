public class Integer {

	public static void main(String[] args) {
		System.out.println("Задачи Integer");
		// Integer1
		int L, M;
		L = 345;
		M = L / 100;
		System.out.println("number of full meters: " + M);

		// Integer2
		int M, t;
		M = 42845;
		t = M / 1000;
		System.out.println("number of full meters: " + t);

		// Integer4
		int A, B, O;
		A = 11;
		B = 2;
		O = A / B;
		if (B > A) {
			System.out.println("by the condition A is greater than B!!!");
		} else {
			System.out.println("number of segments B: " + O);
		}

		// Integer6
		int a, d, e;
		a = 57;
		d = a / 10;
		e = a % 10;
		System.out.println("number of tens: " + d);
		System.out.println("number of units: " + e);

		// Integer8
		int a, d, e, x, y;
		a = 98;
		d = a / 10;
		e = a - d * 10;
		x = e;
		y = d;
		System.out.print("reverse number: " + x);
		System.out.print(y);

		// Integer9
		int a, d, e;
		a = 999;
		d = a / 100;
		System.out.println("number of hundreds: " + d);

		// Integer15
		int a, s, d, e, x, y, z;
		a = 123;
		s = a / 100;
		d = (a - s * 100) / 10;
		e = a - (s * 100) - (d * 10);
		x = s;
		y = d;
		z = e;
		System.out.print(y);
		System.out.print(x);
		System.out.print(z);

		// Integer16
		int a, s, d, e, x, y, z;
		a = 123;
		s = a / 100;
		d = (a - s * 100) / 10;
		e = a - (s * 100) - (d * 10);
		x = s;
		y = d;
		z = e;
		System.out.print(x);
		System.out.print(z);
		System.out.print(y);

		// Integer24
		int d, w, k; 
		d = 77;
		w = d % 7;
		System.out.println("номер дня недели К-того дня года: " + w);
		
		//Integer25
		int d, w, k; 
		d = 76;
		w = (d +3) % 7;
		System.out.println("номер дня недели К-того дня года: " + w);

		// Integer29
		int A = 7, B = 5, C = 2, x, y, z, Sp, Sz, So;
		Sp = A * B;
		x = A / C;
		y = B / C;
		z = x * y;
		Sz = z * C * C;
		So = Sp - Sz;
		System.out.println("Сторона прямоугольника А: " + A);
		System.out.println("Сторона прямоугольника B: " + B);
		System.out.println("Сторона квадрата C: " + C);
		if (C > A) {
			System.out.println("введите целое значение стороны квадрата меньше стороны прямоугольника");
		} else {
			System.out.println("Количество полных квадратов: " + z);
		}
		if (C > B) {
			System.out.println("введите целое значение стороны квадрата меньше стороны прямоугольника");
		} else {
			System.out.println("Количество полных квадратов: " + z);
		}
		System.out.println("Незанятая площадь прямоуголиника составляет: " + So);

		// Integer30
		int Y = 100, C;
		//C = (Y + 99) / 100; // мой вариант
		C = (Y-1)/100+1; // вариант преподавателя
		System.out.println("Указанный год относится к веку: " + C);


	}
}
