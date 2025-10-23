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
	
	Juego()
	{
		// Inicializa el objeto entorno
		this.entorno = new Entorno(this, "Proyecto para TP", 810, 600);
		
		// Inicializar lo que haga falta para el juego
		// ...

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
	    // --- 1. DEFINIR PROPIEDADES ---
	    int columnas = 9;
	    int filas = 5;
	    int anchoCasilla;
	    int altoCasilla;
	    int anchoTotalTablero;
	    int altoTotalTablero;
	       
	    // --- 2. CALCULAR TAMAÑOS DINÁMICOS ---
	    
	    // El ancho de la casilla se calcula dividiendo el ancho de la ventana por las columnas.
	    // Esto asegura que el tablero "ocupe todo el ancho".
	    anchoCasilla = entorno.ancho()/columnas;
	    
	    // Hacemos que el alto de la casilla sea igual al ancho
	    // para mantener las casillas cuadradas (como en el juego original).
	    altoCasilla = anchoCasilla;
	    
	    // Calculamos el tamaño total del tablero (Servirá para más adelante)
	    anchoTotalTablero = columnas * anchoCasilla;
	    altoTotalTablero = filas * altoCasilla;
	  

	    // --- 3. DIBUJAR LA GRILLA ---
	    // El tablero empieza en X=0 (borde izquierdo)
	    int inicioX = 0;
	    
	    
	    // El espacio superior que dejamos para la UI (cartas, puntaje, etc.)
	    int margenSuperior = entorno.alto()-altoTotalTablero;
	    // Y empieza justo debajo de nuestro margen superior
	    int inicioY = margenSuperior ;

	    // Estos for anidados sirven para dibujar la grilla, simulan una matriz de f x c  
	    for (int f = 0; f < filas; f++) {
	        for (int c = 0; c < columnas; c++) {
	        	
	        	// Calculamos el centro de la casilla (Servirá para más adelante)
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
