package modelos;

import java.util.ArrayList;

public class Estudiante{
    public String matricula;
    public String facultad;
    public InformacionPersonal cedula;
    public ArrayList<Paralelo> paralelos;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public InformacionPersonal getCedula() {
        return cedula;
    }

    public void setCedula(InformacionPersonal cedula) {
        this.cedula = cedula;
    }

    public ArrayList<Paralelo> getParalelos() {
        return paralelos;
    }

    public void setParalelos(ArrayList<Paralelo> paralelos) {
        this.paralelos = paralelos;
    }

   
    public double CalcularNotaInicial(Paralelo p, double nexamen,double ndeberes, double nlecciones, double ntalleres){
        return calcularNota(p,nexamen,ndeberes,nlecciones,ntalleres);
    }
    
    public double CalcularNotaFinal(Paralelo p, double nexamen,double ndeberes, double nlecciones, double ntalleres){
        return calcularNota(p,nexamen,ndeberes,nlecciones,ntalleres);
    }
    
    public double calcularNota(Paralelo p, double nexamen,double ndeberes, double nlecciones, double ntalleres){
        double nota=0;
        for(Paralelo par:paralelos){
            if(p.equals(par)){
                double notaTeorico=(nexamen+ndeberes+nlecciones)*0.80;
                double notaPractico=(ntalleres)*0.20;
                nota=notaTeorico+notaPractico;
            }
        }
        return nota;
    }
    
    public double CalcularNotaTotal(Paralelo p){
        double notaTotal=0;
        for(Paralelo par:paralelos){
            if(p.equals(par)){
                notaTotal=(p.getMateria().getNotaInicial() + p.getMateria().getNotaFinal())/2;
                
            }
        }
        return notaTotal;
        
    }
}
        
    
    
    
            
        
        
