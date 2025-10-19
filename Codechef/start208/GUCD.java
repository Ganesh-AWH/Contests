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
		    int min = Integer.MAX_VALUE;
		    int max = Integer.MIN_VALUE;
		    for(int i=0; i<n; i++){
		        int ele = sc.nextInt();
    		    min = Integer.min(min, ele);
    		    max = Integer.max(max, ele);
		    }
		    
		  //  System.out.println(max+" "+ min);
		    if(max-1 == min){
		        System.out.println(max-2);
		    }else{
		        System.out.println(max-1);
		    }
		}
	}
}
