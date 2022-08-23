package basic_ass;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap a");

		int a = sc.nextInt();
		System.out.println( "phan 1.a");  
		System.out.println( tinhTong(a));
		
		System.out.println( "phan 1.b");  
		System.out.println( "nhap b");
		int b = sc.nextInt();
		System.out.println( tinhTong2(b));


	}
	
	// bai 1 phan a
		public static int tinhTong(int n) {
			if (n < 0) {
				return 0;
			}
			int tong = 0;
			for (int i = 1; i <= n; i++) {
				if (n % 2 == 1 && i % 2 == 1) {
					tong += i;
				}
				if (n % 2 == 0 && i % 2 == 0) {
					tong += i;
				}
			}
			return tong;
		}
		// bai 1 phan b
		public static double tinhTong2(int n) {
			if (n <= 0) {
				return 0;
			}
			return 1 / (double) n + tinhTong2(n - 1);
		}
	
}
