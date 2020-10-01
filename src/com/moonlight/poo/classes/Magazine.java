package com.moonlight.poo.classes;

/**
 *
 * @author Mark_Zamudio
 */

public class Magazine extends Publication {
    private String id;
    
    public Magazine() {
        super();
        this.id = "Sin identificacion";
    }
    
    public Magazine(String id, String title, int numberOfPages) {
        super(title, numberOfPages);
        this.id = id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return "La revista " + getTitle() + " tiene " + getNumberOfPages() + 
                " Paginas";
    }
}
