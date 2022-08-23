package basic_ass;

import java.util.Scanner;

// Viết chương trình in ra các cặp số nguyên tố cùng nhau trong đoạn [a,b]. Với a,b nhập từ
//bàn phím.
public class bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap a");
		int a = sc.nextInt();
		System.out.println("nhap b");
		int b = sc.nextInt();
		hienThiDapA(a, b);
	}

	public static void hienThiDapA(int a, int b) {
		if (a < 0 || b < 0) {
			System.out.println("Không có cặp số nguyên tố");
			return;
		}
		System.out.println("Cặp số nguyên tố");
		int n = Math.max(a, b);
		int m = Math.min(a, b);
		boolean coDapAnDung = true;

		for (int i = m; i <= n - 1; i++) {
			for (int j = i + 1; j <= n; j++) {
				if (uocChungLonNhat(j, i) == 1) {
					System.out.println(i + " " + j);
					coDapAnDung = false;
				}
			}
		}
		if (coDapAnDung) {
			System.out.println("Không có cặp số nguyên tố");
		}
	}

	public static int uocChungLonNhat(int n, int m) {
		if (n == 0)
			return 0;
		if (m == 0)
			return n;
		return uocChungLonNhat(m, n % m);

	}
}
