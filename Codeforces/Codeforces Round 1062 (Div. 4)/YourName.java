import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class YourName {
    static class FastReader {
        BufferedReader b;
        StringTokenizer s; 
        public FastReader() {
            b = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while (s == null || !s.hasMoreElements()) {
                try {
                    s = new StringTokenizer(b.readLine());
                } catch (IOException e) {
                    e.printStackTrace(); 
                }
            }
            return s.nextToken();
        }
        int nextInt() { 
            return Integer.parseInt(next()); 
        }
        long nextLong() { 
            return Long.parseLong(next()); 
        }
        double nextDouble() { 
            return Double.parseDouble(next()); 
        }
        String nextLine() {
            String str = "";
            try {
                if (s.hasMoreTokens()) {
                    str = s.nextToken("\n");
                } else {
                    str = b.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace(); 
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        PrintWriter out = new PrintWriter(System.out);
        while(t-->0){
            int n = fr.nextInt();
            String s1 = fr.next();
            String s2 = fr.next();
            out.println(isTrue(s1, s2, n)?"YES":"NO");
        }
        out.flush();
    }
    public static boolean isTrue(String s1, String s2, int n){
        
        int []freq = new int[26];
        for(int i=0; i<n; i++){
            int ind = s1.charAt(i) - 'a';
            freq[ind]++;
        }
        for(int i=0; i<n; i++){
            int ind = s2.charAt(i) - 'a';
            freq[ind]--;
            if(freq[ind]<0){
                return false;
            }
        }
        return true;

    }
}