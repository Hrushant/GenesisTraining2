class InterfaceTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.travel();
        car.running();
        car.increaseSp();

        Bike bike = new Bike();
        bike.travel();
        bike.increaseSp();
        bike.decreaseSp();
    }
}

interface increaseSpeed {
    void increaseSp();
}

interface decreaseSpeed {
    void decreaseSp();
}

class Car implements increaseSpeed {
    void travel() {
        System.out.println("Car is travelling...");
    }

    void running() {
        System.out.println("Car is running...");
    }

    public void increaseSp() {
        System.out.println("Car is increasing its speed");
    }
}

class Bike  implements increaseSpeed, decreaseSpeed {
    
    void travel() {
        System.out.println("Bike is Travelling...");
    }

    public void increaseSp() {
        System.out.println("Bike increases the speed");
    }

    public void decreaseSp() {
        System.out.println("Bike decreases the speed");
    }
}