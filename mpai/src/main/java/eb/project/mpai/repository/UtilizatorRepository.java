package eb.project.mpai.repository;

import eb.project.mpai.domain.Utilizator;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UtilizatorRepository extends CrudRepository<Utilizator, Long> {

    List<Utilizator> findAll();
}
