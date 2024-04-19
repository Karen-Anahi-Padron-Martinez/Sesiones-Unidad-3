package mx.utng.sesion26.model.dao;

import java.util.List;
import mx.utng.sesion26.model.entity.Examen;

public interface IExamenDao {
    
    List<Examen>list(); 
    void save(Examen examen);
    Examen getById(Long id);
    void delete (Long id);

}