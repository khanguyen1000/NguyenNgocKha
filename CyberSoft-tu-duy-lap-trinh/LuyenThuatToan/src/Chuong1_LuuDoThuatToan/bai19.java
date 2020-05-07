package Chuong1_LuuDoThuatToan;

import java.util.Scanner;

public class bai19 {

	public static void main(String[] args) {
		// dau vao
		Scanner sn = new Scanner(System.in);
		int n, m;
		double S = 1;
		int x;
		double vtren = 1;
		double vduoi = 1;
		// nhap du lieu
		System.out.println("nhap x: ");
		x = Integer.parseInt(sn.nextLine());
		System.out.println("nhap n: ");
		n = Integer.parseInt(sn.nextLine());
		for (int i = 0; i <= n; i++) {
			vtren = Math.pow(x, 2 * i+1);
			m = 2 * i+1;
			if(m==1) {
				vduoi=1;
			}else {
				vduoi = vduoi * m * (m - 1);
			}
			S += (double) vtren / vduoi;

		}
		// dau ra
		System.out.println("S=" + S);
//				System.out.println(" S =" + Math.round(S * 1000) / 1000);

	}

}
