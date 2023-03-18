package Lectura;
import java.io.File;
import java.util.Scanner;
public class Archivo {
    public void lecturatxt(int numero){
        Scanner archivo=null;
        try{
            archivo=new Scanner(new File("C:/Users/Bruno/Documents/NetBeansProjects/clase4/target/numeros.txt"));
        }catch(Exception e){
            System.out.println("Archivo no encontrado.");
        }
        //leer los numeros del archivo
        int num=0;
        int conta=1;
        //hasNext--->nos va devolver un boolean y pregunta ¿hay un caracter adelante?
        //en caso de ser true sigue leyendo y en caso contrario no
        while(archivo.hasNext()){
            num=archivo.nextInt();
            if(numero==1){
              conta=conta+num;  
            }else{
              conta=conta*num;  
            }
            System.out.print(num+" ");
        }
        if(numero==1){
            System.out.println("La suma de los numeros es: "+ conta);
        }else{
            System.out.println("El factor de los numeros es :"+ (conta));
        }
        
    }
}
