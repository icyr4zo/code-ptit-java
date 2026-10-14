import java.util.*;

public class luonggv {

    static class GiaoVien {
        String ma;
        String ten;
        int bac;
        long phuCap;
        long thuNhap;

        GiaoVien(String ma, String ten, long luongCoBan) {
            this.ma = ma;
            this.ten = ten;

            // 2 ký tự cuối của mã là bậc lương
            bac = Integer.parseInt(ma.substring(2));

            // Xác định phụ cấp
            if (ma.substring(0, 2).equals("HT")) {
                phuCap = 2000000;
            } else if (ma.substring(0, 2).equals("HP")) {
                phuCap = 900000;
            } else {
                phuCap = 500000;
            }

            // Tính thu nhập
            thuNhap = luongCoBan * bac + phuCap;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        ArrayList<GiaoVien> ds = new ArrayList<>();

        int soHT = 0;
        int soHP = 0;

        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            long luongCoBan = Long.parseLong(sc.nextLine());

            String chucVu = ma.substring(0, 2);

            // Chỉ nhận tối đa 1 HT
            if (chucVu.equals("HT")) {
                if (soHT >= 1) {
                    continue;
                }
                soHT++;
            }

            // Chỉ nhận tối đa 2 HP
            if (chucVu.equals("HP")) {
                if (soHP >= 2) {
                    continue;
                }
                soHP++;
            }

            ds.add(new GiaoVien(ma, ten, luongCoBan));
        }

        for (GiaoVien gv : ds) {
            System.out.println(
                gv.ma + " " +
                gv.ten + " " +
                gv.bac + " " +
                gv.phuCap + " " +
                gv.thuNhap
            );
        }
    }
}