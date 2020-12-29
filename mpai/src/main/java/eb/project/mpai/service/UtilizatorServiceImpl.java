package eb.project.mpai.service;

import eb.project.mpai.domain.Utilizator;
import eb.project.mpai.repository.UtilizatorRepository;
import eb.project.mpai.service.interfaces.UtilizatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilizatorServiceImpl implements UtilizatorService {

    @Autowired
    private UtilizatorRepository utilizatorRepository;

    @Override
    public List<Utilizator> findAll() {
        return utilizatorRepository.findAll();
    }
}
