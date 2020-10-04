package com.moonlight.poo.classes;

/**
 *
 * @author Mark_Zamudio
 */

public class Infractions {
    private Infraction infractions[];
    private int index;
    
    public Infractions(int total) {
        infractions = new Infraction[total];
    }
    
    public boolean add(Infraction infraction) {
        if (index < infractions.length) {
            infractions[index++] = infraction;
            return true;
        }
        
        return false;
    }
}
