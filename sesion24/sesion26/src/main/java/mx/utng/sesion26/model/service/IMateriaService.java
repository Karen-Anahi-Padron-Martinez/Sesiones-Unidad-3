package mx.utng.sesion26.model.service;

import mx.utng.sesion26.model.entity.Materia;
import java.util.List;

public interface IMateriaService {
    List<Materia> list();
    void save (Materia materia); 
    Materia getById(Long id); 
    void delete (Long id);
}
