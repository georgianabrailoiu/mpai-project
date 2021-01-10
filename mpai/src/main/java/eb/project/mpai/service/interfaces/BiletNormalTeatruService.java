package eb.project.mpai.service.interfaces;

import eb.project.mpai.domain.bilete.BiletNormalConcert;
import eb.project.mpai.domain.bilete.BiletNormalTeatru;

import java.util.List;
import java.util.Optional;

public interface BiletNormalTeatruService {
    List<BiletNormalTeatru> findAll();

    void save(BiletNormalTeatru bilet);

    void delete(BiletNormalTeatru bilet);

    Optional<BiletNormalTeatru> findById (Long id);
}
