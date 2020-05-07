package onClass;

import java.util.Scanner;

public class demoVongLap {
	public static void main(String[] args) {
		// đầu vào
		// tính tổng n số đó và xuất kết quả
		Scanner sn = new Scanner(System.in);
		int n = -1;
		int tg = 0;
		int i = 1;
		// nhập dữ liệu
		while (n < 0) {
			System.out.print("nhập n: ");
			n = sn.nextInt();
		}
//		for(;;) {
//			System.out.print("nhập n: ");
//			n=sn.nextInt();
//			if(n>0)
//				break;
//			else
//				System.out.println("n>0 vui lòng nhập lại");
//		}
		// xử lý
		while (i <= n) {
			tg += i;
			i++;
		}
		// đầu ra
		System.out.println("kết quả tổng từ " + 1 + " đến " + n + " là " + tg);

	}
}
