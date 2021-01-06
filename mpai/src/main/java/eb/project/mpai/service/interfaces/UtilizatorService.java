package eb.project.mpai.service.interfaces;

import eb.project.mpai.domain.Utilizator;
import eb.project.mpai.repository.UtilizatorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UtilizatorService {

    List<Utilizator> findAll();
}
