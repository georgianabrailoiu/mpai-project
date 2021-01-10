package eb.project.mpai.repository;

import eb.project.mpai.domain.bilete.BiletNormalCinema;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BiletNormalCinemaRepository extends CrudRepository<BiletNormalCinema, Long> {
    List<BiletNormalCinema> findAll();

}
