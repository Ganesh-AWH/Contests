import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class MagicWand {
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
            int []arr = new int[n];
            boolean isEven = false;
            boolean isOdd = false;
            for(int i=0; i<n; i++){
                arr[i] = fr.nextInt();
                if(arr[i]%2 == 0) isEven = true;
                else isOdd = true;
            }
            if(isEven && isOdd){
                Arrays.sort(arr);
            }
            for(int i=0; i<n; i++){
                out.print(arr[i]+" ");
            }
            out.println();
        }
        out.flush();
    }
}