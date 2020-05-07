package Chuong1_LuuDoThuatToan;

import java.util.Scanner;

public class bai8 {

	public static void main(String[] args) {
		// đầu vào
		Scanner sn = new Scanner(System.in);
		int n;
		double S = 0;

		// nhập dữ liệu

		System.out.println("nhập n :");
		n = Integer.parseInt(sn.nextLine());
		// xử lý
		for (int i = 0; i <= n; i++) {
			S += (float) (2*i+1) / (2*i + 2);
		}
		// đầu ra
		System.out.println("s="+S);
		System.out.println("S round ="+ (double) Math.round(S * 1000)/1000);

	}

}
