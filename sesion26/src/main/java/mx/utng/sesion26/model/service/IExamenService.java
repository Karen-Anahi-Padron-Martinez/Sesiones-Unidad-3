package mx.utng.sesion26.model.service;

import mx.utng.sesion26.model.entity.Examen;
import java.util.List;

public interface IExamenService {
    List<Examen> list();
    void save (Examen examen); 
    Examen getById(Long id); 
    void delete (Long id);
}
