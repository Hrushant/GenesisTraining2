package com.kpit;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.kpit.myExceptions.FlightNotFoundException;

public class UpdateFlightTest {
    public static void main(String[] args) {
        EntityManagerFactory factory=Persistence.createEntityManagerFactory("MyJPA");
        EntityManager manager=factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter flight number which you want to update : ");
        int flight_No = sc.nextInt();
        Flight flight1 = manager.find(Flight.class, flight_No);
        if(flight1 == null){
            throw new FlightNotFoundException("Flight not found");
        }
        
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter flight new name : ");
        String flight_name = sc3.nextLine();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter flight new destination : ");
        String flight_Dest = sc1.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter flight new Source : ");
        String flight_source = sc2.nextLine();

        flight1.setFlightName(flight_name);
        flight1.setFlightDest(flight_Dest);
        flight1.setFlightSource(flight_source);

        transaction.commit();
        manager.close();

    }
}
