
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
    
    public void burbuja() {
        System.out.println(getNombre() + " usa burbuja!");
    }
    
    public void cascada() {
        System.out.println(getNombre()+ "usa cascada!");
    }
    
    public void Martillazo() {
        System.out.println(getNombre()+ "usa Marillazo");
    }
    
    public void Pistola_agua(){
        System.out.println(getNombre() + "usa Pistola agua");
    }
    
    public void Rayo_burbuja(){
        System.out.println(getNombre() + "usa Rayo buerbuja");
    }
    
    public void Refujio() {
        System.out.println(getNombre() + "usa Refujio");   
    }
    
    public void Surf(){
        System.out.println(getNombre() + "usa surf");
    }
    
    public void Tenaza(){
        System.out.println(getNombre() + "usa Tenaza");
    }   
}