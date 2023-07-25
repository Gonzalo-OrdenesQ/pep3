package cl.mingeso.prueba.Repository;

import cl.mingeso.prueba.Entity.PruebaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PruebaRepository extends JpaRepository<PruebaEntity,Integer> {
}
