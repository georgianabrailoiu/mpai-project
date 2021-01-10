package eb.project.mpai.service;

import eb.project.mpai.domain.Rezervare;
import eb.project.mpai.domain.Utilizator;
import eb.project.mpai.repository.RezervareRepository;
import eb.project.mpai.repository.UtilizatorRepository;
import eb.project.mpai.service.interfaces.RezervareService;
import eb.project.mpai.service.interfaces.UtilizatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RezervareServiceImpl implements RezervareService {

    @Autowired
    private RezervareRepository rezervareRepository;

    @Override
    public List<Rezervare> findAll() {
        return rezervareRepository.findAll();
    }

    @Override
    public Rezervare addRezervare(Rezervare utilizator) {
        return rezervareRepository.save(utilizator);
    }


}
