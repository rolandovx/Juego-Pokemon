
package juego.pokemon;


public class pokemonElectrico extends Pokemon {
    public pokemonElectrico() {
    }

    public pokemonElectrico(String nombre, int numeroPokedex, String Tipo, int puntosSalud, int ataque, int defensa, int velocidad) {
        super(nombre, numeroPokedex, Tipo, puntosSalud, ataque, defensa, velocidad);
    }
    
    public void rayoTrueno() {
        System.out.println(getNombre() + " usa Rayo Trueno!");
    }
}