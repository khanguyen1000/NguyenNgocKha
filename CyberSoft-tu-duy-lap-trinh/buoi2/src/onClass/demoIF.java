package onClass;

import java.util.Scanner;

public class demoIF {

	public static void main(String[] args) {
		//đầu vào 
		int so;
		Scanner sn=new Scanner(System.in);
		//nhập dữ liệu 
		System.out.print("mời bạn nhập số  :");
		so=sn.nextInt();
		//xử lý
		if(so<0) {
			so=-so;
		}
		//đầu ra
		System.out.println(so);

	}

}
