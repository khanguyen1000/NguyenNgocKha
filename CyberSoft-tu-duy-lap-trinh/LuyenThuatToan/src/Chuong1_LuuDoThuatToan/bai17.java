package Chuong1_LuuDoThuatToan;

import java.util.Scanner;

public class bai17 {

	public static void main(String[] args) {
		//dau vao 
		Scanner sn =new Scanner(System.in);
		int n;
		double S=0;
		int x;
		double vtren=1;
		double vduoi=1;
		//nhap du lieu
		System.out.println("nhap x: ");
		x=Integer.parseInt(sn.nextLine());
		System.out.println("nhap n: ");
		n=Integer.parseInt(sn.nextLine());
		for(int i=1;i<=n;i++) {
			vtren=Math.pow(x, i);
				vduoi*=i;
			S+=(float)vtren/vduoi;
			
		}
		//dau ra
		System.out.println(" S ="+Math.round(S*1000)/1000);
	}

}
