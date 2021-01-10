package eb.project.mpai.service.interfaces;

import eb.project.mpai.domain.bilete.BiletNormalCinema;
import eb.project.mpai.domain.bilete.BiletVIPCinema;

import java.util.List;
import java.util.Optional;

public interface BiletVIPCinemaService {
    List<BiletVIPCinema> findAll();

    void save(BiletVIPCinema bilet);

    void delete(BiletVIPCinema bilet);

    Optional<BiletVIPCinema> findById (Long id);
}
