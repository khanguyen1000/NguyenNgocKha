package NguyenNgocKha_buoi4;

import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		// đầu vào
		Scanner sn = new Scanner(System.in);
		float n = 1;
		float tg = 0;
		int i = 0;
		// nhập số liên tục, nhập 0 thì ngưng, in ra tổng

		while (true) {
			System.out.print("nhập " + (++i) + " :");
			n = sn.nextFloat();
			tg += n;
			if(n==0) {
				break;
			}
		}

//				do {
//					System.out.print("nhập n :");
//					n=sn.nextInt();
//					tg+=n;
//				}
//				while(n!=0);

		// đầu ra
		System.out.println();
		System.out.println("tổng " + i + " số trên :" + tg);
	}
}
