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
public class Electrodomestico implements Comparable {
        private int codigo;
    private String descripcion;
    private double precioBase;
    private String color;
    private char consumoElectrico;
    int peso;

    public Electrodomestico() {
        
    }

    public Electrodomestico(int codigo, String descripcion, double precioBase, String color, char consumoElectrico, int peso) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioBase = precioBase;
        this.color = color;
        this.consumoElectrico = consumoElectrico;
        this.peso = peso;
    }

    public Electrodomestico(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoElectrico() {
        return consumoElectrico;
    }

    public void setConsumoElectrico(char consumoElectrico) {
        this.consumoElectrico = consumoElectrico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
     public double calcularPrecio() {
        if (this.consumoElectrico == 'A') {
            this.precioBase += 100;
        }
        if (this.consumoElectrico == 'B') {
            this.precioBase += 80;
        }
        if (this.consumoElectrico == 'C') {
            this.precioBase += 60;
        }
        if (this.consumoElectrico == 'D') {
            this.precioBase += 50;
        }
        if (this.consumoElectrico == 'E') {
            this.precioBase += 30;
        }
        if (this.consumoElectrico== 'F') {
            this.precioBase += 10;
        }
        
        if (this.peso >= 20 && this.peso <= 49) {
            this.precioBase += 50;
        }
        if (this.peso >= 50 && this.peso <= 79) {
            this.precioBase += 80;
        }
        if (this.peso >= 80) {
            this.precioBase += 100;
        }
        return this.precioBase;
    }

    @Override
    public String toString() {
        return  "codigo=" + codigo + ", descripcion=" + descripcion + ", precioBase=" + precioBase + ", color=" + color + ", consumoElectrico=" + consumoElectrico + ", peso=" + peso ;
    }

    
    
        @Override
    public int compareTo(Object obj){
    int resul = 0;
    Electrodomestico electro = (Electrodomestico)obj;
    if(this.calcularPrecio()==electro.calcularPrecio()){
    return resul;
    }
    if(this.calcularPrecio()==electro.calcularPrecio()){
    resul= 1;
    }else{
    
    resul=1;
    }
    return resul;
    }
    
}
