import java.util.*;
class solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int cur_sum =1;
        int max_sum =-100000;
        for(int j=0;j<size;j++){
            int temp = cur_sum+arr[j];
            if(temp<arr[j]){
                cur_sum=arr[j];
            }
            else{
              cur_sum = cur_sum+arr[j];
            }
            if(cur_sum>max_sum){
              max_sum = cur_sum;
            }
        }
        System.out.println(max_sum);
    }
}
