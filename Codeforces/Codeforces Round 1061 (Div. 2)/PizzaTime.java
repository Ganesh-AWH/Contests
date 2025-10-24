import java.util.Scanner;

public class PizzaTime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long ans = findOptimal(n);
            System.out.println(ans);
        }
        sc.close();
    }
    public static long findOptimal(long n){
        if(n<=2) return 0;
        long m1 = n/3; //hao eats
        long m2 = (n+1)/3;//alex eats
        long m3 = n - m1 - m2; // remaining
        return m1 + findOptimal(m3);
    }
}