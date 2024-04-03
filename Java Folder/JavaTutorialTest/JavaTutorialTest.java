package JavaTutorialTest;

public class JavaTutorialTest {
    public static void main(String args[]) {
        System.out.println("Begin the program....");

        JavaTutorial javaTutObj = new JavaTutorial();

        Application appObj = new Application("VSCode", 900);
        StudentsCount stuObj = new StudentsCount(100, 40, 60);
        Projector projObj = new Projector("DLP", 7000);

        javaTutObj.learn(appObj, stuObj, projObj);

        System.out.println("End the program....");
    }
}

class Tutorial {

}

class JavaTutorial extends Tutorial {
    private Classroom classroomObj = new Classroom(); // hasA

    void learn(Application appObjRef, StudentsCount stuObjRef, Projector projObjRef) {

        System.out.println(
                "There are total " + stuObjRef.totalCount + " students in a class out of them " + stuObjRef.boysCount
                        + " are boys and remaining " + stuObjRef.girlsCount + " are girls. In this, we uses "
                        + appObjRef.getAppName() + " as a platform and it's subscription fees is "
                        + appObjRef.getSubscriptionAmount() + "Rs. " + "In our class we uses a " + projObjRef.type
                        + " projector and it's cost is " + projObjRef.price + "Rs.");
    }
}

class Room {

}

class Classroom extends Room // isA
{

}

class Application {
    String appName;
    int subscriptionAmount;

    public Application(String appName, int subscriptionAmount) {
        this.appName = appName;
        this.subscriptionAmount = subscriptionAmount;
    }

    String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public int getSubscriptionAmount() {
        return subscriptionAmount;
    }

    public void setSubscriptionAmount(int subscriptionAmount) {
        this.subscriptionAmount = subscriptionAmount;
    }
}

class StudentsCount {
    int totalCount;
    int boysCount;
    int girlsCount;

    public StudentsCount(int totalCount, int boysCount, int girlsCount) {
        this.totalCount = totalCount;
        this.boysCount = boysCount;
        this.girlsCount = girlsCount;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getBoysCount() {
        return boysCount;
    }

    public void setBoysCount(int boysCount) {
        this.boysCount = boysCount;
    }

    public int getGirlsCount() {
        return girlsCount;
    }

    public void setGirlsCount(int girlsCount) {
        this.girlsCount = girlsCount;
    }
}

class Projector {
    String type; // LCD,LED,DLP,LCOS
    int price;

    public Projector(String type, int price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}