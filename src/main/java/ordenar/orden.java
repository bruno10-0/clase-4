package ordenar;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class orden {
public static void main(String args[]) {
    File txt = new File("C:/Users/Bruno/Documents/NetBeansProjects/clase4/src/main/java/ordenar/datos.txt");
    File txt_salida = new File("C:/Users/Bruno/Documents/NetBeansProjects/clase4/src/main/java/ordenar/datos_salida.txt");
    try { 
        try (Scanner leer = new Scanner(txt); PrintWriter escribir = new PrintWriter(txt_salida)) {
            String palabraCodi="";
            String palabra=leer.next();
            int desplazo=leer.nextInt();
            int opcion=leer.nextInt();
            codificador.codificador(palabra, opcion, opcion, palabraCodi);
            palabraCodi=codificador.codificador(palabra, desplazo, opcion, palabraCodi);
            escribir.println("La cadena es: "+palabraCodi);
            System.out.println("Exito");
        }
    } catch (FileNotFoundException ex) {
        System.out.println("Error");
    }
}  
}
