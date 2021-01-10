package eb.project.mpai.repository;

import eb.project.mpai.domain.bilete.BiletNormalCinema;
import eb.project.mpai.domain.bilete.BiletNormalTeatru;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BiletNormalTeatruRepository extends CrudRepository<BiletNormalTeatru, Long> {
    List<BiletNormalTeatru> findAll();

}
