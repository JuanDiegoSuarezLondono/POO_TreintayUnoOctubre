/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import principal.Calculadora;

/**
 *
 * @author suare
 */
public class CalculadoraUI extends JFrame implements ActionListener{
    private Calculadora c;
    private JLabel JLabelNumero1;
    private JLabel JLabelNumero2;
    private JLabel JLabelResultado;
    private JTextField JTextFieldNumero1;
    private JTextField JTextFieldNumero2;
    private JTextField JTextFieldResultado;
    private JButton JButtonSumar;
    private JButton JButtonRestar;
    private JButton JButtonMultiplicar;
    private JButton JButtonDividir;
            
    
    public CalculadoraUI() {
        setLayout(new GridLayout(5,2));
        c = new Calculadora();
        JLabelNumero1= new JLabel("Numero1");        
        JLabelNumero1.setSize(10,10);
        JLabelNumero1.setVisible(true);
        add(JLabelNumero1);
        
        JTextFieldNumero1=new JTextField();
        JTextFieldNumero1.setSize(10, 10);
        JTextFieldNumero1.setVisible(true);
        add(JTextFieldNumero1);
        
        
        JLabelNumero2= new JLabel("Numero2");        
        JLabelNumero2.setSize(10,10);
        JLabelNumero2.setVisible(true);
        add(JLabelNumero2);
        
        JTextFieldNumero2=new JTextField();
        JTextFieldNumero2.setSize(10, 10);
        JTextFieldNumero2.setVisible(true);
        add(JTextFieldNumero2);
        
        JLabelResultado= new JLabel("Resultado");        
        JLabelResultado.setSize(10,10);        
        JLabelResultado.setVisible(true);
        add(JLabelResultado);
        
        JTextFieldResultado=new JTextField();
        JTextFieldResultado.setSize(10, 10);
        JTextFieldResultado.setEnabled(false);
        JTextFieldResultado.setVisible(true);
        add(JTextFieldResultado);
        
        JButtonSumar=new JButton("Sumar");
        JButtonSumar.setSize(50,50);
        JButtonSumar.setVisible(true);
        JButtonSumar.setActionCommand("Sumar");
        JButtonSumar.addActionListener(this);
        add(JButtonSumar);
        
        
        JButtonRestar=new JButton("Restar");
        JButtonRestar.setSize(50,50);
        JButtonRestar.setVisible(true);
        JButtonRestar.setActionCommand("Restar");
        JButtonRestar.addActionListener(this);
        add(JButtonRestar);
        
        
        JButtonMultiplicar=new JButton("Multiplicar");
        JButtonMultiplicar.setSize(50,50);
        JButtonMultiplicar.setVisible(true);
        JButtonMultiplicar.setActionCommand("Multiplicar");
        JButtonMultiplicar.addActionListener(this);
        add(JButtonMultiplicar);
        
        JButtonDividir=new JButton("Dividir");
        JButtonDividir.setSize(50,50);
        JButtonDividir.setVisible(true);
        JButtonDividir.setActionCommand("Dividir");
        JButtonDividir.addActionListener(this);
        add(JButtonDividir);
        
        
        setBounds(0,0,342,423);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String comando=e.getActionCommand();
        switch(comando) {
            case "Sumar":
                JTextFieldResultado.setText(String.valueOf(c.sumar(Integer.parseInt(JTextFieldNumero1.getText()), Integer.parseInt(JTextFieldNumero2.getText()))));
            break;
            
            case "Restar":
                JTextFieldResultado.setText(String.valueOf(c.restar(Integer.parseInt(JTextFieldNumero1.getText()), Integer.parseInt(JTextFieldNumero2.getText()))));
            break;
            
            case "Multiplicar":
                JTextFieldResultado.setText(String.valueOf(c.multipliar(Integer.parseInt(JTextFieldNumero1.getText()), Integer.parseInt(JTextFieldNumero2.getText()))));
            break;
            
            case "Dividir":
                JTextFieldResultado.setText(String.valueOf(c.dividir(Integer.parseInt(JTextFieldNumero1.getText()), Integer.parseInt(JTextFieldNumero2.getText()))));
            break;
        };
    }
    
    
    public static void main(String args[]) {
        new CalculadoraUI().setVisible(true);
    }
}
