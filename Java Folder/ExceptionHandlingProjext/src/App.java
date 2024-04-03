public class App {
    public static void main(String[] args) throws Exception {

        Home home = new Home();
        home.exitFromHome();
        home.startTheJourney();
        home.enterInHome();
    }
}

// t e a r
class Home {
    void enterInHome() {
        System.out.println("Entering in home...");
    }

    void exitFromHome() {
        System.out.println("Exiting from home...");
    }

    void startTheJourney() {
        System.out.println("Starting the journey....");
        Car car;
        try {
            car = new Car();
            car.longDrive();
        } catch (CarKeyNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (DocsNotCarriedException docsNotCarriedException) {
            docsNotCarriedException.printStackTrace();
        }

        finishedTheJourney();
    }

    void finishedTheJourney() {
        System.out.println("Finishing the journey....");
    }

}

class Car {
    boolean keyFound; // false
    boolean docsFound; // false

    Car() throws CarKeyNotFoundException, DocsNotCarriedException {
        double val = Math.random() % 10;
        if (val > 0.50) {
            keyFound = true;
            System.out.println("Wow!!! Key found");

        } else {
            throw new CarKeyNotFoundException("Oh No!!where is the car key????");
        }

        if (val > 0.10) {
            docsFound = true;
            System.out.println("Wow!!! docs found");
        } 
       // else {
        //     throw new DocsNotCarriedException("Oh No!!car's documents are at home...");
        // }
    }

    void longDrive() {
        for (int i = 1; i <= 50; i++) {

            double val = Math.random() % 10; // 0 to 1

            if (val > 0.99) {
                // throw new RuntimeException("Oh!!! the tyre is punctured....can't go now..");
                throw new TyrePuncturedException("Oh!!! the tyre is punctured....can't go now..");
            }

            if (val > 0.50 && val < 0.51) {
                // throw new RuntimeException("OMG, the brakes failed...can't go now..");
                throw new BrakesFailedException("OMG, the brakes failed...can't go now..");

            }

            if (val > 0.10 && val < 0.11) {
                // throw new RuntimeException("Oh!!! fuel ran out....can't go now..");
                throw new FuelRanOutException("Oh!!! fuel ran out....can't go now..");

            }

            if (val > 0.90 ) {
                // throw new RuntimeException("Oh!!! fuel ran out....can't go now..");
                throw new SpeedLimitException("OMG!!!your speed is very high...");

            }

            System.out.println("driving my car " + i);
        }
    }

    void shortDrive() {

    }
}

class FuelRanOutException extends RuntimeException {
    FuelRanOutException(String msg) {
        super(msg);
    }
}

class TyrePuncturedException extends RuntimeException {
    TyrePuncturedException(String msg) {
        super(msg);
    }
}

class BrakesFailedException extends RuntimeException // unchecked
{
    BrakesFailedException(String msg) {
        super(msg);
    }
}

class SpeedLimitException extends RuntimeException //unchecked --------------
{
    SpeedLimitException(String msg)
    {
        super(msg);
    }
}

class CarKeyNotFoundException extends Exception // checked
{
    CarKeyNotFoundException(String msg) {
        super(msg);
    }
}

class DocsNotCarriedException extends Exception // checked -----------
{
    DocsNotCarriedException(String msg) {
        super(msg);
    }
}