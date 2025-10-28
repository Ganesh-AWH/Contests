import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Square {
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
            int a = fr.nextInt();
            int b = fr.nextInt();
            int c = fr.nextInt();
            int d = fr.nextInt(); 
            if(a !=b || a!=c || a!=d){
                out.println("NO");
            }else{
                out.println("YES");
            }
        }
        out.flush();
    }
}