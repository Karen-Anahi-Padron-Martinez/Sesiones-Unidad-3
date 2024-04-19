package mx.utng.sesion26.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import mx.utng.sesion26.model.entity.Examen;


 @Repository
public class ExamenDaoImpl implements IExamenDao {

    

     @Autowired
    private EntityManager em;

    @Override
    public List<Examen> list() {
        return em.createQuery("from Examen").getResultList();
        
    }

    @Override
    public void save(Examen examen) {
        if(examen.getId()!=null && examen.getId()>0){
            //Actualizar si Student no es null 
            em.merge(examen);
        }else{
            //Crear un nuevo Student
            em.persist(examen);
        }
        
    }

    @Override
    public Examen getById(Long id) {
        //PARA ENCONTRAR A UN ESTUDIANTE CON EL id que esta en los PARAMETROS

        return em.find(Examen.class, id);        
    }

    @Override
    public void delete(Long id) {
    Examen examen = getById(id); 
    em.remove(examen);
    }
    
}
