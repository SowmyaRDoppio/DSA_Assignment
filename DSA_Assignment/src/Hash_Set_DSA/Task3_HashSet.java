package Hash_Set_DSA;

import java.util.HashSet;
import java.util.Scanner;

public class Task3_HashSet {
public static void main(String[] args) {
	Scanner ob=new Scanner(System.in);
	System.out.println("Enter hte string");
	String temp=ob.next();
	HashSet<Character> answer=new HashSet<>();
	char[] temp_array=temp.toCharArray();
	for(int i=0;i<temp_array.length;i++) {
		char ch=temp_array[i];
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			answer.add(ch);
		}
	}
	System.out.println(answer);
}
}
