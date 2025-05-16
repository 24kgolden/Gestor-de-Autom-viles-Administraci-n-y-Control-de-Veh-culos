package com.mycompany.crud_automovil.logica;

import com.mycompany.crud_automovil.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void agregarAutomovil(String modelo, String marca, String motor, String color, String placa, int puertas) {
        
        Automovil auto = new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setColor(color);
        auto.setPlaca(placa);
        auto.setPuertas(puertas);
        
        controlPersis.agregarAutomovil(auto);
    }

    public List<Automovil> traerAuto() {
        return controlPersis.traerAutos();
    }

    public void borrarAuto(int idAuto) {
        controlPersis.borrarAuto(idAuto);
    }

    public Automovil traerAuto(int idAuto) {
        return controlPersis.traerAutos(idAuto);
    }

    public void modificarAuto(Automovil auto, String modelo, String marca, String motor, String color, String placa, int puertas) {
        auto.setColor(color);
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setPlaca(placa);
        auto.setPuertas(puertas);
        
        //le dopido a la persistencia que modifque el auto
        controlPersis.modificarAuto(auto);
    }
        
    


}
