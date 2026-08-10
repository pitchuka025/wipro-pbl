interface Vehicle {
    default void message() {
        System.out.println("Inside Vehicle");
    }
}

interface FourWheeler {
    default void message() {
        System.out.println("Inside FourWheeler");
    }
}

class Car implements Vehicle, FourWheeler {
    @Override
    public void message() {
        Vehicle.super.message();
        System.out.println("Inside Car");
    }
}

public class Interfacesnew1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.message();
    }
}
