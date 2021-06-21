package org.example;

import java.time.LocalDate;
import java.util.Arrays;

public class SalesPerson extends Employee{

    private String[] clients;
    private int aquiredClients;

    public SalesPerson(int id, String name, double salary, LocalDate dateHired) {
        super(id, name, salary, dateHired);
    }


    public void calculateSalary(){
        int salary = (25000+((clients.length)*500)+((aquiredClients)*1500));
    }

    public String[] getClients() {
        return clients;
    }

    public void setClients(String[] clients) {
        this.clients = clients;
    }

    public int getAquiredClients() {
        return aquiredClients;
    }

    public void setAquiredClients(int aquiredClients) {
        this.aquiredClients = aquiredClients;
    }

    @Override
    public String toString() {
        return "SalesPerson{" +
                "clients=" + Arrays.toString(clients) +
                ", aquiredClients=" + aquiredClients +
                '}';
    }
}
