package eb.project.mpai.service.interfaces;

import eb.project.mpai.domain.Rezervare;
import eb.project.mpai.domain.Utilizator;

import java.util.List;
import java.util.Optional;

public interface RezervareService {

    List<Rezervare> findAll();

    Rezervare addRezervare(Rezervare rezervare);

    Optional<Rezervare> findById(Long id);
}
