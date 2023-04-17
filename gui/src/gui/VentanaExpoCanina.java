package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;

public class VentanaExpoCanina extends JFrame {

    private PanelAgregarPerro panelAgregarPerro;
    private PanelBusqueda panelBusqueda;
    private PanelConsultarExpo panelConsultarExpo;
    private PanelDatosPerro panelDatosPerro;
    private PanelPerrosExpo panelPerrosExpo;
    private PanelPuntosExt panelPuntosExt;

    public VentanaExpoCanina() {
        panelAgregarPerro = new PanelAgregarPerro();
        panelBusqueda = new PanelBusqueda();
        panelConsultarExpo = new PanelConsultarExpo();
        panelDatosPerro = new PanelDatosPerro();
        panelPerrosExpo = new PanelPerrosExpo(this);
        panelPuntosExt = new PanelPuntosExt();

        setLayout(new GridBagLayout());
        GridBagConstraints grid = new GridBagConstraints();
        grid.insets = new Insets(2, 2, 2, 2);
        grid.gridx = 0;
		grid.gridy = 0;

		grid.anchor = GridBagConstraints.WEST;

        grid.gridx = 0;
        grid.gridy = 0;
        add(panelPerrosExpo, grid);

        grid.gridx = 1;
        grid.gridy = 0;
        add(panelDatosPerro, grid);

        grid.gridx = 2;
        grid.gridy = 0;
        add(panelBusqueda, grid);

        grid.gridx = 0;
        grid.gridy = 1;
        grid.gridheight = 3;
        grid.gridwidth = 4;
        add(panelAgregarPerro, grid);

        grid.gridx = 2;
        grid.gridy = 1;
        grid.gridheight = 2;
        add(panelConsultarExpo, grid);

        grid.gridx = 0;
        grid.gridy = 3;
        grid.gridwidth = 3;
        add(panelPuntosExt, grid);

        pack();
        setSize(850, 660);
        setResizable(false);
        setTitle("Exposición Canina");
        setVisible(true);
    }

    public static void main(String[] args) {
        new VentanaExpoCanina();
    }
}