package cajero;

import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
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
    JButton crear, ok, canc, ingresar;
    
    public Cajero(){
    setLayout(null);
    setSize(300,300);
    setTitle("Cajero");
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setResizable(false);
    
    JPanel panel = (JPanel) this.getContentPane();
    panel.setLayout(null);
    
    pantalla = new JTextField("0", 40);
    pantalla.setHorizontalAlignment(JTextField.RIGHT);
    pantalla.setEditable(false);
    //pantalla.setSize(295,50);
    pantalla.setBorder(new EmptyBorder(4, 4, 4, 4));
    pantalla.setBackground(Color.WHITE);
    panel.add(pantalla);
    
    panelCrear = new JPanel();
    panel.setLayout(new GridLayout(1,3));
    crear = new JButton("CREAR CUENTA");
    ingresar = new JButton("INGRESAR");
    //crear.setSize(50,20);
    //crear.setLocation(110, 60);
    crear.setVisible(true);
    ingresar.setVisible(true);
    panelCrear.add(crear);
    panelCrear.add(ingresar);
    panel.add(panelCrear);
    
    
    /*panelAceptar = new JPanel();
    ok = new JButton("OK");
    ok.setSize(80,20);
    ok.setLocation(50, 240);
    canc = new JButton("CANCELAR");
    canc.setSize(100,20);
    canc.setLocation(150, 240);
    
    panel.add(ok);
    panel.add(canc);*/
    
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

    private LayoutManager GridLayout(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

