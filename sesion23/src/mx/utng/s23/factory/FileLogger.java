package mx.utng.s23.factory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {
      
    @Override
    public void log (String msg) {
        try{
            BufferedWriter writer =new BufferedWriter(new FileWriter("log.txt"));
            writer.write(msg);
            writer.close();
        } catch (IOException e){
            System.out.println("ERROR de I-O"+ e.getMessage());
        }
        
    }
    
}
