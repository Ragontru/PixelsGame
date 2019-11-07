import java.awt.Color;
import java.awt.Graphics;

public class personaje extends Pizarra {

	public static void main(String[] args) {
		
		new Ventana(new personaje());

	}

	@Override
	public void pintar(Graphics g, Tarjetero t) {
		
		int x0=250, y0=250, zoom=100;
/*		
		//Abajo
			//Pelo
			g.setColor(Color.black);
			g.fillRect(x0, y0, 50, 10);
			g.fillRect(x0, y0, 10, 40);
			g.fillRect(x0, y0+30, 20, 10);
			g.fillRect(x0+40, y0, 10, 40);
			g.fillRect(x0+30, y0+30, 20, 10);
			
			//Piel
			g.setColor(Color.pink);
			g.fillRect(x0+10, y0+10, 30, 20);
			g.fillRect(x0+20, y0+30, 10, 10);
			g.fillRect(x0-30, y0+40, 10, 10);
			g.fillRect(x0+70, y0+40, 10, 10);
			
			//Chaleco
			g.setColor(Color.green);
			g.fillRect(x0-20, y0+40, 90, 10);
			g.fillRect(x0+10, y0+50, 30, 30);
			
			//Pantalon
			g.setColor(Color.blue);
			g.fillRect(x0+10, y0+80, 30, 20);
			g.fillRect(x0+10, y0+100, 10, 20);
			g.fillRect(x0+30, y0+100, 10, 20);
			
			//Zapatos
			g.setColor(Color.black);
			g.fillRect(x0+10, y0+120, 10, 10);
			g.fillRect(x0+30, y0+120, 10, 10);
			
		//Arriba
			//Pelo
			g.setColor(Color.black);
			g.fillRect(x0, y0, 50, 40);
	
			//Piel
			g.setColor(Color.pink);
			g.fillRect(x0-30, y0+40, 10, 10);
			g.fillRect(x0+70, y0+40, 10, 10);
			
			//Chaleco
			g.setColor(Color.green);
			g.fillRect(x0-20, y0+40, 90, 10);
			g.fillRect(x0+10, y0+50, 30, 30);
			
			//Pantalon
			g.setColor(Color.blue);
			g.fillRect(x0+10, y0+80, 30, 20);
			g.fillRect(x0+10, y0+100, 10, 20);
			g.fillRect(x0+30, y0+100, 10, 20);
			
			//Zapatos
			g.setColor(Color.black);
			g.fillRect(x0+10, y0+120, 10, 10);
			g.fillRect(x0+30, y0+120, 10, 10);
*/			
		
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
