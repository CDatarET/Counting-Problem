import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		for(int c = 0; c < cases; c++){
		    int l = scan.nextInt();
		    long[] A = new long[l];
		    int even = 0;
		    int odd = 0;
		    
		    for(int i = 0; i < l; i++){
		        A[i] = scan.nextLong();
		        if(A[i] % 2 == 0){
		            even++;
		        }
		        else{
		            odd++;
		        }
		    }
		    
		    if(odd % 2 != 0){
		        System.out.println("no");
		    }
		    else{
		        if(odd == 0){
		            System.out.println("no");
		        }
		        else{
		            System.out.println("yes");
		        }
		    }
		}
	}
}
