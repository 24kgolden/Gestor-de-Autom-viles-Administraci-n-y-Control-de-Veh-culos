package com.mycompany.crud_automovil.persistencia;

import com.mycompany.crud_automovil.logica.Automovil;
import com.mycompany.crud_automovil.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    AutomovilJpaController autosJPA = new AutomovilJpaController();
    
    public void agregarAutomovil(Automovil auto) {
        autosJPA.create(auto);
    }

    public List<Automovil> traerAutos() {
        return autosJPA.findAutomovilEntities();
    }

    public void borrarAuto(int idAuto) {
        try {
            autosJPA.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Automovil traerAutos(int idAuto) {
        return autosJPA.findAutomovil(idAuto);
    }

    public void modificarAuto(Automovil auto) {
        try {
            autosJPA.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
