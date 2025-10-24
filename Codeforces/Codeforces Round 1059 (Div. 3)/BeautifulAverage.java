import java.util.Scanner;

public class BeautifulAverage {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){

            int n = sc.nextInt();
            int []arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            } 
            // System.out.println(findMax1(arr));
            System.out.println(findMax2(arr));
        }
        sc.close();
    }
    //brute force approach
    public static int findMax1(int []arr){
        int max = 0;
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=i; j<arr.length; j++){
                sum += arr[j];
                int len = j - i + 1;
                int avg = sum / len;
                max = Integer.max(max, avg);
            }
        }
        return max;
    }
    //optimal solution -> return max value because we can take any sub array so i am choosing max element as a subarray
    public static int findMax2(int []arr){
        int max = 0;
        for(int i:arr) max = Integer.max(max, i);
        return max;
    }
}
