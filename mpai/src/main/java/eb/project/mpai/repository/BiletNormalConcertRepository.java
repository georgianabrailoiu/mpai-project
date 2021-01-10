package eb.project.mpai.repository;

import eb.project.mpai.domain.bilete.BiletNormalCinema;
import eb.project.mpai.domain.bilete.BiletNormalConcert;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BiletNormalConcertRepository extends CrudRepository<BiletNormalConcert, Long> {
    List<BiletNormalConcert> findAll();

}
