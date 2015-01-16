/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Антон
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     DrumKit d = new DrumKit();
    d.snare = false;
    if (d.snare == true) {
         d.playSnare();
     }
    
    d.playSnare();
    d.playTophat();
    
     
    }
    
}
