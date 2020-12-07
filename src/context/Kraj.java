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
public class Kraj extends State {

    public Kraj() {
        System.out.println(toString());
    }

    @Override
    public State next() {
        return null;
    }

    @Override
    public String toString() {
        return "Kraj";
    }
    
    
}
