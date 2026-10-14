import java.util.*;

public class SONGUYENTO {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
             boolean prime = true;
             if(n<2) prime = false;
             else {
                for(int i = 2; i <= Math.sqrt(n); i++){
                    if(n % i == 0) {
                        prime = false;
                        break;
                    }
                }
             }
             if (prime){
                System.out.println("YES");
             } else {
                System.out.println("NO");
             }
        }
    }
}