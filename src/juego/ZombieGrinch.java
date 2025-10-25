import java.awt.Color;

import entorno.Entorno;

public class ZombieGrinch {
	double x;
	double y;
	double Velocidad;
	//getters y setters:
	
	public double getX() {
		return x;
		}
	public void setX(double x) {
		this.x=x;
	}
	
	public double getY() {
		return y;
	}
	public void setY(double x) {
		this.y=y;
	}
	
	public void mover() {
		this.x=this.x-this.Velocidad;
		
	}
	
	//constructor:
	
	ZombieGrinch(double x, double y){
		this.x=x;
		this.y=y;
		
	}
	
	//métodos de instancia:
	
	public void dibujarse (Entorno entorno) {
		entorno.dibujarCirculo(this.x, this.y, 45, Color.GREEN);
		entorno.dibujarCirculo(this.x, this.y, 35, Color.GRAY);
		entorno.dibujarCirculo(this.x, this,y, 25, Color.BLACK);
		entorno.dibujarCirculo(this.x, this.y, 15, Color.MAGENTA);}
	}