package org.example;

import java.util.Arrays;

public class SystemDeveloper {

    private String[] certificates;
    private String[] languages;

    public void calculateSalary(){

    }

    @Override
    public String toString() {
        return "SystemDeveloper{" +
                "certificates=" + Arrays.toString(certificates) +
                ", languages=" + Arrays.toString(languages) +
                '}';
    }
}
