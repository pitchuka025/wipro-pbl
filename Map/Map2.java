import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map2 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("India", "Delhi");
        map.put("Japan", "Tokyo");
        map.put("France", "Paris");

        // a) Check if a particular key exists or not
        String key = "India";
        if (map.containsKey(key)) {
            System.out.println(key + " exists as a key.");
        } else {
            System.out.println(key + " does not exist as a key.");
        }

        // b) Check if a particular value exists or not
        String value = "Tokyo";
        if (map.containsValue(value)) {
            System.out.println(value + " exists as a value.");
        } else {
            System.out.println(value + " does not exist as a value.");
        }

        // c) Use Iterator to loop through the map
        System.out.println("\nIterating through the map:");
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
