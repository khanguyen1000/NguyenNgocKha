/**
 * lớp Giám Đốc  thừa kế bởi lớp nhân sự và có 1 thuộc tính riêng là 'cổ phần '
 * 
 *  @author kha_ng
 *  
 *  ngày tạo : 9-5-2020
 *  
 *  phiên bản :1.0
 * 
 */
package QLNS;

import java.util.Scanner;

public class GiamDoc extends NhanSu{
	//attributes 
	private float coPhan;
	
	//constructors
	public GiamDoc() {
		super();
		this.coPhan = 0;
	}
	
	public GiamDoc(String maSo, String hoTen, String sdt, int soNgayLam, String chucVu, double luong1Ngay,float coPhan) {
		super(maSo, hoTen, sdt, soNgayLam, chucVu, luong1Ngay);
		this.coPhan = coPhan;
	}

	//get set
	public float getCoPhan() {
		return coPhan;
	}


	public void setCoPhan(float coPhan) {
		this.coPhan = coPhan;
	}
	
	//methods
	public void nhap() {
		super.nhap();
		Scanner sn =new Scanner(System.in);
		System.out.print("cổ phần : ");
		this.coPhan=sn.nextFloat();
	}
	public void xuat() {
		super.xuat();
		System.out.println("Cổ phần : "+this.coPhan);
	}
	public double TinhLuong() {
		return super.cachTinhLuong();
	}
}
