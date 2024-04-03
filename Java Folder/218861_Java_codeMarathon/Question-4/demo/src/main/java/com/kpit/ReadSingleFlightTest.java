package com.kpit;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.kpit.myExceptions.FlightNotFoundException;

public class ReadSingleFlightTest {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyJPA");
        EntityManager manager = factory.createEntityManager();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter flight number which you want to display : ");
        int flight_Number = sc.nextInt();

        Flight flight1 = manager.find(Flight.class, flight_Number);
        if (flight1 == null) {
            throw new FlightNotFoundException("Flight not found");
        }
        System.out.println("Flight number : " + flight1.getFlightNumber());
        System.out.println("Flight name : " + flight1.getFlightName());
        System.out.println("Flight source : " + flight1.getFlightSource());
        System.out.println("Flight destination : " + flight1.getFlightDest());
    }

}
