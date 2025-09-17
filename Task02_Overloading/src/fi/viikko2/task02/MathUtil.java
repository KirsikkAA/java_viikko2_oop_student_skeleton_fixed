/**
 * Tehtävä 2 – Metodien ylikuormitus (sum, min, max, taulukot)
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Toteuta sum(int,int), sum(int,int,int), sum(int[]), sum(double[]).
 *  2. Toteuta max(int[]) ja min(int[]).
 *
 * VINKIT:
 *  - Käy taulukko silmukalla; varo tyhjiä taulukoita.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task02;

public class MathUtil {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int[] numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    public static double sum(double[]numbers){
        double total = 0.0;
        for (double n : numbers){
            total += n;
        }
        return total;
    }


    //max ja min
    public static int max(int[] numbers){
        int max = numbers[0];
        for(int n : numbers){
            if(n > max){
                max = n;
            }
        }
        return max;
    }

        public static int min(int[] numbers){
        int min = numbers[0];
        for(int n : numbers){
            if(n < min){
                min = n;
            }
        }
        return min;
    }
}