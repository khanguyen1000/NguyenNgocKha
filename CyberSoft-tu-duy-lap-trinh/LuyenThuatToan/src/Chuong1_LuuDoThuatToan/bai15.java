package Chuong1_LuuDoThuatToan;

import java.util.Scanner;

public class bai15 {

	public static void main(String[] args) {
		// đầu vào
		Scanner sn = new Scanner(System.in);
		int n, x;
		int tog=0;
		double S = 0;
		double Thg = 1;
		// nhập dữ liệu
		System.out.println("nhập n :");
		n = Integer.parseInt(sn.nextLine());
		// xử lý
		for (int i = 1; i <= n; i++) {
			tog+=i;
			Thg=(float)1/tog;
			S += Thg;
		}
		// đầu ra
		System.out.println("s=" + (double) Math.round(S*1000)/1000);

	}

}
