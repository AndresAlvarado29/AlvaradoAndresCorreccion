/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.idao;

import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.List;

/**
 *
 * @author HI andres
 */
public interface IElectrodomesticoDAO {
    public void createTV(Television television);
    public void createLava(Lavadora lavadora);
    public List<Lavadora> listaLava();
    public List<Television> listaTV();
}
