
package juego.pokemon;

public class JuegoPokemon {

    public static void main(String[] args) {
        
        pokemonFuego charmander = new pokemonFuego ("Charmander", 4, "Fuego", 39, 52, 43, 65);
        
        charmander.lanzarLlamas();
        
        pokemonPlanta bulbasaur = new pokemonPlanta ("Bulbasaur", 1, "Planta", 45, 49, 49, 45);
        
        bulbasaur.comer();
        
        pokemonAgua squirtle = new pokemonAgua ("Squirtle", 7, "Agua", 44, 48, 65, 43);
        
        squirtle.hidrobomba();
    }
    
}
