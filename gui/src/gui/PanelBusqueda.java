package gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelBusqueda extends JPanel{
	
	private JButton btnRaza;
	private JButton btnPuntos;
	private JButton btnEdad;
	private JButton btnPerro;
	

	public PanelBusqueda() {
		
		
		setBorder(new TitledBorder("Búsqueda y Ordenamiento"));
		setPreferredSize(new Dimension(200, 300));
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		btnRaza = new JButton("Ordenar por Raza");

		
		btnPuntos = new JButton("Ordenar por Puntos");

		
		btnEdad = new JButton("Ordenar por Edad");

		
		btnPerro = new JButton("Buscar Perro");
		
		
		
	    add(Box.createRigidArea(new Dimension(0, 10)));
		add(btnRaza);
		add(Box.createRigidArea(new Dimension(0, 10)));
		add(btnPuntos);
		add(Box.createRigidArea(new Dimension(0, 10)));
		add(btnEdad);
		add(Box.createRigidArea(new Dimension(0, 10)));
		add(btnPerro);

	}

}
