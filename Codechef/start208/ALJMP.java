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
		    int x = n;
		    for(int i=1; i<=n-1; i++){
		        if(i%2 == 0){
		            x = x + (n-i);
		        }else{
		            x = x - (n - i);
		        }
		    }
		    System.out.println(x);
		}

	}
}
