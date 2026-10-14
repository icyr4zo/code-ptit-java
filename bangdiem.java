import java.util.*;

public class bangdiem {

    static class HocSinh {
        String ma;
        String ten;
        double diemTB;
        String xepLoai;

        HocSinh(String ma, String ten, double diemTB) {
            this.ma = ma;
            this.ten = ten;
            this.diemTB = diemTB;

            if (diemTB >= 9) {
                xepLoai = "XUAT SAC";
            } else if (diemTB >= 8) {
                xepLoai = "GIOI";
            } else if (diemTB >= 7) {
                xepLoai = "KHA";
            } else if (diemTB >= 5) {
                xepLoai = "TB";
            } else {
                xepLoai = "YEU";
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        ArrayList<HocSinh> ds = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String ten = sc.nextLine();

            double tong = 0;

            for (int j = 0; j < 10; j++) {
                double diem = sc.nextDouble();

                if (j == 0 || j == 1) {
                    tong += diem * 2;
                } else {
                    tong += diem;
                }
            }

            double diemTB = Math.round(tong / 12.0 * 10) / 10.0;

            String ma = String.format("HS%02d", i);

            ds.add(new HocSinh(ma, ten, diemTB));

            sc.nextLine();
        }

        Collections.sort(ds, new Comparator<HocSinh>() {
            @Override
            public int compare(HocSinh a, HocSinh b) {
                if (a.diemTB > b.diemTB) {
                    return -1;
                }

                if (a.diemTB < b.diemTB) {
                    return 1;
                }

                return a.ma.compareTo(b.ma);
            }
        });

        for (HocSinh hs : ds) {
            System.out.printf("%s %s %.1f %s\n",
                    hs.ma, hs.ten, hs.diemTB, hs.xepLoai);
        }
    }
}