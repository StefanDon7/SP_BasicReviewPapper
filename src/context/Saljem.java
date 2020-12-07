/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package context;

/**
 *
 * @author Stefan
 */
public class Saljem extends State {

    public Saljem() {
        System.out.println(toString());

    }

    @Override
    public State next() {
        int izbor = vratiIzbor("Izaberite opciju. Moguca stanja:\n1-Odbijeno\n2-Prihvaceno\n3-Vraceno na doradu\n4-Ostaje na proveri\nOdgovor:");
        if (izbor == 1) {
            return new Odbijeno();
        } else if (izbor == 2) {
            return new Prihvaceno();
        } else if (izbor == 3) {
            return new PiseRad();
        }
        return this;

    }

    @Override
    public String toString() {
        return "Autor je poslao rad na proveru!";
    }

}
