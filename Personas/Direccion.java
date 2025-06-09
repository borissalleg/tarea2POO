package Personas;

public class Direccion {
    private String calle;
    private Byte numero;
    private String barrio;

    public Direccion(String calle, Byte numero, String barrio) {
        this.calle = calle;
        this.numero = numero;
        this.barrio = barrio;
    }
    public Direccion(){

    }

    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public Byte getNumero() {
        return numero;
    }
    public void setNumero(Byte numero) {
        this.numero = numero;
    }
    public String getBarrio() {
        return barrio;
    }
    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }
}
    