package file;

import java.io.*;
public class CarpetaDeEjercicios {
    public static void main(String[] args) {

        try{
            String directorio="C:\\Users\\cmartin\\Acceso a Datos";
            File fichero = new File("C:\\Users\\cmartin\\Acceso a Datos\\fichero1.txt");

            boolean bien = (new File(directorio)).mkdir();

            if (bien){
                System.out.println("Directorio: "+directorio+" creado");
            }

            if (fichero.createNewFile()) {
                System.out.println("El fichero se ha creado correctamente");
            }else{
                System.out.println("No se ha podido crear el fichero");
            }

        } catch (Exception e){
            System.out.println("Error!! "+e.getMessage());
        }


    }
}