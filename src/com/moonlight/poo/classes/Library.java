package com.moonlight.poo.classes;

/**
 *
 * @author Mark_Zamudio
 */

public class Library {
private Publication[] shelves;
    private int index;
    
    public Library() {
        shelves = new Publication[20];
        index = 0;
    }
    
    public Library(int size) {
        shelves = new Publication[size];
        index = 0;
    }
    
    public Publication[] getShelves() {
        return shelves;
    }
}
