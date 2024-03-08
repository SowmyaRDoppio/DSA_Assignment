package Hash_Map_Of_Array;

import java.util.HashMap;

public class Task2_HaAr {
	HashMap<String,String[]> catalog;
	Task2_HaAr(){
		catalog=new HashMap<>();
	}
	public void addBook(String sno,String title,String author) {
		String[] details= {title,author};
		catalog.put(sno, details);
	}
	 public void removeBook(String sno) {
		 catalog.remove(sno);
	 }
	 
	 public void updateBook(String sno,String title,String author) {
		 if(catalog.containsKey(sno)) {
			 String[] details= {title,author};
			 catalog.put(sno,details);
		 }
		 else {
			 System.out.println("Book with "+sno+" not found!");
		 }
	 }
	 
	 public void displayBook(String sno,String title,String author) {
		 if(catalog.containsKey(sno)) {
			 String details[]= {title,author};
			 System.out.println("Book name :"+details[0]);
			 System.out.println("Author name :"+details[1]);
		 }
	 }

public static void main(String[] args) {
	Task2_HaAr lib=new Task2_HaAr();
	
	lib.addBook("12", "ABC","Ram");
	lib.addBook("13", "DEF","Rani");
	lib.addBook("10", "GHI","Raj");
	lib.addBook("15", "JKL","Tom");
	
	lib.displayBook("12", "ABC","Ram");
	lib.displayBook("13", "DEF","Rani");
	lib.displayBook("10", "GHI","Raj");
	lib.displayBook("15", "JKL","Tom");
	
	lib.updateBook("14","GHI","Raj");
	
	lib.removeBook("12");
}
}
