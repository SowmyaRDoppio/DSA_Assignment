package Hash_Map_Of_Array;

import java.util.HashMap;

public class Task3_HaAr {
public static void main(String[] args) {
	HashMap<String,Integer[]> cars=new HashMap<>();
	cars.put("Ford", new Integer[] {20000, 25000, 28000});
	cars.put("Ferrari", new Integer[] {11000,112500,90000});
	cars.put("Toyota", new Integer[]{22000, 24000, 27000});
	 
	System.out.println("Average price of Ford "+average(cars,"Ford"));
	System.out.println("Average price of Ferrari "+average(cars,"Ferrari"));
	System.out.println("Average price of Toyota "+average(cars,"Toyota"));
}
public static double average(HashMap<String,Integer[]> map,String name) {
	if(map.containsKey(name)) {
		Integer[] prices=map.get(name);
		int total=0;
		for(int cost:prices) {
			total+=cost;
		}
		return (double)total;
	}
	else {
		System.out.println("Car not present!");
	}
	return 0;
}
}
