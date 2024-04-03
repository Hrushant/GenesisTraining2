package com.kpit;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.kpit.myExceptions.FlightNotFoundException;

public class DeleteFlightTest {
    public static void main(String[] args) {
        try {
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyJPA");
            EntityManager manager = factory.createEntityManager();

            EntityTransaction trans = manager.getTransaction();
            trans.begin();

            System.out.println("Enter flight number to delete ");
            Scanner scanner1 = new Scanner(System.in);
            int flightNumberToSearch = scanner1.nextInt();

            Flight flight1 = manager.find(Flight.class, flightNumberToSearch);

            if (flight1 == null) {
                FlightNotFoundException flightNotFoundEx = new FlightNotFoundException(
                        "This flight id does not exists !!! " + flightNumberToSearch);
                throw flightNotFoundEx;
            }
            System.out.println("Flight No   : " + flight1.getFlightNumber());
            System.out.println("Flight Source  : " + flight1.getFlightSource());
            System.out.println("Flight Dest : " + flight1.getFlightDest());
            System.out.println("Flight name : "+flight1.getFlightName());
            System.out.println("Are you sure you want to delete ");
            Scanner scanner2 = new Scanner(System.in);
            String ans = scanner2.nextLine();
            if (ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("yes")) {
                manager.remove(flight1);
                trans.commit();
                System.out.println("Record deleted...");
            } else {
                System.out.println("Record NOT deleted....");
            }

            manager.close();
            System.out.println("Entity manager closed..");
        } catch (FlightNotFoundException e) {
            System.out.println("Error : " + e);
        }
    }

}