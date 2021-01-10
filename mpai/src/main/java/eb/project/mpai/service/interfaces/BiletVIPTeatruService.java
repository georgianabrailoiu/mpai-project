package eb.project.mpai.service.interfaces;

import eb.project.mpai.domain.bilete.BiletNormalTeatru;
import eb.project.mpai.domain.bilete.BiletVIPTeatru;

import java.util.List;
import java.util.Optional;

public interface BiletVIPTeatruService {
    List<BiletVIPTeatru> findAll();

    void save(BiletVIPTeatru bilet);

    void delete(BiletVIPTeatru bilet);

    Optional<BiletVIPTeatru> findById (Long id);
}
