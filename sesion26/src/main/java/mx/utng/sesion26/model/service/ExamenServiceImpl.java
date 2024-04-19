package mx.utng.sesion26.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.utng.sesion26.model.dao.IExamenDao;
import mx.utng.sesion26.model.entity.Examen;

@Service
public class ExamenServiceImpl implements IExamenService {
    //Inyectamos la interfaz para utilizar los métodos de CRUD. 
    //C-Create, R-Read Retrieve, U-Update,D-Delete. 
    @Autowired
    private IExamenDao dao;

    @Transactional(readOnly = true)
    @Override
    public List<Examen> list() {
        return dao.list();
    }

    @Transactional
    @Override
    public void save(Examen examen) {
        dao.save(examen);
    }

    @Transactional(readOnly =  true)
    @Override
    public Examen getById(Long id) {
       return dao.getById(id);
    }

    @Transactional
    @Override
    public void delete(Long id) {
       dao.delete(id);
    }

    
}
