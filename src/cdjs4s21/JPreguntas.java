
package cdjs4s21;


public class JPreguntas {
    
    String[] preguntas = {
        "¿ En que año salio iron man ?", "¿como se llama el martillo de thor?", "¿cuantas gemas del infinito existen?",
        "¿de que esta hecho el escudo del capitan america?", "¿nombre de la gema del infinito color verde?"
    };
    
   public String getPregunta(int posicion){
        return preguntas[posicion];
    }
    
}
