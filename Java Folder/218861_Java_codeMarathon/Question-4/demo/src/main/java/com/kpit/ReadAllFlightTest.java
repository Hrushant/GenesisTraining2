package com.kpit;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


public class ReadAllFlightTest {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyJPA");
        EntityManager manager = factory.createEntityManager();
        TypedQuery<Flight> typedQuery = manager.createQuery("from Flight", Flight.class);

        List<Flight> flightList = typedQuery.getResultList();

        for (Flight flight : flightList) {
            System.out.println("Flight No   : " + flight.getFlightNumber());
            System.out.println("Flight name : " + flight.getFlightName());
            System.out.println("Flight Dest : " + flight.getFlightDest());
            System.out.println("Flight Source  : " + flight.getFlightSource());
            System.out.println("------------------");
        }

    }
}