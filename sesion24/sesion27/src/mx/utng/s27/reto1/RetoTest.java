package mx.utng.s27.reto1;

public class RetoTest {
    public static void main(String[] args) {
        Hilo1 h1 =new Hilo1();
        Hilo2 h2 = new Hilo2();
        Hilo1 h3 =new Hilo1();
       // h2.setDaemon(true);
        //h1.setDaemon(true);

        h1.start();
        h2.start();

    }
    
}
