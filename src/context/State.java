/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package context;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Stefan
 */
public abstract class State {
    public abstract State next();
    
    public int vratiIzbor(String message){
        System.out.println(message);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = -1;
        try {
            String answer = br.readLine();
            i = Integer.parseInt(answer);
        } catch (Exception ex) {
            Logger.getLogger(State.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
}
