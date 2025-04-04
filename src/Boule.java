import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Boule extends JComponent implements MouseListener,MouseMotionListener{
	private BufferedImage image;
	public boolean selected;
	public Boule() throws IOException {
		image=ImageIO.read(new File("images/boule.png"));
		addMouseListener(this);
		addMouseMotionListener(this);
		setBorder(BorderFactory.createLineBorder(Color.blue, 3, true));

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

	public void tomber(Panier panier) {
		new Thread(()->{
			int yLimit=292;
			while(this.getY()<400) {
				this.setLocation(this.getX(), this.getY()+1);
				if ((this.getX()<panier.getX()+100)&&(this.getX()>panier.getX()-50)&&(this.getY()>yLimit)) {
					this.setVisible(false);
					Fenetre fenetre=(Fenetre) SwingUtilities.getWindowAncestor(this);
					fenetre.addPoint();
					break;
					
				}
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		
	}
}
