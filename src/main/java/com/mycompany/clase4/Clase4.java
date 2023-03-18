package com.mycompany.clase4;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Clase4 {
//el algoritmo actual es el resultado del ejercicio 1 punto a b y c combinados.
    public static void main(String args[]) {
        Scanner leer= new Scanner(System.in);
        String let;
        int[] num = new int[3];
        for(int i=0;i<num.length;i++){
         num[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el "+(i+1)+"# numero entero que quiera."));
        }
        System.out.println("Ingrese 'a' para ordernar de manera Ascendente y 'b' para Descendente");
        let=leer.next();
        Ordenar(num, let);
        if(let.equalsIgnoreCase("a") || let.equalsIgnoreCase("b")){
        Mostrar(num);
        }else{
            System.out.println("Crack era tan simle como poner 'a' o 'b'");
        } 
        
    }

    public static int[] Ordenar(int numeros[],String letra){
        int aux = 0;
        if(letra.equalsIgnoreCase("a")){
            System.out.println("Ascendente");
        for(int i=0; i<3;i++){
            for(int u=0;u<numeros.length-1;u++){
                if (numeros[u]>numeros[u+1]){
                    aux=numeros[u];
                    numeros[u]=numeros[u+1];
                    numeros[u+1]=aux;
                }
            }
        }
        }else if(letra.equalsIgnoreCase("b")){
            System.out.println("Descendente");
            for(int i=0; i<3;i++){
            for(int u=0;u<numeros.length-1;u++){
                if (numeros[u]<numeros[u+1]){
                    aux=numeros[u];
                    numeros[u]=numeros[u+1];
                    numeros[u+1]=aux;
                }
            }
            
        }
    }
    return numeros;
 }
    public static void Mostrar(int numeros[]){
        for(int i=0; i<numeros.length;i++){
            System.out.print(numeros[i]+" ");
        }
    }
}