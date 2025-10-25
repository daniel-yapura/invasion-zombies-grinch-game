package juego;


import java.awt.Color;

import entorno.Entorno;
import entorno.InterfaceJuego;

public class Juego extends InterfaceJuego
{
	// El objeto Entorno que controla el tiempo y otros
	private Entorno entorno;
	
	// Variables y métodos propios de cada grupo
	// ...
	int columnas = 9;
    int filas = 5;
    int anchoCasilla;
    int altoCasilla;
    int inicioX;
    int inicioY;
	
	Juego()
	{
		// Inicializa el objeto entorno
		this.entorno = new Entorno(this, "Proyecto para TP", 810, 600);
		
		// Inicializar lo que haga falta para el juego
		// ...
		// Calculamos las medidas del tablero UNA SOLA VEZ en el constructor
        this.anchoCasilla = entorno.ancho() / columnas;
        this.altoCasilla = this.anchoCasilla; // Casillas cuadradas
        int altoTotalTablero = filas * altoCasilla;
        this.inicioX = 0;
        this.inicioY = entorno.alto() - altoTotalTablero;

		// Inicia el juego!
		this.entorno.iniciar();
	}

	/**
	 * Durante el juego, el método tick() será ejecutado en cada instante y 
	 * por lo tanto es el método más importante de esta clase. Aquí se debe 
	 * actualizar el estado interno del juego para simular el paso del tiempo 
	 * (ver el enunciado del TP para mayor detalle).
	 */
	public void tick()
	{
		// Procesamiento de un instante de tiempo
		// ...
		
		dibujarTablero();
	}
	
	void dibujarTablero() {
	    

	    // Estos for ahora usan las variables de instancia (this.inicioX, this.anchoCasilla, etc.) 
	    for (int f = 0; f < filas; f++) {
	        for (int c = 0; c < columnas; c++) {
	        	
	        	// Calculamos el centro de la casilla
	            double x = inicioX + c * anchoCasilla + anchoCasilla / 2;
	            double y = inicioY + f * altoCasilla + altoCasilla / 2;
	            // Dibujamos rectangulos de un color en las filas-columnas pares y en filas-columnas impares
	            if ((f%2 == 0 && c%2 == 0) || (f%2 != 0 && c%2 != 0  )) {
					Color colorCesped = new Color(0, 102, 0);
					entorno.dibujarRectangulo(x, y, anchoCasilla, altoCasilla, 0, colorCesped);
				// Dibujamos rectangulos de otro color en las filas impares y columnas pares, y viceversa
				}else { 
					Color colorCesped1 = new Color(0, 50, 0);
					entorno.dibujarRectangulo(x, y, anchoCasilla, altoCasilla, 0, colorCesped1);
				}
	        }
	    }
	}

	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		Juego juego = new Juego();
	}
}
