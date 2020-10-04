package com.moonlight.poo.classes;

/**
 *
 * @author Mark_Zamudio
 */

public class Infraction {
    private long folio;
    private int code;
    private double amount;
    
    public Infraction(long folio, int code, double amount) {
        this.folio = folio;
        this.code = code;
        this.amount = amount;
    }
    
    public void setFolio(long folio) {
        this.folio = folio;
    }
    
    public long getFolio() {
        return folio;
    }
    
    public void setCode(int code) {
        this.code = code;
    }
    
    public int getCode() {
        return code;
    }
    
    public double getAmount() {
        return amount;
    }
    
    @Override
    public String toString() {
        return "Folio: " + folio + "\n" +
                "Codigo de infraccion: " + code + "\n" + 
                "Monto: " + amount;
    }
}
