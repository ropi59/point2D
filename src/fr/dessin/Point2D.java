package fr.dessin;

public class Point2D {

	//attributs
	private int x, y;
	private static int compteur = 0;

	//constructors
	public Point2D() {
		compteur++;
	}
	public Point2D(int x, int y) {
		this();
		this.x = x;
		this.y = y;
	}
	
	//method afficher
	public void afficher() {
		System.out.println("[" + this.x + ", " + this.y + "]" );
	}
	
	//getters setters
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public static int getCompteur() {
		return compteur;
	}
	
	//method	
	public void translater(int dX, int dY) throws PointException{
		if(dX < 0) {
			throw new PointException("Les points ne peuvent pas etre inférieur à 0");	
		}else
		if(dY < 0) {
			throw new PointException("Les points ne peuvent pas etre inférieur à 0");	
		}
		this.x += dX;
		this.y += dY;
	}
	
	public static int compter() {
		System.out.println(compteur);
		return compteur;	
	}
}
