import java.util.*;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        StringBuilder ans = new StringBuilder();

        char max = 'a';

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) >= max) {
                ans.append(s.charAt(i));
                max = s.charAt(i);
            }
        }

        ans.reverse();

        System.out.println(ans);
    }
}