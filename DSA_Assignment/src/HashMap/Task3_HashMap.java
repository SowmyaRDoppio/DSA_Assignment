package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Task3_HashMap {
public static void main(String[] args) {
	HashMap<Integer,String> map1=new HashMap<>();
	map1.put(1, "Sowmya");
	map1.put(2,"Shreya");
	map1.put(3, "Neha");
	map1.put(4, "Shruthi");
	HashMap<Integer,String> map2=new HashMap<>();
	map2.put(1, "Sowmya");
	map2.put(20,"Ruchi");
	map2.put(30, "Rani");
	map2.put(4, "Usha");
	
	HashMap<Integer,String> answer=common(map1,map2);
	System.out.println(answer);
}
public static HashMap<Integer,String> common(HashMap<Integer,String> map1,HashMap<Integer,String> map2){
	HashMap<Integer,String> answer=new HashMap<>();
	for(Map.Entry<Integer,String> entry:map1.entrySet()) {
		Integer key=entry.getKey();
		String value=entry.getValue();
		if(map2.containsKey(key)) {
			answer.put(key,value);
		}
	}
	return answer;
}
}
