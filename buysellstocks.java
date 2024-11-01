import java.util.*;
class buysellstocks{
	public static void main(String[]args){
		  int arr[] ={7,6,4,3,1};
		  int profit=0,maxprofit = Integer.MIN_VALUE;
		  for(int i=0;i<arr.length;i++){
		    for(int j=i+1;j<arr.length;j++){
		      profit = arr[j]-arr[i];
		      if(profit>=maxprofit){
		        maxprofit = profit;
		      }
		    }
		  }
		  if(maxprofit<0){System.out.println("0");}
		  
		  else{System.out.println(maxprofit);}
	}
}
