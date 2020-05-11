package QLChuyenXe;

import java.util.LinkedList;

public class main {

	public static void main(String[] args) {
		Cty cty=new Cty();
		cty.khoitao();
		//cty.xuatList();
		//System.out.println("doanh thu noi thanh "+cty.tinhTongDoanhThuNoiThanh());
		//System.out.println("doanh thu ngoaoi thanh "+cty.tinhTongDoanhThuNgoaiThanh());
//		ChuyenXe cx= cty.timChuyenXeTheoMaChuyen();
//		cx.xuat();
		LinkedList<ChuyenXe> List=cty.timChuyenXeTheoTaiXe();
		for(ChuyenXe chuyenxe :List) {
			chuyenxe.xuat();
		}
	}

}
