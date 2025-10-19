import java.util.Scanner;

public class BeautifulXor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int lenA = Integer.numberOfLeadingZeros(1) - Integer.numberOfLeadingZeros(a);
            int lenB = Integer.numberOfLeadingZeros(1) - Integer.numberOfLeadingZeros(b);

            if(lenA < lenB) System.out.println(-1);

            if(lenA == lenB){
                System.out.println(1);
                System.out.println(a^b);
            }
            if(lenA > lenB){
                System.out.println(2);
                System.out.print((a ^ b ^ (1<<lenA)) + " ");
                System.out.println(1<<lenA);
            }
        }
        sc.close();
    }
}
