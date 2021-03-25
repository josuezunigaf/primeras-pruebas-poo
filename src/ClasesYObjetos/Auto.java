package ClasesYObjetos;

//Clase
public class Auto {
    //Atributos
    String color;
    String marca;
    int km;
    
    //Metodo main
    public static void main(String [] args) {
        //Crear o instanciar un objeto
        Auto autoUno = new Auto();
        
        //Asignacion de valores a los atributos del objeto
        autoUno.color = "Rojo";
        autoUno.marca = "Ferrari";
        autoUno.km = 0;
        
        //Impresion en consola
        System.out.println("El color del autoUno es: "+autoUno.color);
        System.out.println("La marca del autoUno es: "+autoUno.marca);
        System.out.println("El kilometraje del autoUno es: "+autoUno.km);
        
        //Crear o instanciar un objeto
        Auto autoDos = new Auto();
        
        //Asignacion de valores a los atributos del objeto
        autoDos.color = "Blanco";
        autoDos.marca = "Mercedes";
        autoDos.km = 100;
        
        //Impresion en consola
        System.out.println("\nEl color del autoDos es: "+autoDos.color);
        System.out.println("La marca del autoDos es: "+autoDos.marca);
        System.out.println("El kilometraje del autoDos es: "+autoDos.km);
    }
}