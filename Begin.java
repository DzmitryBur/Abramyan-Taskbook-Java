
public class Begin {

	public static void main(String[] args) {
		System.out.println("Задачи Begin");

		// Begin1
		double a = 5.12;
		double p = 4 * a;
		System.out.println(p);

		//Begin2
		double a = 7;
		double s = a * a;
		System.out.println(s);

		// Begin3
		double a = 4, b = 7;
		double s = a * b;
		double P = 2 * (a + b);
		System.out.println(s);
		System.out.println(P);

		// Begin4
		double d = 7, pi = 3.14;
		double L = pi * d;
		System.out.println(L);

//		или 

		double d = 10;
		double L = Math.PI * d;
		System.out.println(L);

		// Begin5
		double a = 2;
		double V = a * a * a;
		double S = 6 * (a + a);
		System.out.println(V);
		System.out.println(S);

		// Begin6
		//Даны длины ребер a, b, c прямоугольного параллелепипеда.
		//Найти его объем V = a·b·c и площадь поверхности S = 2·(a·b + b·c + a·c).
		double a = 1, b = 2, c = 3, V, S;
		V = a * b * c;
		S = 2 * (a* b + b * c + a * c);
		System.out.println(V);
		System.out.println(S);

		// Begin7.
		// Найти длину окружности L и площадь круга S заданного радиуса R:
		// L = 2·π·R, S = π·R2.
		//В качестве значения π использовать 3.14.
		double R = 3, L, S, P;
		L = 2 * Math.PI * R;
		S = Math.PI * (R * R);
		System.out.println(L);
		System.out.println(S);

		// Begin8.
		// Даны два числа a и b. Найти их среднее арифметическое: (a + b)/2.
		double a = 3, b = 4, c;
		c = (a + b) / 2;
		System.out.println(c);

		// Begin9
		double a = 9, b = 16;
		double s = a + b;
		double ag = Math.sqrt(s);
		System.out.println(ag);

		// Begin10. Даны два ненулевых числа.
		 Найти сумму, разность, произведение и частное их квадратов.
		double a = 3, b = 4, S, R, P, C;
		S = a * a + b * b;
		R = a * a - b * b;
		P = a * a * b * b;
		C = (a * a) / (b * b);
		System.out.println(S);
		System.out.println(R);
		System.out.println(P);
		System.out.println(C);

		// Begin11.
		// Даны два ненулевых числа. Найти сумму, разность, произведение и частное их
		// модулей.
		double a = -3, b = -4, S, R, P, C;
		S = Math.abs(a) + Math.abs(b);
		R = Math.abs(a) - Math.abs(b);
		P = Math.abs(a) * Math.abs(b);
		C = Math.abs(a) / Math.abs(b);
		System.out.println(S);
		System.out.println(R);
		System.out.println(P);
		System.out.println(C);

		// Begin12. Даны катеты прямоугольного треугольника a и b.
		// Найти его гипотенузу c и периметр P: c = √a2 + b2, P = a + b + c.
		double a = 3, b = 4, c, P;
		c = Math.sqrt(a * a + b * b);
		P = a + b + c;
		System.out.println(c);
		System.out.println(P);

		// Begin13. Даны два круга с общим центром и радиусами R1 и R2 (R1 > R2).
		// Найти площади этих кругов S1 и S2, а также площадь S3 кольца,
		// внешний радиус которого равен R1, а внутренний радиус равен R2:
		//S1 = π·(R1)2,	S2 = π·(R2)2,	S3 = S1 − S2.
		double R1 = 6, R2 = 3, S1, S2, S3;
		S1 = Math.PI * (R1 * R1);
		S2 = Math.PI * (R2 * R2);
		S3 = S1 - S2;
		System.out.println(S1);
		System.out.println(S2);
		System.out.println(S3);

		// Begin14. Дана длина L окружности. Найти ее радиус R и площадь S круга,
		// ограниченного этой окружностью, учитывая, что L = 2·π·R, S = π·R2.
		double L = 28, R, S;
		R = (L / (2 * Math.PI));
		S = Math.PI * R * R;
		System.out.println(R);
		System.out.println(S);

		// Begin15. Дана площадь S круга.
		// Найти его диаметр D и длину L окружности, ограничивающей этот круг,
		//учитывая, что L = 2·π·R, S = π·R2.
		double S = 62.4, R, D, L, P = 3.14;
		R = Math.sqrt(S / P);
		D = 2 * R;
		L = 2 * P * R;
		System.out.println(D);
		System.out.println(L);

		// Begin16. Найти расстояние между двумя точками с
		// заданными координатами x1 и x2 на числовой оси: |x2 − x1|.
		double x1 = -8, x2 = 3, x, R;
		x = x2 - x1;
		R = Math.abs(x);
		System.out.println(R);

		// Begin17. Даны три точки A, B, C на числовой оси.
		// Найти длины отрезков AC и BC и их сумму.
		double A = -1, B = 11, C = 3, AC, BC, S;
		AC = C - A;
		AC = Math.abs(AC);
		BC = C - B;
		BC = Math.abs(BC);
		S = AC + BC;
		System.out.println(AC);
		System.out.println(BC);
		System.out.println(S);

		// Begin18. Даны три точки A, B, C на числовой оси.
		// Точка C расположена между точками A и B. Найти произведение длин отрезков AC
		// и BC.
		double A = -1, B = 11, C = 3, AC, BC, P;
		AC = C - A;
		AC = Math.abs(AC);
		BC = C - B;
		BC = Math.abs(BC);
		P = AC * BC;
		System.out.println(AC);
		System.out.println(BC);
		System.out.println(P);

		// Begin19. Даны координаты двух противоположных вершин прямоугольника:
		// (x1, y1), (x2, y2). Стороны прямоугольника параллельны осям координат.
		// Найти периметр и площадь данного прямоугольника.
		double x1 = -1, y1 = -1, x2 = -5, y2 = -4, St1, St2, P, S;
		St1 = x2 - x1;
		St2 = y2 - y1;
		P = (Math.abs(St1) + Math.abs(St2)) * 2;
		S = (Math.abs(St1) * Math.abs(St2));
		System.out.println(P);
		System.out.println(S);

		//Begin20 - расстояние между двумя точками на плоскости
		double x1 = -1, x2 = -5, y1 =-1, y2 = -4;
		double x = x2 - x1;
		double y = y2 - y1;
		double L = Math.sqrt((x * x) + (y * y));
		System.out.println(L);

		//Begin21 - периметр и площадь треугольника по 3-м координатам
		double x1 = 1, x2 = 5, x3 = 1, y1 = 1, y2 = 1, y3 = 4;
		double a1 = x2 - x1;
		double a2 = y2 - y1;
		double b1 = x3 - x1;
		double b2 = y3 - y1;
		double c1 = x3 - x2;
		double c2 = y3 - y2;
		double a = Math.sqrt((a1 * a1) + (a2 * a2));
		double b = Math.sqrt((b1 * b1) + (b2 * b2));
		double c = Math.sqrt((c1 * c1) + (c2 * c2));
		double P = a + b + c;
		double P2 = (a + b + c) / 2;
		// P2 - полупериметр для формулы Герона
		double S = Math.sqrt(P2 * (P2 - a) * (P2 - b) * (P2 - c));
		System.out.println(P);
		System.out.println(S);

		//Begin22 - поменять местами содержимое 2-х переменных
		double a = 3.14, b = 7.68;
		double t = a;
		a = b;
		b = t;
		System.out.println(a);
		System.out.println(b);

//		или без введения треть ей переменной:
		double a = 3, b = 5;
		a = a + b;
		b =  b - a;
		b = -b;
		a = a - b;
		System.out.println(a);
		System.out.println(b);	
		
		//Begin23 - Даны переменные A, B, C. 
		// Изменить их значения, переместив содержимое A в B, B — в C, C — в A,
		// и вывести новые значения переменных A, B, C.
		double a = 3, b = 5, c = 7;
		double t = c;
		c = b;
		b = a;
		a = t;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		// Begin24. Даны переменные A, B, C.
		// Изменить их значения, переместив содержимое A в C, C — в B, B — в A,
		//и вывести новые значения переменных A, B, C.
		double a = 3, b = 5, c = 7, t;
		t = a;
		a = b;
		b = c;
		c = t;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		// Begin25 - Найти значение функции
		double x = 2;
		double a = 6;
		double y = 3 * Math.pow(x, a) - 6 * x * x - 7;
		System.out.println(y);

		// Begin26. Найти значение функции y = 4(x−3)6 − 7(x−3)3 + 2 при данном значении x.
		double x = 4, y;
		y = 4 * Math.pow((x-3), 6) - 7 * Math.pow((x-3), 3) + 2;
		System.out.println(y);

//		Begin27. Дано число A. 
//		Вычислить A8, используя вспомогательную переменную и три операции умножения. 
//		Для этого последовательно находить A2, A4, A8. 
//		Вывести все найденные степени числа A.
		double A = 3, t, A2, A4, A8;
		t = A * A;
		A2 = t;
		A4 = t * t;
		A8 = (t * t) * (t * t);
		System.out.println(A2);
		System.out.println(A4);
		System.out.println(A8);

//		Begin28. Дано число A. 
//		Вычислить A15, используя две вспомогательные переменные и пять операций умножения. 
//		Для этого последовательно находить A2, A3, A5, A10, A15. 
//		Вывести все найденные степени числа A.
		double A = 2, t1, t2, A2, A3, A5, A10, A15;
		t1 = A * A; //A2
		t2 = t1 * A; //A3
		A2 = t1;
		A3 = t2;
		A5 = t1 * t2;
		A10 = t2 * t2 * t2 * A;
		A15 = t2 * t2 * t2 * t2 * t1 * A;
		System.out.println(A2);
		System.out.println(A3);
		System.out.println(A5);
		System.out.println(A10);
		System.out.println(A15);

		// Begin29 - Дано значение угла α в градусах (0 < α < 360).
		// Определить значение этого же угла в радианах,
		// учитывая, что 180 = π радианов.
		double a = 90;
		System.out.println(Math.toRadians(a));
		
		или, где пи = 180 градусов, т.е. х радиан это пи на 1 делить на 180
		
		double b = 90;
		double r;
		r = 3.14 * b / 180;
		System.out.println(r);

		// Begin30. Дано значение угла α в радианах (0 < α < 2·π).
		// Определить значение этого же угла в градусах,
		// учитывая, что 180 = π радианов.
		double r = 1.6, a;
		a = 180 / (Math.PI * r);
		System.out.println(a);

		// Begin31. Дано значение температуры T в градусах Фаренгейта.
		// Определить значение этой же температуры в градусах Цельсия.
		// Температура по Цельсию TC и температура по Фаренгейту TF
		//связаны следующим соотношением: TC = (TF − 32)·5/9
		double TF = 85  , TC;
		TC = (TF - 32) * 5 / 9;
		System.out.println(TC);

		// Begin32. Дано значение температуры T в градусах Цельсия.
		// Определить значение этой же температуры в градусах Фаренгейта.
		// Температура по Цельсию TC и температура по Фаренгейту TF
		// связаны следующим соотношением: TC = (TF − 32)·5/9
		double TC = 30, TF;
		TF = TC * 9 / 5 + 32;
		System.out.println(TF);

		// Begin33. Известно, что X кг конфет стоит A рублей.
		// Определить, сколько стоит 1 кг и Y кг этих же конфет.
		double A = 10, x = 5, n=6, prkg1, prY;
		prkg1 = A / x;
		prY = prkg1 * n;
		System.out.println("1 kilo price " + prkg1);
		System.out.println("Y kilo price " + prY);

		// Begin34. Известно, что X кг шоколадных конфет стоит A рублей,
		// а Y кг ирисок стоит B рублей. Определить, сколько стоит 1 кг шоколадных
		// конфет, 1 кг ирисок,
		// а также во сколько раз шоколадные конфеты дороже ирисок.
		double A = 20, B = 23, x = 2, y=3, prkg1, prkg2, K;
		prkg1 = A / x;
		prkg2 = B / y;
		K = prkg1 / prkg2;
		System.out.println("1 kilo price шоколадных " + prkg1);
		System.out.println("1 kilo price ирисок " + prkg2);
		System.out.println("Соотношение " + K);

		// Begin35. Скорость лодки в стоячей воде V км/ч, скорость течения реки U км/ч
		// (U < V).
		// Время движения лодки по озеру T1 ч, а по реке (против течения) — T2 ч.
		// Определить путь S,
		// пройденный лодкой (путь = время · скорость). Учесть, что при движении против
		// течения
		//скорость лодки уменьшается на величину скорости течения.
		double V = 20, U = 3, T1 = 1, T2 = 1, S;
		S = (T1 * V) + (T2 * (V - U));
		System.out.println(S);

		// Begin36. Скорость первого автомобиля V1 км/ч, второго — V2 км/ч, расстояние
		// между ними S км. Определить расстояние между ними через T часов, если
		// автомобили удаляются друг от друга. Данное расстояние равно сумме начального
		// расстояния и общего пути, проделанного автомобилями; общий путь =
		//время · суммарная скорость.
		double V1 = 60, V2 = 75, S, S1 = 100, T = 1;
		S = S1 + (V1 + V2) * T;
		System.out.println(S);

		// Begin37. Скорость первого автомобиля V1 км/ч, второго — V2 км/ч,
		// расстояние между ними S км. Определить расстояние между ними через T часов,
		// если автомобили первоначально движутся навстречу друг другу.
		// Данное расстояние равно модулю разности начального расстояния и общего пути,
		// проделанного автомобилями;
		// общий путь = время · суммарная скорость.
		double V1 = 60, V2 = 75, S, S1 = 100, T = 1;
		S = Math.abs((S1 - ((V1 + V2) * T)));
		System.out.println(S);

		// Begin38. Решить линейное уравнение A·x + B = 0,
		// заданное своими коэффициентами A и B (коэффициент A не равен 0).
		double A = 1, B = 2, x;
		x = -B / A;
		System.out.println(x);

		// Begin39 - найти корни квадратного уравнения
		double A = -50, B = 100, C = 1, D;
		D = (B * B) - (4 * A * C);
		double x1, x2;
		x1 =  (-B + Math.sqrt(D)) / (2 * A);
		x2 =  (-B - Math.sqrt(D)) / (2 * A);
		System.out.println(D);
		if (x2 < x1) {
		System.out.println("Корень уравнения x2= " + x2);
		System.out.println("Корень уравнения x1= " + x1);
		
		}
		else {
			System.out.println("Корень уравнения x1= " + x1);
			System.out.println("Корень уравнения x2= " + x2);
			} 

		// Begin40. Найти решение системы линейных уравнений вида
		// A1·x + B1·y = C1,
		// A2·x + B2·y = C2,
		// заданной своими коэффициентами A1, B1, C1, A2, B2, C2,
		// если известно, что данная система имеет единственное решение.
		// Воспользоваться формулами
		//x = (C1·B2 − C2·B1)/D,	y = (A1·C2 − A2·C1)/D, где D = A1·B2 − A2·B1.
		double A1 = 4, B1 = 6, C1 = 3, A2 = 5, B2 = 7, C2 = 6, x, y, D;
		D = (A1 * B2) - (A2 * B1);
		x = ((C1 * B2) - (C2 * B1)) / D;
		y = ((A1 * C2) - (A2 * C1)) / D;
		System.out.println(x);
		System.out.println(y);

		int a = 3;
		++a;
		System.out.println(a);

	}

}
