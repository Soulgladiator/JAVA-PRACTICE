import java.util.*;
class factorial{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = fact(num);
		System.out.println(result);
	}
	private static int fact(int n){
	    if(n==0){
	        return 1;
	    }
	    else{
	        return n*fact(n-1);
	    }
	}
}

