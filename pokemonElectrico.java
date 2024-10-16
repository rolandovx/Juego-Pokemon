
package juego.pokemon;


public class pokemonElectrico extends Pokemon {
    public pokemonElectrico() {
    }

    public pokemonElectrico(String nombre, int numeroPokedex, String Tipo, int puntosSalud, int ataque, int defensa, int velocidad) {
        super(nombre, numeroPokedex, Tipo, puntosSalud, ataque, defensa, velocidad);
    }
    
    public void puño_Trueno() {
        System.out.println(getNombre() + " usa Puño Trueno!");
    }
    
    public void Rayo(){
        System.out.println(getNombre() + "usa Rayo");
    }

    public void Impactueno(){
        System.out.println(getNombre() + "usa impactueno");
    }

    public void Onda_trueno(){
        System.out.println(getNombre() + "usa onda trueno");
    }

    public void Trueno(){
        System.out.println(getNombre() + "usa Trueno");
    }    
}