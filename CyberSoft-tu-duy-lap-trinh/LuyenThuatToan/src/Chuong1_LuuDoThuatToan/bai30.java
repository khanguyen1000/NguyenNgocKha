package Chuong1_LuuDoThuatToan;

import java.util.Scanner;

public class bai30 {

	public static void main(String[] args) {
		// đầu vào
		Scanner sn=new Scanner(System.in);
		int n;
		int S=0;
		//nhập dữ liệu
		System.out.println("nhập n :");
		n=Integer.parseInt(sn.nextLine());
		//xử lý
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(" "+i+(i==n?"\n":" ,"));
				S+=i;
			}
		}
		
		//đầu ra
		if(S==n) {
			System.out.println(" n là số hoàn thiện ");
		}else {
			System.out.println("n không phải là số hoàn thiện");
		}

	}

}
