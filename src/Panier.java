import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class Panier extends JComponent implements MouseListener,MouseMotionListener{
	private BufferedImage image;
	public boolean selected;
	public Panier() throws IOException {
		image=ImageIO.read(new File("images/panier.png"));
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	@Override
	protected void paintComponent(Graphics g) {	
		super.paintComponent(g);
		if (image!=null) {
			g.drawImage(image,0,0,getWidth(), getHeight(),this);
		}

	}



	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		this.selected=!this.selected;
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		if (selected==true) {
		int posX=this.getX()+e.getX()-25;
		int posY=this.getY()+e.getY()-25;
		setLocation(posX, posY);
		}
	}

}
