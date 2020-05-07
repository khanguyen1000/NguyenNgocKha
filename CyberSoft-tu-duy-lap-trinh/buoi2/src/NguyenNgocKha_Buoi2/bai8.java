package NguyenNgocKha_Buoi2;

import java.util.Scanner;

public class bai8 {
	public static void main(String[] args) {
		//đầu vào
		Scanner sn=new Scanner(System.in);
		String tenMH;
		double soLuong;
		double donGia;
		double discount;
		String giam="";
		double tien;
		//nhập dữ liệu 
		System.out.println("--mời bạn nhập thông tin mặt hàng--");
		System.out.print("tên mặt hàng :");
		tenMH=sn.nextLine();
		System.out.print("số lượng :" );
		soLuong=sn.nextDouble();
		System.out.println("đơn giá :" );
		donGia=sn.nextDouble();
		//xử lý
		tien=soLuong*donGia;
		if(soLuong>100) {
			discount=0.12;
			giam="giảm 12%";
		}else if(soLuong>50) {
			discount=0.08;
			giam="giảm 8%";
		}else {
			discount=0;
			giam="không có giảm";
		}
//		tien=tien-tien*discount;
		//đầu ra
		System.out.println("-----------kết--quả----------------");
		System.out.println(" mặt hàng :"+tenMH);
		System.out.println("số lượng :"+soLuong);
		System.out.println("đơn giá : "+donGia);
		if(discount!=0) {
			System.out.println("giá góc : "+tien);
			System.out.println("trạng thái : "+giam);	
		}
		System.out.println("thành tiền  : "+(tien-tien*discount));
		
	}
}
