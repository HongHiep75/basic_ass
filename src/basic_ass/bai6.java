package basic_ass;

import java.util.Scanner;

//Nhập vào một số nguyên từ bàn phím, viết chương trình phân tích số đó thành các
//thừa số nguyên tố. Ví dụ: 28=2x2x7
public class bai6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap a");
		int a = sc.nextInt();
		thuaSoNguyenTo(a);
	}

	public static void thuaSoNguyenTo(int n) {
		if (n == 0 || n == 1) {
			System.out.println(n + " : không có thừa số nguyên tố");
		}

		int soChia = 2;
		String dapAn = "";
		while (n != 1) {
			if (n % soChia == 0) {
				dapAn += soChia + "x";
				n /= soChia;
			} else {
				soChia++;
			}
		}

		System.out.println(dapAn.substring(0, dapAn.length() - 1));
	}
}
