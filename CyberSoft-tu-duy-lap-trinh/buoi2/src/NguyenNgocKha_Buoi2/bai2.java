package NguyenNgocKha_Buoi2;

import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		//đầu vào
		Scanner sn=new Scanner(System.in);
		float a,b,c;
		//nhập dữ liệu
		System.out.println("----mời bạn nhập 3 số thực----");
		System.out.print("a = "); a=sn.nextFloat();
		System.out.print("b = "); b=sn.nextFloat();
		System.out.print("c = "); c=sn.nextFloat();
		//xử lý 
		if(a<0) {
			a=-a;
		}
		if(b<0) {
			b=-b;
		}
		if(c<0) {
			c=-c;
		}
		//đầu ra
		System.out.println("--sau khi tính trị tuyệt đối --- ");
		System.out.println("a = " +a);
		System.out.println("b = " +b);
		System.out.println("c = "+ c);
	}
                          
}
