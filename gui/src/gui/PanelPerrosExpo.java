package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

public class PanelPerrosExpo extends JPanel{
	
	private JScrollPane PanelPerros;

	public PanelPerrosExpo(VentanaExpoCanina papa){
		
		setBorder(new TitledBorder("Perros en la Exposición"));
		
		setLayout(new BorderLayout());
	    setPreferredSize(new Dimension(250, 300));
        
        String[] perros = {"Puppy(Gran Danés)",
        		"Taylor(Beagle)",
        		"Cobrador(Akita)",
        		"Brutal y Mamut(Doberman)",
        		"Maximus(Mastin Español)",
        		"Tony(Bull Terrier)",
        		"Nieve(Gigante de los Pirineos)",
        		"Titán(Pug)","Leviatan(Chiuahua)",
        		"Puppy(Gran Danés)",
        		"Tarzán(Gosque)",
        		"Fido(Mastin Napolitano)",
        		"‏‏‎ ‎",
        		"‏‏‎ ‎",
        		"‏‏‎ ‎",
        		"‏‏‎ ‎"};
        JList<String> ScrollPanelInfo = new JList<>(perros);
        PanelPerros = new JScrollPane(ScrollPanelInfo);
			
		add(PanelPerros);
		
		
	}

}
