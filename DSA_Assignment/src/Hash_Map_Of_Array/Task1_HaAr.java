package Hash_Map_Of_Array;

import java.util.HashMap;

public class Task1_HaAr {
public static void main(String[] args) {
	HashMap<Integer,String[]> map=new HashMap<>();
	map.put(1, new String[] {"Sowmya","OX79","ISE"});
	map.put(2, new String[] {"Ruchi","OX200","CSE"});
	map.put(3, new String[] {"Shreya","OX71","ISE"});
	System.out.println("Employee records");
	for(Integer id:map.keySet()) {
		String[] details=map.get(id);
		System.out.println("ID :"+id+"\nDetails\n Name : "+details[0]+"\n ID : "+details[1]+"\n Department :"+details[2]+"\n");
	}
	System.out.println("Updating!!!");
	String[] emp=map.get(2);
	emp[1]="OX01";
	
	for(Integer id:map.keySet()) {
		String[] details=map.get(id);
		System.out.println("ID :"+id+"\nDetails\n Name : "+details[0]+"\n ID : "+details[1]+"\n Department :"+details[2]+"\n");
	}
	System.out.println("Deleting!!!");
	map.remove(3);
	
	for(Integer id:map.keySet()) {
		String[] details=map.get(id);
		System.out.println("ID :"+id+"\nDetails\n Name : "+details[0]+"\n ID : "+details[1]+"\n Department :"+details[2]+"\n");
	}
	}
}
