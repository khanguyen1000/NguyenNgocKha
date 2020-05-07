package NguyenNgocKha_Buoi2;

import java.util.Scanner;

public class bai7 {
	public static void main(String[] args) {
		//đầu vào
		Scanner sn= new Scanner(System.in);
		String ten;
		float toan,ly,hoa;
		float dtb;
		String xeploai;
		//nhập dữ liệu
		System.out.println("mời bạn nhập thông tin sv :");
		System.out.print("nhập tên :");
		ten=sn.nextLine();
		System.out.print("Toán :");
		toan=sn.nextFloat();
		System.out.print("Lý :");
		ly=sn.nextFloat();
		System.out.print("Hoá :");
		hoa=sn.nextFloat();
//		System.out.print("dtb =");
//		dtb=sn.nextFloat();
		//xử lý
		dtb=(toan+ly+hoa)/3;
		if(dtb>=8.5) {
			xeploai="giỏi";
		}else if(dtb>=6.5) {
			xeploai="khá";
		}else if(dtb>=5) {
			xeploai="trung bình";
		}else {
			xeploai="yếu xìu";
		}
		//đầu ra 
		System.out.println("sinh viên : "+ten);
		System.out.println("Toán: "+toan+" Lý: "+ly+" Hoá: "+hoa);
		System.out.println("điểm trung bình :" +dtb);
		System.out.println("----> xếp loại "+xeploai);
	}
}
