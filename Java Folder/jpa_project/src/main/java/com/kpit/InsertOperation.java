package com.kpit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertOperation {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyJPA");
        EntityManager manager = factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        Flight flight1 = new Flight(105, "Mumbai", "Pune", 2000);
        Flight flight2 = new Flight(102, "Pune", "Banglore", 2200);
        Flight flight3 = new Flight(103, "Banglore", "Haidrabad", 2500);
        Flight flight4 = new Flight(104, "Mumbai", "Nagpur", 2900);

        manager.persist(flight1);
        manager.persist(flight2);
        manager.persist(flight3);
        manager.persist(flight4);
        transaction.commit();
    }
}
