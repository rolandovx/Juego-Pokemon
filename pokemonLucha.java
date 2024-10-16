
package juego.pokemon;

public class pokemonLucha extends Pokemon {
    public pokemonLucha() {
    }

    public pokemonLucha(String nombre, int numeroPokedex, String Tipo, int puntosSalud, int ataque, int defensa, int velocidad) {
        super(nombre, numeroPokedex, Tipo, puntosSalud, ataque, defensa, velocidad);
    }
    
    public void Contraataque() {
        System.out.println(getNombre() + " usa Contraataque!");
    }
    
    public void Doble_patada() {
        System.out.println(getNombre() + " usa Doble Patada!");
    }

    public void Golpe_Karate() {
        System.out.println(getNombre() + " usa Golpe Karate!");
    }

    public void Patada_baja() {
        System.out.println(getNombre() + " usa Patada Baja!");
    }
    
    public void Patada_giro() {
        System.out.println(getNombre() + " usa Patada_giro!");
    }
    
    public void Patada_salto_alta() {
        System.out.println(getNombre() + " usa Patada salto alta!");
    }
    
    public void Patada_Salto() {
        System.out.println(getNombre() + " usa Patada Salto!");
    }
    
    public void Sismico() {
        System.out.println(getNombre() + " usa Sismico!");
    }
    
    public void Sumisión() {
        System.out.println(getNombre() + " usa Sumisión!");
    }
}
