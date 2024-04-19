package mx.utng.sesion21.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import mx.utng.sesion21.model.Saludo;



    @RestController
    public class SaludoController{

        @GetMapping ("/Saludo")
        public Saludo saludar(){
            Saludo saludo = new Saludo();
            saludo.setMensaje("Hola mundo de SPRINGBOOT");
            return saludo;
        }

    }
     
    
        
    
    

