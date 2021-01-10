package eb.project.mpai.service.interfaces;

import eb.project.mpai.domain.Rezervare;
import eb.project.mpai.domain.Utilizator;

import java.util.List;

public interface RezervareService {

    List<Rezervare> findAll();

    Rezervare addRezervare(Rezervare rezervare);
}
