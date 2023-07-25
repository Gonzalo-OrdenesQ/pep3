package cl.mingeso.pregunta.repository;

import cl.mingeso.pregunta.entity.PreguntaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PreguntaRepository extends JpaRepository<PreguntaEntity, Integer> {

    @Query(value = "SELECT * FROM preguntas p WHERE p.dificultad = :dificultad", nativeQuery = true)
    public List<PreguntaEntity> getByDificultad(@Param("dificultad") String dificultad);
}
