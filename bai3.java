import java.util.*;

public class bai3 {

    static String vietTat(String s) {
        String[] tu = s.trim().split("\\s+");
        String kq = "";

        for (String x : tu) {
            kq += Character.toUpperCase(x.charAt(0));
        }

        return kq;
    }

    static class GiangVien {
        String ma;
        String hoTen;
        String boMon;

        GiangVien(String ma, String hoTen, String boMon) {
            this.ma = ma;
            this.hoTen = hoTen;
            this.boMon = vietTat(boMon);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        ArrayList<GiangVien> ds = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String hoTen = sc.nextLine();
            String boMon = sc.nextLine();

            String ma = String.format("GV%02d", i);

            ds.add(new GiangVien(ma, hoTen, boMon));
        }

        int q = Integer.parseInt(sc.nextLine());

        while (q-- > 0) {
            String truyVan = sc.nextLine();

            String vietTatBM = vietTat(truyVan);

            System.out.println("DANH SACH GIANG VIEN BO MON " + vietTatBM + ":");

            for (GiangVien gv : ds) {
                if (gv.boMon.equals(vietTatBM)) {
                    System.out.println(gv.ma + " " + gv.hoTen + " " + gv.boMon);
                }
            }
        }
    }
}