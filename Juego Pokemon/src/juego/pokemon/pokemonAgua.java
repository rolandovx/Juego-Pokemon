
package juego.pokemon;


public class pokemonAgua extends Pokemon {
    public pokemonAgua() {
    }

    public pokemonAgua(String nombre, int numeroPokedex, String Tipo, int puntosSalud, int ataque, int defensa, int velocidad) {
        super(nombre, numeroPokedex, Tipo, puntosSalud, ataque, defensa, velocidad);
    }
    
    public void hidrobomba() {
        System.out.println(getNombre() + " usa Hidrobomba!");
    }
    
}