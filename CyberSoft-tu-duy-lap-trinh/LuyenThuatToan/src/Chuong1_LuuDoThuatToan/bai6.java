package Chuong1_LuuDoThuatToan;

import java.util.Scanner;

public class bai6 {

	public static void main(String[] args) {
		// đầu vào
		Scanner sn = new Scanner(System.in);
		int n;
		double S = 0;

		// nhập dữ liệu

		System.out.println("nhập n :");
		n = Integer.parseInt(sn.nextLine());
		// xử lý
		for (int i = 1; i <= n; i++) {
			S += (float) 1 / (i * (i + 1));
		}
		// đầu ra
		System.out.println(" S= " + S);

	}

}
