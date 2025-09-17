/**
 * Tehtävä 4 – Main
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Luo Shape[] ja laske kokonaispinta-ala.
 *  2. Tulosta toString()-arvot.
 *
 * VINKIT:
 *  - Toteuta aliluokat ensin.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task04;

public class Main {
    public static void main(String[] args) {

    Shape[] shapes = new Shape[]{
        new Rectangle(2,5),
        new Rectangle(3,4),
        new Circle(4),
        new Circle(3.6)
    };

    double totalArea = 0.0;

    for(Shape s : shapes){
        System.out.println(s.toString() + ", area = "+ s.area());
        totalArea = totalArea + s.area();
    }
    System.out.println("Kok.pinta-ala = " + totalArea);
    }
}