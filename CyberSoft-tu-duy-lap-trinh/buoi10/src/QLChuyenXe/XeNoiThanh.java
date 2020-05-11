/**
 * Lớp chuyến xe nội thành thừa kế từ lớp Cha ChuyenXe
 * @author kha_ng
 * ngày tạo : 7-5-2020
 * phiên bản :1.0
 */

package QLChuyenXe;

public class XeNoiThanh extends ChuyenXe {
	// attribultes
	private int soTuyen;
	private float soKmDiDuoc;
	// constructors

	public XeNoiThanh() {
		super();
		this.soTuyen = 0;
		this.soKmDiDuoc = 0;
	}

	public XeNoiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, int soTuyen,
			float soKmDiDuoc) {
		super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
		this.soTuyen = soTuyen;
		this.soKmDiDuoc = soKmDiDuoc;
	}

	// get set methods
	public int getSoTuyen() {
		return soTuyen;
	}

	public void setSoTuyen(int soTuyen) {
		this.soTuyen = soTuyen;
	}

	public float getSoKmDiDuoc() {
		return soKmDiDuoc;
	}

	public void setSoKmDiDuoc(float soKmDiDuoc) {
		this.soKmDiDuoc = soKmDiDuoc;
	}

	// methods
	public void nhap() {

	}

	public void xuat() {
		super.xuat();
		System.out.println("số Tuyến : "+this.soTuyen);
		System.out.println("số km : "+this.soKmDiDuoc );
	}

	public double TinhDoanhThu() {
		return 0;
	}
}
