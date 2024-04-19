package main.java.mx.utng.sesion20;


public class Ciudadano {
    public static void main(String[] args) {
       Gobierno gobierno = Gobierno.getInstancia();
       gobierno.darApoyo();
    
    

    Gobierno pseudoOtro = Gobierno.getInstancia();
    pseudoOtro.darApoyo();
}
}

