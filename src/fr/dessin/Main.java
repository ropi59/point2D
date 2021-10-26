package fr.dessin;

public class Main {

	public static void main(String[] args) {

		try {
		Point2D.compter();
		
		Point2D p1 = new Point2D();
		p1.setX(4);
		p1.setY(34);
		
		Point2D.compter();
		
		Point2D p2 = new Point2D(6, 21);
		
		Point2D.compter();
				
		p1.afficher();
		
		p1.translater(5, 20);
	
		p1.afficher();
		
		p2.afficher();
		
		p2.translater(4, 19);
		p2.afficher();
		
		Point3D p3 = new Point3D(5, 12, 18);
		p3.afficher();
		p3.translater(0, 0, -12);
		Point2D.compter();
		}catch (PointException e){
			System.out.println(e.getMessage());
		}
		
	}

}
