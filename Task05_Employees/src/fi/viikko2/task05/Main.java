/**
 * Tehtävä 5 – Main
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Luo Employee[] ja laske palkkasumma.
 *  2. Tulosta tiedot.
 *
 * VINKIT:
 *  - Toteuta aliluokat ensin.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task05;

import fi.viikko2.task04.Circle;
import fi.viikko2.task04.Rectangle;
import fi.viikko2.task04.Shape;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[] {
                new SalariedEmployee("Max", 300),
                new SalariedEmployee("George", 500),
                new HourlyEmployee("Abby", 11, 11),
                new HourlyEmployee("Ariana", 22, 7.20)
        };

        double total = 0;

        for (Employee e : employees) {
            System.out.println(e);
            total += e.monthlyPay();
        }

        System.out.println("Yhteensä palkkoja maksetaan: " + total);
    }
}