import java.util.Random;

public class TestCompartmentAllInOne {
    public static void main(String[] args) {
        Compartment[] compartments = new Compartment[10];
        Random rand = new Random();

        for (int i = 0; i < compartments.length; i++) {
            int r = rand.nextInt(4) + 1; // 1..4
            switch (r) {
                case 1:
                    compartments[i] = new FirstClass();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new General();
                    break;
                default:
                    compartments[i] = new Luggage();
                    break;
            }
            System.out.println("Compartment " + (i + 1) + ": " + compartments[i].notice());
        }
    }
}

abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {
    @Override
    public String notice() {
        return "First Class: Please maintain silence and decorum.";
    }
}

class Ladies extends Compartment {
    @Override
    public String notice() {
        return "Ladies Compartment: Reserved for women passengers only.";
    }
}

class General extends Compartment {
    @Override
    public String notice() {
        return "General Compartment: Open for all passengers.";
    }
}

class Luggage extends Compartment {
    @Override
    public String notice() {
        return "Luggage Compartment: Keep luggage secured and do not occupy.";
    }
}
