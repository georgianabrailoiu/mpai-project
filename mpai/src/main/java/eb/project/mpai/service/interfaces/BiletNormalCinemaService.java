package eb.project.mpai.service.interfaces;

import eb.project.mpai.domain.bilete.BiletNormalCinema;

import java.util.List;
import java.util.Optional;

public interface BiletNormalCinemaService {
    List<BiletNormalCinema> findAll();

    void save(BiletNormalCinema bilet);

    void delete(BiletNormalCinema bilet);

    Optional<BiletNormalCinema> findById (Long id);
}
