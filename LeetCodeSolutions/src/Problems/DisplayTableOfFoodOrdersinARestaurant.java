package Problems;
import java.util.*;

public class DisplayTableOfFoodOrdersinARestaurant {
	 public List<List<String>> displayTable(List<List<String>> orders) {

	        Set<Integer> tableSet = new TreeSet<>();
	        Set<String> foodSet = new TreeSet<>();
	        Map<String, Integer> hshMap = new HashMap<>();

	        for(List<String> order: orders) {
	            
	            int table = Integer.parseInt(order.get(1));
	            String food = order.get(2);

	            tableSet.add(table);
	            foodSet.add(food);

	            String key = table + "<=>" + food;

	            hshMap.put(key, hshMap.getOrDefault(key, 0) + 1);
	        }

	        List<List<String>> ansList = new ArrayList<>();
	        List<String> headers = new ArrayList<>();

	        headers.add("Table");
	        headers.addAll(foodSet);
	        
	        ansList.add(headers);

	        for(int table: tableSet) {
	            List<String> row = new ArrayList<>();
	            row.add(String.valueOf(table));

	            for(String food: foodSet) {
	                
	                String key = table + "<=>" + food;
	                row.add(String.valueOf(hshMap.getOrDefault(key, 0)));
	            }
	            ansList.add(row);

	        }
	        return ansList;
	        
	    }
}
