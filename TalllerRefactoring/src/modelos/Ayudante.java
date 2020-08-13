package modelos;

import java.util.ArrayList;

public class Ayudante {
    protected Estudiante est;
    public ArrayList<Paralelo> paralelos;

    Ayudante(Estudiante e){
    	est = e;
    }
    public String getMatricula() {
        return est.getMatricula();
    }

    public void setMatricula(String matricula) {
        est.setMatricula(matricula);
    }
    //Getters y setters se delegan en objeto estudiante para no duplicar cÃ³digo
    
    public String getNombre() {
        return est.getNombre();
    }

    public String getApellido() {
        return est.getApellido();
    }

    //Los paralelos se aÃ±aden/eliminan directamente del Arraylist de paralelos
    
    
    public void MostrarParalelosAyudante(){
        for(Paralelo par:paralelos){
            //Muestra la info general de cada paralelo
        }
    }
}
