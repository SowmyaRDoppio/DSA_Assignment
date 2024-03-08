package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Task1_Map {
public static void main(String[] args) {
	Scanner ob=new Scanner(System.in);
	System.out.println("Enter hte string");
	String temp=ob.next();
	HashMap<Character,Integer> answer=new HashMap<>();
	char[] temp_array=temp.toCharArray();
	for(int i=0;i<temp_array.length;i++) {
		if(!answer.containsKey(temp_array[i])) {
			answer.put(temp_array[i],1);
		}
		else {
			answer.put(temp_array[i], answer.get(temp_array[i])+1);
		}
		
	}
	System.out.println(answer);
}
}
