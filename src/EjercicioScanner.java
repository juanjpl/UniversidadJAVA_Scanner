
import java.util.Scanner;


public class EjercicioScanner {

    public static void main(String args[]) {

        var nombre = "Karla";

        System.out.println("Nueva linea : \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b\b" + nombre);
        System.out.println("Comilla simple: \'" + nombre + "\'");
        System.out.println("Comilla doble: \"" + nombre + "\"");

         var usuario = "Carlos";
        System.out.println("usuario = " + usuario);
        
        System.out.println("Escribe tu nombre: ");
        Scanner consola = new Scanner(System.in);
        var usuarioIngresado = consola.nextLine();
        System.out.println("usuarioIngresado = " + usuarioIngresado);
        
        System.out.println("Ingresa el Titulo...");
        var titulo = consola.nextLine();
        System.out.println("Resultado: " + titulo + " " + usuarioIngresado);
       
    }
}
