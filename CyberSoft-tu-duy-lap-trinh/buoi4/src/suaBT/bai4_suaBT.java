package suaBT;

import java.util.Scanner;

public class bai4_suaBT {

	public static void main(String[] args) {
		// đầu vào
		Scanner sn = new Scanner(System.in);
		int n;
		int giaithua = 1;
		// nhập dữ liệu
		System.out.println("mời bạn nhập số n: ");
		n = sn.nextInt();
		// xử lý
		if (n >= 0) {
			while (n > 1) {
				giaithua *= n;
				n--;

			}
		System.out.println("kết quả là:" + giaithua);
		} else {
			System.out.println("lỗi ");
		}
		// đầu ra
		

	}

}
