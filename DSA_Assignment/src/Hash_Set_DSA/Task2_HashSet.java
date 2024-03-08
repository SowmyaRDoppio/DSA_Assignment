package Hash_Set_DSA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Task2_HashSet {
public static void main(String[] args) {
	Scanner ob=new Scanner(System.in);
	ArrayList<Integer> list1=new ArrayList<>();
	System.out.println("Enter the number of items needed inside the list");
	int n=ob.nextInt();
	for(int i=0;i<n;i++) {
		list1.add(ob.nextInt());
	}
	ArrayList<Integer> list2=new ArrayList<>();
	System.out.println("Enter the number of items needed inside the list");
	int m=ob.nextInt();
	for(int i=0;i<m;i++) {
		list2.add(ob.nextInt());
	}
	HashSet<Integer> setFinal=new HashSet<>();
	for(Integer i:list2) {
		if(list1.contains(i)) {
			setFinal.add(i);
		}
	}
	System.out.println(setFinal);
}
}
