package org.example;

import java.sql.SQLOutput;
import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        SystemDeveloper systemDeveloper1 = new SystemDeveloper(1,"Kalle",25000, LocalDate.now());
        systemDeveloper1.addCertificate("Roblox game certification");
        systemDeveloper1.addLanguage("Lua");
        systemDeveloper1.addCertificate("C C++ certificate");
        systemDeveloper1.addLanguage("C++");
        systemDeveloper1.addCertificate("V B Certified");
        systemDeveloper1.addLanguage("Visual basic");

        System.out.println(systemDeveloper1);

    }
}
