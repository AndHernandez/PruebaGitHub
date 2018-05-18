package copiarepositorio;

import java.util.*;
public class ExamenAndoniEnt{
    public static void intercalar(String frase,String frase2){
        char[] fraseintercalada=new char[(frase.length()+frase2.length())];
        int contador=0;
        int i=0;
        
        while(i<fraseintercalada.length){
            if(contador<frase.length()){
                fraseintercalada[i]=frase.charAt(contador);
                i++;
            }
            if(contador<frase2.length()){
                fraseintercalada[i]=frase2.charAt(contador);
                i++;
            }
            contador++;
        }
        System.out.println("1ºFrase: "+frase);
        System.out.println("2ºFrase: "+frase2);
        System.out.println(Arrays.toString(fraseintercalada));
    }
    public static void main(String[] args){
        String frase="";
        String frase2="";
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la 1º Frase");
        frase=sc.nextLine();
        
        System.out.println("Introduce la 2ºFrase");
        frase2=sc.nextLine();
        
        intercalar(frase, frase2);
    }
}
