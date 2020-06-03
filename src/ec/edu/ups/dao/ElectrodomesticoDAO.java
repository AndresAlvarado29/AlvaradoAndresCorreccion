/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.idao.IElectrodomesticoDAO;
import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author HI andres
 */
public class ElectrodomesticoDAO implements IElectrodomesticoDAO {
    private final SortedSet<Electrodomestico> lista;

    public ElectrodomesticoDAO() {
        
        lista = new TreeSet<>();
    }
    
    @Override
    public void createTV(Television television) {
        lista.add(television);
    }

    @Override
    public void createLava(Lavadora lavadora) {
        lista.add(lavadora);
    }

    @Override
    public List<Lavadora> listaLava() {
        List lavadoras = new ArrayList<>();
        
        for (Electrodomestico electrodomestico : this.lista) {
           if (electrodomestico instanceof Lavadora) {
               lavadoras.add(electrodomestico);
           }
        }
        
        return lavadoras;
    }

    @Override
    public List<Television> listaTV() {
        List televisiones = new ArrayList<>();
        
        for (Electrodomestico electrodomestico : this.lista) {
           if (electrodomestico instanceof Television) {
               televisiones.add(electrodomestico);
           }
        }
        
        return televisiones;
        
    }
}
