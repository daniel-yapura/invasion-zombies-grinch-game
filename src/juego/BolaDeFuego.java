package juego;

import java.awt.Color;

import entorno.Entorno;

public class BolaDeFuego {
    double x;
    double y;
    /**
     * Constructor de la bola de fuego.
     * @param x Posición inicial en x
     * @param y Posición inicial en y
     */
    public BolaDeFuego(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Dibuja la bola de fuego en la pantalla.
     */
    public void dibujarse(Entorno entorno) {
        entorno.dibujarCirculo(this.x, this.y, 20, Color.BLACK);
    }

    /**
     * Mueve la bola de fuego un paso hacia la derecha.
     */
    public void moverse() {
        // Le sumamos a 'x' para que avance a la derecha
        this.x += 1; 
    }
}