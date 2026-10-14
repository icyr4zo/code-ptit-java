import java.util.*;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int K = sc.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);

            int j = 0;
            long dem = 0;

            for (int i = 0; i < n; i++) {
                if (j < i) {
                    j = i;
                }

                while (j + 1 < n && a[j + 1] - a[i] < K) {
                    j++;
                }

                dem += j - i;
            }

            System.out.println(dem);
        }
    }
}