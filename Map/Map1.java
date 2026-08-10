import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Map1 {
    private HashMap<String, String> M1 = new HashMap<>();

    public HashMap<String, String> saveCountryCapital(String countryName, String capital) {
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

    public HashMap<String, String> getCapitalCountryMap() {
        HashMap<String, String> M2 = new HashMap<>();
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
        Map1 map = new Map1();

        map.saveCountryCapital("India", "Delhi");
        map.saveCountryCapital("Japan", "Tokyo");

        System.out.println("Capital of India: " + map.getCapital("India"));
        System.out.println("Country for Tokyo: " + map.getCountry("Tokyo"));
        System.out.println("Capital-Country Map: " + map.getCapitalCountryMap());
        System.out.println("Country Names: " + map.getCountryNames());
    }
}
