package eb.project.mpai.service.interfaces;

import eb.project.mpai.domain.Utilizator;

import java.util.List;

public interface UtilizatorService {

    List<Utilizator> findAll();

    Utilizator addUtilizator(Utilizator utilizator);
}
