import java.util.*;
import java.lang.Math;
class buystockstp{
    public static void main(String[] args){
       int arr[] ={2,1,2,0,1};
		  int profit=0,maxprofit = Integer.MIN_VALUE;
		  int left=0,right=arr.length-1;
		  while(right>left){
		    profit = arr[right] - arr[left];
		    if(profit>maxprofit){maxprofit=profit;}
		    if(arr[left+1]<arr[left]){
		        left++;}
		    else if(arr[right-1]>arr[right]){
		        right--;}
		    else{
		        left++;
		        right--;}
		  }
		  if(maxprofit<0){System.out.println("0");}
		  else{System.out.println(maxprofit);}
    }
}
