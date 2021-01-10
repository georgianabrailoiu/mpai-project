package eb.project.mpai.service.interfaces;

import eb.project.mpai.domain.bilete.BiletNormalConcert;
import eb.project.mpai.domain.bilete.BiletVIPConcert;

import java.util.List;
import java.util.Optional;

public interface BiletVIPConcertService {
    List<BiletVIPConcert> findAll();

    void save(BiletVIPConcert bilet);

    void delete(BiletVIPConcert bilet);

    Optional<BiletVIPConcert> findById (Long id);
}
