package eb.project.mpai.service.interfaces;

import eb.project.mpai.domain.Utilizator;

import java.util.List;
import java.util.Optional;

public interface UtilizatorService {

    List<Utilizator> findAll();
    Optional<Utilizator> findById(Long id);
    Utilizator addUtilizator(Utilizator utilizator);
}
