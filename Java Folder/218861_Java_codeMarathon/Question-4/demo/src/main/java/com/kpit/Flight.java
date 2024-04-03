package com.kpit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flight_table")
public class Flight {
    @Id
    @Column(name="flight_no")
    private int flightNumber;
    @Column(name="flight_name")
    private String flightName;
    @Column(name="source")
    private String flightSource;
    @Column(name="dest")
    private String flightDest;

    public Flight() {
        System.out.println("Flight constructed...");
    }

    public Flight(int flightNumber, String flightName, String flightSource, String flightDest) {
        this.flightNumber = flightNumber;
        this.flightName = flightName;
        this.flightSource = flightSource;
        this.flightDest = flightDest;
    }
    public int getFlightNumber() {
        return flightNumber;
    }
    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }
    public String getFlightName() {
        return flightName;
    }
    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }
    public String getFlightSource() {
        return flightSource;
    }
    public void setFlightSource(String flightSource) {
        this.flightSource = flightSource;
    }
    public String getFlightDest() {
        return flightDest;
    }
    public void setFlightDest(String flightDest) {
        this.flightDest = flightDest;
    }

    @Override
    public String toString() {
        return "Flight [flightNumber=" + flightNumber + ", flightName=" + flightName + ", flightSource=" + flightSource
                + ", flightDest=" + flightDest + "]";
    }

    
    
}
