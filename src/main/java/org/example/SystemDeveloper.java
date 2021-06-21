package org.example;

import java.time.LocalDate;
import java.util.Arrays;

public class SystemDeveloper extends Employee{

    private String[] certificates = new String[0];
    private String[] languages = new String[0];

    public SystemDeveloper(int id, String name, double salary, LocalDate dateHired) {
        super(id, name, salary, dateHired);
    }

    public void addCertificate(String certificate){
        int size = certificates.length;
        String[] newArray = new String[size+1];
        certificates = newArray;
        certificates[size] = certificate;
        calculateSalary();
    }

    public void addLanguage(String language){
        int size = languages.length;
        String[] newArray = new String[size+1];
        languages = newArray;
        languages[size] = language;
        calculateSalary();
    }

    public void calculateSalary(){
        this.setSalary(25000+((certificates.length)*1000)+((languages.length)*1500));
    }

    public String[] getCertificates() {
        return certificates;
    }

    public void setCertificates(String[] certificates) {
        this.certificates = certificates;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }



    @Override
    public String toString() {
        return "Id=" + getId() +
                "Name=" + getName() +
                "Salary" + getSalary() +
                "Date of employment" + getDateHired() +
                "SystemDeveloper{" +
                "certificates=" + Arrays.toString(certificates) +
                ", languages=" + Arrays.toString(languages) +
                '}';
    }
}
