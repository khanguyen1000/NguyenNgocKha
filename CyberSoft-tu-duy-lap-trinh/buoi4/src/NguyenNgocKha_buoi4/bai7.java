package NguyenNgocKha_buoi4;

import java.util.Scanner;

public class bai7 {
	public static void main(String[] args) {
		// đầu vào
		gameoantuty();
	}

	public static void gameoantuty() {
		// đầu vào
		Scanner sn = new Scanner(System.in);
		
		int lua_chon_ng_choi;
		int soluot = 0;
		int nguoi = 0, may = 0, hoa = 0;
		System.out.println("quy ước ");
		System.out.println("số 1 : là BAO");
		System.out.println();
		System.out.println("số 2 : là BÚA");
		System.out.println();
		System.out.println("số 3 : là KÉO");
		System.out.println();
		System.out.println("số 0 : là kết thúc và xem kết quả");
		System.out.println();
		do {
			int lua_chon_cua_may = (int) (Math.random() * 3 + 1);
			soluot++;
			System.out.println("_____________________________________________");
			System.out.println("1-Bao 2-Búa 3-kéo 0-kết thúc xem kết quả");
			System.out.println();
			System.out.print("lưa chọn :");
			lua_chon_ng_choi = sn.nextInt();
			if (lua_chon_ng_choi > 3 || lua_chon_ng_choi < 0) {
				System.out.println("vui lòng nhập lại ");
				soluot--;
			} else if (lua_chon_ng_choi == 0) {
				soluot--;
			} else {
				System.out.println("-------------------------");
				System.out.println("lượt : " + soluot);
				System.out.println();
				if (lua_chon_cua_may == 3 && lua_chon_ng_choi == 2) {
					System.out.println("máy : Kéo");
					System.out.println();
					System.out.println("bạn : Búa");
					System.out.println("=========");
					System.out.println("-bạn thắng- ");
					nguoi++;

				} else if (lua_chon_cua_may == 3 && lua_chon_ng_choi == 1) {
					System.out.println("máy : Kéo");
					System.out.println();
					System.out.println("bạn : Bao");
					System.out.println("=========");
					System.out.println("-máy thắng- ");
					may++;
				} else if (lua_chon_cua_may == 2 && lua_chon_ng_choi == 1) {
					System.out.println("máy : Búa");
					System.out.println();
					System.out.println("bạn : Bao");
					System.out.println("=========");
					System.out.println("-bạn thắng- ");
					nguoi++;
				} else if (lua_chon_cua_may == 2 && lua_chon_ng_choi == 3) {
					System.out.println("máy : Búa");
					System.out.println();
					System.out.println("bạn : kéo");
					System.out.println("=========");
					System.out.println("-máy thắng- ");
					may++;
				} else if (lua_chon_cua_may == 1 && lua_chon_ng_choi == 2) {
					System.out.println("máy : Bao");
					System.out.println();
					System.out.println("bạn : Búa");
					System.out.println("=========");
					System.out.println("-máy thắng- ");
					may++;
				} else if (lua_chon_cua_may == 1 && lua_chon_ng_choi == 3) {
					System.out.println("máy : Bao");
					System.out.println();
					System.out.println("bạn : Kéo");
					System.out.println("=========");
					System.out.println("-bạn thắng- ");
					nguoi++;
				} else {
					if (lua_chon_cua_may == 1) {
						System.out.println("máy : Bao");
					} else if (lua_chon_cua_may == 2) {
						System.out.println("máy : Búa");
					} else if (lua_chon_cua_may == 3) {
						System.out.println("máy : Kéo");
					}
					System.out.println();
					if (lua_chon_ng_choi == 1) {
						System.out.println("bạn : Bao");
					} else if (lua_chon_ng_choi == 2) {
						System.out.println("bạn : Búa");
					} else if (lua_chon_ng_choi == 3) {
						System.out.println("bạn : Kéo");
					}
					System.out.println("-hoà-");
					hoa++;
				}
			}
		} while (lua_chon_ng_choi != 0);
		System.out.println("sau " + soluot + " lượt chơi ");
		System.out.println();
		System.out.println("----tỷ số ---");
		System.out.println();
		System.out.println("máy : " + may);
		System.out.println();
		System.out.println("bạn : " + nguoi);
		System.out.println();
		System.out.println("hoà : " + hoa);
		if (may > nguoi) {
			System.out.println("------> máy thắng !!!!");
		} else if (may < nguoi) {
			System.out.println("------> bạn thắng !!!!!");
		} else {
			System.out.println("------> hoà !!!");
		}
	}
}
