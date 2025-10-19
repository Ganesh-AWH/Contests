import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BeautifulString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            int count = 0;
            List<Integer> li = new ArrayList<>();
            // System.out.println(str);
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i) == '0'){
                    li.add(i+1);
                    count++;
                }
            } 
            System.out.println(count);
            for(int i:li) System.out.print(i+" ");
            System.out.println();
        }
        sc.close();
    }
}
