package modelos;

import java.util.ArrayList;

public class Profesor {
    public String codigo;
    public InformacionPersonal informacionPer;
    public InformacionAdicionalProfesor info;
    public ArrayList<Paralelo> paralelos;

    public Profesor(String codigo, InformacionPersonal informacionPer) {
        this.codigo = codigo;
        this.informacionPer = informacionPer;
        paralelos= new ArrayList<>();
    }
    
    public void anadirParalelos(Paralelo p){
        paralelos.add(p);
    }
    
    public double calcularSueldo(){
        double sueldo=0;
        sueldo= this.info.getAnosdeTrabajo()*600 + this.info.getBonoFijo();
        return sueldo;
    }  

}
