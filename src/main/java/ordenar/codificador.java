package ordenar;
public class codificador {
    public static String codificador(String palabra,int desplazo,int opcion,String palabraCodi){
        char letra;
        char aux;
        int ASCII=97;
        for(int i=0;i<palabra.length();i++){
            for(int u=0;u<26;u++){
                letra=palabra.charAt(i);
                if(opcion==1){
                    if((int)letra==(ASCII+u)){
                    aux=(char)(ASCII+u+desplazo);
                    palabraCodi=palabraCodi+Character.toString(aux);
                    }    
                }else{
                    if((int)letra==(ASCII+u)){
                    aux=(char)(ASCII+u-desplazo);
                    palabraCodi=palabraCodi+Character.toString(aux);
                    }
                }  
            }
        }
        
        return palabraCodi;
    }
}

