package NguyenNgocKha_buoi4;

import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {
		// đầu vào
		Scanner sn = new Scanner(System.in);
		float n;
		float tg = 0;
		int i = 0;
		// nhập số liên tục, nhập 0 thì ngưng, in ra tổng các số chẵn
		do {
			System.out.print("nhập số thứ " + (++i) + ":");
			n = sn.nextFloat();
			if (n % 2 == 0) {
				tg += n;
				
			}
			if(n==0) {
				break;
			}
		} while (true);

		// đầu ra
		System.out.println();
		System.out.println("tổng các số chẵn là :" + tg);

	}

}
