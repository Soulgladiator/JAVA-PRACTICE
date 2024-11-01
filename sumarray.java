import java.util.*;
class solution{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3,4,5};
		int sum = 0;
		int result[] = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			sum = sum+arr[i];
			result[i] = sum;
		}
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]+" ");
		}
	}
}
