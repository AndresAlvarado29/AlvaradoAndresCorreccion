/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import ec.edu.ups.controlador.ControladorElectrodomestico;
import ec.edu.ups.dao.ElectrodomesticoDAO;
import ec.edu.ups.vista.VistaElectrodomestico;

/**
 *
 * @author HI andres
 */
public class Principal {
    public static void main(String[] args) {
    ElectrodomesticoDAO electroDAO = new ElectrodomesticoDAO();
    VistaElectrodomestico vistaElectro = new VistaElectrodomestico();
    ControladorElectrodomestico controlador = new ControladorElectrodomestico(vistaElectro, electroDAO);
    System.out.println("Tienda de Electrodomesticos");
        for (int i = 0; i < 3; i++) {
        System.out.println("Ingrese la informacion de la television "+i);
        controlador.registrarTelevision();    
        }
        for (int i = 0; i < 3; i++) {
         System.out.println("Ingrese la informacion de la lavadora "+i); 
         controlador.RegistrarLavadora();
              
        }
        System.out.println("Hay los siguientes articulos:");
        System.out.println("Televisiones");
        controlador.verTelevisiones();
        System.out.println("Lavadoras");
        controlador.verLavadoras();
       
    }   
}
