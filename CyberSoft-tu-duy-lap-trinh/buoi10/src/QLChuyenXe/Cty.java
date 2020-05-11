/**
 * Lớp Cty là lớp gồm danh sách chuyến xe 
 * @author kha_ng
 * ngày tạo : 7-5-2020
 * phiên bản :1.0
 */
package QLChuyenXe;

import java.util.LinkedList;
import java.util.Scanner;

public class Cty {
	// attributes
	private LinkedList<ChuyenXe> ListChuyenXe;

	// constructors
	public Cty() {
		ListChuyenXe = new LinkedList<ChuyenXe>();
	}

	public Cty(LinkedList<ChuyenXe> listChuyenXe) {
		ListChuyenXe = listChuyenXe;
	}
	// get set

	public LinkedList<ChuyenXe> getListChuyenXe() {
		return ListChuyenXe;
	}

	public void setListChuyenXe(LinkedList<ChuyenXe> listChuyenXe) {
		ListChuyenXe = listChuyenXe;
	}

	//
	public void khoitao() {
		ChuyenXe cx1 = new XeNoiThanh("01", "tài Xế 2", "1111", 10, 1, 10);
		ChuyenXe cx2 = new XeNoiThanh("02", "tài Xế 2", "2222", 9, 2, 9);
		ChuyenXe cx3 = new XeNoiThanh("03", "tài Xế 2", "3333", 21, 3, 30);
		ChuyenXe cx4 = new XeNoiThanh("04", "tài Xế 4", "4444", 24, 4, 20);
		ChuyenXe cx5 = new XeNgoaiThanh("05", "tài xế 5", "5555", 10, "Tây Ninh", 70);
		ChuyenXe cx6 = new XeNgoaiThanh("06", "tài xế 6", "6666", 25, "Bà Rịa", 103);
		ChuyenXe cx7 = new XeNgoaiThanh("07", "tài xế 7", "7777", 15, "Hóc Môn", 20);
		ChuyenXe cx8 = new XeNgoaiThanh("08", "tài xế 8", "8888", 7, "Long An", 35);
		ChuyenXe cx9 = new XeNgoaiThanh("09", "tài xế 9", "9999", 5, "Củ chi", 30);

		this.ListChuyenXe.add(cx1);
		this.ListChuyenXe.add(cx2);
		this.ListChuyenXe.add(cx3);
		this.ListChuyenXe.add(cx4);
		this.ListChuyenXe.add(cx5);
		this.ListChuyenXe.add(cx6);
		this.ListChuyenXe.add(cx7);
		this.ListChuyenXe.add(cx8);
		this.ListChuyenXe.add(cx9);

	}

	public void xuatList() {
		for (ChuyenXe cx : this.ListChuyenXe) {
			cx.xuat();
		}
	}

	// methods
	public float tinhTongDoanhThuNoiThanh() {
		float tong = 0;
		for (ChuyenXe cx : this.ListChuyenXe) {
			// instanceof :thể hiện ,là đối tượng của ...
			// c# => SHAPE is CIRCLE
			if (cx instanceof XeNoiThanh) {
				tong += cx.getDoanhThu();
			}
		}

		return tong;
	}

	public float tinhTongDoanhThuNgoaiThanh() {
		float tong = 0;
		for (ChuyenXe cx : this.ListChuyenXe) {
			// java => instanceof :thể hiện ,là đối tượng của ...
			// c++ => typeId.name
			// c# => is
			if (cx instanceof XeNgoaiThanh) {
				tong += cx.getDoanhThu();
			}
		}

		return tong;
	}

	// tim chuyến xe theo mã chuyến nếu tìm thấy thì in chuyến xe đó
	// ko tìm thầy thì thông báo "không tìn thấy"
	public ChuyenXe timChuyenXeTheoMaChuyen() {
		ChuyenXe cx = new ChuyenXe();
		Scanner sn = new Scanner(System.in);
		System.out.println("nhập mã chuyến xe :");
		String mcx = sn.nextLine();
		for (ChuyenXe chuyenxe : this.ListChuyenXe) {
			if (chuyenxe.getMaSoChuyen().equalsIgnoreCase(mcx)) {
				cx = chuyenxe;
				break;
			}
		}
		return cx;
	}

	public LinkedList<ChuyenXe> timChuyenXeTheoTaiXe(){
		LinkedList<ChuyenXe> kq=new LinkedList<ChuyenXe>();
		Scanner sn =new Scanner(System.in);
		System.out.println("Nhập tên tài xe :");
		String ten=sn.nextLine();
		for(ChuyenXe cx:this.ListChuyenXe) {
			if(cx.getHoTenTaiXe().equalsIgnoreCase(ten)) {
				kq.add(cx);
			}
		}
		if(kq.size()==0) {
			System.out.println("không tìm thấy tài xế này");
		}
		return kq;
	}
}
