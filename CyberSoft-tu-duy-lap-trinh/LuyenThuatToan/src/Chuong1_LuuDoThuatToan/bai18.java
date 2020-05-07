package Chuong1_LuuDoThuatToan;

import java.util.Scanner;

public class bai18 {

	public static void main(String[] args) {
		// dau vao
		Scanner sn = new Scanner(System.in);
		int n,m;
		double S = 1;
		int x;
		double vtren = 1;
		double vduoi = 1;
		// nhap du lieu
		System.out.println("nhap x: ");
		x = Integer.parseInt(sn.nextLine());
		System.out.println("nhap n: ");
		n = Integer.parseInt(sn.nextLine());
		for (int i = 1; i <= n; i++) {
			vtren = Math.pow(x,2*i);
//			vduoi=1;
			 m=2*i;
//			for(int j=1;j<=m;j++) {
//					vduoi*=j;
//			}
			vduoi=vduoi*m*(m-1);
			S += (double) vtren / vduoi;
			

		}
		// dau ra
		System.out.println("S=" +S);
//		System.out.println(" S =" + Math.round(S * 1000) / 1000);

	}

}
