package NguyenNgocKha_buoi4;

import java.util.Scanner;

public class bai6 {
	public static void main(String[] args) {
		gamedoanso();
	}

	public static void gamedoanso() {
		// đầu vào
		Scanner sn = new Scanner(System.in);
		int so_ngau_nhien = (int) (Math.random() * 999 + 1);
		int so;
		int solandoan = 1;
		// xử lý
		do {
			System.out.println("__________________________________________________");
//			System.out.println(so_ngau_nhien);
			System.out.println();
			System.out.println(" nhập vào số bạn đoán ");
			System.out.println();
			System.out.print("số :");
			so = sn.nextInt();

			if (so > so_ngau_nhien) {
				System.out.println("------------------------------------------");
				System.out.println("số lần đoán : " + solandoan);
				System.out.println();
				System.out.println("số bạn nhập lớn hơn số ngẫu nhiên");
				System.out.println();
				System.out.println("try-again");

			} else if (so < so_ngau_nhien) {
				System.out.println("------------------------------------------");
				System.out.println("số lần đoán : " + solandoan);
				System.out.println();
				System.out.println("số bạn nhập bé hơn số ngẫu nhiên");
				System.out.println();
				System.out.println("try-again");

			} else {
				System.out.println("------------------------------------------");
				System.out.println("bạn đã đoán đúng");
				System.out.println();
				System.out.println("số ngẫu nhiên : " + so_ngau_nhien);
				System.out.println();
				System.out.println("số lần đoán : " + solandoan);
				System.out.println();
				if (so == so_ngau_nhien) {
					break;
				}
			}
			solandoan++;
		} while (true);
	}
}
