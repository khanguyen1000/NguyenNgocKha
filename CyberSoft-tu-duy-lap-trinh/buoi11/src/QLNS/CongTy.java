/**
 * lớp công ty gồm : tên công ty ,mã số thuế ,doanh thu tháng 
 * 
 * @author kha_ng
 * 
 * phiên bản : 1.0
 */
package QLNS;

import java.util.LinkedList;
import java.util.Scanner;

public class CongTy {

	// attributes
	private String tenCty;
	private String maSoThue;
	private double doanhThu;
	private LinkedList<NhanSu> listNS;

	// constructors
	public CongTy() {
		listNS = new LinkedList<NhanSu>();
		this.tenCty = null;
		this.maSoThue = null;
		this.doanhThu = 0;

	}

	public CongTy(String tenCty, String maSoThue, double doanhThu) {
		listNS = new LinkedList<NhanSu>();
		this.tenCty = tenCty;
		this.maSoThue = maSoThue;
		this.doanhThu = doanhThu;
	}

	// get set
	public String getTenCty() {
		return tenCty;
	}

	public void setTenCty(String tenCty) {
		this.tenCty = tenCty;
	}

	public String getMaSoThue() {
		return maSoThue;
	}

	public void setMaSoThue(String maSoThue) {
		this.maSoThue = maSoThue;
	}

	public double getDoanhThu() {
		return doanhThu;
	}

	public void setDoanhThu(double doanhThu) {
		this.doanhThu = doanhThu;
	}

	public LinkedList<NhanSu> getListNS() {
		return listNS;
	}

	public void setListNS(LinkedList<NhanSu> listNS) {
		this.listNS = listNS;
	}

	// methods
	public void nhapTTCty() {
		Scanner sn = new Scanner(System.in);
		System.out.println("----------------------");
		System.out.println();
		System.out.print("Tên Công ty : ");
		this.tenCty = sn.nextLine();
		System.out.println("----------------------");
		System.out.println();
		System.out.print("Mã số thuế : ");
		this.maSoThue = sn.nextLine();
		System.out.println("----------------------");
//		System.out.println("Doanh Thu : ");
//		this.doanhThu=sn.nextDouble();
	}

	public void xuatTTCty() {
		System.out.println("Tên cty : " + this.tenCty);
		System.out.println("");
	}

	public void nhapDSNS() {
		NhanSu ns1 = new GiamDoc("gd1", "giám đốc 1", "0329586", 220, "giám đốc", 300, 0.3f);
		NhanSu ns2 = new GiamDoc("gd2", "giám đốc 2", "0082736", 210, "giám đốc", 300, 0.2f);
		NhanSu ns3 = new GiamDoc("gd3", "giám đốc 3", "0749431", 200, "giám đốc", 300, 0.2f);
		NhanSu ns4 = new GiamDoc("gd4", "giám đốc 4", "0123956", 200, "giám đốc", 300, 0.3f);
		NhanSu ns5 = new TruongPhong("tp1", "Trưởng phòng 1", "1203021", 150, "trưởng phòng", 200, 3);
		NhanSu ns6 = new TruongPhong("tp2", "Trưởng phòng 2", "1203021", 190, "trưởng phòng", 200, 2);
		NhanSu ns7 = new TruongPhong("tp3", "Trưởng phòng 3", "1203021", 140, "trưởng phòng", 200, 4);
		NhanSu ns8 = new NhanVien("nv1", "Nhân viên 1", "1230123", 25, "nhân viên", 100, "tp1");
		NhanSu ns9 = new NhanVien("nv2", "Nhân viên 2", "5612671", 35, "nhân viên", 100, "tp1");
		NhanSu ns10 = new NhanVien("nv3", "Nhân viên 3", "1233123", 55, "nhân viên", 100, "tp1");
		NhanSu ns11 = new NhanVien("nv4", "Nhân viên 4", "1976533", 15, "nhân viên", 100, "tp2");
		NhanSu ns12 = new NhanVien("nv5", "Nhân viên 5", "1123233", 5, "nhân viên", 100, "tp2");
		NhanSu ns13 = new NhanVien("nv6", "Nhân viên 6", "8766886", 45, "nhân viên", 100, "tp3");
		NhanSu ns14 = new NhanVien("nv7", "Nhân viên 7", "5457645", 75, "nhân viên", 100, "tp3");
		NhanSu ns15 = new NhanVien("nv8", "Nhân viên 8", "1230123", 35, "nhân viên", 100, "tp3");
		NhanSu ns16 = new NhanVien("nv9", "Nhân viên 9", "8678678", 65, "nhân viên", 100, "tp3");
		this.listNS.add(ns1);
		this.listNS.add(ns2);
		this.listNS.add(ns3);
		this.listNS.add(ns4);
		this.listNS.add(ns5);
		this.listNS.add(ns6);
		this.listNS.add(ns7);
		this.listNS.add(ns8);
		this.listNS.add(ns9);
		this.listNS.add(ns10);
		this.listNS.add(ns11);
		this.listNS.add(ns12);
		this.listNS.add(ns13);
		this.listNS.add(ns14);
		this.listNS.add(ns15);
		this.listNS.add(ns16);
		
	}

	public void xuatDSNS() {
		for (NhanSu ns : this.listNS) {
			System.out.println("______________________________________");
			ns.xuat();
		}
	}

	public void themNS() {
		Scanner sn = new Scanner(System.in);
		NhanSu ns;
		System.out.println("chọn chức vụ ('nv','tp','gd' ):");
		String cv = sn.nextLine();
		switch (cv) {
		case "nv": {
			ns = new NhanVien();
			ns.nhap();
			this.listNS.add(ns);
			break;
		}
		case "tp": {
			ns = new TruongPhong();
			ns.nhap();
			this.listNS.add(ns);
			break;
		}
		case "gd": {
			ns = new GiamDoc();
			ns.nhap();
			this.listNS.add(ns);
			break;
		}
		default: {
			System.out.println("vui lòng chọn \n 'nv' hoặc 'tp' hoặc 'gd' ");
			break;
		}
		}
	}

}
