import java.util.HashSet;
import java.util.Iterator;

public class Set1 {
    private HashSet<String> H1 = new HashSet<>();

    public HashSet<String> saveCountryNames(String countryName) {
        H1.add(countryName);
        return H1;
    }

    public String getCountry(String countryName) {
        Iterator<String> iterator = H1.iterator();
        while (iterator.hasNext()) {
            String country = iterator.next();
            if (country.equals(countryName)) {
                return country;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Set1 set1 = new Set1();

        System.out.println(set1.saveCountryNames("India"));
        System.out.println(set1.saveCountryNames("USA"));
        System.out.println(set1.saveCountryNames("Australia"));

        System.out.println("Search India: " + set1.getCountry("India"));
        System.out.println("Search France: " + set1.getCountry("France"));
    }
}
