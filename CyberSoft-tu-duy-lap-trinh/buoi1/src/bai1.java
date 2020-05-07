import java.util.Scanner;

import javax.swing.plaf.synth.Region;

public class bai1 {

	public static void main(String[] args) {
//		đầu vào (khai báo biến)
		Scanner sn=new Scanner(System.in);
		final int luongmotngay=100000; //khai báo biên là hằng số không được phép thay đổi giá trị lần 2 
		double ngayLam;
		double luong;
		
//		nhập dữ liệu
		
		System.out.println("-------------xin chào--------------");
		System.out.println("mời bạn nhập vào số ngày làm :");
		ngayLam=sn.nextInt();
		
//	    xử lý(tính toán của chương trình)
		
		
		luong=ngayLam*luongmotngay;
		
//		đầu ra (in ra kết quả của chương trình)
		
		System.out.println("lương của bạn là : "+luong );
	
	}
}
