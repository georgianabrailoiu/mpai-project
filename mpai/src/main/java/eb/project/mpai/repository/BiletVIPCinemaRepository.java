package eb.project.mpai.repository;

import eb.project.mpai.domain.bilete.BiletNormalCinema;
import eb.project.mpai.domain.bilete.BiletVIPCinema;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BiletVIPCinemaRepository extends CrudRepository<BiletVIPCinema, Long> {
    List<BiletVIPCinema> findAll();

}
