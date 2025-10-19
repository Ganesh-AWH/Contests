import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    int k = sc.nextInt();
		       
		    //total scores after performing k operations
		    x = x + 100 * k;
		       
		    int count = 0;
		    for(int i=0; i<n; i++){
		        int participant = sc.nextInt();
		        if(participant > x){
		            count++;
		        }
		    }
		    
		    int ans = Integer.max(1, count - k + 1);
		    System.out.println(ans);
		}

	}
}
