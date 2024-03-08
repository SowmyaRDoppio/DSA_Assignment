package Array_List_DSA;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_1 {
 public static void main(String[] args) {
	 Scanner ob=new Scanner(System.in);
	 ArrayList<Integer> list1=new ArrayList<>();
	 System.out.println("Enter the number of elements to be added into the list1");
	 int n=ob.nextInt();
	 for(int i=0;i<n;i++) {
		 System.out.println("Please enter the "+(i+1)+"th element into the list");
		 list1.add(ob.nextInt());
	 }
	 System.out.println(list1);
	 list1=sorting(list1);
	 System.out.println(list1);
	 ArrayList<Integer> list2=new ArrayList<>();
	 System.out.println("Enter the number of elements to be added into the list2");
	 int m=ob.nextInt();
	 for(int i=0;i<m;i++) {
		 System.out.println("Please enter the "+(i+1)+"th element into the list");
		 list2.add(ob.nextInt());
	 }
	 System.out.println(list2);
	 list2=sorting(list2);
	 System.out.println(list2);
	 list1.addAll(list2);
     list1=sorting(list1);
	 System.out.println(list1);
	 
 }
 public static ArrayList<Integer> sorting(ArrayList<Integer> list){
	 int temp;
	 for(int i=0;i<list.size();i++) {
		 for(int j=i+1;j<list.size();j++) {
			 if(list.get(i)>list.get(j)) {
				 temp=list.get(i);
				 list.set(i,list.get(j));
				 list.set(j,temp);
			 }
		 }
	 }
	 return list;
 }
}
