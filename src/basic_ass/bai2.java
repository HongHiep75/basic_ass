package basic_ass;

import java.util.Scanner;

//Nhập số tự nhiên n rồi liệt kê các ước số của nó và số lượng ước số mà nó có.
public class bai2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap n");

		int n = sc.nextInt();
		soUoc(n);
	}
	
	public static void soUoc(int n) {
		if (n < 0) {
			System.out.println(n + " : không phải số tự nhiên ");
			return;
		}
		if (n == 0) {
			System.out.println(n + " : có vô hạn ước ");
			return;
		}

		System.out.print("Các ước là: ");
		int tong = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
				tong++;
			}
		}
		System.out.println("\nTổng ước là: " + tong);
	}
	
	
	
	
	
}
