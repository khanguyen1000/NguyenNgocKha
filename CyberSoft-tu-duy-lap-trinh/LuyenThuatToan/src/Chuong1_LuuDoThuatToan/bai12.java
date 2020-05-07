package Chuong1_LuuDoThuatToan;

import java.util.Scanner;

public class bai12 {

	public static void main(String[] args) {
		// đầu vào
		Scanner sn = new Scanner(System.in);
		int n,x;
		double S = 0;
		double T = 1;
		// nhập dữ liệu
		System.out.println("nhập x :");
		x=Integer.parseInt(sn.nextLine());
		System.out.println("nhập n :");
		n = Integer.parseInt(sn.nextLine());
		// xử lý
		for (int i = 1; i <= n; i++) {
			T*=x;
			S += T;
		}
		// đầu ra
		System.out.println("s=" + S);
	}

}
