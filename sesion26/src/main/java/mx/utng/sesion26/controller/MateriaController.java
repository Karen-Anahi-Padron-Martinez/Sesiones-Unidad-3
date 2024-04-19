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
import mx.utng.sesion26.model.entity.Materia;
import mx.utng.sesion26.model.service.IMateriaService;




@Controller
@SessionAttributes("materia")
public class MateriaController {
    
    @Autowired //Crea una instancia para que puedas utilizarla sin utlizar = new la clase y sin inicializarla desde un contructor
    private IMateriaService service;


    @GetMapping({"/materia","/materia/","/materia/list"})
    public String list(Model model){

    model.addAttribute("title", "Listado de materias");
    model.addAttribute("materias",service.list());
    return "materia-list";

    }

    @GetMapping("/materia/form")//Si usas peticion GET lo tienes que hacer encriptado para que sea seguro. 
    public String create(Model model){
        model.addAttribute("title","Formulario de Materias");
        model.addAttribute("materia", new Materia());
        return "materia-form";
    }

    @PostMapping("/materia/form")  
    //Peticion POST para guardar datos de forma mas segura 
    public String save(@Valid Materia materia ,BindingResult br, Model model){
        if(br.hasErrors()){
            model.addAttribute("title","Formulario de Materias");
            return "materia-form";
        }
        service.save(materia);
        return "redirect:/materia/list";

    }

    @GetMapping("/materia/form/{id}")
    public String update(@PathVariable Long id, Model model){
        Materia materia = null;
        if(id>0){
            materia = service.getById(id);
        }else{
            return "redirect:/materia/list";
        }
        model.addAttribute("title", "Editar Estudiante");
        model.addAttribute("materia", materia);
        return "materia-form";
    }

    @GetMapping("/materia/delete/{id}")
    public String delete(@PathVariable Long id, Model model){
        if (id>0 ){
            service.delete(id);
        }
        return "redirect:/materia/list";
    }



}

