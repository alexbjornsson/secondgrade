package paquete1;

public class TestModificadoresAcceso {
    public static void main(String[] args) {
       Clase1 clase1 = new Clase1();
       clase1.atributoDefault = "Cambio desde la prueba";
       System.out.println("clase1 + " + clase1.atributoDefault);
       clase1.metodoDefault();
    }
}
