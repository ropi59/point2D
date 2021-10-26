package fr.dessin;

public class Point3D extends Point2D{

	//attributs
	private int z;
	
	//constructors
	public Point3D() {
		super();
	}
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	//getters setters
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	//method afficher
	public void afficher() {
		System.out.println("[" + this.getX() + ", " + this.getY() + ", " + this.z + "]" );
	}
	//method	
	public void translater(int dX, int dY, int dZ) throws PointException {
		this.translater(dX, dY);
		//this.setX(this.getX() + dX);
		//this.setY(this.getY() + dX);
		if(dZ < 0) {
			throw new PointException("Les points ne peuvent pas etre inférieur à 0");	
		}
		this.z += dZ;
	}
	
}
