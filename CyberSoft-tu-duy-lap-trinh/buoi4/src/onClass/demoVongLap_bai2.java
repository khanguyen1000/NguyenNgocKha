package onClass;

import java.util.Scanner;

public class demoVongLap_bai2 {
	public static void main(String[] args) {
		// đầu vào
		Scanner sn = new Scanner(System.in);
		int n = 1;
		int tg = 0;
		int i = 0;
		// nhập số liên tục, nhập 0 thì ngưng, in ra tổng

		while (n != 0) {
			System.out.print("nhập " + (++i) + " :");
			n = sn.nextInt();

			tg += n;
		}

//		do {
//			System.out.print("nhập n :");
//			n=sn.nextInt();
//			tg+=n;
//		}
//		while(n!=0);

		// đầu ra
		System.out.println("tổng " + i + " số trên :" + tg);
	}
}
