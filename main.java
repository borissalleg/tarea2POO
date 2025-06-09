import java.time.LocalDate;
import java.util.Scanner;
import java.util.InputMismatchException;

import Personas.Persona;
import Personas.ArrayPersonas;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Aplicacion Iniciada");
        // Crear una instancia del arreglo Persona
        ArrayPersonas array = new ArrayPersonas();


        
       //--- menu de opciones ------//
        boolean salida = false;
        int t,opcion; //Guardaremos la opcion del usuario
        while (!salida) // Mientras no sea falso se repite el menu
        {
 
            System.out.println("1. Agregar Persona");
            System.out.println("2. Listar Personas del arreglo");
            System.out.println("3. Indicar tamaño del arreglo");
            System.out.println("4. Salir");
            // try catch para manejar excepciones y controlar los errores en tiempo de ejecución
            try {
                System.out.println("Escribe una de las opciones");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                            System.out.println("Solo números entre 1 y 4");
                            System.out.print("Ingrese el nombre: ");
                            String nombre = sc.next();
                            System.out.print("Ingrese el apellido: ");
                            String apellido = sc.next();
                            System.out.print("Ingrese el género (MASCULINO/FEMENINO): ");
                            String generoStr = sc.next().toUpperCase();
                            Personas.Genero genero = Personas.Genero.valueOf(generoStr);
                            System.out.print("Ingrese el año de nacimiento (YYYY): ");
                            int anio = sc.nextInt();
                            System.out.print("Ingrese el mes de nacimiento (1-12): ");
                            int mes = sc.nextInt();
                            System.out.print("Ingrese el día de nacimiento (1-31): ");
                            int dia = sc.nextInt();
                            LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);

                            Persona persona = new Persona(nombre, apellido, genero, fechaNacimiento);
                            array.addPersona(persona);

                            System.out.println("Persona agregada correctamente.");

                    
                        break;
                    case 2:
                        array.printPersonas();
                        break;
                    
                    case 3:
                        System.out.println("El tamaño del arreglo es: " + array.getSizeArrayPersonas());   
                        break;
                    case 4:
                        salida = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sc.next();


    }
}
}
}