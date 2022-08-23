package basic_ass;

import java.util.Scanner;

//Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ nhập vào từ bàn phím.
public class bai5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap a");
		int a = sc.nextInt();
		System.out.println(tinhTong(a));
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
