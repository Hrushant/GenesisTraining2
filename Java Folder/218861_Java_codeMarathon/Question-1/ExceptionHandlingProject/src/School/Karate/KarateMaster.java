package School.Karate;

import School.Karate.Exceptions.FallenException;
import School.Karate.Exceptions.KnockDownException;

public class KarateMaster {
    public void knockDown() throws KnockDownException{
        for(int i=0;i<20;i++)
        {
            double value = Math.random()%10;
            if(value > 0.90)
            {
                throw new KnockDownException("Player is knockDown...");
            }
            else if(value < 0.10){
                throw new FallenException("Player is Fall..");
            }
            System.out.println("Artificial fight : "+i);
        }
    }
}
