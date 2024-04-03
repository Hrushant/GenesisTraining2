import School.Karate.KarateMaster;
import School.Karate.Exceptions.KnockDownException;

public class KarateTest {
    public static void main(String[] args) {
        KarateMaster karateMaster = new KarateMaster();
        try{
            karateMaster.knockDown();
        }catch(KnockDownException e){
            System.out.println("KnockDownException found..."+e);
        }
    }
}
