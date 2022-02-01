import java.util.Scanner;

public class Case {

	public static void main(String[] args) {
		System.out.println("Task Case");

		// Case1
		Scanner in = new Scanner(System.in);
		System.out.print("Введите число: ");
		int key = in.nextInt();
		// int key = 3; если не используем ввод данных с клавиатуры (scanner), то
		// необходим ИНИЦИАЦИЯ ПЕРЕМЕННОЙ
		switch (key) {
		case 1:
			System.out.println("вы выбрали понедельник");
			break;
		case 2:
			System.out.println("вы выбрали вторник");
			break;
		case 3:
			System.out.println("вы выбрали среда");
			break;
		case 4:
			System.out.println("вы выбрали четверг");
			break;
		case 5:
			System.out.println("вы выбрали пятница");
			break;
		case 6:
			System.out.println("вы выбрали суббота");
			break;
		case 7:
			System.out.println("вы выбрали воскресенье");
			break;

		default:
			System.out.println("error. ваш выбор ошибочен");
			break;
		}

		// Case3
		Scanner in = new Scanner(System.in);
		System.out.print("Введите порядковый номер месяца: ");
		int N = in.nextInt();
		//int N = 7; //если не используем ввод данных с клавиатуры (scanner), то необходима ИНИЦИАЦИЯ ПЕРЕМЕННОЙ
		switch (N) {
		case 1:
			System.out.println("Зима"); 
			break;
		case 2:
			System.out.println("Зима"); 
			break;
		case 3:
			System.out.println("Весна"); 
			break;
		case 4:
			System.out.println("Весна"); 
			break;
		case 5:
			System.out.println("Весна"); 
			break;
		case 6:
			System.out.println("Лето"); 
			break;
		case 7:
			System.out.println("Лето"); 
			break;
		case 8:
			System.out.println("Лето"); 
			break;
		case 9:
			System.out.println("Осень"); 
			break;
		case 10:
			System.out.println("Осень"); 
			break;
		case 11:
			System.out.println("Осень"); 
			break;
		case 12:
			System.out.println("Зима");
			break;
		case 13:
			System.out.println("такой месяц еще не придумали");
			break;
		default:
			System.out.println("error. ваш выбор ошибочен");
			break;
			}

		 // Case5
		int N = 5;
		double A = 4, B = 5, C = 0;
		switch (N) {
		case 1:
			C = A + B;
			break;
		case 2:
			C = A - B;
			break;
		case 3:
			C = A * B;
			break;
		case 4:
			C = A / B;
			break;
		default:
			System.out.println("Ошибка кода операции");
			break;
			return; // оператор выхода из программы
			
		}

	System.out.println(C);

		// Case6
		Scanner in = new Scanner(System.in);
		System.out.print("Введите единицу измерения (1 - дц., 2 - км., 3 - м., 4 - мм., 5 см.): ");
		int N = in.nextInt();
		System.out.print("Введите величину: ");
		double A = in.nextInt();
//		//int N = 7; //если не используем ввод данных с клавиатуры (scanner), то необходим ИНИЦИАЦИЯ ПЕРЕМЕННОЙ
//		//int N = 4;
//		//double A = 543, C = 0;
		double C = 0;
		switch (N) {
		case 1:
			C = A / 10; //дециметров
			System.out.println("длина отрезка: " + C + " метра(ов)");
			break;
		case 2:
			C = A * 1000; //километров
			System.out.println("длина отрезка: " + C + " метра(ов)");
			break;
		case 3:
			C = A; //метров
			System.out.println("длина отрезка: " + C + " метра(ов)");
			break;
		case 4:
			C = A / 1000; //миллиметров
			System.out.println("длина отрезка: " + C + " метра(ов)");
			break;
		case 5:
			C = A / 100; //сантиметров
			System.out.println("длина отрезка: " + C + " метра(ов)");
			break;
		default:
			System.out.println("error");
			break;
			
		}

		// Case10
		Scanner in = new Scanner(System.in);
		System.out.print("Выберите исходное направление (Север, Запад, Юг, Восток): ");
		String [] dir = {"Север","Запад","Юг","Восток"}; 
		String C = in.next();
		System.out.print("Введите команду: ");
		int N = in.nextInt(); // ввод направления -1, 0 или 1
		//int N = -1; ////если не используем ввод данных с клавиатуры (scanner), то необходима ИНИЦИАЦИЯ ПЕРЕМЕННОЙ 
		int ind = 0;
		//char [] dir = {'С','З','Ю','В'};
		//char C = 'Ю';
		switch (C) {
		case "Север":
			ind = 0;
			break;
		case "Запад":
			ind = 1;
			break;
		case "Юг":
			ind = 2;
			break;
		case "Восток":
			ind = 3;
			break;
		default: //почему не отрабатывает??
			System.out.println("error");
			break;
		}
		switch (N) {
		case 1:
			ind = ++ind % 4; break;
		case -1:
			ind = (--ind + 4) % 4; break;  

		}
		System.out.println(dir[ind]);

		// Case11
		Scanner in = new Scanner(System.in);
		System.out.print("Выберите исходную ориентацию локатора (Север, Запад, Юг, Восток): ");
		String[] dir = { "Север", "Запад", "Юг", "Восток" };
		String C = in.next();
		System.out.print("Введите команду N1: ");
		int N1 = in.nextInt(); // ввод направления N1 -1, 1 или 2
		System.out.print("Введите команду N2: ");
		int N2 = in.nextInt(); // ввод направления N2 -1, 1 или 2

		// int N1 = -1; ////если не используем ввод данных с клавиатуры (scanner), то
		// необходима ИНИЦИАЦИЯ ПЕРЕМЕННОЙ
		// int N2 = -1; ////если не используем ввод данных с клавиатуры (scanner), то
		// необходима ИНИЦИАЦИЯ ПЕРЕМЕННОЙ
		int ind = 0;
		// char [] dir = {'С','З','Ю','В'};
		// char C = 'Ю';
		switch (C) {
		case "Север":
			ind = 0;
			break;
		case "Запад":
			ind = 1;
			break;
		case "Юг":
			ind = 2;
			break;
		case "Восток":
			ind = 3;
			break;
		default: // почему не отрабатывает??
			System.out.println("error");
			break;
		}
		switch (N1) {
		case 1:
			ind = ++ind % 4;
			break;
		case -1:
			ind = (--ind + 4) % 4;
			break;
		case 2:
			ind = (ind + 2) % 4;
			break;
		}
		switch (N2) {
		case 1:
			ind = ++ind % 4;
			break;
		case -1:
			ind = (--ind + 4) % 4;
			break;
		case 2:
			ind = (ind + 2) % 4;
			break;
		}

		System.out.println(dir[ind]);

		// Case12

		Scanner in = new Scanner(System.in);
		System.out.print("Введите единицу измерения (1 - R, 2 - D, 3 - L, 4 - S): ");
		int N = in.nextInt();
		System.out.print("Введите величину: ");
		double A = in.nextInt();
//		//int N = 7; //если не используем ввод данных с клавиатуры (scanner), то необходим ИНИЦИАЦИЯ ПЕРЕМЕННОЙ
//		//int N = 4;
//		//double A = 543, C = 0;
		double xR = 0, xD = 0, xL = 0, xS = 0;
		switch (N) {
		case 1: //введен радиус
			xR = A; //находим радиус
			xD = A * 2; //находим диаметр
			xL = A * 2 * Math.PI; //находим длину
			xS = Math.PI * (A * A); //находим площадь
			System.out.println("радиус составляет: " + xR);
			System.out.println("диаметр составляет: " + xD);
			System.out.println("длина составляет: " + xL);
			System.out.println("площадь составляет: " + xS);
			break;
		case 2: //введен диаметр
			xR = A / 2; //считаем радиус
			xD = A; //считаем диаметр
			xL = A * Math.PI; //считаем длину
			xS = (A * A) / 4 * Math.PI; //считаем пдощадь
			System.out.println("радиус составляет: " + xR);
			System.out.println("диаметр составляет: " + xD);
			System.out.println("длина составляет: " + xL);
			System.out.println("площадь составляет: " + xS);
			break;
		case 3: //введена длина
			xR = A / (2 * Math.PI); //считаем радиус
			xD = A / Math.PI; //считаем диаметр
			xL = A; //считаем длину
			xS = (A * A) / (4 * Math.PI); //считаем пдощадь
			System.out.println("радиус составляет: " + xR);
			System.out.println("диаметр составляет: " + xD);
			System.out.println("длина составляет: " + xL);
			System.out.println("площадь составляет: " + xS);
			break;
		case 4: //введена площадь
			xR = Math.sqrt(A / Math.PI); //считаем радиус
			xD = Math.sqrt(A / Math.PI) * 2; //считаем диаметр
			xL = Math.sqrt(A * 4 * Math.PI); //считаем длину
			xS = A; //считаем пдощадь
			System.out.println("радиус составляет: " + xR);
			System.out.println("диаметр составляет: " + xD);
			System.out.println("длина составляет: " + xL);
			System.out.println("площадь составляет: " + xS);
			break;
		default:
			System.out.println("error");
			break;
			
		}

			
			
		}
		
		
	}

