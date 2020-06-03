/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author HI andres
 */
public class Lavadora extends Electrodomestico{
    private int carga; 

    public Lavadora() {
    }

    public Lavadora(int codigo) {
        super(codigo);
    }
   

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return super.toString() + "carga=" + carga ;
    }

    @Override
    public double calcularPrecio() {
        super.calcularPrecio();
        if(this.carga>30){
            super.setPrecioBase(getPrecioBase()+50);
        }
   return super.getPrecioBase();
    
    }
    
}
