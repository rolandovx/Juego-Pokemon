
package juego.pokemon;


public class pokemoFantasma extends Pokemon {

    public pokemoFantasma() {
    }

    public pokemoFantasma(String nombre, int numeroPokedex, String Tipo, int puntosSalud, int ataque, int defensa, int velocidad) {
        super(nombre, numeroPokedex, Tipo, puntosSalud, ataque, defensa, velocidad);
    }
    
    public void Lengüetazo() {
        System.out.println(getNombre() + " usa Lengüetazo!");
    }
    
    public void Rayo_Confuso() {
        System.out.println(getNombre() + " usa Rayo Confuso!");
    }
    
    public void Tiniebla() {
        System.out.println(getNombre() + " usa Tiniebla!");
    }
    
}
