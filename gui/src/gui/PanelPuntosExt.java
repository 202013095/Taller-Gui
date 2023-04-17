package gui;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelPuntosExt extends JPanel{
	
	public PanelPuntosExt() {
	
	setBorder(new TitledBorder("Puntos de Extensión"));
	setPreferredSize(new Dimension(810, 100));
	
	JButton botonOpcion1 = new JButton("Opción 1");
    JButton botonOpcion12 = new JButton("Opción 2");    
    
    add(botonOpcion1);
    add(botonOpcion12);

}}
