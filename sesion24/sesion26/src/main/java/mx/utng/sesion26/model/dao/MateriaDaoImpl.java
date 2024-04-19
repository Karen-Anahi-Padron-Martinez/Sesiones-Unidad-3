package mx.utng.sesion26.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import mx.utng.sesion26.model.entity.Materia;



 @Repository
public class MateriaDaoImpl implements IMateriaDao {

    

     @Autowired
    private EntityManager em;

    @Override
    public List<Materia> list() {
        return em.createQuery("from Examen").getResultList();
        
    }

    @Override
    public void save(Materia materia) {
        if(materia.getId()!=null && materia.getId()>0){
            //Actualizar si Student no es null 
            em.merge(materia);
        }else{
            //Crear un nuevo Student
            em.persist(materia);
        }
        
    }

    @Override
    public Materia getById(Long id) {
        //PARA ENCONTRAR A UN ESTUDIANTE CON EL id que esta en los PARAMETROS

        return em.find(Materia.class, id);        
    }

    @Override
    public void delete(Long id) {
    Materia materia = getById(id); 
    em.remove(materia);
    }
    
}
