import java.awt.Dimension;
import java.awt.FlowLayout;
import java.io.IOException;

import javax.swing.JFrame;

public class Fenetre extends JFrame{
public Fenetre() throws IOException {
	setSize(600, 400);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(new FlowLayout());
	//Ajouter une boule
	Boule boule=new Boule();
	boule.setLocation(200, 100);
	add(boule);
	
	setVisible(true);
}
}
