package Hash_Set_DSA;

import java.util.HashSet;
import java.util.Scanner;

public class Task1_Set {
public static void main(String[] args) {
	Scanner ob=new Scanner(System.in);
	HashSet<String> set1=new HashSet<>();
	System.out.println("Enter the number of items needed inside the list");
	int n=ob.nextInt();
	for(int i=0;i<n;i++) {
		String temp=ob.next();
		set1.add(temp);
	}
	System.out.println(set1);
	for(String str:set1) {
		boolean isUnique=unique(str);
		if(isUnique) {
			System.out.println("It's Unique!!");
		}
		else
			System.out.println("It's not different!");
	}
}
public static boolean unique(String str) {
		char[] char_array=str.toCharArray();
		for(int i=0;i<char_array.length;i++) {
			for(int j=i+1;j<char_array.length;j++) {
				if(char_array[i]==char_array[j]) {
					return false;
				}
			}
		}
		return true;
}
}
