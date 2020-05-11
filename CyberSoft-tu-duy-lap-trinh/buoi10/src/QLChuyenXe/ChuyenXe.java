/** lớp ChuyenXe gồm mã số chuyến , họ tên tài xe , số xe , doanh thu 
 * @author kha_ng
 * Ngày tạo: 7-5-2020
 * phiên bản : 1.0
 */

package QLChuyenXe;

public class ChuyenXe {
	//attributes
	private String maSoChuyen;
	private String hoTenTaiXe;
	private String soXe;
	private double doanhThu;
	//constructors
	public ChuyenXe() {
		this.maSoChuyen = null;
		this.hoTenTaiXe = null;
		this.soXe = "";
		this.doanhThu = 0;
		}
	public ChuyenXe(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
		this.maSoChuyen = maSoChuyen;
		this.hoTenTaiXe = hoTenTaiXe;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
	}
	
	//get set methods
	public String getMaSoChuyen() {
		return maSoChuyen;
	}
	public void setMaSoChuyen(String maSoChuyen) {
		this.maSoChuyen = maSoChuyen;
	}
	public String getHoTenTaiXe() {
		return hoTenTaiXe;
	}
	public void setHoTenTaiXe(String hoTenTaiXe) {
		this.hoTenTaiXe = hoTenTaiXe;
	}
	public String getSoXe() {
		return soXe;
	}
	public void setSoXe(String soXe) {
		this.soXe = soXe;
	}
	public double getDoanhThu() {
		return doanhThu;
	}
	public void setDoanhThu(double doanhThu) {
		this.doanhThu = doanhThu;
	}
	//methods
	public void nhap() {
		
	}
	public void xuat() {
		if(this.maSoChuyen!=null) {
		System.out.println("Mã số chuyến : "+this.maSoChuyen);
		System.out.println("Họ tên tài xe : "+this.hoTenTaiXe);
		System.out.println("Số xe :" +this.soXe);
		System.out.println("doanh thu : "+this.doanhThu);
		}else {
			System.out.println("không tìm thấy chuyến xe ");
		}
	}
	public double TinhDoanhThu() {
		return 0;
	}
}
