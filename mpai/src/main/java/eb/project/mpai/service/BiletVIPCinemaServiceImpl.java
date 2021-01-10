package eb.project.mpai.service;

import eb.project.mpai.domain.bilete.BiletNormalCinema;
import eb.project.mpai.domain.bilete.BiletVIPCinema;
import eb.project.mpai.repository.BiletNormalCinemaRepository;
import eb.project.mpai.repository.BiletVIPCinemaRepository;
import eb.project.mpai.service.interfaces.BiletNormalCinemaService;
import eb.project.mpai.service.interfaces.BiletVIPCinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BiletVIPCinemaServiceImpl implements BiletVIPCinemaService {

    @Autowired
    private BiletVIPCinemaRepository biletVIPCinemaRepository;

    @Override
    public List<BiletVIPCinema> findAll() {
        return biletVIPCinemaRepository.findAll();
    }

    @Override
    public void save(BiletVIPCinema bilet){
        biletVIPCinemaRepository.save(bilet);
    }

    @Override
    public void delete(BiletVIPCinema bilet){
        biletVIPCinemaRepository.delete(bilet);
    }

    @Override
    public Optional<BiletVIPCinema> findById(Long id){ return biletVIPCinemaRepository.findById(id);}
}
