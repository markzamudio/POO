package com.moonlight.poo.classes;

/**
 *
 * @author Mark_Zamudio
 */

public class Publication {
    private String title;
    private int numberOfPages;
    
    public Publication() {
        this.title = "Sin nombre";
    }
    
    public Publication(String title, int numberOfPages) {
        this.title = title;
        this.numberOfPages = numberOfPages;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    
    public int getNumberOfPages() {
        return numberOfPages;
    }
    
    @Override
    public String toString() {
        return this.title + " tiene " + this.numberOfPages + " paginas";
    }
}
