package exam6;

import java.util.Scanner;
import java.util.Hashtable;

public class Hash {

private String cadena,lista1="aeiou",lista2="1234567890",llave;
private int v,d,c;

public void ingresar_cadena(Hashtable<String,Integer> tabla1, Hashtable<String,Integer> tabla2){
  System.out.println("Ingrese el texto");
  Scanner guardar = new Scanner(System.in);
  cadena = guardar.nextLine();
  cadena = cadena.replaceAll("[-:&$;?,)¿¡€%×!+@#(]","");
  cadena = cadena.replace(" ","");
  cadena = cadena.toLowerCase();
  agregar_diccionario(tabla1,lista1);
  agregar_diccionario(tabla2,lista2);
}
public void agregar_diccionario(Hashtable<String,Integer> tabla,String b){
  for(int i=0;i<b.length();i++){
    llave = b.substring(i,i+1);
    tabla.put(llave,1);
  }
}
public void mostrar_filtros(Hashtable<String,Integer> vocales, Hashtable<String,Integer> digitos){
  for(int i=0;i<cadena.length();i++){
    llave = cadena.substring(i,i+1);
    if(vocales.containsKey(llave)){
      v++;
    }else if(digitos.containsKey(llave)){
      d++;
    }
    else{
      c++;
    }
  }
  System.out.println("Existen "+v+" vocales, "+d+" digitos y "+c+" consonantes");
}
}
