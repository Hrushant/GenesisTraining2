package com.kpit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CreateFlightTest {
    public static void main(String[] args) {
        EntityManagerFactory factory=Persistence.createEntityManagerFactory("MyJPA");
        EntityManager manager=factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
    
        Flight flight1 = new Flight(101,"Emirates","Pune","Kochi");
        Flight flight2 = new Flight(102,"Subway","Mumbai","Kochi");
        Flight flight3 = new Flight(103,"Airlines","Kochi","Amravati");
        
        manager.persist(flight1);
        manager.persist(flight2);
        manager.persist(flight3);

        transaction.commit();

    }
}
