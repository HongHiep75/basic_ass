package basic_ass;
//Viết chương trình liệt kê các số nguyên có 7 đến 9 chữ số thoả mãn cả 3 điều kiện sau:

//- Là số thuận nghịch.
//- Chỉ có chữ số 0, 6, 8.
//- Tổng chữ số chia hết cho 10.

import java.util.regex.Pattern;

public class Bai9 {
	public static void main(String[] args) {
		soNghichThuan();
	}

	public static void soNghichThuan() {
		System.out.println("Số nhịch đảo : ");
		Pattern p = Pattern.compile("[1234579]");
		Pattern p1 = Pattern.compile("[0]");
		Pattern p2 = Pattern.compile("[6]");
		Pattern p3 = Pattern.compile("[8]");
		String chuoiSoNhichDao = "";
		int soNgichDao;
		String chuoiI;
		for (int i = 1000; i < 10000; i++) {
			chuoiI = i + "";
			if (!p.matcher(chuoiI).find() && p1.matcher(chuoiI).find() && p2.matcher(chuoiI).find()
					&& p3.matcher(chuoiI).find()) {
				chuoiSoNhichDao = i + nghichDaoSo(chuoiI);
				soNgichDao = Integer.parseInt(chuoiSoNhichDao);
				if (tinhTong(soNgichDao) % 10 == 0) {
					System.out.println(soNgichDao);
				}
			}
		}
	}

	public static String nghichDaoSo(String n) {
		String dapAn = "";
		int lengt = n.length();
		for (int i = lengt - 1; i >= 0; i--) {
			dapAn += n.charAt(i);
		}
		return dapAn;
	}

	// tinh tổng các chữ số của một số nguyên
	public static int tinhTong(int a) {
		if (a < 0) {
			return 0;
		}
		int tong = 0;
		String chuoiA = a + "";
		String[] mangA = chuoiA.split("");
		int n = mangA.length;
		for (int i = 0; i < n; i++) {
			tong += Integer.parseInt(mangA[i]);
		}
		return tong;
	}

}
