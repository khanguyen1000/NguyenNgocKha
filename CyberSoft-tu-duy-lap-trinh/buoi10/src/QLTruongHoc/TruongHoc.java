package QLTruongHoc;

import java.util.LinkedList;

public class TruongHoc {
	//attributes
	private LinkedList<Nguoi> listNg;
	//constructors
	public TruongHoc() {
		listNg=new LinkedList<Nguoi>();
	}
	public TruongHoc(LinkedList<Nguoi> listNg) {
		this.listNg = listNg;
	}
	//methods
	public void nhap() {
		Nguoi ng1=new GiaoVien("giáo viên 1 ",1975,"TP HCM", "ABC",2000,"tự nhiên");
		this.listNg.add(ng1);
		Nguoi ng2=new GiaoVien("giáo viên 2 ",1985,"TP HCM", "ABC",2007,"Xã hội");
		this.listNg.add(ng2);
		Nguoi ng3=new GiaoVien("giáo viên 3 ",1980,"TP HCM", "ABC",2004,"tự nhiên");
		this.listNg.add(ng3);
		Nguoi ng4=new GiaoVien("giáo viên 4 ",1991,"TP HCM", "ABC",2017,"Xã hội");
		this.listNg.add(ng4);
		Nguoi ng5=new HocSinh("học sinh 1",2000,"Hà nội","đống đa",7,8.6,9);
		this.listNg.add(ng5);
		Nguoi ng6=new HocSinh("học sinh 2",2000,"Hà nội","đống đa",9,8.6,5.5);
		this.listNg.add(ng6);
		Nguoi ng7=new HocSinh("học sinh 3",2000,"Hà nội","đống đa",10,8.6,9.3);
		this.listNg.add(ng7);
		Nguoi ng8=new HocSinh("học sinh 4",2000,"Hà nội","đống đa",5,6,7);
		this.listNg.add(ng8);
	}
	public void xuat() {
		for(Nguoi ng: this.listNg) {
			ng.xuat();
		}
	}
	public LinkedList<Nguoi> timGiaoVienCoThamNienCaoNhat(){
		LinkedList<Nguoi> kq=new LinkedList<Nguoi>();
		int max=0;
		for(Nguoi ng:this.listNg) {
				if(ng instanceof GiaoVien) {
					if(((GiaoVien) ng).tinhThamNien()>max) {
						max=((GiaoVien) ng).tinhThamNien();
					}
				}
			}
		for(Nguoi ng:this.listNg) {
			if(ng instanceof GiaoVien) {
				if(((GiaoVien) ng).tinhThamNien()==max) {
					kq.add(ng);
				}
			}
		}
		return kq;
	}
	public LinkedList<Nguoi> timGiaoVienCo5NamThamNienTuNhien(){
		LinkedList<Nguoi> kq= new LinkedList<Nguoi>();
		
		for(Nguoi ng :this.listNg) {
			if(ng instanceof GiaoVien) {
				if(((GiaoVien) ng).tinhThamNien()>5 && ((GiaoVien) ng).getChuyenMon()=="tự nhiên") {
					kq.add(ng);
				}
			}
		}
		
		return kq;
	}
	public double timDiemTbCaoNhat() {
		
		double max=0;
		for(Nguoi ng : this.listNg) {
			if(ng instanceof HocSinh) {
				if(((HocSinh) ng).TinhDiemTB()>max) {
					max=((HocSinh) ng).TinhDiemTB();
				}
			}
		}
		
		return max;
	}
	public LinkedList<Nguoi> hocSinhCoDTBcaoNhat(){
		LinkedList<Nguoi> kq=new LinkedList<Nguoi>();
		double max=0;
		for(Nguoi ng :this.listNg) {
			if(ng instanceof HocSinh) {
				if(((HocSinh)ng).TinhDiemTB()>max) {
					max=((HocSinh)ng).TinhDiemTB();
				}
			}
		}
		for(Nguoi ng :this.listNg) {
			if(ng instanceof HocSinh) {
				if(((HocSinh)ng).TinhDiemTB()==max) {
					kq.add(ng);
				}
			}
		}
		return kq;
	}
}
