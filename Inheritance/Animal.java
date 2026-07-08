public class Animal {
    public void eat() {
        System.out.println("Animal is eating.");
    }

    public void sleep() {
        System.out.println("Animal is sleeping.");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();

        Bird bird = new Bird();
        bird.eat();
        bird.sleep();
        bird.fly();
    }
}

class Bird extends Animal {
    @Override
    public void eat() {
        System.out.println("Bird is pecking at seeds.");
    }

    @Override
    public void sleep() {
        System.out.println("Bird is sleeping in its nest.");
    }

    public void fly() {
        System.out.println("Bird is flying high in the sky.");
    }
}

