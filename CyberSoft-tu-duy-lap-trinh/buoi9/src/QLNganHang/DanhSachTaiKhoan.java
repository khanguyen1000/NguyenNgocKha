package QLNganHang;

import java.util.LinkedList;
import java.util.Scanner;

public class DanhSachTaiKhoan {
	// attributes
	private LinkedList<TaiKhoan> ListTK;

	// constructors
	public DanhSachTaiKhoan() {
		this.ListTK = new LinkedList<TaiKhoan>();
	}

	public DanhSachTaiKhoan(LinkedList<TaiKhoan> listTK) {
		ListTK = listTK;
	}

	// methods
	public void nhapDSTK() {
		TaiKhoan tk1 = new TaiKhoan("STK1", "Tên Tài Khoản 1", 3990000);
		this.ListTK.add(tk1);
		TaiKhoan tk2 = new TaiKhoan("STK2", "Tên Tài Khoản 2", 1200000);
		this.ListTK.add(tk2);
		TaiKhoan tk3 = new TaiKhoan("STK3", "Tên Tài Khoản 3", 1990000);
		this.ListTK.add(tk3);
		TaiKhoan tk4 = new TaiKhoan("STK4", "Tên Tài Khoản 4", 2990000);
		this.ListTK.add(tk4);
		TaiKhoan tk5 = new TaiKhoan("STK5", "Tên Tài Khoản 5", 4090000);
		this.ListTK.add(tk5);
		TaiKhoan tk6 = new TaiKhoan("STK6", "Tên Tài Khoản 6", 1620000);
		this.ListTK.add(tk6);
		TaiKhoan tk7 = new TaiKhoan("STK7", "Tên Tài Khoản 7", 7990000);
		this.ListTK.add(tk7);
	}

	public void xuatDSTK() {
		for (TaiKhoan tk : this.ListTK) {
			tk.xuat();
			System.out.println();
		}
	}
	public void CapnhatDanhSach(TaiKhoan tk) {
		for(TaiKhoan taikhoan :this.ListTK) {
			if(taikhoan.getSoTK()==tk.getSoTK()) {
				taikhoan.setSoTienTK(tk.getSoTienTK());
				break;
			}
		}
	}
	public boolean kiemTraTaiKhoan(TaiKhoan tk,String alert) {
		Scanner sn=new Scanner(System.in);
		boolean kq = false;
		System.out.println("nhập số tài khoản "+alert+":");
		String stk=sn.nextLine();
		for (TaiKhoan taikhoan : this.ListTK) {
			if (taikhoan.getSoTK().equalsIgnoreCase(stk)) {
				tk.setSoTK(taikhoan.getSoTK());
				tk.setTenTK(taikhoan.getTenTK());
				tk.setSoTienTK(taikhoan.getSoTienTK());
				kq = true;
				break;
			}
		}
		return kq;
	}

}
