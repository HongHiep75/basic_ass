package basic_ass;

public class bai8 {

	public static void main(String[] args) {
//		Viết chương trình liệt kê tất cả các số thuận nghịch có sáu chữ số (số thuận nghịch là số đối
//				xứng nhau, ví dụ 123321, 9512159, ...).
		System.out.println("phan 8.a");
		soNghichThuan();
		
//		Viết chương trình liệt kê các số thuận nghịch có 6 chữ số mà tổng chữ số chiahết cho 10
		System.out.println("phan 8.b");
		soNghichThuanChiaHetCho10();
		
	}
	
	public static void soNghichThuan() {
		System.out.println("Số nhịch đảo: ");
		for(int i = 100; i < 1000; i++) {
			System.out.println( i + nghichDaoSo(i));
		}
	}
	public static String nghichDaoSo(int n) {
		String dapAn = "";
		String chuoiN = n +"";
		int lengt = chuoiN.length();
		for(int i = lengt -1; i >= 0; i--) {
			dapAn+= chuoiN.charAt(i);
		}
		return dapAn;
	}
	
	//8.b so nghich thuan tong chia het cho 10
	public static void soNghichThuanChiaHetCho10() {
		System.out.println("Số nhịch đảo tong chia het cho 10: ");
		String chuoiSoNhichDao = "";
		int soNgichDao;
		for(int i = 100; i < 1000; i++) {
			chuoiSoNhichDao = i + nghichDaoSo(i);
			soNgichDao = Integer.parseInt(chuoiSoNhichDao);
			if(tinhTong(soNgichDao)%10 == 0) {
				System.out.println(soNgichDao);
			}
		}
	}
	public static int tinhTong(int a) {
		if(a< 0) {
			return 0;
		}
		int tong = 0;
		String chuoiA = a + "";
		String[] mangA = chuoiA.split("");
		int n = mangA.length;
		for(int i = 0; i < n; i++) {
			tong+= Integer.parseInt(mangA[i]);
		}
		return tong;
	}
}
