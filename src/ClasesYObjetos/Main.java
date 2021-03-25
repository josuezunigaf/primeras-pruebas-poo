package ClasesYObjetos;

//Clase
public class Main {
    //Metodo main
    public static void main(String [] args) {
        //Creacion o instancia del objeto de la clase Operacion
        Operacion op = new Operacion();
        
        //Llamado a los metodos de la clase Operacion
        op.leerNumeros();
        op.sumar();
        op.restar();
        op.dividir();
        op.multiplicar();
        op.mostrarResultados();
    }
}