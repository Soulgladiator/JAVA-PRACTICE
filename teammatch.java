import java.util.*;
class solution{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int teams = sc.nextInt();
		int copy = teams;
		int matches =0;
		while(teams!=2){
			matches = (teams/2)+(teams%2);
			teams = teams/2;
		}
		System.out.println(matches);
	}
}
