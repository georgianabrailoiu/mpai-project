package eb.project.mpai.repository;

import eb.project.mpai.domain.bilete.BiletNormalTeatru;
import eb.project.mpai.domain.bilete.BiletVIPTeatru;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BiletVIPTeatruRepository extends CrudRepository<BiletVIPTeatru, Long> {
    List<BiletVIPTeatru> findAll();

}
