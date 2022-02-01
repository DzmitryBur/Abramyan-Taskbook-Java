public class Boolean {

	public static void main(String[] args) {
		System.out.println("Задачи Boolean");

		//Boolean1
		int a = 0;
		boolean b = a > 0;
		System.out.println(b);

		// Boolean2
		int a = 77;
		boolean b = a % 2 != 0;
		System.out.println(b);

		// Boolean3
		int a = 78;
		boolean b = a % 2 == 0;
		System.out.println(b);

		// Boolean4
		int a = 15, b = -15;
		boolean c = (a > 2) && (b <= 3);
		System.out.println(c);

		// Boolean5
		int a = 1, b = -15;
		boolean c = (a >= 2) || (b < -2);
		System.out.println(c);

		// Boolean6
		int A = -1, B = 2, C = 3;
		boolean D = (C > B) && (B > A); //можно без скобок
		System.out.println(D);

		// Boolean7
		int A = -1, B = 2, C = 3;
		boolean D = (C > B) && (B > A);
		System.out.println(D);

		// Boolean8
		int A = 3, B = 5;
		boolean C = (A % 2 != 0) && (B % 2 != 0);
		System.out.println(C);

		// Boolean9
		int A = 3, B = 4;
		boolean C = (A % 2 != 0) || (B % 2 != 0);
		System.out.println(C);

		// Boolean10
		int A = 3, B = 3;
		boolean C = (A % 2 == 1) ^ (B % 2 == 1);
				//boolean C = (A % 2 != 0) && (B % 2 == 0); 
				//boolean D = (A % 2 == 0) && (B % 2 != 0);
				//boolean E = (C != D);
		System.out.println(C);

		// Boolean11 - 2 варианта!!!
		int A = 4, B = 4;
		boolean C = A % 2 == B % 2;
		System.out.println(C);
		//boolean C = (A % 2 != 0) && (B % 2 != 0); 
		//boolean D = (A % 2 == 0) && (B % 2 == 0);
		//boolean E = (C || D);
		//System.out.println(E);
		
		int A = 3, B = 3;
		if (A % 2 != 0 && B % 2 != 0 || A % 2 == 0 && B % 2 == 0) {
			System.out.println("четность одинаковая");
		} 
		else {
			System.out.println("четность не одинаковая");
		}; 
		
		

		// Boolean12
		int A = 1, B = 1, C = 2;
		boolean D = (A > 0) && (B > 0) && (C > 0);
		System.out.println(D);

		//Boolean13
		int A = 1, B = -1, C = -2;
		boolean D = (A > 0 || B > 0 || C > 0);
		System.out.println(D);

		// Boolean14
		int A = 1, B = 1, C = -2;
		boolean D = (A > 0 && B <= 0 && C <= 0 || A <= 0 && B > 0 && C <= 0 || A <= 0 && B <= 0 && C > 0);
		System.out.println(D);

		// Boolean15
		int A = 1, B = 1, C = 0;
		boolean D = (A > 0 && B > 0 && C <= 0 || A > 0 && B <= 0 && C > 0 || A <= 0 && B > 0 && C > 0);
		System.out.println(D);

		// Boolean16
		int A = 90;
		boolean B = (A % 2 == 0) && (A > 9) && (A < 100);
		System.out.println(B);

		// Boolean17
		int A = 999;
		boolean B = (A % 2 != 0) && (A > 99) && (A < 1000);
		System.out.println(B);

		// Boolean18
		int A = 1, B = 3, C = 1;
		boolean D = (A == B) || (A == C) || (B == C);
		System.out.println(D);

		// Boolean19
		int A = 3, B = 3, C = 1;
		boolean D = (A != B) || (A != C) || (B != C);
		System.out.println(D);

		// Boolean20
		int A = 879, a, d, e;
		a = A / 100;
		d = (A - a * 100) / 10;
		e = A - (a * 100) - (d * 10);
		boolean D = (a != d) && (a != e) && (d != e);
		System.out.println(D);

		// Boolean21
		int A = 789, a, d, e;
		a = A / 100;
		d = (A - a * 100) / 10;
		e = A - (a * 100) - (d * 10);
		boolean D = (a < d) && (a < e) && (d < e);
		System.out.println(D);

		// Boolean22
		int A = 987, a, d, e;
		a = A / 100;
		d = (A - a * 100) / 10;
		e = A - (a * 100) - (d * 10);
		boolean D = ((a < d) && (a < e) && (d < e)) || ((a > d) && (a > e) && (d > e));
		System.out.println(D);

		// Boolean23
		int A = 1221, t, a, d, e;
		t = A / 1000;
		a = (A - t * 1000) / 100;
		d = (A - (t * 1000) - (a * 100)) / 10;
		e = A - (t * 1000) - (a * 100) - (d * 10);
		boolean D = (t == e) && (a == d);
		System.out.println(D);

		// Boolean24
		int A = 1, B = 4, C = 3, D;
		D = B * B - 4 * A * C;
		boolean x = (D >= 0);
		System.out.println(x);

		// Boolean25
		int x = -1, y = 4;
		boolean D = x < 0 && y > 0;
		System.out.println(D);

		// Boolean26
		int x = 1, y = -4;
		boolean D = x > 0 && y < 0;
		System.out.println(D);

		// Boolean27
		int x = -1, y = 4;
			//boolean D = (x < 0 && y > 0) || (x < 0 && y < 0);
		boolean D = (x < 0);
		System.out.println(D);

		// Boolean28
		int x = -1, y = -4;
		boolean D = (x > 0 && y > 0) || (x < 0 && y < 0);
		System.out.println(D);

		// Boolean29
		int x = 2, y = 2, x1 = 1, y1 = 3, x2 = 4, y2 = 0, x3 = 1, y3 = 0, x4 = 4, y4 = 3;
		boolean D = (x > x1 && y < y1) && (x < x2 && y > y2) && (x3 - x1 == 0) && (x4 - x2 == 0) && (y4 - y1 == 0) && (y2 - y3 == 0);
		System.out.println(D);

		// Boolean30
		int a = 7, b = 7, c = 7;
		boolean D = (a - c == 0) && (a - b == 0) && (b - c == 0);
		System.out.println(D);

		// Boolean31
		int a = 7, b = 7, c = 2;
		boolean D = (a == c) || (a == b) || (b == c);
		System.out.println(D);

		// Boolean32
		int a = 3, b = 4, c = 5;
		boolean D = (a * a == c * c + b * b) || (b * b == c * c + a * a) || (c * c == a * a + b * b);
		System.out.println(D);

		// Boolean33
		int a = 3, b = 4, c = 5;
		boolean D = (a < b + c) && (b < c + a) && (c < a + b);
		System.out.println(D);

		// Boolean34
		int x = 8, y = 7;
		boolean D = ((x + y) % 2 != 0);
		System.out.println(D); //white square

		// Boolean35
		int x1 = 2, y1 = 3, x2 = 7, y2 = 8;
		boolean D = (((x1 + y1) % 2 != 0) && (x2 + y2) % 2 != 0) || (((x1 + y1) % 2 == 0) && (x2 + y2) % 2 == 0);
		System.out.println(D); // same color

		// Boolean36
		int x1 = 2, y1 = 5, x2 = 4, y2 = 5;
		boolean D = (x2 == x1) || (y2 == y1);
		System.out.println(D); // lad'a

		// Boolean37
		int x1 = 5, y1 = 5, x2 = 6, y2 = 5;
		boolean D = (x2-x1 == 0 && Math.abs(y2 - y1) == 1) || (Math.abs(x2-x1) == 1 && y2 - y1 == 0) || (Math.abs(x2-x1) == 1 && Math.abs(y2 - y1) == 1);
		System.out.println(D); // king1

		// or

		int x1 = 5, y1 = 5, x2 = 6, y2 = 4;
		boolean D = (Math.abs(y2 - y1) <= 1) && (Math.abs(x2-x1) <= 1);
		System.out.println(D); // king2

		// Boolean38
		int x1 = 3, y1 = 1, x2 = 6, y2 = 4;
		boolean D = (Math.abs(x2-x1) == Math.abs(y2 - y1)); 
		System.out.println(D); // elephant

		// Boolean39
		int x1 = 3, y1 = 1, x2 = 1, y2 = 3;
		boolean D = ((x2 == x1) || (y2 == y1)) || ((Math.abs(x2-x1) == Math.abs(y2 - y1)));
		System.out.println(D); // ferz' = lad'a + elephant

		// Boolean40
		int x1 = 4, y1 = 4, x2 = 6, y2 = 5;
		boolean D = (Math.abs(x2-x1) == 1) && (Math.abs(y2 - y1) == 2) || (Math.abs(x2-x1) == 2) && (Math.abs(y2 - y1) == 1);
		System.out.println(D);



	}

}
