package eb.project.mpai.repository;

import eb.project.mpai.domain.Rezervare;
import eb.project.mpai.domain.Utilizator;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RezervareRepository extends CrudRepository<Rezervare, Long> {

    List<Rezervare> findAll();
}
