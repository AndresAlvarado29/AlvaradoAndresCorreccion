/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.ElectrodomesticoDAO;
import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import ec.edu.ups.vista.VistaElectrodomestico;
import java.util.List;

/**
 *
 * @author HI andres
 */
public class ControladorElectrodomestico {
    private VistaElectrodomestico vistaElectro;
    private Electrodomestico electro;
    private ElectrodomesticoDAO electroDAO;

    public ControladorElectrodomestico(VistaElectrodomestico vistaElectrodomestico, ElectrodomesticoDAO electrodomesticoDAO) {
        this.vistaElectro = vistaElectrodomestico;
        this.electroDAO = electrodomesticoDAO;
    }

    public void registrarTelevision(){
        Television television = vistaElectro.ingresarTV();
        electroDAO.createTV(television);
    }
    
    public void RegistrarLavadora(){
        Lavadora lavadora = vistaElectro.ingresarLava();
        electroDAO.createLava(lavadora);
    }
    
    public void verLavadoras(){
        List lavadoras = electroDAO.listaLava();
        vistaElectro.mostrarLavadoras(lavadoras);
     
    }
    
    public void verTelevisiones(){
        List televisiones = electroDAO.listaTV();
        vistaElectro.mostrarTelevisores(televisiones);
    }
}
