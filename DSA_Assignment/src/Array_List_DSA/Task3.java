package Array_List_DSA;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
public static void main(String[] args) {
	Scanner ob=new Scanner(System.in);
	ArrayList<String> answer=new ArrayList<>();
	System.out.println("Enter the number of items needed inside the list");
	int n=ob.nextInt();
	for(int i=0;i<n;i++) {
		answer.add(ob.next());
	}
	for(String str:answer) {
		boolean isPalidrome=palidrome(str);
		if(isPalidrome) {
			System.out.println("It's a palidrome");
		}
		else
			System.out.println("It's not palidrome!");
	}
}
public static boolean palidrome(String str){
	int start=0;
	int end=str.length()-1;
	while(start<end) {
		if(str.charAt(start)!=str.charAt(end)) {
			return false;
		}
		start++;
		end--;
	}
	return true;
}
}
