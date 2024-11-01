import java.util.*;
class solution{
	private static boolean isVowel(char ch){
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
			return true;
		}
		else{return false;}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int i=0;
		int j=str.length()-1;
		char arr[] = str.toCharArray();
		while(i<j){
			if(! isVowel(arr[i])){i++;}
			if(! isVowel(arr[j])){j--;}
			if(isVowel(arr[i])==true && isVowel(arr[j])==true){
				char temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		for(int k=0;k<str.length();k++){
		  System.out.print(arr[k]);
		}
	}
}
