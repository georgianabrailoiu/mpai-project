package eb.project.mpai.service.interfaces;

import eb.project.mpai.domain.bilete.BiletNormalCinema;
import eb.project.mpai.domain.bilete.BiletNormalConcert;

import java.util.List;
import java.util.Optional;

public interface BiletNormalConcertService {
    List<BiletNormalConcert> findAll();

    void save(BiletNormalConcert bilet);

    void delete(BiletNormalConcert bilet);

    Optional<BiletNormalConcert> findById (Long id);
}
