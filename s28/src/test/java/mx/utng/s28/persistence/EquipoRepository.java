package mx.utng.s28.persistence;

import org.springframework.data.repository.CrudRepository;

import mx.utng.s28.model.Equipo;

public interface EquipoRepository extends CrudRepository<Equipo,Long>{
    
}
