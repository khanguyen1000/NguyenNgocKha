package Chuong1_LuuDoThuatToan;

import java.util.Scanner;

public class bai20 {

	public static void main(String[] args) {
		// dau vao
		Scanner sn = new Scanner(System.in);
		int n;
		String str=" ";
		// nhap du lieu
		System.out.println("nhap n :");
		n = Integer.parseInt(sn.nextLine());
		// xu ly
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				str += i+" ";
			}
		}
		//dau ra 
		System.out.println("cac ước số của "+n +" : " );
		System.out.println(str);
	}
}
