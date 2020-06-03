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
public class Television extends Electrodomestico {
    private int resolucion;
    private boolean puertoHDMI;

    public Television() {
    }

    public Television(int codigo) {
        super(codigo);
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isPuertoHDMI() {
        return puertoHDMI;
    }

    public void setPuertoHDMI(boolean puertoHDMI) {
        this.puertoHDMI = puertoHDMI;
    }

    
    @Override
    public String toString() {
        return super.toString()+ "resolucion=" + resolucion + ", puertoHDMI=" + puertoHDMI;
    }

    @Override
    public double calcularPrecio() {
        super.calcularPrecio();
      if (this.resolucion>40) {
           super.setPrecioBase(getPrecioBase()*100/30);
        }  
      if(puertoHDMI==true){
           super.setPrecioBase(getPrecioBase()+50);
      }
      return super.getPrecioBase();
    }
    
}
