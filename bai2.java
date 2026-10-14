import java.util.*;

public class bai2 {

    static class MatHang {
        String ma;
        String ten;
        char loai;

        MatHang(String ma, String ten, char loai) {
            this.ma = ma;
            this.ten = ten;
            this.loai = loai;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        ArrayList<MatHang> ds = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            char loai = sc.nextLine().charAt(0);

            ds.add(new MatHang(ma, ten, loai));
        }

        int m = Integer.parseInt(sc.nextLine());

        while (m-- > 0) {
            String[] a = sc.nextLine().split("\\s+");

            String ma = a[0];
            long soLuongNhap = Long.parseLong(a[1]);
            long donGiaNhap = Long.parseLong(a[2]);
            long soLuongXuat = Long.parseLong(a[3]);

            MatHang mh = null;

            for (MatHang x : ds) {
                if (x.ma.equals(ma)) {
                    mh = x;
                    break;
                }
            }

            long triGiaNhap = soLuongNhap * donGiaNhap;

            long triGiaXuat;

            if (mh.loai == 'A') {
                triGiaXuat = soLuongXuat * donGiaNhap * 108 / 100;
            } else if (mh.loai == 'B') {
                triGiaXuat = soLuongXuat * donGiaNhap * 105 / 100;
            } else {
                triGiaXuat = soLuongXuat * donGiaNhap * 102 / 100;
            }

            System.out.println(
                mh.ma + " " + mh.ten + " " +
                triGiaNhap + " " + triGiaXuat
            );
        }
    }
}