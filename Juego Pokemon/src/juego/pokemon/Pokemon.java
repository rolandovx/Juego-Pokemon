
package juego.pokemon;

public abstract class Pokemon {
    private String nombre;
    private int numeroPokedex;
    private String Tipo;
    private int puntosSalud;
    private int ataque;
    private int defensa;
    private int velocidad;

    public Pokemon() {
    }

    public Pokemon(String nombre, int numeroPokedex, String Tipo, int puntosSalud, int ataque, int defensa, int velocidad) {
        this.nombre = nombre;
        this.numeroPokedex = numeroPokedex;
        this.Tipo = Tipo;
        this.puntosSalud = puntosSalud;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroPokedex() {
        return numeroPokedex;
    }

    public void setNumeroPokedex(int numeroPokedex) {
        this.numeroPokedex = numeroPokedex;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getPuntosSalud() {
        return puntosSalud;
    }

    public void setPuntosSalud(int puntosSalud) {
        this.puntosSalud = puntosSalud;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    public void comer() {
        System.out.println(nombre + " ahora esta comiendo.");
    }
    
    public void curarse(int puntos) {
        puntosSalud += puntos;
        System.out.println(nombre + " se ha curado " + puntos + " puntos de salud.");
    }
}
