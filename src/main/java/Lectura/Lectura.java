package Lectura;
import java.util.Scanner;
public class Lectura {
    public static void main(String args[]) {
        int num=0;
        Scanner leer= new Scanner(System.in);
        Archivo a = new Archivo();
        System.out.println("1 para sumar y 2 para multiplicar");
        num=leer.nextInt();
        while(num>2 || num<1){
            System.out.println("1 para sumar y 2 para multiplicar");
            num=leer.nextInt();
        }
        a.lecturatxt(num);
    }
}
