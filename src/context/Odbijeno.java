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
public class Odbijeno extends State {

    public Odbijeno() {
        System.out.println(toString());
    }

    @Override
    public State next() {
        return new Kraj();
    }

    @Override
    public String toString() {
        return "Odbijen je rad!";
    }
    
    
}
