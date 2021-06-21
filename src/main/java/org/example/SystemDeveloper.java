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
        String[] newArray = Arrays.copyOf(certificates, certificates.length + 1);//make big array
        newArray[newArray.length-1] = certificate;//Put the new toDoItem in the bigger array
        certificates = newArray;
        calculateSalary();
    }

    public void addLanguage(String language){
        String[] newArray = Arrays.copyOf(languages, languages.length + 1);//make big array
        newArray[newArray.length-1] = language;//Put the new toDoItem in the bigger array
        languages = newArray;
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
                " Name=" + getName() +
                " Salary=" + getSalary() +
                " Date of employment=" + getDateHired() +
                " SystemDeveloper{" +
                "certificates=" + Arrays.toString(certificates) +
                ", languages=" + Arrays.toString(languages) +
                '}';
    }
}
