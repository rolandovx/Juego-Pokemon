
package juego.pokemon;

public class pokemonPlanta extends Pokemon {
    public pokemonPlanta() {
    }

    public pokemonPlanta(String nombre, int numeroPokedex, String Tipo, int puntosSalud, int ataque, int defensa, int velocidad) {
        super(nombre, numeroPokedex, Tipo, puntosSalud, ataque, defensa, velocidad);
    }
    
    public void latigo() {
        System.out.println(getNombre() + " usa Latigo!");
    }
    
}

