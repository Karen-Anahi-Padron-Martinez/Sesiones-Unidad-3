package mx.utng.s23.factory;

import java.util.Scanner;

public class LoggerTest {
    public static void main(String[] args) {
        //CREAR un objeto LoggerFactory
        LoggerFactory factory = new LoggerFactory();
        //El usuario tecelara el tipo
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teclea el tipo de Logger: (1)Archivo (2)Consola");
        int type = scanner.nextInt();
        scanner.close();
        //Crear el logger elegido por el ususario
        Logger logger = factory.getLogger(type);
        logger.log("Registro de eventos del sistema");
        
        
    }
    
}
