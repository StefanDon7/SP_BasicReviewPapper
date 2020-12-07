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
public class PiseRad extends State{

    public PiseRad(){
        System.out.println(toString());
    }
    
    @Override
    public State next() {
       int answer = vratiIzbor("Izaberite opciju. Moguca stanja:\n1-Odustajem od pisanja\n2-Saljem\n3-Ostajem da pisem\nOdgovor:");
        if(answer==1){
            return new Odustajem();
        }
        if(answer==2){
             return new Saljem();
        }
        return this;
    }

    @Override
    public String toString() {
       return "Autor pise rad!";
    }
    
    
}
