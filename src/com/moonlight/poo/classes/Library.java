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
    
    public boolean add(Publication publication) {
        if (index < shelves.length) {
            this.shelves[index++] = publication;
            return true;
        }
        
        return false;    
    }
    
    public void showShelves(){
        System.out.println("Publicaciones: ");
        for (int i = 0; i < index; i++) {
            System.out.println(shelves[i].getTitle());
        }
    }
    
    public String searchPublication(String title) {
        for (int i = 0; i < index; i++) {
            if (shelves[i].getTitle().equalsIgnoreCase(title)) {
                return "La revista se encuentra en la pos " + (i+1);
            }
        }
        
        return "No se encontro la publicacion";
    }
}
