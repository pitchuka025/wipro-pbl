abstract class Vehicle {
    public abstract String getModelName();
    public abstract String getRegistrationNumber();
    public abstract String getOwnerName();
}

class Hero extends Vehicle {
    public String getModelName() {
        return "Hero Splendor";
    }

    public String getRegistrationNumber() {
        return "AP39AB1234";
    }

    public String getOwnerName() {
        return "Rupa Sri";
    }

    public int getSpeed() {
        return 80;
    }

    public void radio() {
        System.out.println("Radio is ON");
    }
}

class Honda extends Vehicle {
    public String getModelName() {
        return "Honda Shine";
    }

    public String getRegistrationNumber() {
        return "AP39CD5678";
    }

    public String getOwnerName() {
        return "Rupa Sri";
    }

    public int getSpeed() {
        return 90;
    }

    public void cdplayer() {
        System.out.println("CD Player is ON");
    }
}

public class TestVehicle {
    public static void main(String[] args) {
        Hero h1 = new Hero();

        System.out.println("Hero Details");
        System.out.println(h1.getModelName());
        System.out.println(h1.getRegistrationNumber());
        System.out.println(h1.getOwnerName());
        System.out.println(h1.getSpeed());
        h1.radio();

        System.out.println();

        Honda h2 = new Honda();

        System.out.println("Honda Details");
        System.out.println(h2.getModelName());
        System.out.println(h2.getRegistrationNumber());
        System.out.println(h2.getOwnerName());
        System.out.println(h2.getSpeed());
        h2.cdplayer();
    }
}
