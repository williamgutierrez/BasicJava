import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*;
public class Principal extends JFrame {
	
	
	public static void main(String arg[]){

	
	   JFrame f = new JFrame();
       JPanel panel= new JPanel();	
       JLabel label = new JLabel("HOla como estas");	
	   JTextField testfield = new JTextField("");
	   JButton boton = new JButton("Entrar");
		
	   boton.setBackground(Color.green);
       panel.add(label);
	   panel.add(testfield);
	   panel.add(boton);
	   panel.setBackground(Color.blue);

       f.add(panel);	
	   f.setSize(300,300);
	   f.show();	
	   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//System.out.println("hooodsoodd");
  
  
	}
	
}