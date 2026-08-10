import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class Map6 {
    private Hashtable<String, String> M1 = new Hashtable<>();

    public Hashtable<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equals(capitalName)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public Hashtable<String, String> getCapitalCountryMap() {
        Hashtable<String, String> M2 = new Hashtable<>();
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }
        return M2;
    }

    public ArrayList<String> getCountryNames() {
        ArrayList<String> countryNames = new ArrayList<>();
        for (String country : M1.keySet()) {
            countryNames.add(country);
        }
        return countryNames;
    }

    public static void main(String[] args) {
        Map6 map = new Map6();

        map.saveCountryCapital("India", "Delhi");
        map.saveCountryCapital("Japan", "Tokyo");

        System.out.println("Capital of India: " + map.getCapital("India"));
        System.out.println("Country for Tokyo: " + map.getCountry("Tokyo"));
        System.out.println("Capital-Country Map: " + map.getCapitalCountryMap());
        System.out.println("Country Names: " + map.getCountryNames());
    }
}
