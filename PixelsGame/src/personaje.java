import java.awt.Color;
import java.awt.Graphics;

public class personaje extends Pizarra {

	public static void main(String[] args) {
		
		new Ventana(new personaje());

	}

	@Override
	public void pintar(Graphics g, Tarjetero t) {
		
		int x0=250, y0=250, zoom=100;
		
		//Abajo
			//Pelo
			g.setColor(Color.black);
			g.fillRect(x0, y0, 50, 10);
			g.fillRect(x0, y0, 10, 40);
			g.fillRect(x0, y0+30, 20, 10);
		//	g.drawLine(x0, y0+40, x0+2, y0+40);
		//	g.drawLine(x0+30, y0+40, x0+50, y0+40);
		//	g.drawLine(x0+50, y0, x0+50, y0+40);
			
			//Piel
			g.setColor(Color.pink);
		//	g.drawLine(x0+10, y0+10, x0+20, y0+20);
			g.fillRect(x0+10, y0+10, 30, 20);
			
			//Chaleco
			g.setColor(Color.green);
			
			//Pantalon
			g.setColor(Color.blue);
			
			//Zapatos
			g.setColor(Color.black);
			
		//Arriba
			//Pelo
			g.setColor(Color.black);
			
			//Piel
			g.setColor(Color.orange);
			
			//Chaleco
			g.setColor(Color.green);
			
			//Pantalon
			g.setColor(Color.blue);
			
			//Zapatos
			g.setColor(Color.black);
			
		
		//Izquierda
			//Pelo
			g.setColor(Color.black);
			
			//Piel
			g.setColor(Color.orange);
			
			//Chaleco
			g.setColor(Color.green);
			
			//Pantalon
			g.setColor(Color.blue);
			
			//Zapatos
			g.setColor(Color.black);
			
		
		//Derecha
			//Pelo
			g.setColor(Color.black);
			
			//Piel
			g.setColor(Color.orange);
			
			//Chaleco
			g.setColor(Color.green);
			
			//Pantalon
			g.setColor(Color.blue);
			
			//Zapatos
			g.setColor(Color.black);
			
		
	}

}
