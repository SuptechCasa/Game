import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;

import javax.swing.JFrame;

public class Fenetre extends JFrame implements MouseListener, MouseMotionListener{
	Boule boule;
	public Fenetre() throws IOException {
	setSize(600, 400);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(new FlowLayout());
	//Ajouter une boule
	boule=new Boule();
	boule.setLocation(200, 100);
	add(boule);
	
	addMouseMotionListener(this);
	setVisible(true);
}
@Override
public void mouseDragged(MouseEvent e) {
	// TODO Auto-generated method stub	
}
@Override
public void mouseMoved(MouseEvent e) {
	System.out.println("x="+e.getX()+", y="+e.getY());
	boule.setLocation(e.getX(), e.getY());
	
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
}
