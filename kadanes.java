import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int sample = sc.nextInt();
		
		for(int i=0;i<sample;i++){
		    int size = sc.nextInt();
		    int arr[] = new int[size]; 
		    for(int j=0;j<size;j++){
		        arr[j] = sc.nextInt();
		    }
		    int cursum=0;
		    int maxsum= Integer.MIN_VALUE;
		    for(int k=0;k<size;k++){
		        int temp = cursum+ arr[k];
		        if(temp<cursum){cursum=arr[k];}
		        else {cursum=temp;}
		        if(cursum>=maxsum){maxsum=cursum;}
		    }
		    if(maxsum<0){System.out.println("0");}
		    else{System.out.println(maxsum);}
		}

	}
}

