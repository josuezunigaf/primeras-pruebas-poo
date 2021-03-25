package ClasesYObjetos;

import javax.swing.JOptionPane;

//Clase
public class Operacion {
    //Atributos
    int numeroA;
    int numeroB;
    int suma;
    int resta;
    int multiplicacion;
    float division;
    
    //Metodo para leer numeros
    public void leerNumeros() {
        numeroA = Integer.parseInt(JOptionPane.showInputDialog("Digite el numeroA: "));
        numeroB = Integer.parseInt(JOptionPane.showInputDialog("Digite el numeroB: "));
    }
    
    //Metodo para sumar
    public void sumar() {
        suma = numeroA + numeroB;
    }
    
    //Metodo para restar
    public void restar() {
        resta = numeroA - numeroB;
    }
    
    //Metodo para multiplicar
    public void multiplicar() {
        multiplicacion = numeroA * numeroB;
    }

    //Metodo para dividir
    public void dividir() {
        division = numeroA / numeroB;
    }
    
    //Metodo para mostrarResultados
    public void mostrarResultados() {
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);
    }
}