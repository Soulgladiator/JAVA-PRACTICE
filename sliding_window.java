import java.util.*;
class solution{
  public static void sliding_wind(int arr[] , int k){
      int lsum=0,rsum=0,maxsum=-1,sum=0;
      for(int i=0;i<=k-1;i++){
          lsum = lsum+arr[i];
      }
      int right_index=arr.length-1;
      for(int j=k-1;j>=0;j--){
        rsum = rsum+arr[right_index];
        lsum = lsum - arr[j];
        sum = lsum + rsum;
        right_index = right_index-1;
        if(sum>maxsum){maxsum=sum;}
      }
      System.out.println(maxsum);
      
  }
	public static void main(String[] args){
		int arr[] ={6,2,3,4,7,2,1,7,1};
		int k=4;
		sliding_wind(arr,k);
	}
}
