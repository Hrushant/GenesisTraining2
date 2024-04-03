import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        PhoneLog log1 = new PhoneLog("Hrushant","8830109747",129);
        PhoneLog log2 = new PhoneLog("Nishant","89489378267",1200);
        PhoneLog log3 = new PhoneLog("Ankush","892389238923",13);
        PhoneLog log4 = new PhoneLog("Ashish","7856345689",67);
        PhoneLog log5 = new PhoneLog("Om","9078563423",145);

        ArrayList<PhoneLog> arraylist = new ArrayList<PhoneLog>();
        arraylist.add(log1);
        arraylist.add(log2);
        arraylist.add(log3);
        arraylist.add(log4);
        arraylist.add(log5);

        Iterator iter = arraylist.iterator();
        
        int i=1;
        while(iter.hasNext()){
            PhoneLog val = (PhoneLog) iter.next();
            System.out.println(i+" = "+val);
            i++;
        }
    }
}

class PhoneLog{
    String name;
    String phoneNumber;
    int durationInSeconds;

    public PhoneLog(String name, String phoneNumber, int durationInSeconds) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.durationInSeconds = durationInSeconds;
    }
    @Override
    public String toString() {
        return "PhoneLog [name=" + name + ", phoneNumber=" + phoneNumber + ", durationInSeconds=" + durationInSeconds
                + "]";
    }
}