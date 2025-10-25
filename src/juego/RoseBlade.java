package juego;

import java.awt.Color;
import java.awt.Image;
import entorno.Herramientas;
import entorno.Entorno;

public class RoseBlade {
    double x;
    double y;
    Image imagen;
    BolaDeFuego bola; // Variable para guardar el disparo

    /**
     * Constructor de la planta.
     * @param x Posición inicial en x
     * @param y Posición inicial en y
     */
    public RoseBlade(double x, double y) {
        this.x = x;
        this.y = y;
        
        // Al crearse, la planta aún no ha disparado.
        this.bola = null; 
    }

    /**
     * Dibuja la planta en la pantalla usando el entorno.
     */
    public void dibujarse(Entorno entorno) {
    	entorno.dibujarCirculo(this.x, this.y, 45, Color.RED); // 0.1 es la escala
    }
    
    /**
     * Intenta crear una nueva BolaDeFuego.
     * Solo crea una si no hay una bola activa actualmente.
     */
    public void disparar() {
        // Si no hay una bola de fuego activa...
        if (this.bola == null) {
            // ...creamos una nueva en la posición actual de la planta.
            this.bola = new BolaDeFuego(this.x, this.y);
        }
    }
}