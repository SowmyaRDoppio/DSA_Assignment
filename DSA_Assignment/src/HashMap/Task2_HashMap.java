package HashMap;

import java.util.HashMap;

public class Task2_HashMap {
public static void main(String[] args) {
	int[] array=new int[]{1, 2, 3, 1, 4, 2, 5, 6, 7, 1, 8, 9, 9};
	HashMap<Integer,Integer> count=new HashMap<>();
    for(int i=0;i<array.length;i++) {
    	if(!count.containsKey(array[i])) {
    		count.put(array[i],1);
    	}
    	else{
    		count.put(array[i],count.get(array[i])+1);
    	}
    }
    System.out.println(count);
}
}
