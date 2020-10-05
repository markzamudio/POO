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
    
    public double calculateAmount() {
        double total = 0;
        
        for (int i = 0; i < index; i++) {
            total += infractions[i].getAmount();
        }
        
        return total;
    }
    
    public int[] getInfractionCount() {
        int counters[] = new int[20];
        
        for (int i = 0; i < index; i++) {
            counters[infractions[i].getCode() - 1]++;
        }
        
        return counters;
    }
    
    public String getInfractions() {
        StringBuilder temp = new StringBuilder("");
        
        for (int i = 0; i < index; i++) {
            temp.append(infractions[i]).append("\n");
        }
        
        return temp.toString();
    }
}
