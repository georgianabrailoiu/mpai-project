package eb.project.mpai.service;

import eb.project.mpai.domain.bilete.BiletNormalCinema;
import eb.project.mpai.repository.BiletNormalCinemaRepository;
import eb.project.mpai.service.interfaces.BiletNormalCinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BiletNormalCinemaServiceImpl implements BiletNormalCinemaService {

    @Autowired
    private BiletNormalCinemaRepository biletNormalCinema;

    @Override
    public List<BiletNormalCinema> findAll() {
        return biletNormalCinema.findAll();
    }

    @Override
    public void save(BiletNormalCinema bilet){
        biletNormalCinema.save(bilet);
    }

    @Override
    public void delete(BiletNormalCinema bilet){
        biletNormalCinema.delete(bilet);
    }

    @Override
    public Optional<BiletNormalCinema> findById(Long id){ return biletNormalCinema.findById(id);}
}
