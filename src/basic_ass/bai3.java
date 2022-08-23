package basic_ass;
//Viết chương trình tìm ước số chung lớn nhất và bội số chung nhỏ nhất của hai số nguyên
//dương a,b. Với a,b nhập từ bàn phím.

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap a");
		int a = sc.nextInt();
		System.out.println("nhap b");
		int b = sc.nextInt();
		hienThiDapAn(a, b);
	}
	
	
	public static void hienThiDapAn(int a, int b) {
		int n = Math.max(a, b);
		int m = Math.min(a, b);
		int uocChungLonNhat = uocChungLonNhat(n, m);
		System.out.println("Ước chung lớn nhất " + uocChungLonNhat);
		int boiChungNhoNhat = boiChungNhoNhat(n, m, uocChungLonNhat);
		System.out.println("Bội chung nhỏ nhất " + boiChungNhoNhat);
	}

	public static int uocChungLonNhat(int n, int m) {
		if (n == 0)
			return 0;
		if (m == 0)
			return n;
		return uocChungLonNhat(m, n % m);

	}

	public static int boiChungNhoNhat(int n, int m, int uocLonNhat) {
		if (uocLonNhat == 0) {
			return 0;
		}
		return (n * m) / uocLonNhat;
	}
}
