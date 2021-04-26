//6.	Realice una función que retorne la cantidad de dígitos, vocales y consonantes dentro de una cadena recibida

package exam6;

import java.util.Hashtable;

public class HashMain {

  public static void main(String[] args) {
  Hashtable<String,Integer> tabla1 = new Hashtable();
  Hashtable<String,Integer> tabla2 = new Hashtable();
  
  Hash diccionario = new Hash();
  diccionario.ingresar_cadena(tabla1,tabla2);
  diccionario.mostrar_filtros(tabla1,tabla2);
  }
}
