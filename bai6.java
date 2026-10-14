import java.io.*;
import java.util.*;

public class bai6 {

    public static void main(String[] args) throws Exception {

        // Đọc DATA1.in
        ObjectInputStream in1 = new ObjectInputStream(
                new FileInputStream("DATA1.in")
        );

        ArrayList<String> a = (ArrayList<String>) in1.readObject();
        in1.close();

        // Đọc DATA2.in
        ObjectInputStream in2 = new ObjectInputStream(
                new FileInputStream("DATA2.in")
        );

        ArrayList<Integer> b = (ArrayList<Integer>) in2.readObject();
        in2.close();

        // TreeSet: tự loại trùng + tự sắp xếp
        TreeSet<String> set = new TreeSet<>();

        // Ghép mã
        for (String s : a) {
            for (Integer x : b) {
                String ma = s + x;
                set.add(ma);
            }
        }

        // In kết quả
        for (String ma : set) {
            System.out.println(ma);
        }
    }
}