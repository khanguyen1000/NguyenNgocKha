package NguyenNgocKha_buoi3;

import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {
		// đầu vào
		Scanner sn = new Scanner(System.in);
		int ngay, thang, nam;
		String ngaytruoc = "", ngaysau = "";
		int temp;
		boolean kt=true;
		// nhập dữ liệu
		System.out.print("ngày: ");
		ngay = sn.nextInt();
		System.out.print("tháng: ");
		thang = sn.nextInt();
		System.out.print("năm: ");
		nam = sn.nextInt();
		// xử lý

		if ((0 > ngay) || (ngay > 31) || (thang < 0) || (thang > 13) || (nam < 0)) {

			System.out.println("lỗi!!");
			System.exit(0);
		}
		switch (thang) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: {
			// có 31 ngày
			if (ngay < 31 && ngay > 1) {
				ngaysau = " " + (ngay + 1) + "/" + thang + "/" + nam;
				ngaytruoc = " " + (ngay - 1) + "/" + thang + "/" + nam;
			} else if (ngay == 31) {
				if (thang < 12) {
					ngaysau = "" + "1" + "/" + (thang + 1) + "/" + nam;

				} else if (thang == 12) {
					ngaysau = "" + "1" + "/" + 1 + "/" + (nam + 1);
				}
				ngaytruoc = "" + (ngay - 1) + "/" + thang + "/" + nam;
			} else if (ngay == 1) {
				if (thang > 1) {
					ngaytruoc = "" + 31 + "/" + (thang - 1) + "/" + nam;
				} else if (thang == 1) {
					temp = nam;
					temp--;
					ngaytruoc = "" + 31 + "/" + 12 + "/" + temp;
				}
				ngaysau = "" + 2 + "/" + thang + "/" + nam;
			}
			break;
		}
		case 4:
		case 6:
		case 9:
		case 11: { // có 30 ngày
			if (ngay < 30 && ngay > 1) {
				temp = ngay;
				ngaysau = " " + (ngay + 1) + "/" + thang + "/" + nam;
				temp = ngay;
				ngaytruoc = " " + (ngay - 1) + "/" + thang + "/" + nam;
			} else if (ngay == 30) {
				ngaysau = "" + 1 + "/" + (thang + 1) + "/" + nam;
				ngaytruoc = "" + 29 + "/" + thang + "/" + nam;
			} else if (ngay == 1) {
				ngaysau = "" + 2 + "/" + thang + "/" + nam;
				ngaytruoc = "" + 30 + "/" + (thang - 1) + "/" + nam;
			}
			break;
		}
		case 2: {
			if (nam % 400 == 0) {
				// nhuần 29 ngày
				if (ngay > 1 && ngay < 29) {
					ngaysau = "" + (ngay + 1) + "/" + thang + "/" + nam;
					ngaytruoc = "" + (ngay - 1) + "/" + thang + "/" + nam;
				} else if (ngay == 29) {
					ngaysau = "" + 1 + "/" + (thang + 1) + "/" + nam;
					ngaytruoc = "" + (ngay - 1) + "/" + thang + "/" + nam;
				} else if (ngay == 1) {
					ngaysau = "" + 2 + "/" + thang + "/" + nam;
					ngaytruoc = "" + 29 + "/" + (thang - 1) + "/" + nam;
				}else {
					System.out.println("tháng 2  năm "+nam+" chỉ có 29 ngày");
					kt=false;
				}
			} else {
				// 28 ngày
				if (ngay > 1 && ngay < 28) {
					ngaysau = "" + (ngay + 1) + "/" + thang + "/" + nam;
					ngaytruoc = "" + (ngay - 1) + "/" + thang + "/" + nam;
				} else if (ngay == 28) {
					ngaysau = "" + 1 + "/" + (thang + 1) + "/" + nam;
					ngaytruoc = "" + (ngay - 1) + "/" + thang + "/" + nam;
				} else if (ngay == 1) {
					ngaysau = "" + 2 + "/" + thang + "/" + nam;
					ngaytruoc = "" + 28 + "/" + (thang - 1) + "/" + nam;
				} else{
					System.out.println("tháng 2 năm "+nam+" chỉ có 28 ngày");
					kt=false;
				}
			}

			break;
		}

		}
		// đầu ra
		if(kt) {
		System.out.println("ngay trước :" + ngaytruoc);
		System.out.println("ngày sau :" + ngaysau);
		}

	}

}
