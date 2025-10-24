import java.io.*;

public class Notelock {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String[] nk = br.readLine().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);
            String s = br.readLine().trim();

            int count = 0;
            int lastProtected = -k;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1' && i - lastProtected >= k) {
                    count++;
                    lastProtected = i;
                }
            }

            System.out.println(count);
        }
    }
}