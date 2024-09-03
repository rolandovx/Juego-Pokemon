
package juego.pokemon;


public class pokemonFuego extends Pokemon {

    public pokemonFuego() {
    }

    public pokemonFuego(String nombre, int numeroPokedex, String Tipo, int puntosSalud, int ataque, int defensa, int velocidad) {
        super(nombre, numeroPokedex, Tipo, puntosSalud, ataque, defensa, velocidad);
    }
    
    public void lanzarLlamas() {
        System.out.println(getNombre() + " usa Lanzallamas!");
    }
    
}
