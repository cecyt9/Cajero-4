/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

public class Cajero extends JFrame {
    
    JTextField pantalla;
    String cuenta;
    JPanel panelCrear, panelAceptar, panelNumeros;
    JButton crear, ok, canc;
    
    public Cajero(){
    super();
    setSize(300,300);
    setTitle("Cajero");
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setResizable(false);
    
    JPanel panel = (JPanel) this.getContentPane();
    panel.setLayout(null);
    
    pantalla = new JTextField("0", 40);
    pantalla.setHorizontalAlignment(JTextField.RIGHT);
    pantalla.setEditable(true);
    pantalla.setSize(295,50);
    pantalla.setBorder(new EmptyBorder(4, 4, 4, 4));
    pantalla.setBackground(Color.WHITE);
    panel.add(pantalla);
    
    panelCrear = new JPanel();
    crear = new JButton("CREAR");
    crear.setSize(80,20);
    crear.setLocation(110, 60);
    panel.add(crear);
    
    panelNumeros = new JPanel();
		panelNumeros.setLayout(new GridLayout(4, 3));
		panelNumeros.setBorder(new EmptyBorder(4, 4, 4, 4));

		for (int n = 9; n >= 0; n--) {
			nuevoBotonNumerico("" + n);
		}

		nuevoBotonNumerico(".");
    
    panel.add(panelNumeros);
    panelNumeros.setLocation(60,100);

    panelAceptar = new JPanel();
    ok = new JButton("OK");
    ok.setSize(80,20);
    ok.setLocation(50, 240);
    canc = new JButton("CANCELAR");
    canc.setSize(100,20);
    canc.setLocation(150, 240);
    
    panel.add(ok);
    panel.add(canc);
    
    validate();
    }
    
    
    	private void nuevoBotonNumerico(String digito) {
		JButton btn = new JButton();
		btn.setText(digito);
		btn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseReleased(MouseEvent evt) {
				JButton btn = (JButton) evt.getSource();
			}
		});

		panelNumeros.add(btn);
	}
}

