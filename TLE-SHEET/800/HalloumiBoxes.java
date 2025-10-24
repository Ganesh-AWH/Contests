import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class HalloumiBoxes {
    // FastReader class for efficient input
    static class FastReader {
    
        // BufferedReader to read input
        BufferedReader b;
      
        // StringTokenizer to tokenize input
        StringTokenizer s; 

        // Constructor to initialize BufferedReader
        public FastReader() {
            b = new BufferedReader(new InputStreamReader(System.in));
        }

        // Method to read the next token as a string
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

        // Method to read the next token as an integer
        int nextInt() { 
            return Integer.parseInt(next()); 
        }

        // Method to read the next token as a long
        long nextLong() { 
            return Long.parseLong(next()); 
        }

        // Method to read the next token as a double
        double nextDouble() { 
            return Double.parseDouble(next()); 
        }

        // Method to read the next line as a string
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
      
        // Create a FastReader instance for input
        FastReader fr = new FastReader();

        int t = fr.nextInt();
        while(t-->0){
            int n = fr.nextInt();
            int k = fr.nextInt();
            
            int []arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = fr.nextInt();
            }
            PrintWriter out = new PrintWriter(System.out);
            if(isSorted(arr)){
                out.println("yes");
            }else if(k == 1){
                out.println("No");
            }else{
                out.println("Yes");
            }
            out.flush();
        }
    }
    public static boolean isSorted(int []arr){
        for(int i=1; i<arr.length; i++){
            if(arr[i-1] > arr[i]) return false;
        }
        return true;
    }
}