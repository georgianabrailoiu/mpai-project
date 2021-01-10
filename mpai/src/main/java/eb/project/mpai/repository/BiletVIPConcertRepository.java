package eb.project.mpai.repository;

import eb.project.mpai.domain.bilete.BiletNormalConcert;
import eb.project.mpai.domain.bilete.BiletVIPConcert;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BiletVIPConcertRepository extends CrudRepository<BiletVIPConcert, Long> {
    List<BiletVIPConcert> findAll();

}
