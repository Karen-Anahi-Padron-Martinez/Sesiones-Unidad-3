package mx.utng.s27;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class MiHilo extends Thread{
    private String parametro;

    public void setParametro(String parametro) {
        this.parametro = parametro;
    }

    @Override
    public void run(){
        while (!"terminar".equals(parametro)){
       mostrarInfo();
       pausarUnSegundo();
        }

    }

    private void mostrarInfo(){
        String tipoHilo = isDaemon()?"Daemon":"Usuario";
        System.out.println(tipoHilo+"\t | Nombre: "+getName()+"\t| ID:"+getId()+"\t|");

    }
    public static void pausarUnSegundo(){

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}