package eb.project.mpai.service;

import eb.project.mpai.domain.bilete.BiletNormalCinema;
import eb.project.mpai.domain.bilete.BiletNormalConcert;
import eb.project.mpai.repository.BiletNormalCinemaRepository;
import eb.project.mpai.repository.BiletNormalConcertRepository;
import eb.project.mpai.service.interfaces.BiletNormalCinemaService;
import eb.project.mpai.service.interfaces.BiletNormalConcertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BiletNormalConcertServiceImpl implements BiletNormalConcertService {

    @Autowired
    private BiletNormalConcertRepository biletNormalConcertRepository;

    @Override
    public List<BiletNormalConcert> findAll() {
        return biletNormalConcertRepository.findAll();
    }

    @Override
    public void save(BiletNormalConcert bilet){
        biletNormalConcertRepository.save(bilet);
    }

    @Override
    public void delete(BiletNormalConcert bilet){
        biletNormalConcertRepository.delete(bilet);
    }

    @Override
    public Optional<BiletNormalConcert> findById(Long id){ return biletNormalConcertRepository.findById(id);}
}
