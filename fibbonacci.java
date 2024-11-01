import java.util.*;
class solution{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = fibbo(num);
		System.out.println(result);
	}
	private static int fibbo(int n){
	  if(n<=1) return n;
	  else {
	    //System.out.println(fibbo(n-1)+fibbo(n-2));
	    return fibbo(n-1)+fibbo(n-2);}
	}
}
