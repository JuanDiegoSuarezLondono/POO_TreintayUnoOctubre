/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author suare
 */
public class Calculadora {

    private double operado1;
    private double operado2;
    
    public Calculadora() {
    }   
    
    public double sumar(double numero1, double numero2) {
        return  numero1+numero2;
    }
    
    public double restar(double numero1, double numero2) {
        return  numero1-numero2;
    }
    
    public double multipliar (double numero1, double numero2) {
        return  numero1*numero2;
    }
    
    public double dividir (double numero1, double numero2) {
        return  numero1/numero2;
    }
        
}
