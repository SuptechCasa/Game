import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;

import javax.swing.JFrame;

public class Fenetre extends JFrame implements MouseListener, MouseMotionListener,KeyListener{
	Boule boule;
	Panier panier;
	public Fenetre() throws IOException {
	setSize(800, 600);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(null);
	//Ajouter une boule
	boule=new Boule();
	boule.setBounds(375, 100, 50, 50);
	add(boule);
	//Ajouter le panier
	panier=new Panier();
	panier.setBounds(350,280,100,100);
	add(panier);
	
	addMouseMotionListener(this);
	addKeyListener(this);
	setVisible(true);
	boule.tomber();
}
@Override
public void mouseDragged(MouseEvent e) {
	// TODO Auto-generated method stub	
}
@Override
public void mouseMoved(MouseEvent e) {
	if (boule.selected) {
	boule.setLocation(e.getX()-25, e.getY()-25);
	}
}
@Override
public void mouseClicked(MouseEvent e) {
	
	
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
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	int code=e.getKeyCode();
	switch (code){
	case KeyEvent.VK_RIGHT:panier.setLocation(panier.getX()+5, panier.getY());break;
	case KeyEvent.VK_LEFT:panier.setLocation(panier.getX()-5, panier.getY());break;
	}
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}
