package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

public class PanelAgregarPerro extends JPanel {
	
	public PanelAgregarPerro() {
		
		setBorder(new TitledBorder("Agregar Perro"));
		setPreferredSize(new Dimension(550, 200));
		
		JLabel lbNombreNuevo = new JLabel("Nombre:");
		JTextField textNombreNuevo = new JTextField();
		
		JLabel lbEdadNueva = new JLabel("Edad:");
		JTextField textEdadNueva = new JTextField();
		
		JLabel lbRazaNueva = new JLabel("Raza:");
		JTextField textRazaNueva = new JTextField();
		
		JLabel lbPuntosNuevos = new JLabel("Puntos:");
		JTextField textPuntosNuevos = new JTextField();
		
		JLabel lbImagen = new JLabel("Imagen:");
		JTextField textImagen = new JTextField();
		
		JButton botonExaminar = new JButton("Examinar");
		JButton botonAgregarPerro = new JButton("Agregar Perro");
		
		lbNombreNuevo.setPreferredSize(new Dimension(50, 25));
		textNombreNuevo.setPreferredSize(new Dimension(50, 25));
		lbRazaNueva.setPreferredSize(new Dimension(50, 25));
		textRazaNueva.setPreferredSize(new Dimension(165, 25));
		lbEdadNueva.setPreferredSize(new Dimension(50, 25));
		textEdadNueva.setPreferredSize(new Dimension(165, 25));
		lbPuntosNuevos.setPreferredSize(new Dimension(50, 25));
		textPuntosNuevos.setPreferredSize(new Dimension(165, 25));
		lbImagen.setPreferredSize(new Dimension(45, 25));
		textImagen.setPreferredSize(new Dimension(160, 25));
		
		setLayout(new GridBagLayout());
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.LINE_END;
		gbc.insets = new Insets(5, 5, 5, 5);
		add(lbNombreNuevo, gbc);
		
		gbc.gridx = 1;
		gbc.anchor = GridBagConstraints.LINE_START;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 1.0;
		gbc.insets = new Insets(5, 0, 5, 5);
		add(textNombreNuevo, gbc);
		
		gbc.gridx = 2;
		add(lbRazaNueva, gbc);
		
		gbc.gridx = 3;
		add(textRazaNueva, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.anchor = GridBagConstraints.LINE_START;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 1.0;
		add(lbEdadNueva, gbc);
		
		gbc.gridx = 2;

		add(textEdadNueva, gbc);
		
		gbc.gridx = 3;

		add(lbPuntosNuevos, gbc);
		
		gbc.gridx = 4;
		add(textPuntosNuevos, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.anchor = GridBagConstraints.LINE_START;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 1.0;
		add(lbImagen, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 2;
		add(textImagen, gbc);
		
		gbc.gridx = 3;
		gbc.gridy = 2;

		add(botonExaminar, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 4;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.NONE;
		gbc.weightx = 0.0;
		gbc.insets = new Insets(20, 5, 5, 5);
		gbc.anchor = GridBagConstraints.CENTER;
		add(botonAgregarPerro, gbc);
		
	}
}