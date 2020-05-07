package Chuong1_LuuDoThuatToan;

import java.util.Scanner;

public class bai33 {

	public static void main(String[] args) {
		//đầu vào
		Scanner sn=new Scanner(System.in);
		int n;
		double S=Math.sqrt(2);
		//nhập dữ liệu
		System.out.println("nhập n: ");
		n=Integer.parseInt(sn.nextLine());
		//xử lý
		for(int i=2;i<=n;i++) {
			
				S=Math.sqrt(2+S);
			
		}
		
		//đầu ra
		System.out.println(" S(n) = "+S);

	}

}
