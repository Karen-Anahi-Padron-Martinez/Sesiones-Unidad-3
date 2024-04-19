package main.java.mx.utng.sesion20;

public class Gobierno {
    private static Gobierno instancia;
    
    private Gobierno(){
        System.out.println("Unica instancia de Gobierno");
    }

    public static Gobierno getInstancia() {
        if(instancia == null){
            instancia = new Gobierno();
        }
        return instancia;
    }

    public void darApoyo(){
        System.out.println("Dando apoyo al ciudadano");
    }
}
