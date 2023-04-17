package gui;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelConsultarExpo extends JPanel{
	
	public PanelConsultarExpo() {
		
		setBorder(new TitledBorder("Consultar Expo"));
		setPreferredSize(new Dimension(200, 200));
        setLayout(new FlowLayout());
		
        JButton btGanador = new JButton("Ganador");        
        JButton btPuntajeMenor = new JButton("Menor Puntaje");
        JButton btVeterano = new JButton("Más Viejo");  
        
        btGanador.setPreferredSize(new Dimension(160, 25));
        btPuntajeMenor .setPreferredSize(new Dimension(160, 25));
        btVeterano.setPreferredSize(new Dimension(160, 25));

        add( btGanador);
        add(btPuntajeMenor);
        add(btVeterano);
		
	}

}
