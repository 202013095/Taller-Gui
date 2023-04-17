package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelDatosPerro extends JPanel{
	
	public PanelDatosPerro(){
    setBorder(new TitledBorder("Datos Perro"));
    setPreferredSize(new Dimension(350, 300));	


    JLabel lbNombre = new JLabel("Nombre:"); 
    JTextField Nombre = new JTextField();
    
    JLabel lbRaza = new JLabel("Raza:");
    JTextField Raza = new JTextField();
    
    JLabel lbEdad = new JLabel("Edad:"); 
    JTextField Edad = new JTextField();
    
    JLabel lbPuntos = new JLabel("Puntos:"); 
    JTextField Puntos = new JTextField();
    
    setForeground(new Color(102, 204, 255));
    lbNombre.setPreferredSize(new Dimension(60, 25));
    Nombre.setText("Snowball");
    
    Nombre.setPreferredSize(new Dimension(60, 25));
    lbRaza.setPreferredSize(new Dimension(60, 25));
    Raza.setText("Bolita");
    
    Raza.setPreferredSize(new Dimension(60, 25));
    lbEdad.setPreferredSize(new Dimension(60, 25));
    
    Edad.setPreferredSize(new Dimension(60, 25));       
    lbPuntos.setPreferredSize(new Dimension(60, 25));
    Puntos.setPreferredSize(new Dimension(60, 25));
    Edad.setText("173 meses");
    Puntos.setText("100");
  
    ImageIcon icon = new ImageIcon("D:\\Universidad\\7MO SEMESTRE\\Disenio y programacion\\TALLER GUI\\gui\\src\\data\\perrito.jpg");
    Image image = icon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
    ImageIcon scaledIcon = new ImageIcon(image);
    JLabel imagen = new JLabel(scaledIcon);
    
    setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();

    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.gridwidth = GridBagConstraints.REMAINDER;
    gbc.anchor = GridBagConstraints.CENTER;
    add(imagen, gbc);     
    
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.weighty = 1.0;
    add(new JLabel(), gbc);

    gbc.gridy = 1;
    gbc.gridwidth = 1;
    gbc.anchor = GridBagConstraints.WEST;
    add(lbNombre, gbc);
    
    gbc.gridx = 1;
    add(Nombre, gbc);

    gbc.gridx = 2;
    add(lbRaza, gbc);
    
    gbc.gridx = 3;
    add(Raza, gbc);

    gbc.gridx = 0;
    gbc.gridy = 2;
    add(lbEdad, gbc);
    
    gbc.gridx = 1;
    add(Edad, gbc);

    gbc.gridx = 3;
    add(lbPuntos, gbc);
    
    gbc.gridx = 4;
    add(Puntos, gbc);

    gbc.gridx = 0;
    gbc.gridy = 5;
    gbc.gridwidth = GridBagConstraints.REMAINDER;
    gbc.weighty = 1.0;
    add(new JLabel(), gbc);}

}
