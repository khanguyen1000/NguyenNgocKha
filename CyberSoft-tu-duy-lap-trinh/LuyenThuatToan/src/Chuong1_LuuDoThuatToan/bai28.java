package Chuong1_LuuDoThuatToan;

import java.util.Scanner;

public class bai28 {

	public static void main(String[] args) {
		//đầu vào
		Scanner sn=new Scanner(System.in);
		int n;
		int S=0;
		//nhập dữ liệu
		System.out.println("nhập n");
		n=Integer.parseInt(sn.nextLine());
		
		//xử lý
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(" "+i+(i==n?"\n":" ,"));
				if(i<n) {
					S+=i;
				}
			}
		}
		//đầu ra
		System.out.println(" tổng các ước số nhỏ hơn số nguyên dương n :"+S);
	}

}
