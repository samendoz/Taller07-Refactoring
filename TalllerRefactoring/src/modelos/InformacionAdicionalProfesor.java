package modelos;

public class InformacionAdicionalProfesor {
    private int añosdeTrabajo;
    private String facultad;
    private double BonoFijo;
    
    public int getAnosdeTrabajo(){
        return añosdeTrabajo;
    }
    public String getFacultad){
        return facultad;
    }  
    public double getBonoFijo(){
        return  BonoFijo;
    } 
    public void setAnosdeTrabajo(int año){
        añosdeTrabajo = año;
    } 
    public void setFacultad(String facult){
        facultad = facult;
    }
    public void setBonoFijo(double bono){
        BonoFijo = bono;
    }
}
