package mx.utng.sesion26.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;
import mx.utng.sesion26.model.entity.Examen;
import mx.utng.sesion26.model.service.IExamenService;





@Controller
@SessionAttributes("examen")
public class ExamenController {
    
    @Autowired //Crea una instancia para que puedas utilizarla sin utlizar = new la clase y sin inicializarla desde un contructor
    private IExamenService service;


    @GetMapping({"/examen","/examen/","/examen/list"})
    public String list(Model model){

    model.addAttribute("title", "Listado de Examenes");
    model.addAttribute("examen",service.list());
    return "examen-list";

    }

    @GetMapping("/examen/form")//Si usas peticion GET lo tienes que hacer encriptado para que sea seguro. 
    public String create(Model model){
        model.addAttribute("title","Formulario de Examenes");
        model.addAttribute("examen", new Examen());
        return "examen-form";
    }

    @PostMapping("/examen/form")  
    //Peticion POST para guardar datos de forma mas segura 
    public String save(@Valid Examen examen ,BindingResult br, Model model){
        if(br.hasErrors()){
            model.addAttribute("title","Formulario de Examenes");
            return "examen-form";
        }
        service.save(examen);
        return "redirect:/examen/list";

    }

    @GetMapping("/examen/form/{id}")
    public String update(@PathVariable Long id, Model model){
        Examen examen = null;
        if(id>0){
            examen = service.getById(id);
        }else{
            return "redirect:/examen/list";
        }
        model.addAttribute("title", "Editar Examen");
        model.addAttribute("examen", examen);
        return "examen-form";
    }

    @GetMapping("/examen/delete/{id}")
    public String delete(@PathVariable Long id, Model model){
        if (id>0 ){
            service.delete(id);
        }
        return "redirect:/examen/list";
    }



}