import java.io.*;

public class HELLOFILE {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("Hello.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}