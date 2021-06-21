package org.example;

import java.time.LocalDate;
import java.util.Arrays;

public class SystemDeveloper extends Employee{

    private String[] certificates;
    private String[] languages;

    public SystemDeveloper(int id, String name, double salary, LocalDate dateHired) {
        super(id, name, salary, dateHired);
    }

    public void addCertificate(String certificate){
        int size = certificates.length;
        certificates[size+1] = certificate;
        calculateSalary();
    }

    public void calculateSalary(){
        this.setSalary(25000+((certificates.length)*1000)+((languages.length)*1500));
    }

    @Override
    public String toString() {
        return "SystemDeveloper{" +
                "certificates=" + Arrays.toString(certificates) +
                ", languages=" + Arrays.toString(languages) +
                '}';
    }
}
