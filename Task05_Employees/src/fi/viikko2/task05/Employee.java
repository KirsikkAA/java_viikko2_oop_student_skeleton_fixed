/**
 * Tehtävä 5 – Employee
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Perusluokka name-kentällä.
 *  2. monthlyPay() palauttaa 0.
 *  3. toString() ja equals(Object).
 *
 * VINKIT:
 *  - equals: sama nimi + sama alatyyppi.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task05;

import java.util.Objects;

import fi.viikko2.task04.Circle;

public class Employee {
    protected String name;

    public Employee(String name){
        this.name = name;
    }

    public double monthlyPay(){
        return 0.0; 
    }

    @Override
    public String toString(){
        return name;
    }

    @Override
    public boolean equals(Object o){
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Employee that = (Employee) o;
        return Objects.equals(name, that.name);
    }
}