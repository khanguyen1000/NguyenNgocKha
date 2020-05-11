/**
 * Lớp chuyến xe ngoại thành thừa kế từ lớp Cha ChuyenXe
 * @author kha_ng
 * ngày tạo : 7-5-2020
 * phiên bản :1.0
 */
package QLChuyenXe;

public class XeNgoaiThanh extends ChuyenXe{
	//attributes
	private String noiDen;
	private int soNgayDiduoc;
	//constructors
	public XeNgoaiThanh() {
		super();
		this.noiDen = "";
		this.soNgayDiduoc = 0;
	}
	public XeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu,String noiDen, int soNgayDiduoc) {
		super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
		this.noiDen = noiDen;
		this.soNgayDiduoc = soNgayDiduoc;
	}

	//get set methods
	public String getNoiDen() {
		return noiDen;
	}
	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}
	public int getSoNgayDiduoc() {
		return soNgayDiduoc;
	}
	public void setSoNgayDiduoc(int soNgayDiduoc) {
		this.soNgayDiduoc = soNgayDiduoc;
	}
	//methods
	public void nhap() {
		
	}
	public void xuat() {
		super.xuat();
		System.out.println("nơi đến : "+this.noiDen);
		System.out.println("số ngày : "+this.soNgayDiduoc);
		
	}
	public double tinhDoanhThu() {
		return 0;
	}
}
