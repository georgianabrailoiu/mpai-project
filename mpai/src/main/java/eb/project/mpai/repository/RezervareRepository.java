package eb.project.mpai.repository;

import eb.project.mpai.domain.Rezervare;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RezervareRepository extends CrudRepository<Rezervare, Long> {

    List<Rezervare> findAll();

    Optional<Rezervare> findAllById(Long id);
}
