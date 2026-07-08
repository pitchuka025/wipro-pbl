import java.util.Optional;

public class Optional2 {
    public static void printAddress(String address) {
        String addr = Optional.ofNullable(address).orElse("India");
        System.out.println(addr);
    }

    public static void main(String[] args) {
        // Example usages
        printAddress("USA");    // prints USA
        printAddress(null);       // prints India (default)
        if (args.length > 0) printAddress(args[0]);
    }
}
