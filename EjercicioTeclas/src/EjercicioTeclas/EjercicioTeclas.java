/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioTeclas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Jesús Sánchez Allende
 */
public class EjercicioTeclas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ejemplo de manejo de eventos");
        ventana.setLayout(new FlowLayout());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JLabel etiqueta = new JLabel("¡¡Pulsa el botón!!");
        JButton botón = new JButton("¡Púlsame!");
        ventana.add(etiqueta);
        ventana.add(botón);

        botón.addActionListener(new ActionListener() {
            int cuenta = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                // cuento una pulsación más
                cuenta++;

                // actualizo el texto de la etiqueta
                etiqueta.setText("¡Ha pulsado el botón " + cuenta + " veces!");
            }
        });
            botón.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
               
                System.out.println("Carácter de la tecla: " + e.getKeyChar());
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                 System.out.println("Código de la tecla: " + e.getKeyCode());
            }

            @Override
            public void keyReleased(KeyEvent e) {
               
                System.out.println("Nombre de la tecla: " + e.getKeyText(e.getKeyCode()));
            }

          
        });


    

//        ventana.addMouseListener(new MouseAdapter() {
//
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                System.out.println("Pulsado el botón del ratón " + e.getButton());
//                System.out.println("En la posición: " + e.getPoint());
//            }
//        });
        ventana.setSize(600, 400);
        ventana.setVisible(true);
    }
}
