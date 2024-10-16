
package juego.pokemon;


public class pokemonHielo extends Pokemon {

    public pokemonHielo() {
    }

    public pokemonHielo(String nombre, int numeroPokedex, String Tipo, int puntosSalud, int ataque, int defensa, int velocidad) {
        super(nombre, numeroPokedex, Tipo, puntosSalud, ataque, defensa, velocidad);
    }
    
    public void Neblina() {
        System.out.println(getNombre() + " usa neblina!");
    }
    public void Niebla() {
        System.out.println(getNombre() + " usa Niebla!");
    }
    public void Puño_Hielo() {
        System.out.println(getNombre() + " usa PuñoHielo!");
    }
    public void Rayo_Aurora() {
        System.out.println(getNombre() + " usa Rayo Aurora!");
    }
    public void Rayo_Hielo() {
        System.out.println(getNombre() + " usa Rayo Hielo!");
    }
    public void Ventisca() {
        System.out.println(getNombre() + " usa Ventisca!");
    }
}
