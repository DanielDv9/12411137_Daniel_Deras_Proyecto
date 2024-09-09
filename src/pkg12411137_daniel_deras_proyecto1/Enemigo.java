/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg12411137_daniel_deras_proyecto1;

public class Enemigo {
    private String nombre;
    private int vida;
    private int oro;
    private int nivel;
    private int dano;

    public Enemigo(String nombre, int vida, int oro, int nivel, int dano) {
        this.nombre = nombre;
        this.vida = vida;
        this.oro = oro;
        this.nivel = nivel;
        this.dano = dano;
    }

    public Enemigo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }
    
    
}
