package Chuong1_LuuDoThuatToan;

import java.util.Scanner;

public class bai2 {
	//Tính S(n) = 1^2 + 2^2 + 3^2 + … + n^2
	public static void main(String[] args) {
		//đầu vào
		Scanner sn =new Scanner(System.in);
		int n;
		int S=0;
		
		//nhập dữ liệu
		
		System.out.println("nhập n :");
		n = Integer.parseInt(sn.nextLine());
		//xử lý
		for(int i=1;i<=n;i++) {
			S+= i*i;
		}
		//đầu ra
		System.out.println(" S= "+S );
		

	}

}
