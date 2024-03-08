package Array_List_DSA;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_2 {
public static void main(String[] args) {
	Scanner ob=new Scanner(System.in);
	ArrayList<String> list=new ArrayList<>();
	System.out.println("Enter the number of elements to be added into the list1");
	 int n=ob.nextInt();
	 String temp;
	 for(int i=0;i<n;i++) {
		 System.out.println("Enter the string" );
		 list.add(ob.next());
	 } 
	 list=sorted(list);
	 System.out.println(list);
}
public static ArrayList<String> sorted(ArrayList<String> str){
	String temp;
	for(int i=0;i<str.size();i++) {
		for(int j=i+1;j<str.size();j++) {
			if(str.get(i).length()>str.get(j).length()) {
				temp=str.get(i);
				str.set(i, str.get(j));
				str.set(j, temp);
			}
		}
	}
	return str;
}
}
