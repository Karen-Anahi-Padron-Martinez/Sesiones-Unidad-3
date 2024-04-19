package mx.utng.sesion26.model.dao;

import java.util.List;
import mx.utng.sesion26.model.entity.Materia;
public interface IMateriaDao {
    
    List<Materia>list(); 
    void save(Materia materia);
    Materia getById(Long id);
    void delete (Long id);

}