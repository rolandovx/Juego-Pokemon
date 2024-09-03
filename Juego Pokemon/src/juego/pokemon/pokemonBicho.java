
package juego.pokemon;


public class pokemonBicho extends Pokemon {

    public pokemonBicho() {
    }

    public pokemonBicho(String nombre, int numeroPokedex, String Tipo, int puntosSalud, int ataque, int defensa, int velocidad) {
        super(nombre, numeroPokedex, Tipo, puntosSalud, ataque, defensa, velocidad);
    }
    
    public void placaje() {
        System.out.println(getNombre() + " usa Placaje!");
    }
}
