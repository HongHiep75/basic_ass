package basic_ass;

import java.util.regex.Pattern;

//Viết chương trình liệt kê các số nguyên tố có 6 chữ số chỉ bao gồm các chữ số lẻ.
public class bai7 {
	public static void main(String[] args) {
		hienSoNguyenToToanSoLe();
	}

	public static void hienSoNguyenToToanSoLe() {

		Pattern p = Pattern.compile("[02468]");
		for (int i = 100000; i < 1000000; i++) {
			if (!p.matcher(i + "").find()) {
				if (kiemTraSoNguyenTo(i)) {
					System.out.println(i);
				}
			}
		}

	}

	public static boolean kiemTraSoNguyenTo(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i <= (int) Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
