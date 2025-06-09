package Personas;
import java.util.ArrayList;

public class ArrayPersonas {
    
    ArrayList<Persona> ArrayPersonas;

    public ArrayPersonas() {
        this.ArrayPersonas = new ArrayList<>();
    }

    public ArrayList<Persona> getArrayPersonas() {
        return ArrayPersonas;
    }
    public void setArrayPersonas(ArrayList<Persona> arrayPersonas) {
        this.ArrayPersonas = arrayPersonas;
    }
    public void addPersona(Persona persona) {
        this.ArrayPersonas.add(persona);
    }
    
    public int getSizeArrayPersonas() {
        return this.ArrayPersonas.size();
    }

    public void printPersonas() {
        for (Persona p : ArrayPersonas) {
            System.out.println("Nombre: " + p.getNombre() + ", Apellido: " + p.getApellido() + 
                               ", Género: " + p.getGenero() + ", Fecha de Nacimiento: " + p.getFechaNacimiento());
        }
    }


    
}