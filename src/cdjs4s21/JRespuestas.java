
package cdjs4s21;

import java.util.StringTokenizer;

public class JRespuestas {

    String[] respuestas = {
      "2008","mjolnir","6","vibranio","tiempo"
    };
    
    String[] radioR = {
        "2005,2006,2001,2008",
        "jonatan,mjolnir,guacamole,rodrigo",
        "1,3,6,0",
        "vibranio,adamantium,roca volcanica,lava",
        "tiempo,alma,realidad,mente"
    };
    
    public String getRespuesta(int posicion){
        return respuestas[posicion];
    }
    
    public String[] separar(String cadena, String separador){
        StringTokenizer token = new StringTokenizer(cadena,separador);
        
        String[] a = new String[4];
        int i = 0;
        
        while(token.hasMoreTokens()){
            a[i] = token.nextToken(); // obtenido el token
            i++;
        }
        
        return a;
    }
    
    public String[] setRespuestas(int posicion){
        String s1 = radioR[posicion];
        String[] s2 = separar(s1,",");
        return s2;
    }
    
}
