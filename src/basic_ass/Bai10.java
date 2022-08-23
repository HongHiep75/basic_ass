package basic_ass;

import java.util.regex.Pattern;

//Viết chương trình liệt kê các số nguyên có 7 chữ số thoả mãn cả 3 điều kiện sau:
//- Là số nguyên tố.
//- Tất cả các chữ số là nguyên tố.
//- Đảo của nó cũng là một số nguyên tố.
public class Bai10 {
	public static void main(String[] args) {
		hienSoNguyenTo();
	}
	
public static void hienSoNguyenTo() {
		
		String chuoiI ;
		for(int i = 1000000; i < 10000000; i++) {
				if(kiemTraSoNguyenTo(i)) {
					chuoiI = i + "";
					String[] mangI = chuoiI.split("");
					if(kiemTraCacChuSo(mangI)) {
						if(kiemTraNghichDao(mangI)) {
							System.out.println(chuoiI);
						}
					}
				}
		}
	
	}
    public static boolean kiemTraNghichDao(String[] mangI) {

    	int n = mangI.length;
    	String chuoiI = "";
    	for(int i = n - 1; i >=0; i--) {
    		chuoiI+= mangI[i];
    	}
    	if(kiemTraSoNguyenTo(Integer.parseInt(chuoiI))) {
    		return true;
    	}
    	
	return false;
}

	// kiem tra Tất cả các chữ số là nguyên tố 
	public static boolean kiemTraCacChuSo(String[] a) {
	int n = a.length;
	for(int i = 0; i < n; i++) {
		if(!kiemTraSoNguyenTo(Integer.parseInt(a[i]))) {
			return false;
		}
	}	
	return true;
}

	public static boolean kiemTraSoNguyenTo(int n) {
		if(n == 0 || n == 1) {
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
