/**
 * Tehtävä 4 – Rectangle
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Kentät: width, height.
 *  2. Konstruktori.
 *  3. Ylikirjoita area(), toString(), equals().
 *
 * VINKIT:
 *  - Muista @Override.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task04;

import java.util.Objects;

import fi.viikko2.task03.BankAccount;

public class Rectangle extends Shape {
    private double width;
    private double height;


    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double area(){ 
        if(width <= 0 || height <= 0){
            return 0.0;
        }
        return width * height;
     }

    @Override
    public String toString(){ 
     return "Retangle (width = " + width +" height = " + height + ")";
    }

    @Override
    public boolean equals(Object o){ 
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Rectangle that = (Rectangle) o;
        return Double.compare(that.width, width) == 0 &&
                Double.compare(that.height, height) == 0;}
}