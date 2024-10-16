
package juego.pokemon;

public class pokemonVolador extends Pokemon {
    public pokemonVolador() {
    }

    public pokemonVolador(String nombre, int numeroPokedex, String Tipo, int puntosSalud, int ataque, int defensa, int velocidad) {
        super(nombre, numeroPokedex, Tipo, puntosSalud, ataque, defensa, velocidad);
    }
    
    public void aéreo() {
        System.out.println(getNombre() + " usa aéreo!");
    }
    
    public void ala() {
        System.out.println(getNombre() + " usa ala!");
    }
    
    public void espejo() {
        System.out.println(getNombre() + " usa espejo!");
    }
    
    public void Picotaladro() {
        System.out.println(getNombre() + " usa PicoTaladro!");
    }
    
    public void Picotazo() {
        System.out.println(getNombre() + " usa Picotazo!");
    }
    
    public void Tornado() {
        System.out.println(getNombre() + " usa Tornado!");
    }
    
    public void Vuelo() {
        System.out.println(getNombre() + " usa Vuelo!");
    }
}

