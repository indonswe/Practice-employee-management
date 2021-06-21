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
        systemDeveloper1.addCertificate("Oracle java certification");
        systemDeveloper1.addLanguage("Lua");

        System.out.println(systemDeveloper1);

    }
}
