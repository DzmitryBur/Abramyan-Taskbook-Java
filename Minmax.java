import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Minmax {
	public static void main(String[] args) {

	//Minmax1
//	int A[] = { 7, 0, 2, -2, 3, 9, 4, 4, 5 }, imin = A[0], imax = A[0];
//	for (int i = 1; i < A.length; i++) {
//		if (imin > A[i]) imin = A[i];
//		if (imax < A[i]) imax = A[i];
//		}
//	System.out.println(imin);
//	System.out.println(imax);
	
	
	//Minmax2
	int a[] = { 2, 3, 4, 3, 2 };
	int b[] = { 4, 3, 5, 3, 2 };
	int imin = a[0] * b[0], S, ind = 0;
	for (int i = 1; i < a.length; i++) {
		S = a[i] * b[i];
		if (imin > S) {
			imin = S;
			ind = i;
		}
	}
	System.out.printf("S min = %d", imin);
	
	//Minmax4
//	int A[] = { -7, 1, 2, 2, 3, 9, 4, -4, 5 }, imin = A[0];
//	for (int i = 1; i < A.length; i++) {
//		if (imin > A[i]) imin = i;
//		}
//	System.out.printf("Number of element is: %d", imin);
	
	
		
}


}