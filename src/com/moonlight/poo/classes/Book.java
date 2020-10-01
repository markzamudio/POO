package com.moonlight.poo.classes;

/**
 *
 * @author Mark_Zamudio
 */

public class Book extends Publication {
private String ISBN;
    private String author;
    
    public Book() {
        super();
        this.ISBN = "Sin definir";
        this.author = "Sin definir";
    }
    
    public Book(String ISBN, String title, String author, int numberOfPages) {
        super(title, numberOfPages);
        this.ISBN = ISBN;
        this.author = author;
    }
    
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    
    public String getISBN() {
        return ISBN;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String getAuthor() {
        return author;
    }
    
    @Override
    public String toString() {
        return "El libro con ISBN " + this.ISBN + ", creado por el autor " + 
                this.author + " tiene " + getNumberOfPages() + " Paginas";
    }    
}
