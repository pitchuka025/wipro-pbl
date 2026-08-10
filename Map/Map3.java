import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Map3 {
    public static void main(String[] args) {
        Properties states = new Properties();

        states.setProperty("Maharashtra", "Mumbai");
        states.setProperty("Karnataka", "Bengaluru");
        states.setProperty("Tamil Nadu", "Chennai");
        states.setProperty("Delhi", "New Delhi");

        Set<Object> keys = states.keySet();
        Iterator<Object> iterator = keys.iterator();

        System.out.println("States and their capitals:");
        while (iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println(key + " -> " + states.getProperty((String) key));
        }
    }
}
